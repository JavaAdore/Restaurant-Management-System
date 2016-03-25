package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPaymentMethod;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
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
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResPaymentMethod.class);
	}

	

	public List<ResPaymentMethod> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPaymentMethod.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResPaymentMethod> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResPaymentMethod> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResPaymentMethod>) super.load(ResPaymentMethod.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResPaymentMethod> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResPaymentMethod> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResPaymentMethod> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResPaymentMethod>) super.load(ResPaymentMethod.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResPaymentMethod.class  , criteria ,conjuncationType) ;
	}
			


	

}
