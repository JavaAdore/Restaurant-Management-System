package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResLogService;
import com.itigeeks.restaurant.common.entity.schema.ResLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResLogDAO;
/**
 * Implementation of ResLogService
 */
@Service
public class ResLogServiceImpl implements ResLogService {


	@Autowired
	private ResLogDAO resLogDAO;
	@Override
	public void delete(ResLog resLog)
	{
		 resLogDAO.delete(resLog);
	}
	
	
	
	@Override
	public ResLog saveOrUpdate(ResLog resLog)
	{
		return  resLogDAO.saveOrUpdate( resLog);
	}
	
	@Override
	public ResLog load(Long id )
	{
		return resLogDAO.load( id );

	}
	

	@Override
	public List<ResLog> loadAll()
	{
		return resLogDAO.loadAll();
	}

	@Override
	public List<ResLog> loadByNamedQuery(String queryName)
	{
		 return resLogDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resLogDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResLog> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resLogDAO.countAll();

	}

	@Override
	public List<ResLog> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resLogDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResLog> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resLogDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResLog> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResLog> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResLog> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResLog> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resLogDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResLog> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resLogDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResLog> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resLogDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resLogDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resLogDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
