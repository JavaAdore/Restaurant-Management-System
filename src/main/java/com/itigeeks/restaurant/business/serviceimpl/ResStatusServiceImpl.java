package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResStatusService;
import com.itigeeks.restaurant.common.entity.schema.ResStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResStatusDAO;
/**
 * Implementation of ResStatusService
 */
@Service
public class ResStatusServiceImpl implements ResStatusService {


	@Autowired
	private ResStatusDAO resStatusDAO;
	@Override
	public void delete(ResStatus resStatus)
	{
		 resStatusDAO.delete(resStatus);
	}
	
	
	
	@Override
	public ResStatus saveOrUpdate(ResStatus resStatus)
	{
		return  resStatusDAO.saveOrUpdate( resStatus);
	}
	
	@Override
	public ResStatus load(Long id )
	{
		return resStatusDAO.load( id );

	}
	

	@Override
	public List<ResStatus> loadAll()
	{
		return resStatusDAO.loadAll();
	}

	@Override
	public List<ResStatus> loadByNamedQuery(String queryName)
	{
		 return resStatusDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resStatusDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResStatus> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resStatusDAO.countAll();

	}

	@Override
	public List<ResStatus> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resStatusDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResStatus> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resStatusDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResStatus> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResStatus> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResStatus> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResStatus> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resStatusDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResStatus> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resStatusDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResStatus> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resStatusDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resStatusDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resStatusDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
