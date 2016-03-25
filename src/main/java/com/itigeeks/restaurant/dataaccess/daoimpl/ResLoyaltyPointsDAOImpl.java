package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLoyaltyPoints;
import com.itigeeks.restaurant.dataaccess.dao.ResLoyaltyPointsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResLoyaltyPointsDAOImpl extends AbstractDAO implements ResLoyaltyPointsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResLoyaltyPoints resLoyaltyPoints) 
	{
		super.delete(resLoyaltyPoints);
	}
	
	public ResLoyaltyPoints saveOrUpdate(ResLoyaltyPoints resLoyaltyPoints) 
	{
		return (ResLoyaltyPoints) super.saveOrUpdate(resLoyaltyPoints);
	}

	public ResLoyaltyPoints load(Long id )
	{
		return (ResLoyaltyPoints) super.get(ResLoyaltyPoints.class , id);
	}

	
	public List<ResLoyaltyPoints> loadAll()
	{
		return (List<ResLoyaltyPoints>) super.loadAll(ResLoyaltyPoints.class);
	}


	public List<ResLoyaltyPoints> loadByNamedQuery(String queryName)
	{
		
		return (List<ResLoyaltyPoints>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResLoyaltyPoints> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResLoyaltyPoints>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResLoyaltyPoints> search( Map<String, Object> criteria )
	{
		return super.search( ResLoyaltyPoints.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResLoyaltyPoints.class);
	}

	public List<ResLoyaltyPoints> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResLoyaltyPoints.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResLoyaltyPoints> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResLoyaltyPoints.class , startPage , pageSize);
	}

}
