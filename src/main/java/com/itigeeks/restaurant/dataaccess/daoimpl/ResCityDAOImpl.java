package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCity;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCityDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCityDAOImpl extends AbstractDAO implements ResCityDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCity resCity) 
	{
		super.delete(resCity);
	}
	
	public ResCity saveOrUpdate(ResCity resCity) 
	{
		return (ResCity) super.saveOrUpdate(resCity);
	}

	public ResCity load(Long id )
	{
		return (ResCity) super.get(ResCity.class , id);
	}

	
	public List<ResCity> loadAll()
	{
		return (List<ResCity>) super.loadAll(ResCity.class);
	}


	public List<ResCity> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCity>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCity> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCity>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResCity.class);
	}

	

	public List<ResCity> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCity.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResCity> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResCity> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResCity>) super.load(ResCity.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResCity> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResCity> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResCity> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResCity>) super.load(ResCity.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResCity.class  , criteria ,conjuncationType) ;
	}
			


	

}
