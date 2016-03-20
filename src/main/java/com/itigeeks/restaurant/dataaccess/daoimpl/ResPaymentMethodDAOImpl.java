package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPaymentMethod;
import com.itigeeks.restaurant.dataaccess.dao.ResPaymentMethodDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPaymentMethodDAOImpl extends AbstractDAO implements ResPaymentMethodDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPaymentMethod resPaymentMethod) 
	{
		super.delete(resPaymentMethod);
	}
	
	public ResPaymentMethod saveOrUpdate(ResPaymentMethod resPaymentMethod) 
	{
		return (ResPaymentMethod) super.saveOrUpdate(resPaymentMethod);
	}

	public ResPaymentMethod load(Long id )
	{
		return (ResPaymentMethod) super.get(ResPaymentMethod.class , id);
	}

	
	public List<ResPaymentMethod> loadAll()
	{
		return (List<ResPaymentMethod>) super.loadAll(ResPaymentMethod.class);
	}


	public List<ResPaymentMethod> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPaymentMethod>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPaymentMethod> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPaymentMethod>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPaymentMethod> search( Map<String, Object> criteria )
	{
		return super.search( ResPaymentMethod.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPaymentMethod.class);
	}
}
