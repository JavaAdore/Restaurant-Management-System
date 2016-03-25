package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderProductAddon;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderProductAddonDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderProductAddonDAOImpl extends AbstractDAO implements ResOrderProductAddonDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderProductAddon resOrderProductAddon) 
	{
		super.delete(resOrderProductAddon);
	}
	
	public ResOrderProductAddon saveOrUpdate(ResOrderProductAddon resOrderProductAddon) 
	{
		return (ResOrderProductAddon) super.saveOrUpdate(resOrderProductAddon);
	}

	public ResOrderProductAddon load(Long id )
	{
		return (ResOrderProductAddon) super.get(ResOrderProductAddon.class , id);
	}

	
	public List<ResOrderProductAddon> loadAll()
	{
		return (List<ResOrderProductAddon>) super.loadAll(ResOrderProductAddon.class);
	}


	public List<ResOrderProductAddon> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderProductAddon>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderProductAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderProductAddon>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderProductAddon> search( Map<String, Object> criteria )
	{
		return super.search( ResOrderProductAddon.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrderProductAddon.class);
	}

	public List<ResOrderProductAddon> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResOrderProductAddon.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResOrderProductAddon> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResOrderProductAddon.class , startPage , pageSize);
	}

}
