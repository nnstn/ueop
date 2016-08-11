package com.ueop.dao.mapper;

import com.ueop.dao.pojo.Widget;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WidgetMapper {
	Widget getWidgetById(@Param("id")Long id);
	List<Widget> getWidgetByName(@Param("name")String name);
	List<Widget> getAllWidget();
	//List<Widget> getAllWidget(@Param("start")int start, @Param("limit")int limit,@Param("name")String name);
}