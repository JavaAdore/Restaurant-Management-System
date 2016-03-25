package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompanyCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResAdditionalCompanyCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResAdditionalCompanyCategoryDAOImpl extends AbstractDAO implements ResAdditionalCompanyCategoryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResAdditionalCompanyCategory resAdditionalCompanyCategory) 
	{
		super.delete(resAdditionalCompanyCategory);
	}
	
	public ResAdditionalCompanyCategory saveOrUpdate(ResAdditionalCompanyCategory resAdditionalCompanyCategory) 
	{
		return (ResAdditionalCompanyCategory) super.saveOrUpdate(resAdditionalCompanyCategory);
	}

	public ResAdditionalCompanyCategory load(Long id )
	{
		return (ResAdditionalCompanyCategory) super.get(ResAdditionalCompanyCategory.class , id);
	}

	
	public List<ResAdditionalCompanyCategory> loadAll()
	{
		return (List<ResAdditionalCompanyCategory>) super.loadAll(ResAdditionalCompanyCategory.class);
	}


	public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName)
	{
		
		return (List<ResAdditionalCompanyCategory>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResAdditionalCompanyCategory>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResAdditionalCompanyCategory.class);
	}

	

	public List<ResAdditionalCompanyCategory> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResAdditionalCompanyCategory.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResAdditionalCompanyCategory>) super.load(ResAdditionalCompanyCategory.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResAdditionalCompanyCategory>) super.load(ResAdditionalCompanyCategory.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResAdditionalCompanyCategory.class  , criteria ,conjuncationType) ;
	}
			


	

}
