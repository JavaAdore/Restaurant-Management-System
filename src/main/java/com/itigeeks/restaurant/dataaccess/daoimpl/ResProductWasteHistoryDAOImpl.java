package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductWasteHistory;
import com.itigeeks.restaurant.dataaccess.dao.ResProductWasteHistoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResProductWasteHistoryDAOImpl extends AbstractDAO implements ResProductWasteHistoryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResProductWasteHistory resProductWasteHistory) 
	{
		super.delete(resProductWasteHistory);
	}
	
	public ResProductWasteHistory saveOrUpdate(ResProductWasteHistory resProductWasteHistory) 
	{
		return (ResProductWasteHistory) super.saveOrUpdate(resProductWasteHistory);
	}

	public ResProductWasteHistory load(Long id )
	{
		return (ResProductWasteHistory) super.get(ResProductWasteHistory.class , id);
	}

	
	public List<ResProductWasteHistory> loadAll()
	{
		return (List<ResProductWasteHistory>) super.loadAll(ResProductWasteHistory.class);
	}


	public List<ResProductWasteHistory> loadByNamedQuery(String queryName)
	{
		
		return (List<ResProductWasteHistory>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResProductWasteHistory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResProductWasteHistory>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResProductWasteHistory> search( Map<String, Object> criteria )
	{
		return super.search( ResProductWasteHistory.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResProductWasteHistory.class);
	}
}
