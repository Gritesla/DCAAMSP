<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>数据统计页面</title>
<meta name="description" content="这是一个 数据统计页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<script src="ass/amazeui/js/echarts.min.js"></script>
<link rel="stylesheet" href="ass/amazeui/css/amazeui.min.css" />
<link rel="stylesheet" href="ass/amazeui/css/app.css">
<script src="js/common/jquery-1.9.1.js"></script>

<script type="text/javascript">
	$(function() {
		var $modal = $('#your-modal');
		$modal.siblings('.am-btn').on('click', function(e) {
			var $target = $(e.target);
			if (($target).hasClass('js-modal-open')) {
				$modal.modal();
			} else if (($target).hasClass('js-modal-close')) {
				$modal.modal('close');
			} else {
				$modal.modal('toggle');
			}
		});
	});
</script>
</head>

<body>
	<script src="ass/amazeui/js/theme.js"></script>
	<div class="container-fluid am-cf">
		<div class="row">
			<div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
				<div class="page-header-heading">
					<span class="am-icon-wpforms page-header-heading-icon"></span> 权限管理
					<small>/权限组设定</small>
				</div>
				<p class="page-header-description"></p>
			</div>
		</div>

	</div>

	<div class="am-panel am-panel-default">
		<div class="am-panel-bd">这是一个基本的面板组件。</div>
		<div class="widget-body  am-fr">
			<div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
				<div class="am-form-group">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button"
								class="am-btn am-btn-default am-btn-success">
								<span class="am-icon-plus"></span> 新增
							</button>
							<!-- <button type="button"
								class="am-btn am-btn-default am-btn-secondary">
								<span class="am-icon-save"></span> 保存
							</button>
							<button type="button"
								class="am-btn am-btn-default am-btn-warning">
								<span class="am-icon-archive"></span> 审核
							</button>
							<button type="button" class="am-btn am-btn-default am-btn-danger">
								<span class="am-icon-trash-o"></span> 删除
							</button> -->
						</div>
					</div>
				</div>
			</div>
			<div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
				<div class="am-form-group tpl-table-list-select">
					<select data-am-selected="{btnSize: 'sm'}">
						<option value="option1">权限组名</option>
						<option value="option2">创建人</option>
					</select>
				</div>
			</div>
			<div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
				<div
					class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
					<input type="text" class="am-form-field "> <span
						class="am-input-group-btn">
						<button
							class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search"
							type="button"></button>
					</span>
				</div>
			</div>

			<div class="am-u-sm-12">
				<table width="100%"
					class="am-table am-table-bordered am-table-centered" id="example-r">
					<thead>
						<tr>
							<th>权限组名</th>
							<th>创建人</th>
							<th>时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr class="gradeX">
							<td>Amaze UI 模式窗口</td>
							<td>张鹏飞</td>
							<td>2016-09-26</td>
							<td>
								<div class="tpl-table-black-operation">
									<a href="javascript:;"> <i class="am-icon-pencil"></i> 编辑
									</a> <a href="javascript:;" class="tpl-table-black-operation-del">
										<i class="am-icon-trash"></i> 删除
									</a>
								</div>
							</td>
						</tr>
						<tr class="even gradeC">
							<td>有适配微信小程序的计划吗</td>
							<td>天纵之人</td>
							<td>2016-09-26</td>
							<td>
								<div class="tpl-table-black-operation">
									<a href="javascript:;"> <i class="am-icon-pencil"></i> 编辑
									</a> <a href="javascript:;" class="tpl-table-black-operation-del">
										<i class="am-icon-trash"></i> 删除
									</a>
								</div>
							</td>
						</tr>
						<tr class="gradeX">
							<td>请问有没有amazeui 分享插件</td>
							<td>王宽师</td>
							<td>2016-09-26</td>
							<td>
								<div class="tpl-table-black-operation">
									<a href="javascript:;"> <i class="am-icon-pencil"></i> 编辑
									</a> <a href="javascript:;" class="tpl-table-black-operation-del">
										<i class="am-icon-trash"></i> 删除
									</a>
								</div>
							</td>
						</tr>
						<tr class="even gradeC">
							<td>关于input输入框的问题</td>
							<td>着迷</td>
							<td>2016-09-26</td>
							<td>
								<div class="tpl-table-black-operation">
									<a href="javascript:;"> <i class="am-icon-pencil"></i> 编辑
									</a> <a href="javascript:;" class="tpl-table-black-operation-del">
										<i class="am-icon-trash"></i> 删除
									</a>
								</div>
							</td>
						</tr>
						<tr class="even gradeC">
							<td>有没有发现官网上的下载包不好用</td>
							<td>醉里挑灯看键</td>
							<td>2016-09-26</td>
							<td>
								<div class="tpl-table-black-operation">
									<a href="javascript:;"> <i class="am-icon-pencil"></i> 编辑
									</a> <a href="javascript:;" class="tpl-table-black-operation-del">
										<i class="am-icon-trash"></i> 删除
									</a>
								</div>
							</td>
						</tr>

						<tr class="even gradeC">
							<td>我建议WEB版本文件引入问题</td>
							<td>罢了</td>
							<td>2016-09-26</td>
							<td>
								<div class="tpl-table-black-operation">
									<a href="javascript:;"
										data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 800, height: 900}">
										<i class="am-icon-pencil"></i> 编辑
									</a> <a href="javascript:;" class="tpl-table-black-operation-del">
										<i class="am-icon-trash"></i> 删除
									</a>
								</div>
							</td>
						</tr>
						<!-- more data -->
					</tbody>
				</table>
			</div>
			<div class="am-u-lg-12 am-cf">
				<div class="am-fr">
					<ul class="am-pagination tpl-pagination">
						<li class="am-disabled"><a href="#">«</a></li>
						<li class="am-active"><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">»</a></li>
					</ul>
				</div>
			</div>
		</div>
		<button type="button" class="am-btn am-btn-primary" 
			data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 800, height: 900}">
			Modal</button>
	</div>



	<div class="am-modal am-modal-no-btn" tabindex="-1" id="doc-modal-1"
		id="your-modal">
		<div class="am-modal-dialog">
			<div class="am-modal-hd">
				权限选择<a href="javascript: void(0)" class="am-close am-close-spin"
					data-am-modal-close>&times;</a>
			</div>
			<div class="am-modal-bd">
				<div class="row-content">
					<div class="widget widget-white">
						<table style="color: black;"
							class="am-table am-table-bordered am-table-centered">
							<tr>
								<th>一级菜单</th>
								<th>二级菜单</th>
								<th>操作</th>
							</tr>
							<tr>
								<td rowspan="2" class="am-text-middle">$50</td>
								<td>January</td>
								<td>$100</td>
							</tr>
							<tr>
								<td>February</td>
								<td>$80</td>
							</tr>
							<tr>
								<td rowspan="2" class="am-text-middle">$50</td>
								<td>January</td>
								<td>$100</td>
							</tr>
							<tr>
								<td>February</td>
								<td>$80</td>
							</tr>
							<tr>
								<td rowspan="2" class="am-text-middle">$50</td>
								<td>January</td>
								<td>$100</td>
							</tr>
							<tr>
								<td>February</td>
								<td>$80</td>
							</tr>
							<tr>
								<td rowspan="2" class="am-text-middle">$50</td>
								<td>January</td>
								<td>$100</td>
							</tr>
							<tr>
								<td>February</td>
								<td>$80</td>
							</tr>
							<tr>
								<td rowspan="2" class="am-text-middle">$50</td>
								<td>January</td>
								<td>$100</td>
							</tr>
							<tr>
								<td>February</td>
								<td>$80</td>
							</tr>
							<tr>
								<td rowspan="2" class="am-text-middle">$50</td>
								<td>January</td>
								<td>$100</td>
							</tr>
							<tr>
								<td>February</td>
								<td>$80</td>
							</tr>
						</table>
					</div>


				</div>
			</div>
		</div>
	</div>


</body>
<script src="ass/amazeui/js/amazeui.min.js"></script>
<script src="ass/amazeui/js/amazeui.datatables.min.js"></script>
<script src="ass/amazeui/js/dataTables.responsive.min.js"></script>
</html>
