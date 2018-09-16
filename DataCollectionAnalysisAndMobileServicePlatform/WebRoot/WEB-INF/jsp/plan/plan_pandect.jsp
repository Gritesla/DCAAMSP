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
	src="${pageContext.request.contextPath }/ass/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" defer="defer"
	src="${pageContext.request.contextPath }/js/common/echarts.js"></script>
<style type="text/css">
.container-fluid {
	background-color: #e9ecf3;
}

body {
	font-family: "Segoe UI", "Lucida Grande", Helvetica, Arial,
		"Microsoft YaHei", FreeSans, Arimo, "Droid Sans",
		"wenquanyi micro hei", "Hiragino Sans GB", "Hiragino Sans GB W3",
		FontAwesome, sans-serif
}
</style>

<script type="text/javascript">
	function showProvince() {
		$.get('${pageContext.request.contextPath }/json/jiangsu.json',
				function(geoJson) {
					// myChart.hideLoading();

					echarts.registerMap('', geoJson);

					myChart
							.setOption(option = {
								backgroundColor : '#DDD',
								title : {
									text : '',
									left : 'center',
									textStyle : {
										color : '#fff'
									}
								},
								tooltip : {
									trigger : 'item',
									formatter : '{b}<br/>文本预案数：{c} (份)'
								},
								visualMap : {
									min : 0,
									max : 1262,
									text : [ '高', '低' ],
									realtime : false,
									calculable : true,
									inRange : {
										color : [ 'lightskyblue', 'yellow',
												'orangered' ]
									}
								},
								series : [ {
									type : 'map',
									mapType : name,
									label : {
										emphasis : {
											textStyle : {
												color : '#fff'
											}
										}
									},
									itemStyle : {
										normal : {
											borderColor : '#389BB7',
											areaColor : '#fff',
											label : {
												show : true
											}
										},
										emphasis : {
											areaColor : '#389BB7',
											borderWidth : 0
										}
									},
									data : [ {
										name : '连云港市',
										value : 349
									}, {
										name : '无锡市',
										value : 357
									}, {
										name : '常州市',
										value : 551
									}, {
										name : '南通市',
										value : 324
									}, {
										name : '南京市',
										value : 901
									}, {
										name : '泰州市',
										value : 240
									}, {
										name : '扬州市',
										value : 31
									}, {
										name : '徐州市',
										value : 1262
									}, {
										name : '宿迁市',
										value : 451
									}, {
										name : '苏州市',
										value : 950
									}, {
										name : '盐城市',
										value : 775
									}, {
										name : '淮安市',
										value : 646
									}, {
										name : '镇江市',
										value : 0
									} ],
									animation : false

								} ]
							});
				});
	}

	var currentIdx = 0;

	option = {
		graphic : [ {
			id : 'left-btn',
			type : 'circle',
			shape : {
				r : 20
			},
			style : {
				text : '<',
				fill : '#eee'
			},
			left : 10,
			top : 'middle',
			onclick : function() {
				currentIdx -= 1;
				if (currentIdx < 0) {
					currentIdx += provinces.length;
				}
				showProvince();
			}
		}, {
			id : 'right-btn',
			type : 'circle',
			shape : {
				r : 20
			},
			style : {
				text : '>',
				fill : '#eee'
			},
			top : 'middle',
			right : 10,
			onclick : function() {
				currentIdx = (currentIdx + 1) % provinces.length;
				showProvince();
			}
		} ],

		series : []
	};

	//showProvince();

	$(function() {
		myChart = echarts.init(document.getElementById('dvProvince'));
		showProvince();
	});
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
							class="fa fa-object-group"></span>预案管理 <small
							style="color: #B3B3B3;">预案总览</small>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							江苏省文本预案完成情况<small style="float: right;"><a
								style="cursor: pointer;">more</a></small>
						</h3>
					</div>
					<div class="panel-body">
						<div id="dvProvince" style="width: 100%;height:800px;"></div>
					</div>

				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							最新文本预案列表<small style="float: right;"><a
								style="cursor: pointer;">more</a></small>
						</h3>
					</div>
					<div class="panel-body">
						<table class="table table-hover table-bordered">
							<thead>
								<tr>
									<th style="width: 40%;text-align: center;">预案名称</th>
									<th style="width: 40%;text-align: center;">上传时间</th>
									<th style="width: 20%;text-align: center;">操作</th>
								</tr>
							</thead>
							<tbody style="text-align: center;">
								<tr>
									<td>连云港万达国际酒店管理有限公司基本预案</td>
									<td>2018/2/8 14:47</td>
									<td><button type="button"
											class="btn btn-primary btn-sm btn-split">编辑</button>
										<button type="button" class="btn btn-warning btn-sm btn-split">删除</button></td>
								</tr>
								<tr>
									<td>盐城东吴化工有限公司基本预案</td>
									<td>2018/2/8 14:47</td>
									<td><button type="button"
											class="btn btn-primary btn-sm btn-split">编辑</button>
										<button type="button" class="btn btn-warning btn-sm btn-split">删除</button></td>
								</tr>
								<tr>
									<td>德纳化工滨海有限公司基本预案</td>
									<td>2018/2/8 14:47</td>
									<td><button type="button"
											class="btn btn-primary btn-sm btn-split">编辑</button>
										<button type="button" class="btn btn-warning btn-sm btn-split">删除</button></td>
								</tr>
								<tr>
									<td>滨海吉尔多肽有限公司基本预案</td>
									<td>2018/2/8 14:47</td>
									<td><button type="button"
											class="btn btn-primary btn-sm btn-split">编辑</button>
										<button type="button" class="btn btn-warning btn-sm btn-split">删除</button></td>
								</tr>
								<tr>
									<td>中国工商银行赣榆县支行基本预案</td>
									<td>2018/2/8 14:46</td>
									<td><button type="button"
											class="btn btn-primary btn-sm btn-split">编辑</button>
										<button type="button" class="btn btn-warning btn-sm btn-split">删除</button></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							最新云卡片预案列表<small style="float: right;"><a
								style="cursor: pointer;">more</a></small>
						</h3>
					</div>
					<div class="panel-body">
						<table class="table table-hover table-bordered">
							<thead>
								<tr>
									<th style="width: 40%;text-align: center;">预案名称</th>
									<th style="width: 40%;text-align: center;">上传时间</th>
									<th style="width: 20%;text-align: center;">操作</th>
								</tr>
							</thead>
							<tbody style="text-align: center;">
								<tr>
									<td colspan="3">暂无数据</td>

								</tr>

							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							最新二维预案列表<small style="float: right;"><a
								style="cursor: pointer;">more</a></small>
						</h3>
					</div>
					<div class="panel-body">
						<table class="table table-hover table-bordered">
							<thead>
								<tr>
									<th style="width: 40%;text-align: center;">预案名称</th>
									<th style="width: 40%;text-align: center;">上传时间</th>
									<th style="width: 20%;text-align: center;">操作</th>
								</tr>
							</thead>
							<tbody style="text-align: center;">
								<tr>
									<td colspan="3">暂无数据</td>

								</tr>

							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							最新三维预案列表<small style="float: right;"><a
								style="cursor: pointer;">more</a></small>
						</h3>
					</div>
					<div class="panel-body">
					<table class="table table-hover table-bordered">
							<thead>
								<tr>
									<th style="width: 40%;text-align: center;">预案名称</th>
									<th style="width: 40%;text-align: center;">上传时间</th>
									<th style="width: 20%;text-align: center;">操作</th>
								</tr>
							</thead>
							<tbody style="text-align: center;">
								<tr>
									<td colspan="3">暂无数据</td>

								</tr>

							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>


</html>
