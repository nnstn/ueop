package com.ueop.sconfig.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ueop.dao.mapper.CatsMapper;
import com.ueop.dao.pojo.Cats;
import com.ueop.dao.pojo.CatsExample;
import com.ueop.dao.pojo.CatsExample.Criteria;
import com.ueop.sconfig.service.CatService;

@Service("catService")
public class CatServiceImpl implements CatService {
	
	@Autowired
	CatsMapper catsMapper;
	@Override
	public List<Cats> getAllCat() {
		CatsExample example = new CatsExample();
		List<Cats> cats = catsMapper.selectByExample(example);
		return cats;
	}

	@Override
	public Cats getCatById(Long id) {
		Cats cat = catsMapper.selectByPrimaryKey(id);
		return cat;
	}

	@Override
	public List<Cats> getCatByName(String name) {
		CatsExample example = new CatsExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		List<Cats> cats = catsMapper.selectByExample(example);
		return cats;
	}

}
