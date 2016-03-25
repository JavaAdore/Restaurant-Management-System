package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResFloorService;
import com.itigeeks.restaurant.common.entity.schema.ResFloor;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResFloorDAO;
/**
 * Implementation of ResFloorService
 */
@Service
public class ResFloorServiceImpl implements ResFloorService {


	@Autowired
	private ResFloorDAO resFloorDAO;
	@Override
	public void delete(ResFloor resFloor)
	{
		 resFloorDAO.delete(resFloor);
	}
	
	
	
	@Override
	public ResFloor saveOrUpdate(ResFloor resFloor)
	{
		return  resFloorDAO.saveOrUpdate( resFloor);
	}
	
	@Override
	public ResFloor load(Long id )
	{
		return resFloorDAO.load( id );

	}
	

	@Override
	public List<ResFloor> loadAll()
	{
		return resFloorDAO.loadAll();
	}

	@Override
	public List<ResFloor> loadByNamedQuery(String queryName)
	{
		 return resFloorDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResFloor> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resFloorDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResFloor> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resFloorDAO.countAll();

	}

	@Override
	public List<ResFloor> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resFloorDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResFloor> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resFloorDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResFloor> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResFloor> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResFloor> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResFloor> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resFloorDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResFloor> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resFloorDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResFloor> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resFloorDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resFloorDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resFloorDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
