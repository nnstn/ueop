function en_URI(str) {
	return encodeURI(encodeURI(str));
}
function commonajax(url,data,async,callback){
	jQuery.ajax({
		type : 'POST',
		url : en_URI(url),
		async : async,
		dataType : 'json',
		data:data,
		traditional:true,
		timeout:120000,
		success : function(data) {
			callback(data);
		},
		error : function(data) {
			
		}
	});
}

function commonajaxp(){
	var qsData = {'searchWord':$("#searchWord").attr("value"),'currentUserId':$("#currentUserId").attr("value"),'conditionBean.pageSize':$("#pageSize").attr("value")};
	$.ajax({
		async:false,
		url: http,//跨域的dns/document!searchJSONResult.action,
		type: "GET",
		dataType: 'jsonp',
		jsonp: 'jsoncallback',
		data: qsData,
		timeout: 5000,
			beforeSend: function(){
				//jsonp 方式此方法不被触发.原因可能是dataType如果指定为jsonp的话,就已经不是ajax事件了
			},
			success: function (json) {//客户端jquery预先定义好的callback函数,成功获取跨域服务器上的json数据后,会动态执行这个callback函数
				if(json.actionErrors.length!=0){
					alert(json.actionErrors);
				}
				genDynamicContent(qsData,type,json);
			},
			complete: function(XMLHttpRequest, textStatus){
				$.unblockUI({ fadeOut: 10 }); 
			},
			error: function(xhr){
				//jsonp 方式此方法不被触发.原因可能是dataType如果指定为jsonp的话,就已经不是ajax事件了
				//请求出错处理
				alert("请求出错(请检查相关度网络状况.)");
			}
	});
}
