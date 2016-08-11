package com.ueop.sconfig.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ueop.common.pojo.UEOPResult;
import com.ueop.sconfig.service.WidgetService;

@Controller
@RequestMapping("/widget")
public class WidgetController {
	@Autowired
	private WidgetService widgetService;
	@RequestMapping("/all")
	@ResponseBody
	public UEOPResult getAllWidget(){
		UEOPResult result = widgetService.getAllWidget();
		return result;
	}
	@RequestMapping("/{id}/id")
	@ResponseBody
	public UEOPResult getAllById(@PathVariable Long id){
		UEOPResult result = widgetService.getAllById(id);
		return result;
	}
	@RequestMapping("/{name}/name")
	@ResponseBody
	public UEOPResult getWidget(@PathVariable String name){
		UEOPResult result = widgetService.getAllByName(name);
		return result;
	}
}
