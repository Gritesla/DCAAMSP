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

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	var ctx = "http://192.168.1.3:8080/DataCollectionAnalysisAndMobileServicePlatform/";

	function init() {
		//alert($("body"));
	}

	function login() {
		//alert( "${pageContext.request.contextPath}/applogin");
		$.ajax({
			type : "post",
			url : ctx + "appLogin",
			contentType : "application/json;charset=utf-8",
			//dataType : "json",
			dataType : "jsonp",
			crossDomain : true,
			data : '{"userCustom":{"loginname":"admin","password":"123456"}}',
			//data : "loginname=admin&password=123456",
			success : function(msg) {
				alert("Data Saved: " + msg);
			},
			error : function(e) {
				alert(e);
			}
		});

	}

	function jumpToLogin() {

	}
</script>
</head>

<body onload="init()">
	<input type="button" value="请求登录" onclick="login()" />
	<!-- <input type="button" value="登录" onclick="jumpToLogin()" /> -->
	<a href="login">登录</a>
</body>
</html>
