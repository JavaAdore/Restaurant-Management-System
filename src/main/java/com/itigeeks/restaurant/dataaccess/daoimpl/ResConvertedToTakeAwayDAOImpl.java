package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResConvertedToTakeAway;
import com.itigeeks.restaurant.dataaccess.dao.ResConvertedToTakeAwayDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResConvertedToTakeAwayDAOImpl extends AbstractDAO implements ResConvertedToTakeAwayDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResConvertedToTakeAway resConvertedToTakeAway) 
	{
		super.delete(resConvertedToTakeAway);
	}
	
	public ResConvertedToTakeAway saveOrUpdate(ResConvertedToTakeAway resConvertedToTakeAway) 
	{
		return (ResConvertedToTakeAway) super.saveOrUpdate(resConvertedToTakeAway);
	}

	public ResConvertedToTakeAway load(Long id )
	{
		return (ResConvertedToTakeAway) super.get(ResConvertedToTakeAway.class , id);
	}

	
	public List<ResConvertedToTakeAway> loadAll()
	{
		return (List<ResConvertedToTakeAway>) super.loadAll(ResConvertedToTakeAway.class);
	}


	public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName)
	{
		
		return (List<ResConvertedToTakeAway>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResConvertedToTakeAway>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResConvertedToTakeAway> search( Map<String, Object> criteria )
	{
		return super.search( ResConvertedToTakeAway.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResConvertedToTakeAway.class);
	}

	public List<ResConvertedToTakeAway> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResConvertedToTakeAway.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResConvertedToTakeAway> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResConvertedToTakeAway.class , startPage , pageSize);
	}

}
