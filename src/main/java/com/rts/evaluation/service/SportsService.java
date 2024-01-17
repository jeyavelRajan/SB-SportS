package com.rts.evaluation.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.rts.evaluation.model.Sports;
import com.rts.evaluation.reopsitory.SportsDAO;

@org.springframework.stereotype.Service
public class SportsService {
	
	@Autowired
	private SportsDAO dao;
	
	public boolean addCustomer(Sports bean) {
		dao.insert(bean);
		return true;
		
	}

}
