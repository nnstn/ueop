package com.ueop.sconfig.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ueop.common.pojo.UEOPResult;
import com.ueop.common.util.ExceptionUtil;
import com.ueop.dao.pojo.Cats;
import com.ueop.dao.pojo.Widget;
import com.ueop.sconfig.service.CatService;
import com.ueop.sconfig.service.WidgetService;

@Controller
public class PageController extends BaseController{
	@Autowired
	private WidgetService widgetService;
	@Autowired
	private CatService catService;
	@RequestMapping("/ueop/{pageid}/edit")
	@ResponseBody
	private UEOPResult edit(Long pageid){
		try {
			//1.请求信息获取
			System.out.println(session());
			//2.用户权限校验
			//3.获取用户组件列表
			
			List<Widget> widgets = widgetService.getAllWidget();
			List<Cats> cats = catService.getAllCat();
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("widgets",widgets);
			data.put("cats",cats);
			return UEOPResult.ok(data);
		} catch (Exception e) {
			return UEOPResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
