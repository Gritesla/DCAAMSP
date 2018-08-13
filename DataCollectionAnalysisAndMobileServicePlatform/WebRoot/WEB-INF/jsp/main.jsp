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
<title>主页面</title>
<meta name="description" content="这是一个 主页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<!-- <meta http-equiv="Cache-Control" content="no-siteapp" /> -->
<!-- <script src="ass/amazeui/js/echarts.min.js"></script> -->
<link rel="stylesheet" href="ass/amazeui/css/amazeui.min.css" />
<link rel="stylesheet" href="ass/amazeui/css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="ass/amazeui/css/app.css">
<script src="js/common/jquery-1.9.1.js"></script>

</head>

<body data-type="index">
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
		<!-- 风格切换 -->
		<!-- <div class="tpl-skiner">
			<div class="tpl-skiner-toggle am-icon-cog"></div>
			<div class="tpl-skiner-content">
				<div class="tpl-skiner-content-title">选择主题</div>
				<div class="tpl-skiner-content-bar">
					<span class="skiner-color skiner-white" data-color="theme-white"></span>
					<span class="skiner-color skiner-black" data-color="theme-black"></span>
				</div>
			</div>
		</div> -->
		<!-- 侧边导航栏 -->
		<div class="left-sidebar">
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
				<shiro:hasPermission name="7">
					<li class="sidebar-nav-link"><a
						onclick="jumpTo(this,'statistics')" href="javascript:;"> <i
							class="am-icon-table sidebar-nav-link-logo"></i> 报警信息
					</a></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="2">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-calendar sidebar-nav-link-logo"></i> 用户管理 <span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="21">
								<li class="sidebar-nav-link"><a
									onclick="jumpTo(this,'userList')" href="javascript:;"> <span
										class="am-icon-angle-right sidebar-nav-link-logo"></span>
										采集端用户
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="22">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										作战端用户
								</a></li>
							</shiro:hasPermission>
						</ul></li>
				</shiro:hasPermission>
				<shiro:hasPermission name="3">
					<li class="sidebar-nav-link"><a href="javascript:;"
						class="sidebar-nav-sub-title"> <i
							class="am-icon-wpforms sidebar-nav-link-logo"></i> 权限管理<span
							class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
					</a>
						<ul class="sidebar-nav sidebar-nav-sub">
							<shiro:hasPermission name="31">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										权限组设定
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="32">
								<li class="sidebar-nav-link"><a href="table-list-img.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										用户权限设定
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
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										历史信息列表
								</a></li>
							</shiro:hasPermission>
							<shiro:hasPermission name="42">
								<li class="sidebar-nav-link"><a href="table-list.html">
										<span class="am-icon-angle-right sidebar-nav-link-logo"></span>
										待审核信息
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
										未通过信息
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
				<li class="sidebar-nav-link"><a href="sign-up.html"> <i
						class="am-icon-clone sidebar-nav-link-logo"></i> 注册 <span
						class="am-badge am-badge-secondary sidebar-nav-link-logo-ico am-round am-fr am-margin-right-sm">6</span>
				</a></li>
			</ul>
		</div>


		<!-- 内容区域 -->
		<div id="dvMain" class="tpl-content-wrapper">
			<!-- <iframe scrolling="auto" frameborder="0" src="statistics"
				style="width:100%;height:1200px;"></iframe> -->

		</div>
	</div>

	<script src="ass/amazeui/js/amazeui.min.js"></script>
	<script src="ass/amazeui/js/amazeui.datatables.min.js"></script>
	<script src="ass/amazeui/js/dataTables.responsive.min.js"></script>
	<!-- 	<script src="ass/amazeui/js/app.js"></script> -->
	<script src="js/pages/main.js"></script>

</body>
</html>
