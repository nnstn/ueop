package com.ueop.sconfig;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ueop.dao.pojo.Cats;
import com.ueop.sconfig.service.CatService;
import com.ueop.sconfig.service.WidgetService;

public class CatTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-*.xml");
		WidgetService bean1 = (WidgetService) context.getBean("widgetServiceImpl");
		CatService bean = (CatService) context.getBean("catService");
		List<Cats> allCat = bean.getAllCat();
		System.out.println(allCat);
	}
}