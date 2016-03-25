package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResMessageService;
import com.itigeeks.restaurant.common.entity.schema.ResMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResMessageDAO;
/**
 * Implementation of ResMessageService
 */
@Service
public class ResMessageServiceImpl implements ResMessageService {


	@Autowired
	private ResMessageDAO resMessageDAO;
	@Override
	public void delete(ResMessage resMessage)
	{
		 resMessageDAO.delete(resMessage);
	}
	
	
	
	@Override
	public ResMessage saveOrUpdate(ResMessage resMessage)
	{
		return  resMessageDAO.saveOrUpdate( resMessage);
	}
	
	@Override
	public ResMessage load(Long id )
	{
		return resMessageDAO.load( id );

	}
	

	@Override
	public List<ResMessage> loadAll()
	{
		return resMessageDAO.loadAll();
	}

	@Override
	public List<ResMessage> loadByNamedQuery(String queryName)
	{
		 return resMessageDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resMessageDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResMessage> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resMessageDAO.countAll();

	}

	@Override
	public List<ResMessage> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resMessageDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResMessage> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resMessageDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResMessage> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResMessage> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResMessage> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResMessage> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resMessageDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResMessage> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resMessageDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResMessage> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resMessageDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resMessageDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resMessageDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
