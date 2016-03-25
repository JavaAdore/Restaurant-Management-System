package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCombineReportPermissionService;
import com.itigeeks.restaurant.common.entity.schema.ResCombineReportPermission;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCombineReportPermissionDAO;
/**
 * Implementation of ResCombineReportPermissionService
 */
@Service
public class ResCombineReportPermissionServiceImpl implements ResCombineReportPermissionService {


	@Autowired
	private ResCombineReportPermissionDAO resCombineReportPermissionDAO;
	@Override
	public void delete(ResCombineReportPermission resCombineReportPermission)
	{
		 resCombineReportPermissionDAO.delete(resCombineReportPermission);
	}
	
	
	
	@Override
	public ResCombineReportPermission saveOrUpdate(ResCombineReportPermission resCombineReportPermission)
	{
		return  resCombineReportPermissionDAO.saveOrUpdate( resCombineReportPermission);
	}
	
	@Override
	public ResCombineReportPermission load(Long id )
	{
		return resCombineReportPermissionDAO.load( id );

	}
	

	@Override
	public List<ResCombineReportPermission> loadAll()
	{
		return resCombineReportPermissionDAO.loadAll();
	}

	@Override
	public List<ResCombineReportPermission> loadByNamedQuery(String queryName)
	{
		 return resCombineReportPermissionDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResCombineReportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resCombineReportPermissionDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResCombineReportPermission> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resCombineReportPermissionDAO.countAll();

	}

	@Override
	public List<ResCombineReportPermission> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resCombineReportPermissionDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResCombineReportPermission> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resCombineReportPermissionDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResCombineReportPermission> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCombineReportPermission> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResCombineReportPermission> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCombineReportPermission> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCombineReportPermissionDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResCombineReportPermission> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCombineReportPermissionDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResCombineReportPermission> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resCombineReportPermissionDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resCombineReportPermissionDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resCombineReportPermissionDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
