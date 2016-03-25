package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCardType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCardTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCardTypeDAOImpl extends AbstractDAO implements ResCardTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCardType resCardType) 
	{
		super.delete(resCardType);
	}
	
	public ResCardType saveOrUpdate(ResCardType resCardType) 
	{
		return (ResCardType) super.saveOrUpdate(resCardType);
	}

	public ResCardType load(Long id )
	{
		return (ResCardType) super.get(ResCardType.class , id);
	}

	
	public List<ResCardType> loadAll()
	{
		return (List<ResCardType>) super.loadAll(ResCardType.class);
	}


	public List<ResCardType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCardType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCardType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCardType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResCardType.class);
	}

	

	public List<ResCardType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCardType.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResCardType> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResCardType> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResCardType>) super.load(ResCardType.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResCardType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResCardType> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResCardType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResCardType>) super.load(ResCardType.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResCardType.class  , criteria ,conjuncationType) ;
	}
			


	

}
