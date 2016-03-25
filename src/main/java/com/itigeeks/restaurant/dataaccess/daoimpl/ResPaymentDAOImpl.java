package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPayment;
import com.itigeeks.restaurant.dataaccess.dao.ResPaymentDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPaymentDAOImpl extends AbstractDAO implements ResPaymentDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPayment resPayment) 
	{
		super.delete(resPayment);
	}
	
	public ResPayment saveOrUpdate(ResPayment resPayment) 
	{
		return (ResPayment) super.saveOrUpdate(resPayment);
	}

	public ResPayment load(Long id )
	{
		return (ResPayment) super.get(ResPayment.class , id);
	}

	
	public List<ResPayment> loadAll()
	{
		return (List<ResPayment>) super.loadAll(ResPayment.class);
	}


	public List<ResPayment> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPayment>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPayment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPayment>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPayment> search( Map<String, Object> criteria )
	{
		return super.search( ResPayment.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPayment.class);
	}

	public List<ResPayment> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPayment.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPayment> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPayment.class , startPage , pageSize);
	}

}
