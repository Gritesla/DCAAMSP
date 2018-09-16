var map, blist = [], districtLoading = 0;
$(function() {
	// 创建地图实例
	// map = new BMap.Map("container");
	// minZoom：设置地图允许的最小级别，maxZoom：设置地图允许的最大级别
	map = new BMap.Map("dvMap", {
		minZoom : 9,
		maxZoom : 18,
		enableMapClick : false
	});
	// 设置中心点坐标
	var point = new BMap.Point(116.404, 39.915);
	// 地图初始化，同时设置地图展示级别
	// 开启鼠标滚轮缩放
	map.enableScrollWheelZoom(true);
	// 去除路网
	map.setMapStyle({
		styleJson : [ {
			"featureType" : "road",
			"elementType" : "all",
			"stylers" : {
				"color" : "#ffffff",
				"visibility" : "off"
			}
		} ]
	});
	setTimeout(function() {
		getBoundary();
	}, 100);
	// 创建控件
	//var menuCtrl = new MenuControl();
	// 添加到地图当中
	//map.addControl(menuCtrl);
});

function getBoundary() {
	addDistrict("南京市");
	addDistrict("无锡市");
	addDistrict("徐州市");
	addDistrict("常州市");
	addDistrict("苏州市");
	addDistrict("南通市");
	addDistrict("连云港市");
	addDistrict("淮安市");
	addDistrict("盐城市");
	addDistrict("扬州市");
	addDistrict("镇江市");
	addDistrict("泰州市");
	addDistrict("宿迁市");
	// 添加地图类型和缩略图
	var overViewOpen = new BMap.OverviewMapControl({
		isOpen : true,
		anchor : BMAP_ANCHOR_BOTTOM_RIGHT
	});
	map.addControl(overViewOpen); // 右下角，打开
	// 添加控件和比例尺
	var top_left_navigation = new BMap.NavigationControl(); // 左上角，添加默认缩放平移控件
	map.addControl(top_left_navigation);
}

/**
 * 添加行政区划
 * 
 * @param districtName
 *            行政区划名
 * @returns 无返回值
 */
function addDistrict(districtName) {
	// 使用计数器来控制加载过程
	districtLoading++;
	var bdary = new BMap.Boundary();
	bdary.get(districtName, function(rs) { // 获取行政区域
		var count = rs.boundaries.length; // 行政区域的点有多少个
		if (count === 0) {
			alert('未能获取当前输入行政区域');
			return;
		}
		for (var i = 0; i < count; i++) {
			blist.push({
				points : rs.boundaries[i],
				name : districtName
			});
		}
		// 加载完成区域点后计数器-1
		districtLoading--;
		if (districtLoading == 0) {
			// 全加载完成后画端点
			drawBoundary();
		}
	});
}

function drawBoundary() {
	// 包含所有区域的点数组
	var pointArray = [];
	/*
	 * 画遮蔽层的相关方法 思路: 首先在中国地图最外画一圈，圈住理论上所有的中国领土，然后再将每个闭合区域合并进来，并全部连到西北角。
	 * 这样就做出了一个经过多次西北角的闭合多边形
	 */
	// 定义中国东南西北端点，作为第一层
	var pNW = {
		lat : 59.0,
		lng : 73.0
	};
	var pNE = {
		lat : 59.0,
		lng : 136.0
	};
	var pSE = {
		lat : 3.0,
		lng : 136.0
	};
	var pSW = {
		lat : 3.0,
		lng : 73.0
	};
	// 向数组中添加一次闭合多边形，并将西北角再加一次作为之后画闭合区域的起点
	var pArray = [];
	pArray.push(pNW);
	pArray.push(pNE);
	pArray.push(pSE);
	pArray.push(pSW);
	pArray.push(pNW);
	// 循环添加各闭合区域
	for (var i = 0; i < blist.length; i++) {
		// 添加显示用标签层
		/*
		 * var label = new BMap.Label(blist[i].name, { offset : new
		 * BMap.Size(20, -10) }); label.hide(); map.addOverlay(label);
		 */

		// 添加多边形层并显示
		var ply = new BMap.Polygon(blist[i].points, {
			strokeWeight : 3,
			strokeColor : "#FF0000",
			fillOpacity : 0.01,
			fillColor : " #FFFFFF"
		}); // 建立多边形覆盖物
		map.addOverlay(ply);
		// 将点增加到视野范围内
		var path = ply.getPath();
		pointArray = pointArray.concat(path);
		// 将闭合区域加到遮蔽层上，每次添加完后要再加一次西北角作为下次添加的起点和最后一次的终点
		pArray = pArray.concat(path);
		pArray.push(pArray[0]);
	}
	map.setViewport(pointArray); // 调整视野
	// 添加遮蔽层
	var plyall = new BMap.Polygon(pArray, {
		strokeOpacity : 0.0000001,
		strokeColor : "#000000",
		strokeWeight : 0.00001,
		fillColor : "#ddd",
		fillOpacity : 0.8
	}); // 建立多边形覆盖物
	map.addOverlay(plyall);
}

// 定义一个控件类,即function
function MenuControl() {
	// 默认停靠位置和偏移量
	this.defaultAnchor = BMAP_ANCHOR_TOP_LEFT;
	this.defaultOffset = new BMap.Size(80, 30);
}

// 通过JavaScript的prototype属性继承于BMap.Control
MenuControl.prototype = new BMap.Control();

// 自定义控件必须实现自己的initialize方法,并且将控件的DOM元素返回
// 在本方法中创建个div元素作为控件的容器,并将其添加到地图容器中
MenuControl.prototype.initialize = function(map) {
	// 创建一个DOM元素
	var img = document.createElement("img");
	// 添加文字说明
	// div.appendChild(document.createTextNode("放大2级"));
	// 设置样式
	img.style.cursor = "pointer";
	img.style.border = "0px solid gray";
	img.src = "../img/menu.png";
	img.style.width = "32px";
	img.style.height = "32px";
	img.id = "imgMenu";
	// 绑定事件,点击一次放大两级
	img.onclick = function(e) {
		map.setZoom(map.getZoom() + 2);
	}
	// 添加DOM元素到地图中
	map.getContainer().appendChild(img);
	// 将DOM元素返回
	return img;
}

var ac = new BMap.Autocomplete( // 建立一个自动完成的对象
{
	"input" : "suggestId",
	"location" : map
});

ac.addEventListener("onhighlight", function(e) { // 鼠标放在下拉列表上的事件
	var str = "";
	var _value = e.fromitem.value;
	var value = "";
	if (e.fromitem.index > -1) {
		value = _value.province + _value.city + _value.district + _value.street
				+ _value.business;
	}
	str = "FromItem<br />index = " + e.fromitem.index + "<br />value = "
			+ value;

	value = "";
	if (e.toitem.index > -1) {
		_value = e.toitem.value;
		value = _value.province + _value.city + _value.district + _value.street
				+ _value.business;
	}
	str += "<br />ToItem<br />index = " + e.toitem.index + "<br />value = "
			+ value;
	document.getElementById("searchResultPanel").innerHTML = str;
});

var myValue;
ac.addEventListener("onconfirm", function(e) { // 鼠标点击下拉列表后的事件
	var _value = e.item.value;
	myValue = _value.province + _value.city + _value.district + _value.street
			+ _value.business;
	document.getElementById("searchResultPanel").innerHTML = "onconfirm<br />index = " + e.item.index
			+ "<br />myValue = " + myValue;

	setPlace();
});

function setPlace() {
	//map.clearOverlays(); // 清除地图上所有覆盖物
	function myFun() {
		var pp = local.getResults().getPoi(0).point; // 获取第一个智能搜索的结果
		map.centerAndZoom(pp, 18);
		map.addOverlay(new BMap.Marker(pp)); // 添加标注
	}
	var local = new BMap.LocalSearch(map, { // 智能搜索
		onSearchComplete : myFun
	});
	local.search(myValue);
}