package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCategory;
import com.itigeeks.restaurant.dataaccess.dao.ResCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCategoryDAOImpl extends AbstractDAO implements ResCategoryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCategory resCategory) 
	{
		super.delete(resCategory);
	}
	
	public ResCategory saveOrUpdate(ResCategory resCategory) 
	{
		return (ResCategory) super.saveOrUpdate(resCategory);
	}

	public ResCategory load(Long id )
	{
		return (ResCategory) super.get(ResCategory.class , id);
	}

	
	public List<ResCategory> loadAll()
	{
		return (List<ResCategory>) super.loadAll(ResCategory.class);
	}


	public List<ResCategory> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCategory>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCategory>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCategory> search( Map<String, Object> criteria )
	{
		return super.search( ResCategory.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCategory.class);
	}

	public List<ResCategory> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResCategory.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResCategory> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCategory.class , startPage , pageSize);
	}

}
