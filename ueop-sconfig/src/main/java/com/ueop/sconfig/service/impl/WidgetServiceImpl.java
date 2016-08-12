package com.ueop.sconfig.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ueop.dao.mapper.WidgetMapper;
import com.ueop.dao.pojo.Widget;
import com.ueop.dao.pojo.WidgetExample;
import com.ueop.dao.pojo.WidgetExample.Criteria;
import com.ueop.sconfig.service.WidgetService;
@Service
public class WidgetServiceImpl implements WidgetService{
	
	@Autowired
	private WidgetMapper widgetMapper;
	
	@Override
	public List<Widget> getAllWidget() {
		WidgetExample example = new WidgetExample();
		List<Widget> allWidget = widgetMapper.selectByExample(example);
		return allWidget;
	}
	@Override
	public Widget getWidgetById(Long id) {
		Widget widget = widgetMapper.selectByPrimaryKey(id);
		return widget;
	}
	@Override
	public List<Widget>  getWidgetByName(String name) {
		WidgetExample example = new WidgetExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		List<Widget> widgets = widgetMapper.selectByExample(example);
		return widgets;
	}
}
