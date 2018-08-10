<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>登录</title>
<meta name="description" content="这是一个 登录页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="comp/amazeui/i/app-icon72x72@2x.png">
<link rel="apple-touch-icon-precomposed"
	href="comp/amazeui/i/app-icon72x72@2x.png">
<!-- <meta name="apple-mobile-web-app-title" content="Amaze UI" /> -->
<link rel="stylesheet" href="comp/amazeui/css/amazeui.min.css" />
<link rel="stylesheet" href="comp/amazeui/css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="comp/amazeui/css/app.css">
<script src="js/common/jquery-1.9.1.js"></script>
<script src="comp/amazeui/js/theme.js"></script>
<script src="comp/amazeui/js/amazeui.min.js"></script>
<script src="comp/amazeui/js/app.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<!-- <body>
	<form action="login" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="username" type="text" value="admin" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password" type="password" value="admin" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录" /></td>
				<td><input type="button" value="取消" /></td>
			</tr>
		</table>
	</form>
</body> -->
<body data-type="login">
	<div class="am-g tpl-g">
		<!-- 风格切换 -->
		<div class="tpl-skiner">
			<div class="tpl-skiner-toggle am-icon-cog"></div>
			<div class="tpl-skiner-content">
				<div class="tpl-skiner-content-title">选择主题</div>
				<div class="tpl-skiner-content-bar">
					<span class="skiner-color skiner-white" data-color="theme-white"></span>
					<span class="skiner-color skiner-black" data-color="theme-black"></span>
				</div>
			</div>
		</div>
		<div class="tpl-login">
			<div class="tpl-login-content">
				<div class="tpl-login-logo"></div>
				<form class="am-form tpl-form-line-form">
					<div class="am-form-group">
						<input type="text" class="tpl-form-input" id="user-name"
							placeholder="请输入账号">
					</div>
					<div class="am-form-group">
						<input type="password" class="tpl-form-input" id="user-name"
							placeholder="请输入密码">
					</div>
					<div class="am-form-group tpl-login-remember-me">
						<input id="remember-me" type="checkbox"> <label
							for="remember-me"> 记住密码 </label>
					</div>
					<div class="am-form-group">
						<button type="button"
							class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">提交</button>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>
</html>
