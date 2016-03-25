package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderCategory;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderCategoryDAOImpl extends AbstractDAO implements ResOrderCategoryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderCategory resOrderCategory) 
	{
		super.delete(resOrderCategory);
	}
	
	public ResOrderCategory saveOrUpdate(ResOrderCategory resOrderCategory) 
	{
		return (ResOrderCategory) super.saveOrUpdate(resOrderCategory);
	}

	public ResOrderCategory load(Long id )
	{
		return (ResOrderCategory) super.get(ResOrderCategory.class , id);
	}

	
	public List<ResOrderCategory> loadAll()
	{
		return (List<ResOrderCategory>) super.loadAll(ResOrderCategory.class);
	}


	public List<ResOrderCategory> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderCategory>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderCategory>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderCategory> search( Map<String, Object> criteria )
	{
		return super.search( ResOrderCategory.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrderCategory.class);
	}

	public List<ResOrderCategory> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResOrderCategory.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResOrderCategory> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResOrderCategory.class , startPage , pageSize);
	}

}
