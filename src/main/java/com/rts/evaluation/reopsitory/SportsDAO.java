package com.rts.evaluation.reopsitory;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rts.evaluation.model.Sports;

import java.util.ArrayList;

@Repository
public class SportsDAO {

        	List<Sports> list = new ArrayList<Sports>();
        	public boolean insert (Sports bean) {
        		list.add(bean);
        		return true;
        	}
        	 


	
         }
