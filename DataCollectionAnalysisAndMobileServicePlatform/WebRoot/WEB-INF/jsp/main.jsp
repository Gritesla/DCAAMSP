<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>数据服务平台</title>
<meta name="description" content="这是一个 主页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<link rel="stylesheet" href="ass/font-awesome/css/font-awesome.min.css" />
<link rel="stylesheet" href="ass/amazeui/css/amazeui.min.css" />
<link rel="stylesheet" href="ass/amazeui/css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="ass/amazeui/css/app.css">
<script src="js/common/jquery-1.9.1.js"></script>

</head>

<body data-type="index" >
	<script src="ass/amazeui/js/theme.js"></script>
	<div class="am-g tpl-g">
		<!-- 头部 -->
		<header>
			<!-- logo -->
			<div class="am-fl tpl-header-logo">
				<a href="javascript:;"><img src="ass/amazeui/img/logo.png"
					alt=""></a>
			</div>
			<!-- 右侧内容 -->
			<div class="tpl-header-fluid">
				<!-- 侧边切换 -->
				<div class="am-fl tpl-header-switch-button am-icon-list">
					<span> </span>
				</div>
				<!-- 搜索 -->
				<div class="am-fl tpl-header-search">
					<form class="tpl-header-search-form" action="javascript:;">
						<button class="tpl-header-search-btn am-icon-search"></button>
						<input class="tpl-header-search-box" type="text"
							placeholder="搜索内容...">
					</form>
				</div>
				<canvas></canvas>
				<!-- 其它功能-->
				<div class="am-fr tpl-header-navbar">
					<ul>
						<!-- 欢迎语 -->
						<li class="am-text-sm tpl-header-navbar-welcome"><a
							href="javascript:;">欢迎你, <span>admin</span>
						</a></li>

						<!-- 新邮件 -->
						<li class="am-dropdown tpl-dropdown" data-am-dropdown><a
							href="javascript:;"
							class="am-dropdown-toggle tpl-dropdown-toggle"
							data-am-dropdown-toggle> <i class="am-icon-envelope"></i> <span
								class="am-badge am-badge-success am-round item-feed-badge">4</span>
						</a> <!-- 弹出列表 -->
							<ul class="am-dropdown-content tpl-dropdown-content">
								<li class="tpl-dropdown-menu-messages"><a
									href="javascript:;"
									class="tpl-dropdown-menu-messages-item am-cf">
										<div class="menu-messages-ico">
											<img src="ass/amazeui/img/user04.png" alt="">
										</div>
										<div class="menu-messages-time">3小时前</div>
										<div class="menu-messages-content">
											<div class="menu-messages-content-title">
												<i class="am-icon-circle-o am-text-success"></i> <span>夕风色</span>
											</div>
											<div class="am-text-truncate">Amaze UI 的诞生，依托于 GitHub
												及其他技术社区上一些优秀的资源；Amaze UI 的成长，则离不开用户的支持。</div>
											<div class="menu-messages-content-time">2016-09-21 下午
												16:40</div>
										</div>
								</a></li>
								<li class="tpl-dropdown-menu-messages"><a
									href="javascript:;"
									class="tpl-dropdown-menu-messages-item am-cf">
										<div class="menu-messages-ico">
											<img src="ass/amazeui/img/user02.png" alt="">
										</div>
										<div class="menu-messages-time">5天前</div>
										<div class="menu-messages-content">
											<div class="menu-messages-content-title">
												<i class="am-icon-circle-o am-text-warning"></i> <span>禁言小张</span>
											</div>
											<div class="am-text-truncate">为了能最准确的传达所描述的问题，
												建议你在反馈时附上演示，方便我们理解。</div>
											<div class="menu-messages-content-time">2016-09-16 上午
												09:23</div>
										</div>
								</a></li>
								<li class="tpl-dropdown-menu-messages"><a
									href="javascript:;"
									class="tpl-dropdown-menu-messages-item am-cf"> <i
										class="am-icon-circle-o"></i> 进入列表…
								</a></li>
							</ul></li>

						<!-- 新提示 -->
						<li class="am-dropdown" data-am-dropdown><a
							href="javascript:;" class="am-dropdown-toggle"
							data-am-dropdown-toggle> <i class="am-icon-bell"></i> <span
								class="am-badge am-badge-warning am-round item-feed-badge">5</span>
						</a> <!-- 弹出列表 -->
							<ul class="am-dropdown-content tpl-dropdown-content">
								<li class="tpl-dropdown-menu-notifications"><a
									href="javascript:;"
									class="tpl-dropdown-menu-notifications-item am-cf">
										<div class="tpl-dropdown-menu-notifications-title">
											<i class="am-icon-line-chart"></i> <span> 有6笔新的销售订单</span>
										</div>
										<div class="tpl-dropdown-menu-notifications-time">12分钟前</div>
								</a></li>
								<li class="tpl-dropdown-menu-notifications"><a
									href="javascript:;"
									class="tpl-dropdown-menu-notifications-item am-cf">
										<div class="tpl-dropdown-menu-notifications-title">
											<i class="am-icon-star"></i> <span> 有3个来自人事部的消息</span>
										</div>
										<div class="tpl-dropdown-menu-notifications-time">30分钟前</div>
								</a></li>
								<li class="tpl-dropdown-menu-notifications"><a
									href="javascript:;"
									class="tpl-dropdown-menu-notifications-item am-cf">
										<div class="tpl-dropdown-menu-notifications-title">
											<i class="am-icon-folder-o"></i> <span> 上午开会记录存档</span>
										</div>
										<div class="tpl-dropdown-menu-notifications-time">1天前</div>
								</a></li>


								<li class="tpl-dropdown-menu-notifications"><a
									href="javascript:;"
									class="tpl-dropdown-menu-notifications-item am-cf"> <i
										class="am-icon-bell"></i> 进入列表…
								</a></li>
							</ul></li>
						<!-- 设置 -->
						<li class="am-text-sm"><a href="logout"> <span
								class="am-icon-cog"></span> 设置
						</a></li>
						<!-- 退出 -->
						<li class="am-text-sm"><a href="logout"> <span
								class="am-icon-sign-out"></span> 退出
						</a></li>

					</ul>
				</div>
			</div>
		</header>
		<!-- 侧边导航栏 -->
		<div id="dvLeft" class="left-sidebar">
			<!-- 用户信息 -->
			<div class="tpl-sidebar-user-panel">
				<div class="tpl-user-panel-slide-toggleable">
					<div class="tpl-user-panel-profile-picture">
						<img src="ass/amazeui/img/user04.png" alt="">
					</div>
					<span class="user-panel-logged-in-text"> <i
						class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
						admin
					</span> <a href="javascript:;" class="tpl-user-panel-action-link"> <span
						class="am-icon-pencil"></span> 账号设置
					</a>
				</div>
			</div>
			<!-- 菜单 -->
			<ul class="sidebar-nav">
				<shiro:hasPermission name="1">
					<li class="sidebar-nav-link"><a
						onclick="jumpTo(this,'statistics')" href="javascript:;"
						class="active"> <i class="am-icon-home sidebar-nav-link-logo"></i>
							数据统计
					</a></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="2">
					<li class="sidebar-nav-link"><a
						onclick="jumpTo(this,'user/manage')" href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-calendar sidebar-nav-link-logo"></i> 用户管理
					</a></li>
				</shiro:hasPermission>


				<shiro:hasPermission name="3">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-wpforms sidebar-nav-link-logo"></i> 权限管理<span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="31">
								<li class="sidebar-nav-link"><a
									onclick="jumpTo(this,'auth/group')" href="javascript:;"> <span
										class="am-icon-angle-right sidebar-nav-link-logo"></span>
										权限组设定
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="32">
								<li class="sidebar-nav-link"><a
									onclick="jumpTo(this,'auth/setting')" href="javascript:;">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										用户权限设定
								</a></li>
							</shiro:hasPermission>
						</ul></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="5">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-table sidebar-nav-link-logo"></i> 审核管理 <span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="51">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										信息审核
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="52">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										报警审核
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="53">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										预案审核
								</a></li>
							</shiro:hasPermission>
						</ul></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="5">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-table sidebar-nav-link-logo"></i> 任务管理 <span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="51">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										任务总览
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="52">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										任务审核
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="53">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										任务下发
								</a></li>
							</shiro:hasPermission>
						</ul></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="6">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-key sidebar-nav-link-logo"></i> 作战管理<span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="61">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										作战指挥
								</a></li>
								<shiro:hasPermission name="62"></shiro:hasPermission>
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										作战单元
								</a></li>
							</shiro:hasPermission>
						</ul></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="7">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-table sidebar-nav-link-logo"></i> 报警管理<span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="41">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										报警信息总览
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="41">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										历史信息查询
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="43">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										已审核信息
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="44">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										误报信息
								</a></li>
							</shiro:hasPermission>
						</ul></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="4">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-bar-chart sidebar-nav-link-logo"></i> 信息管理<span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="41">
								<li class="sidebar-nav-link"><a
									onclick="jumpTo(this,'info/important')" href="javascript:;">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										重点部位信息
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="41">
								<li class="sidebar-nav-link"><a onclick="jumpTo(this,'info/small')" href="javascript:;">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										九小场所信息
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="42">
								<li class="sidebar-nav-link"><a
									onclick="jumpTo(this,'info/detachment')" href="javascript:;">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										执勤力量信息 
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="43">
								<li class="sidebar-nav-link"><a onclick="jumpTo(this,'info/park')" href="javascript:;">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										化工园区信息
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="43">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										战备物资信息
								</a></li>
							</shiro:hasPermission>
						</ul></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="4">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i class="fa fa-object-group"
							style="margin-right: 12px;"></i> 预案管理<span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="43">
								<li class="sidebar-nav-link"><a
									onclick="jumpTo(this,'plan/pandect')" href="javascript:;">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										预案总览
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="41">
								<li class="sidebar-nav-link"><a onclick="jumpTo(this,'plan/basic')" href="javascript:;">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										文本预案
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="41">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										卡片预案
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="41">
								<li class="sidebar-nav-link"><a
									onclick="jumpTo(this,'plan/2d/pandect')" href="javascript:;">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										二维预案
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="42">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										三维预案
								</a></li>
							</shiro:hasPermission>

						</ul></li>
				</shiro:hasPermission>

				<!-- <li class="sidebar-nav-link"><a href="sign-up.html"> <i
						class="am-icon-clone sidebar-nav-link-logo"></i> 注册 <span
						class="am-badge am-badge-secondary sidebar-nav-link-logo-ico am-round am-fr am-margin-right-sm">6</span>
				</a></li> -->
			</ul>
		</div>


		<!-- 内容区域 -->
		<div id="dvMain" class="tpl-content-wrapper"></div>
	</div>

	<script src="ass/amazeui/js/amazeui.min.js"></script>
	<script src="ass/amazeui/js/amazeui.datatables.min.js"></script>
	<script src="ass/amazeui/js/dataTables.responsive.min.js"></script>
	<!-- 	<script src="ass/amazeui/js/app.js"></script> -->
	<script src="js/pages/main.js"></script>

</body>
</html>
