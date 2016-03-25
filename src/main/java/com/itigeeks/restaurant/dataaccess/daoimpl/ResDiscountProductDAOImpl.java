package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDiscountProduct;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDiscountProductDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDiscountProductDAOImpl extends AbstractDAO implements ResDiscountProductDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDiscountProduct resDiscountProduct) 
	{
		super.delete(resDiscountProduct);
	}
	
	public ResDiscountProduct saveOrUpdate(ResDiscountProduct resDiscountProduct) 
	{
		return (ResDiscountProduct) super.saveOrUpdate(resDiscountProduct);
	}

	public ResDiscountProduct load(Long id )
	{
		return (ResDiscountProduct) super.get(ResDiscountProduct.class , id);
	}

	
	public List<ResDiscountProduct> loadAll()
	{
		return (List<ResDiscountProduct>) super.loadAll(ResDiscountProduct.class);
	}


	public List<ResDiscountProduct> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDiscountProduct>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDiscountProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDiscountProduct>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResDiscountProduct.class);
	}

	

	public List<ResDiscountProduct> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDiscountProduct.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResDiscountProduct> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResDiscountProduct> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResDiscountProduct>) super.load(ResDiscountProduct.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResDiscountProduct> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResDiscountProduct> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResDiscountProduct> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResDiscountProduct>) super.load(ResDiscountProduct.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResDiscountProduct.class  , criteria ,conjuncationType) ;
	}
			


	

}
