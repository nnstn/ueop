package com.ueop.sconfig.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ueop.common.pojo.UEOPResult;
import com.ueop.dao.mapper.WidgetMapper;
import com.ueop.dao.pojo.Widget;
import com.ueop.sconfig.service.WidgetService;
@Service
public class WidgetServiceImpl implements WidgetService{
	
	@Autowired
	private WidgetMapper widgetMapper;
	
	@Override
	public UEOPResult getAllWidget() {
		List<Widget> allWidget = widgetMapper.getAllWidget();
		return UEOPResult.ok(allWidget);
	}
	@Override
	public UEOPResult getAllById(Long id) {
		Widget widget = widgetMapper.getWidgetById(id);
		return UEOPResult.ok(widget);
	}
	@Override
	public UEOPResult getAllByName(String name) {
		List<Widget> widgets = widgetMapper.getWidgetByName(name);
		return UEOPResult.ok(widgets);
	}
}
