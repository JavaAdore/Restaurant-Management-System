/*
 * Created on 20 Mar 2016 ( Time 14:19:34 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResIngredientService;
import com.itigeeks.restaurant.common.entity.schema.ResIngredient;
import com.itigeeks.restaurant.dataaccess.dao.ResIngredientDAO;
/**
 * Implementation of ResIngredientService
 */
@Service
public class ResIngredientServiceImpl implements ResIngredientService {


	@Autowired
	private ResIngredientDAO resIngredientDAO;

	public void delete(ResIngredient resIngredient)
	{
		 resIngredientDAO.delete(resIngredient);
	}
	
	public ResIngredient saveOrUpdate(ResIngredient resIngredient)
	{
		return resIngredientDAO.saveOrUpdate( resIngredient);
	}

	public ResIngredient load(Long id )
	{
		return resIngredientDAO.load( id );
	}

	
	public List<ResIngredient> loadAll()
	{
		return resIngredientDAO.loadAll();
	}


	public List<ResIngredient> loadByNamedQuery(String queryName)
	{
		return resIngredientDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResIngredient> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resIngredientDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResIngredient> search( Map<String, Object> criteria )
	{
		return resIngredientDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resIngredientDAO.countAll();
	}

}
