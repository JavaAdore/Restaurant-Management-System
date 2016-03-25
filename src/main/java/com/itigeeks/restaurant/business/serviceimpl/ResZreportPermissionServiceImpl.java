package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResZreportPermissionService;
import com.itigeeks.restaurant.common.entity.schema.ResZreportPermission;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResZreportPermissionDAO;
/**
 * Implementation of ResZreportPermissionService
 */
@Service
public class ResZreportPermissionServiceImpl implements ResZreportPermissionService {


	@Autowired
	private ResZreportPermissionDAO resZreportPermissionDAO;
	@Override
	public void delete(ResZreportPermission resZreportPermission)
	{
		 resZreportPermissionDAO.delete(resZreportPermission);
	}
	
	
	
	@Override
	public ResZreportPermission saveOrUpdate(ResZreportPermission resZreportPermission)
	{
		return  resZreportPermissionDAO.saveOrUpdate( resZreportPermission);
	}
	
	@Override
	public ResZreportPermission load(Long id )
	{
		return resZreportPermissionDAO.load( id );

	}
	

	@Override
	public List<ResZreportPermission> loadAll()
	{
		return resZreportPermissionDAO.loadAll();
	}

	@Override
	public List<ResZreportPermission> loadByNamedQuery(String queryName)
	{
		 return resZreportPermissionDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResZreportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resZreportPermissionDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResZreportPermission> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resZreportPermissionDAO.countAll();

	}

	@Override
	public List<ResZreportPermission> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resZreportPermissionDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResZreportPermission> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resZreportPermissionDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResZreportPermission> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResZreportPermission> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResZreportPermission> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResZreportPermission> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resZreportPermissionDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResZreportPermission> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resZreportPermissionDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResZreportPermission> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resZreportPermissionDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resZreportPermissionDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resZreportPermissionDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
