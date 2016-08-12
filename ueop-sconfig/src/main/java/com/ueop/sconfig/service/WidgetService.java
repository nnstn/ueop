package com.ueop.sconfig.service;

import java.util.List;
import com.ueop.dao.pojo.Widget;

public interface WidgetService {
	public List<Widget> getAllWidget();
	public Widget getWidgetById(Long id);
	public List<Widget> getWidgetByName(String name);
	
}
