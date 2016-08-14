package com.ueop.common.util;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;


/**
 * 命令操作
 * @author wangjn_bj
 */
public class CommandUtil{
	
	private static final Logger logger = Logger.getLogger(CommandUtil.class);
	private static String osName= System.getProperty("os.name").toUpperCase();
	private static String OS_WINDOWS = "WINDOWS";

	/**
	 * 拷贝文件
	 * @param sourceFile		源文件绝对路径
	 * @param destDir			目标目录绝对路径
	 * @throws ServiceException
	 */
	public static void copyFile(String sourceFile, String destDir) {
		StringBuffer sb = new StringBuffer(256);
		if(StringUtils.contains(osName, OS_WINDOWS)){
			sb.append("cmd.exe /C  copy ").append(sourceFile).append(" ").append(destDir);
		}else{
			sb.append("cp ").append(sourceFile).append(" ").append(destDir);
		}
		execSystemCommon(sb.toString());
	}

	/**
	 * 移动文件
	 * param sourceFile			源文件绝对路径
	 * @param destDir			目标目录绝对路径
	 * @throws ServiceException
	 */
	public static void mvFile(String sourceFile, String destDir){
		StringBuffer sb = new StringBuffer(256);
		if(StringUtils.contains(osName, OS_WINDOWS)){
			sb.append("cmd.exe /C  move ").append(sourceFile).append(" ").append(destDir);
		}else{
			sb.append("mv ").append(sourceFile).append(" ").append(destDir);
		}
		execSystemCommon(sb.toString());
	}
	
	/**
	 * 删除文件
	 * param sourceFile			源文件绝对路径
	 * @throws ServiceException
	 */
	public static void rmFile(String sourceFile){
		StringBuffer sb = new StringBuffer(256);
		if(StringUtils.contains(osName, OS_WINDOWS)){
			sb.append("cmd.exe /C  rd /s /q ").append(sourceFile);
		}else{
			sb.append("rm -rf ").append(sourceFile);
		}
		execSystemCommon(sb.toString());
	}

	/**
	 * 执行操作系统命令
	 * @param command
	 * @throws ServiceException
	 */
	public static int execSystemCommon(String command){
		logger.info("start---------");
		long startTime = System.currentTimeMillis();
		try {
			Process proc = Runtime.getRuntime().exec(command);
			if (proc.waitFor() != 0) {  
                if (proc.exitValue() == 1)//p.exitValue()==0表示正常结束，1：非正常结束  
                   logger.error("fis 发布命令执行失败："+command);
                   return 0;
                
            }else{
            	
            	logger.info("fis 发布命令执行成功："+command+"   时间："+(System.currentTimeMillis()-startTime));
            	return 1;
            }
			
		} catch (IOException e) {
			throw new RuntimeException("执行系统命令失败",e);
			
		} catch(InterruptedException exp)
		{
			throw new RuntimeException("执行系统命令失败",exp);
		}
	}
	
	/**
	 * 
	* @Title: execFisRelease 
	* @Description: 执行fis发布 
	* @param     设定文件 
	* @return int    0:失败;1:成功
	 */
	public static int execFisRelease(String command){
		StringBuffer sb = new StringBuffer(256);
		if(StringUtils.contains(osName, OS_WINDOWS)){

			sb.append("cmd.exe /C ").append(command);
		}else{
			sb.append(command);
		}
		 return execSystemCommon(sb.toString()) ;
	}
}





