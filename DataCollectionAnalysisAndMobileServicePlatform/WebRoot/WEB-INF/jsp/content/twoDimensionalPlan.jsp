<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>二维预案页面</title>
<script src="js/common/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=uMhAECOvUmpfkbB6Gwn42Yk10oXwnhW0"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/library/AreaRestriction/1.2/src/AreaRestriction_min.js"></script>
<script src="js/pages/twoDimensionalPlan.js"></script>
<style type="text/css">
html {
	height: 100%
}

body {
	height: 100%;
	margin: 0px;
	padding: 0px
}

#dvMap {
	height: 100%
}
</style>
</head>

<body>
	<div id="dvMap"></div>
	<div style="position: absolute;right:30px;top:30px;"><img src="img/search.png" style="position:absolute; width: 25px;height: 25px;left:-30px;top:3px;"/>
		<input type="text" id="suggestId" size="20" value="百度" 
			style="width:200px;height: 25px;" />
		<div id="searchResultPanel"
			style="border:1px solid #C0C0C0;width:150px;height:auto; display:none;"></div>
	</div>
</body>
</html>
