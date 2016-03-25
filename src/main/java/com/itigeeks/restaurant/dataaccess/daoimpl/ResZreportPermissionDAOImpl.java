package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResZreportPermission;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResZreportPermissionDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResZreportPermissionDAOImpl extends AbstractDAO implements ResZreportPermissionDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResZreportPermission resZreportPermission) 
	{
		super.delete(resZreportPermission);
	}
	
	public ResZreportPermission saveOrUpdate(ResZreportPermission resZreportPermission) 
	{
		return (ResZreportPermission) super.saveOrUpdate(resZreportPermission);
	}

	public ResZreportPermission load(Long id )
	{
		return (ResZreportPermission) super.get(ResZreportPermission.class , id);
	}

	
	public List<ResZreportPermission> loadAll()
	{
		return (List<ResZreportPermission>) super.loadAll(ResZreportPermission.class);
	}


	public List<ResZreportPermission> loadByNamedQuery(String queryName)
	{
		
		return (List<ResZreportPermission>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResZreportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResZreportPermission>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResZreportPermission.class);
	}

	

	public List<ResZreportPermission> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResZreportPermission.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResZreportPermission> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResZreportPermission> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResZreportPermission>) super.load(ResZreportPermission.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResZreportPermission> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResZreportPermission> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResZreportPermission> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResZreportPermission>) super.load(ResZreportPermission.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResZreportPermission.class  , criteria ,conjuncationType) ;
	}
			


	

}
