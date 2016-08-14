package com.ueop.common.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OSUtil {
	/**
	 * 获取系统版本
	 * @return
	 */
	public static String getSystemVesrion(){
		return System.getProperty("os.name").toUpperCase();
	}
	
	
	public static void main(String[] args) throws Exception {
		//System.out.println(OSUtil.getSystemVesrion());
	}
}
