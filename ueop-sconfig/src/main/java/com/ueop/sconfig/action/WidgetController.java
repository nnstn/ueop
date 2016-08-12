package com.ueop.sconfig.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ueop.common.pojo.UEOPResult;
import com.ueop.dao.pojo.Widget;
import com.ueop.sconfig.service.WidgetService;

@Controller
@RequestMapping("/widget")
public class WidgetController {
	@Autowired
	private WidgetService widgetService;
	@RequestMapping("/all")
	@ResponseBody
	public UEOPResult getAllWidget(){
		List<Widget> result = widgetService.getAllWidget();
		return UEOPResult.ok(result);
	}
	@RequestMapping("/{id}/id")
	@ResponseBody
	public UEOPResult getAllById(@PathVariable Long id){
		Widget result = widgetService.getWidgetById(id);
		return UEOPResult.ok(result);
	}
	@RequestMapping("/{name}/name")
	@ResponseBody
	public UEOPResult getWidget(@PathVariable String name){
		List<Widget> widgets = widgetService.getWidgetByName(name);
		return UEOPResult.ok(widgets);
	}
}
