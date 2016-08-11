package com.ueop.common.pojo;

import com.ueop.common.util.FastJsonUtils;

public class UEOPResult {
	//返回状态
	public Integer status;
	//错误信息
	public String msg;
	// 响应中的数据
	public Object data;
	
	public UEOPResult(){
		
	}
	public UEOPResult(Object data){
        this.status = 200;
        this.msg = "OK";
		this.data= data;
	}
	public UEOPResult(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	/**
	 * 返回成功
	 * @return
	 */
	public static UEOPResult ok(){
		return new UEOPResult(null);
	}
	
	/**
	 * 返回成功 data
	 * @param data
	 * @return
	 */
	public static UEOPResult ok(Object data){
		return new UEOPResult(data);
	}
	public static UEOPResult build(Integer status,String msg){
		return new UEOPResult(status,msg,null);
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * 没有object对象的转化
	 * 
	 * @param json
	 * @return
	 */
	public static UEOPResult format(String json) {
		try {
			return  FastJsonUtils.jsonToPojo(json, UEOPResult.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
