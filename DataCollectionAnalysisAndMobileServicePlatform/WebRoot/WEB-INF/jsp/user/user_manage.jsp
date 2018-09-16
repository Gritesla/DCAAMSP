<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>二维预案页面</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/ass/font-awesome/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/ass/bootstrap/css/bootstrap.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/common/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/ass/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" defer="defer"
	src="${pageContext.request.contextPath }/js/common/echarts.js"></script>
<script type="text/javascript" defer="defer"
	src="${pageContext.request.contextPath }/js/common/common.js"></script>
<style type="text/css">
.container-fluid {
	background-color: #e9ecf3;
}

body,html {
	font-family: "Segoe UI", "Lucida Grande", Helvetica, Arial,
		"Microsoft YaHei", FreeSans, Arimo, "Droid Sans",
		"wenquanyi micro hei", "Hiragino Sans GB", "Hiragino Sans GB W3",
		FontAwesome, sans-serif;
	min-height: 100%;
	background-color: #e9ecf3;
}


.btn-split {
	margin-left: 10px;
	margin-left: 10px;
}
</style>

<script type="text/javascript">
	var tableData;

	$(function() {
		$(parent.document.getElementById('frmMain')).css("height",
				($(window).height()));
		ajax("${pageContext.request.contextPath }/user/get", "1=1", createTable);
	});

	function createTable(d) {
		tableData = d;
		$("#dvTable").empty();
		var tableHtml = '<table class="table table-hover table-bordered"><thead><tr>';
		tableHtml += '<th style="width: 10%;text-align: center;">序号</th>';
		tableHtml += '<th style="width: 20%;text-align: center;">登录名</th>';
		tableHtml += '<th style="width: 20%;text-align: center;">用户名</th>';
		tableHtml += '<th style="width: 20%;text-align: center;">所属单位</th>';
		tableHtml += '<th style="width: 10%;text-align: center;">账号状态</th>';
		tableHtml += '<th style="width: 20%;text-align: center;">操作</th>';
		tableHtml += '</tr></thead>';
		tableHtml += '<tbody style="text-align: center;">';
		for (var i = 0; i < d.length; i++) {

			tableHtml += '<tr>';
			tableHtml += '<td>' + (i + 1) + '</td>';
			tableHtml += '<td>' + d[i].dpRespUsercode + '</td>';
			tableHtml += '<td>' + d[i].dpRespUsername + '</td>';
			tableHtml += '<td>' + d[i].dpRespSquadronName + '</td>';
			tableHtml += '<td><lable style="color:green;">正常</lable></td>';
			tableHtml += '<td><button type="button" class="btn btn-primary btn-sm btn-split" onclick="edit('
					+ i + ')">编辑</button>';
			tableHtml += '<button type="button" class="btn btn-warning btn-sm btn-split">删除</button></td>';
		}
		$("#dvTable").append(tableHtml);
	}

	function edit(d) {
		//alert(tableData[d].dpRespSquadronName);
		$("#txtCode").val(tableData[d].dpRespUsercode);
		$("#txtName").val(tableData[d].dpRespUsername);
		$('#userDetail').modal('show');
	}
</script>
</head>
<body>
	<div class="container-fluid" style="padding: 20px;">

		<div class="row">
			<div class="col-md-12">
				<div class="page-header"
					style="margin-bottom: 60px;margin-top: 20px;">
					<div style="font-size: 20px;font-weight: 400;">
						<span style="font-size: 16px;color:#666;margin-right: 8px"
							class="fa fa-object-group"></span>用户管理
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							用户列表<small style="float: right;"><a
								style="cursor: pointer;">more</a></small>
						</h3>
					</div>
					<div class="panel-body">
						<div
							style="width: 300px;margin-top: 20px;margin-bottom: 10px;float: right;">
							<div class="input-group">
								<div class="input-group-btn">
									<button type="button" class="btn btn-default dropdown-toggle"
										data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="false">
										选项 <span class="caret"></span>
									</button>
									<ul class="dropdown-menu" style="min-width: 80px;">
										<li><a href="#">登录名</a></li>
										<li><a href="#">用户名</a></li>
										<li><a href="#">单位</a></li>
										<!-- <li role="separator" class="divider"></li>
										<li><a href="#">Separated link</a></li> -->
									</ul>
								</div>
								<!-- /btn-group -->
								<input type="text" class="form-control" aria-label="...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">搜索</button>
								</span>
							</div>
							<!-- /input-group -->
						</div>
						<div id="dvTable"></div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="userDetail" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">用户详细信息</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-8" style="left: 20%;margin-bottom: 15px;">
							<div class="input-group">
								<span class="input-group-btn">
									<button class="btn btn-default" style="width: 80px;"
										type="button">登录名：</button>
								</span> <input id="txtCode" type="text" class="form-control" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-8" style="left: 20%;margin-bottom: 15px;">
							<div class="input-group">
								<span class="input-group-btn">
									<button class="btn btn-default" style="width: 80px;"
										type="button">用户名：</button>
								</span> <input id="txtName" type="text" class="form-control" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-8" style="left: 20%;margin-bottom: 15px;">
							<div class="input-group">
								<span class="input-group-btn">
									<button class="btn btn-default" style="width: 80px;"
										type="button">电话：</button>
								</span> <input type="text" class="form-control" value="暂无数据" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-8" style="left: 20%;margin-bottom: 15px;">
							<div class="input-group">
								<span class="input-group-btn">
									<button class="btn btn-default" style="width: 80px;"
										type="button">地址：</button>
								</span> <input type="text" class="form-control" value="暂无数据" />
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary">提交</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">重置密码
						</button>

						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>

					</div>
				</div>
			</div>
		</div>
</body>


</html>
