package com.ueop.sconfig.service;

import com.ueop.common.pojo.UEOPResult;

public interface WidgetService {
	public UEOPResult getAllWidget();
	public UEOPResult getAllById(Long id);
	public UEOPResult getAllByName(String name);
	
}
