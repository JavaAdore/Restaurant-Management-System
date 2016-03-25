package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReservationStatusService;
import com.itigeeks.restaurant.common.entity.schema.ResReservationStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationStatusDAO;
/**
 * Implementation of ResReservationStatusService
 */
@Service
public class ResReservationStatusServiceImpl implements ResReservationStatusService {


	@Autowired
	private ResReservationStatusDAO resReservationStatusDAO;
	@Override
	public void delete(ResReservationStatus resReservationStatus)
	{
		 resReservationStatusDAO.delete(resReservationStatus);
	}
	
	
	
	@Override
	public ResReservationStatus saveOrUpdate(ResReservationStatus resReservationStatus)
	{
		return  resReservationStatusDAO.saveOrUpdate( resReservationStatus);
	}
	
	@Override
	public ResReservationStatus load(Long id )
	{
		return resReservationStatusDAO.load( id );

	}
	

	@Override
	public List<ResReservationStatus> loadAll()
	{
		return resReservationStatusDAO.loadAll();
	}

	@Override
	public List<ResReservationStatus> loadByNamedQuery(String queryName)
	{
		 return resReservationStatusDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResReservationStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resReservationStatusDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResReservationStatus> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resReservationStatusDAO.countAll();

	}

	@Override
	public List<ResReservationStatus> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resReservationStatusDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResReservationStatus> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resReservationStatusDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResReservationStatus> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResReservationStatus> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResReservationStatus> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResReservationStatus> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resReservationStatusDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResReservationStatus> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resReservationStatusDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResReservationStatus> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resReservationStatusDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resReservationStatusDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resReservationStatusDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
