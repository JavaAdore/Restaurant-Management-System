package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderDeleteLogService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderDeleteLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderDeleteLogDAO;
/**
 * Implementation of ResOrderDeleteLogService
 */
@Service
public class ResOrderDeleteLogServiceImpl implements ResOrderDeleteLogService {


	@Autowired
	private ResOrderDeleteLogDAO resOrderDeleteLogDAO;
	@Override
	public void delete(ResOrderDeleteLog resOrderDeleteLog)
	{
		 resOrderDeleteLogDAO.delete(resOrderDeleteLog);
	}
	
	
	
	@Override
	public ResOrderDeleteLog saveOrUpdate(ResOrderDeleteLog resOrderDeleteLog)
	{
		return  resOrderDeleteLogDAO.saveOrUpdate( resOrderDeleteLog);
	}
	
	@Override
	public ResOrderDeleteLog load(Long id )
	{
		return resOrderDeleteLogDAO.load( id );

	}
	

	@Override
	public List<ResOrderDeleteLog> loadAll()
	{
		return resOrderDeleteLogDAO.loadAll();
	}

	@Override
	public List<ResOrderDeleteLog> loadByNamedQuery(String queryName)
	{
		 return resOrderDeleteLogDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResOrderDeleteLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resOrderDeleteLogDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResOrderDeleteLog> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resOrderDeleteLogDAO.countAll();

	}

	@Override
	public List<ResOrderDeleteLog> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resOrderDeleteLogDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResOrderDeleteLog> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resOrderDeleteLogDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResOrderDeleteLog> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrderDeleteLog> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResOrderDeleteLog> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrderDeleteLog> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderDeleteLogDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResOrderDeleteLog> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderDeleteLogDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResOrderDeleteLog> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderDeleteLogDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderDeleteLogDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resOrderDeleteLogDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
