package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProduct;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionProductDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPromotionProductDAOImpl extends AbstractDAO implements ResPromotionProductDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPromotionProduct resPromotionProduct) 
	{
		super.delete(resPromotionProduct);
	}
	
	public ResPromotionProduct saveOrUpdate(ResPromotionProduct resPromotionProduct) 
	{
		return (ResPromotionProduct) super.saveOrUpdate(resPromotionProduct);
	}

	public ResPromotionProduct load(Long id )
	{
		return (ResPromotionProduct) super.get(ResPromotionProduct.class , id);
	}

	
	public List<ResPromotionProduct> loadAll()
	{
		return (List<ResPromotionProduct>) super.loadAll(ResPromotionProduct.class);
	}


	public List<ResPromotionProduct> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPromotionProduct>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPromotionProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPromotionProduct>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResPromotionProduct.class);
	}

	

	public List<ResPromotionProduct> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPromotionProduct.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResPromotionProduct> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResPromotionProduct> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResPromotionProduct>) super.load(ResPromotionProduct.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResPromotionProduct> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResPromotionProduct> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResPromotionProduct> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResPromotionProduct>) super.load(ResPromotionProduct.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResPromotionProduct.class  , criteria ,conjuncationType) ;
	}
			


	

}
