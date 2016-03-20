package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductMisc;
import com.itigeeks.restaurant.dataaccess.dao.ResProductMiscDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResProductMiscDAOImpl extends AbstractDAO implements ResProductMiscDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResProductMisc resProductMisc) 
	{
		super.delete(resProductMisc);
	}
	
	public ResProductMisc saveOrUpdate(ResProductMisc resProductMisc) 
	{
		return (ResProductMisc) super.saveOrUpdate(resProductMisc);
	}

	public ResProductMisc load(Long id )
	{
		return (ResProductMisc) super.get(ResProductMisc.class , id);
	}

	
	public List<ResProductMisc> loadAll()
	{
		return (List<ResProductMisc>) super.loadAll(ResProductMisc.class);
	}


	public List<ResProductMisc> loadByNamedQuery(String queryName)
	{
		
		return (List<ResProductMisc>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResProductMisc> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResProductMisc>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResProductMisc> search( Map<String, Object> criteria )
	{
		return super.search( ResProductMisc.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResProductMisc.class);
	}
}
