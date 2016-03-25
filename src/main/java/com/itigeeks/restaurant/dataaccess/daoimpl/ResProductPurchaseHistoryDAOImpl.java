package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductPurchaseHistory;
import com.itigeeks.restaurant.dataaccess.dao.ResProductPurchaseHistoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResProductPurchaseHistoryDAOImpl extends AbstractDAO implements ResProductPurchaseHistoryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResProductPurchaseHistory resProductPurchaseHistory) 
	{
		super.delete(resProductPurchaseHistory);
	}
	
	public ResProductPurchaseHistory saveOrUpdate(ResProductPurchaseHistory resProductPurchaseHistory) 
	{
		return (ResProductPurchaseHistory) super.saveOrUpdate(resProductPurchaseHistory);
	}

	public ResProductPurchaseHistory load(Long id )
	{
		return (ResProductPurchaseHistory) super.get(ResProductPurchaseHistory.class , id);
	}

	
	public List<ResProductPurchaseHistory> loadAll()
	{
		return (List<ResProductPurchaseHistory>) super.loadAll(ResProductPurchaseHistory.class);
	}


	public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName)
	{
		
		return (List<ResProductPurchaseHistory>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResProductPurchaseHistory>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResProductPurchaseHistory> search( Map<String, Object> criteria )
	{
		return super.search( ResProductPurchaseHistory.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResProductPurchaseHistory.class);
	}

	public List<ResProductPurchaseHistory> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResProductPurchaseHistory.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResProductPurchaseHistory> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResProductPurchaseHistory.class , startPage , pageSize);
	}

}
