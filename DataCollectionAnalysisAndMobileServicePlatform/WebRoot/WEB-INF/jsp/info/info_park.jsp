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
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/ass/bootstrap/css/bootstrap-table.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/common/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/ass/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/ass/bootstrap/js/bootstrap-table.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/ass/bootstrap/js/bootstrap-table-zh-CN.js"></script>
<%-- <script type="text/javascript" defer="defer"
	src="${pageContext.request.contextPath }/js/common/echarts.js"></script> --%>
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
	/* 	$(window).resize(function() {
	 $('#tbImportant').bootstrapTable('resetView', {
	 height : tableHeight()
	 });
	 });
	 */
	$(function() {
		$(parent.document.getElementById('frmMain')).css(
				"height",
				((parseInt($(parent.document.getElementById("dvLeft")).css(
						"height")) + 6))
						+ "px");

		//alert($(parent.document.getElementById("dvLeft")).css("height"));

		try {
			$('#tbImportant').bootstrapTable({
				method : 'post',
				//contentType : "application/json;charset=UTF-8",//一种编码。好像在post请求的时候需要用到。这里用的get请求，注释掉这句话也能拿到数据
				url : "${pageContext.request.contextPath }/info/getpark",//要请求数据的文件路径
				dataField : "data",//这是返回的json数组的key.默认好像是"rows".这里只有前后端约定好就行
				//dataType:"json",
				pageNumber : 1, //初始化加载第一页，默认第一页
				cache : false,
				pagination : true,//是否分页
				queryParams : queryParams,//请求服务器时所传的参数
				sidePagination : 'server',//指定服务器端分页
				pageSize : 10,//单页记录数
				pageList : [ 10, 20, 30, 40 ],//分页步进值
				responseHandler : responseHandler,//请求数据成功后，渲染表格前的方法
				columns : [ {
					field : "dpRespId",
					title : "ID",
				},{
					field : "dpRespParkname",
					title : "园区名称",
				}, {
					field : "dpRespAddress",
					title : "园区地址"
				}, {
					field : "dpRespSquadronName",
					title : "管辖单位"
				} ]
			});
		} catch (e) {
			alert(e.message);
		}
	});

	//请求服务数据时所传参数
	function queryParams(params) {
		return {
			pageSize : params.limit, //每一页的数据行数，默认是上面设置的10(pageSize)
			pageIndex : params.offset / params.limit + 1, //当前页面,默认是上面设置的1(pageNumber)
			unitName : $("#txtParam").val()
		//这里是其他的参数，根据自己的需求定义，可以是多个
		}
	}

	//请求成功方法
	function responseHandler(result) {
		var errcode = result.errcode;//在此做了错误代码的判断
		if (errcode != 0) {
			alert("错误代码" + errcode);
			return;
		}
		//alert(result.data.length);
		//如果没有错误则返回数据，渲染表格
		return {
			total : result.total, //总页数,前面的key必须为"total"
			data : result.data
		//行数据，前面的key要与之前设置的dataField的值一致.
		};
	};

	//刷新表格数据,点击你的按钮调用这个方法就可以刷新
	function refresh() {
		$('#tbImportant').bootstrapTable('refresh', {
			url : "${pageContext.request.contextPath }/info/getpark"
		});
	}

	function search() {
		$("#tbImportant").bootstrapTable("refreshOptions", {
			pageIndex : 1,
			pageSize : 10
		});

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
							class="fa fa-object-group"></span>信息管理
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							重点部位信息<small style="float: right;"><a
								style="cursor: pointer;">more</a></small>
						</h3>
					</div>
					<div class="panel-body">
						<div
							style="width: 300px;margin-top: 20px;margin-bottom: 10px;float: right;">
							<div class="input-group">
								<div class="input-group-btn">
									<!--<button type="button" class="btn btn-default dropdown-toggle"
										data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="false">
										选项 <span class="caret"></span>
									</button>
								 	<ul class="dropdown-menu" style="min-width: 80px;">
										<li><a href="#">登录名</a></li>
										<li><a href="#">用户名</a></li>
										<li><a href="#">单位</a></li>
									</ul> -->
								</div>
								<!-- /btn-group -->
								<input id="txtParam" type="text" class="form-control"
									aria-label="..."> <span class="input-group-btn">
									<button class="btn btn-default" type="button"
										onclick="search()">搜索</button>
								</span>
							</div>
							<!-- /input-group -->
						</div>
						<table id="tbImportant"></table>

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
	</div>
</body>


</html>
