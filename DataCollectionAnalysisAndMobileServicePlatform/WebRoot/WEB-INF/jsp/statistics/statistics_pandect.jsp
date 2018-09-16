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
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/common/echarts.js"></script>
<script type="text/javascript"
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
	max-width: calc(100% - 20px);
	margin-left: 10px;
	margin-top: 10px;
}

.clear-mp {
	margin: 0;
	padding: 0;
}

.btn-split {
	margin-left: 10px;
	margin-left: 10px;
}

.alarm-word {
	font-size: 20px;
	color: red;
}
</style>

<script type="text/javascript">
	var myChart;
	$(function() {

		//alert();

		myChart = echarts.init(document.getElementById('dvAlarm'));
		myChart.setOption(alarmOption);

		resize();
	});

	function resize() {
		$(parent.document.getElementById('frmMain')).css("height",
				((parseInt($(".container-fluid").height()) + "px")));
		myChart.resize();

	}

	var data = [ 220, 182, 191, 234, 290, 330, 310, 123, 442, 321, 90, 149,
			210, 122, 133, 334, 198, 123, 125, 220 ];
	var yMax = 500;
	var dataShadow = [];

	for (var i = 0; i < data.length; i++) {
		dataShadow.push(yMax);
	}

	var alarmOption = {
		/* title : {
			text : '特性示例：渐变色 阴影 点击缩放',
			subtext : 'Feature Sample: Gradient Color, Shadow, Click Zoom'
		}, */
		xAxis : [ {
			type : 'category',
			data : [ '1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月',
					'10月', '11月', '12月' ],
			axisPointer : {
				type : 'shadow'
			}
		} ],
		yAxis : {
			axisLine : {
				show : false
			},
			axisTick : {
				show : false
			},
			axisLabel : {
				textStyle : {
					color : '#999'
				}
			}
		},
		dataZoom : [ {
			type : 'inside'
		} ],
		series : [ { // For shadow
			type : 'bar',
			itemStyle : {
				normal : {
					color : 'rgba(0,0,0,0.05)'
				}
			},
			barGap : '-100%',
			barCategoryGap : '40%',
			data : dataShadow,
			animation : false
		}, {
			type : 'bar',
			itemStyle : {
				normal : {
					color : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {
						offset : 0,
						color : '#83bff6'
					}, {
						offset : 0.5,
						color : '#188df0'
					}, {
						offset : 1,
						color : '#188df0'
					} ])
				},
				emphasis : {
					color : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {
						offset : 0,
						color : '#2378f7'
					}, {
						offset : 0.7,
						color : '#2378f7'
					}, {
						offset : 1,
						color : '#83bff6'
					} ])
				}
			},
			data : data
		} ]
	};
</script>
</head>
<body style="overflow: hidden;" onresize="resize()">
	<div class="container-fluid clear-mp">
		<div class="row ">

			<div class="col-md-3 ">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">报警信息数汇总</div>
					</div>
					<div class="panel-body"
						style="text-align: center;font-size: 16px;letter-spacing: 5px;height: 300px;">
						<div>
							共接收报警<span class="alarm-word">--</span>个
						</div>
						<div>
							已核实报警<span class="alarm-word">--</span>个
						</div>
						<div>
							当月出警<span class="alarm-word">--</span>次
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-9 ">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">历史报警信息数</div>
					</div>
					<div class="panel-body"
						style="text-align: center;font-size: 16px;letter-spacing: 5px;height: 300px;">
						<div id="dvAlarm" style="height: 100%;"></div>
					</div>
				</div>
			</div>
		</div>


		<div class="row ">
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">最近一月审核信息</div>
					</div>
					<div class="panel-body">暂无数据</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">各支队提交审核数</div>
					</div>
					<div class="panel-body">暂无数据</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">各支队审核通过数</div>
					</div>
					<div class="panel-body">暂无数据</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">预案数统计</div>
					</div>
					<div class="panel-body">暂无数据</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">最新预案列表</div>
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
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">近一月各支队提交预案数</div>
					</div>
					<div class="panel-body">暂无数据</div>
				</div>
			</div>
		</div>
	</div>
</body>


</html>
