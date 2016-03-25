package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderStatus;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderStatusDAOImpl extends AbstractDAO implements ResOrderStatusDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderStatus resOrderStatus) 
	{
		super.delete(resOrderStatus);
	}
	
	public ResOrderStatus saveOrUpdate(ResOrderStatus resOrderStatus) 
	{
		return (ResOrderStatus) super.saveOrUpdate(resOrderStatus);
	}

	public ResOrderStatus load(Long id )
	{
		return (ResOrderStatus) super.get(ResOrderStatus.class , id);
	}

	
	public List<ResOrderStatus> loadAll()
	{
		return (List<ResOrderStatus>) super.loadAll(ResOrderStatus.class);
	}


	public List<ResOrderStatus> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderStatus>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderStatus>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderStatus> search( Map<String, Object> criteria )
	{
		return super.search( ResOrderStatus.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrderStatus.class);
	}

	public List<ResOrderStatus> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResOrderStatus.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResOrderStatus> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResOrderStatus.class , startPage , pageSize);
	}

}
