/*
 * Created on 20 Mar 2016 ( Time 14:19:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResSpecialInstructionsService;
import com.itigeeks.restaurant.common.entity.schema.ResSpecialInstructions;
import com.itigeeks.restaurant.dataaccess.dao.ResSpecialInstructionsDAO;
/**
 * Implementation of ResSpecialInstructionsService
 */
@Service
public class ResSpecialInstructionsServiceImpl implements ResSpecialInstructionsService {


	@Autowired
	private ResSpecialInstructionsDAO resSpecialInstructionsDAO;

	public void delete(ResSpecialInstructions resSpecialInstructions)
	{
		 resSpecialInstructionsDAO.delete(resSpecialInstructions);
	}
	
	public ResSpecialInstructions saveOrUpdate(ResSpecialInstructions resSpecialInstructions)
	{
		return resSpecialInstructionsDAO.saveOrUpdate( resSpecialInstructions);
	}

	public ResSpecialInstructions load(Long id )
	{
		return resSpecialInstructionsDAO.load( id );
	}

	
	public List<ResSpecialInstructions> loadAll()
	{
		return resSpecialInstructionsDAO.loadAll();
	}


	public List<ResSpecialInstructions> loadByNamedQuery(String queryName)
	{
		return resSpecialInstructionsDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResSpecialInstructions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resSpecialInstructionsDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResSpecialInstructions> search( Map<String, Object> criteria )
	{
		return resSpecialInstructionsDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resSpecialInstructionsDAO.countAll();
	}

}
