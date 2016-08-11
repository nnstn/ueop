package com.ueop.sconfig.service;

import java.util.List;
import com.ueop.dao.pojo.Cats;

public interface CatService {
	public List<Cats> getAllCat();
	public Cats getCatById(Long id);
	public List<Cats> getCatByName(String name);
	
}
