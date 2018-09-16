function ajax(url,data,func){	
	$.ajax({
		type : "POST",
		url : url,
		data : data,
		contentType : "application/json;charset=utf-8",
		dataType : "json",
		success : function(d) {
			func(d);
		}
	});
}