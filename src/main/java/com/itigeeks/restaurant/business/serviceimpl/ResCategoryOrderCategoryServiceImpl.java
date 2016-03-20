/*
 * Created on 20 Mar 2016 ( Time 14:19:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCategoryOrderCategoryService;
import com.itigeeks.restaurant.common.entity.schema.ResCategoryOrderCategory;
import com.itigeeks.restaurant.dataaccess.dao.ResCategoryOrderCategoryDAO;
/**
 * Implementation of ResCategoryOrderCategoryService
 */
@Service
public class ResCategoryOrderCategoryServiceImpl implements ResCategoryOrderCategoryService {


	@Autowired
	private ResCategoryOrderCategoryDAO resCategoryOrderCategoryDAO;

	public void delete(ResCategoryOrderCategory resCategoryOrderCategory)
	{
		 resCategoryOrderCategoryDAO.delete(resCategoryOrderCategory);
	}
	
	public ResCategoryOrderCategory saveOrUpdate(ResCategoryOrderCategory resCategoryOrderCategory)
	{
		return resCategoryOrderCategoryDAO.saveOrUpdate( resCategoryOrderCategory);
	}

	public ResCategoryOrderCategory load(Long id )
	{
		return resCategoryOrderCategoryDAO.load( id );
	}

	
	public List<ResCategoryOrderCategory> loadAll()
	{
		return resCategoryOrderCategoryDAO.loadAll();
	}


	public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName)
	{
		return resCategoryOrderCategoryDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resCategoryOrderCategoryDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCategoryOrderCategory> search( Map<String, Object> criteria )
	{
		return resCategoryOrderCategoryDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resCategoryOrderCategoryDAO.countAll();
	}

}
