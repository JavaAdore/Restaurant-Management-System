package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDocContent;
import com.itigeeks.restaurant.dataaccess.dao.ResDocContentDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDocContentDAOImpl extends AbstractDAO implements ResDocContentDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDocContent resDocContent) 
	{
		super.delete(resDocContent);
	}
	
	public ResDocContent saveOrUpdate(ResDocContent resDocContent) 
	{
		return (ResDocContent) super.saveOrUpdate(resDocContent);
	}

	public ResDocContent load(Long id )
	{
		return (ResDocContent) super.get(ResDocContent.class , id);
	}

	
	public List<ResDocContent> loadAll()
	{
		return (List<ResDocContent>) super.loadAll(ResDocContent.class);
	}


	public List<ResDocContent> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDocContent>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDocContent> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDocContent>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResDocContent> search( Map<String, Object> criteria )
	{
		return super.search( ResDocContent.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResDocContent.class);
	}

	public List<ResDocContent> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResDocContent.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResDocContent> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDocContent.class , startPage , pageSize);
	}

}
