<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>数据统计页面</title>
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<script src="ass/amazeui/js/echarts.min.js"></script>
<link rel="stylesheet" href="ass/amazeui/css/amazeui.min.css" />
<link rel="stylesheet" href="ass/amazeui/css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="ass/amazeui/css/app.css">
<script src="js/common/jquery-1.9.1.js"></script>
</head>

<body>
	<script src="ass/amazeui/js/theme.js"></script>
	<div class="container-fluid am-cf">
		<div class="row">
			<div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
				<div class="page-header-heading">
					<span class="am-icon-home page-header-heading-icon"></span> 统计首页 <small>云数据服务平台</small>
				</div>
				<p class="page-header-description"></p>
			</div>
			<div class="am-u-lg-3 tpl-index-settings-button">
				<button type="button" class="page-header-button">
					<span class="am-icon-paint-brush"></span> 设置
				</button>
			</div>
		</div>
	</div>

	<div class="row-content am-cf">
		<div class="row  am-cf">
			<div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
				<div class="widget widget-white am-cf">
					<div class="widget-head am-cf">
						<div style="color: black;" class="widget-title am-fl">当月报警信息数</div>
						<div class="widget-function am-fr">
							<a href="javascript:;"
								class="widget-fluctuation-description-text">more</a>
						</div>
					</div>
					<div class="widget-body am-fr" style="text-align: center;">
						<span style="font-size: 20px;color: black;">次数：</span><span
							style="font-size: 35px;color: red;">34</span>

						<div class="am-fr am-cf">
							<div class="widget-fluctuation-description-text am-text-right">
								较上月减少次数</div>
							<div style="margin-top: 10px;text-align: center;"
								class="widget-fluctuation-description-amount text-success" am-cf>
								<span>12</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
				<div class="widget widget-yellow am-cf">
					<div class="widget-head am-cf">
						<div style="color: black;" class="widget-title am-fl">当月采集信息数</div>
						<div class="widget-function am-fr">
							<a href="javascript:;"
								class="widget-fluctuation-description-text">more</a>
						</div>
					</div>
					<div class="widget-body am-fr" style="text-align: center;">
						<span style="font-size: 20px;color: black;">数量：</span><span
							style="font-size: 35px;color: red;">312</span>
						<div class="am-fr am-cf">
							<div class="widget-fluctuation-description-text am-text-right">
								较上月减少次数</div>
							<div style="margin-top: 10px;text-align: center;"
								class="widget-fluctuation-description-amount text-success" am-cf>
								<span>42</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
				<div class="widget widget-blue am-cf">
					<div class="widget-head am-cf">
						<div style="color: black;" class="widget-title am-fl">当月新接入用户数</div>
						<div class="widget-function am-fr">
								<a href="javascript:;"
								class="widget-fluctuation-description-text">more</a>
						</div>
					</div>
					<div class="widget-body am-fr" style="text-align: center;">
						<span style="font-size: 20px;color: black;">数量：</span><span
							style="font-size: 35px;color: red;">16</span>

						<div class="am-fr am-cf">
							<div class="widget-fluctuation-description-text am-text-right">
								较上月减少次数</div>
							<div style="margin-top: 10px;text-align: center;"
								class="widget-fluctuation-description-amount text-success" am-cf>
								<span>2</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row am-cf">
			<div class="am-u-sm-12 am-u-md-8">
				<div class="widget am-cf">
					<div class="widget-head am-cf">
						<div class="widget-title am-fl">当月报警数曲线图</div>
						<div class="widget-function am-fr">
							<a href="javascript:;"
								class="widget-fluctuation-description-text">more</a>
						</div>
					</div>
					<div class="widget-body-md widget-body tpl-amendment-echarts am-fr"
						id="tpl-echarts"></div>
				</div>
			</div>
			<div class="am-u-sm-12 am-u-md-4">
				<div class="widget am-cf">
					<div class="widget-head am-cf">
						<div class="widget-title am-fl">接入用户数排名</div>
						<div class="widget-function am-fr">
							<a href="javascript:;"
								class="widget-fluctuation-description-text">more</a>
						</div>
					</div>
					<div class="widget-body widget-body-md am-fr">

						<div class="am-progress-title">
							CPU Load <span class="am-fr am-progress-title-more">28% /
								100%</span>
						</div>
						<div class="am-progress">
							<div class="am-progress-bar" style="width: 15%"></div>
						</div>
						<div class="am-progress-title">
							CPU Load <span class="am-fr am-progress-title-more">28% /
								100%</span>
						</div>
						<div class="am-progress">
							<div class="am-progress-bar  am-progress-bar-warning"
								style="width: 75%"></div>
						</div>
						<div class="am-progress-title">
							CPU Load <span class="am-fr am-progress-title-more">28% /
								100%</span>
						</div>
						<div class="am-progress">
							<div class="am-progress-bar am-progress-bar-danger"
								style="width: 35%"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row am-cf">
			<div class="am-u-sm-12 am-u-md-12 am-u-lg-4 widget-margin-bottom-lg ">
				<div class="widget am-cf  widget-body-lg">
					<div class="widget-head am-cf">
						<div class="widget-title am-fl">各区域接入占比图</div>
						<div class="widget-function am-fr">
								<a href="javascript:;"
								class="widget-fluctuation-description-text">more</a>
						</div>
					</div>
					<div class="widget-body-lg widget-body tpl-amendment-echarts am-fr"
						id="tpl-echarts"></div>
				</div>
			</div>

			<div class="am-u-sm-12 am-u-md-12 am-u-lg-8 widget-margin-bottom-lg">
				<div class="widget am-cf widget-body">
					<div class="widget-head am-cf">
						<div class="widget-title am-fl">待审核信息</div>
						<div class="widget-function am-fr">
								<a href="javascript:;"
								class="widget-fluctuation-description-text">more</a>
						</div>
					</div>
					<div class="widget-body widget-body-lg  am-fr">
						<div class="am-scrollable-horizontal">
							<table width="100%"
								class="am-table am-table-compact am-text-nowrap tpl-table-black "
								id="example-r">
								<thead>
									<tr>
										<th>标题</th>
										<th>用户</th>
										<th>时间</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<tr class="gradeX">
										<td>新加坡大数据初创公司 Latize 获 150 万美元风险融资</td>
										<td>张鹏飞</td>
										<td>2016-09-26</td>
										<td>
											<div class="tpl-table-black-operation">
												<a href="javascript:;"> <i class="am-icon-pencil"></i>
													审核
												</a> <a href="javascript:;"
													class="tpl-table-black-operation-del"> <i
													class="am-icon-trash"></i> 退回
												</a>
											</div>
										</td>
									</tr>
									<tr class="even gradeC">
										<td>自拍的“政治角色”：观众背对希拉里自拍合影表示“支持”</td>
										<td>天纵之人</td>
										<td>2016-09-26</td>
										<td>
											<div class="tpl-table-black-operation">
												<a href="javascript:;"> <i class="am-icon-pencil"></i>
													审核
												</a> <a href="javascript:;"
													class="tpl-table-black-operation-del"> <i
													class="am-icon-trash"></i> 退回
												</a>
											</div>
										</td>
									</tr>
									<tr class="gradeX">
										<td>关于创新管理，我想和你当面聊聊。</td>
										<td>王宽师</td>
										<td>2016-09-26</td>
										<td>
											<div class="tpl-table-black-operation">
												<a href="javascript:;"> <i class="am-icon-pencil"></i>
													审核
												</a> <a href="javascript:;"
													class="tpl-table-black-operation-del"> <i
													class="am-icon-trash"></i> 退回
												</a>
											</div>
										</td>
									</tr>
									<tr class="even gradeC">
										<td>究竟是趋势带动投资，还是投资引领趋势？</td>
										<td>着迷</td>
										<td>2016-09-26</td>
										<td>
											<div class="tpl-table-black-operation">
												<a href="javascript:;"> <i class="am-icon-pencil"></i>
													审核
												</a> <a href="javascript:;"
													class="tpl-table-black-operation-del"> <i
													class="am-icon-trash"></i> 退回
												</a>
											</div>
										</td>
									</tr>
									<tr class="even gradeC">
										<td>Docker领域再添一员，网易云发布“蜂巢”，加入云计算之争</td>
										<td>醉里挑灯看键</td>
										<td>2016-09-26</td>
										<td>
											<div class="tpl-table-black-operation">
												<a href="javascript:;"> <i class="am-icon-pencil"></i>
													审核
												</a> <a href="javascript:;"
													class="tpl-table-black-operation-del"> <i
													class="am-icon-trash"></i> 退回
												</a>
											</div>
										</td>
									</tr>


									<!-- more data -->
								</tbody>
							</table>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<script src="ass/amazeui/js/amazeui.min.js"></script>
	<script src="ass/amazeui/js/amazeui.datatables.min.js"></script>
	<script src="ass/amazeui/js/dataTables.responsive.min.js"></script>
</body>
</html>
