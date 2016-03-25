package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResLoyaltyPointsService;
import com.itigeeks.restaurant.common.entity.schema.ResLoyaltyPoints;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResLoyaltyPointsDAO;
/**
 * Implementation of ResLoyaltyPointsService
 */
@Service
public class ResLoyaltyPointsServiceImpl implements ResLoyaltyPointsService {


	@Autowired
	private ResLoyaltyPointsDAO resLoyaltyPointsDAO;
	@Override
	public void delete(ResLoyaltyPoints resLoyaltyPoints)
	{
		 resLoyaltyPointsDAO.delete(resLoyaltyPoints);
	}
	
	
	
	@Override
	public ResLoyaltyPoints saveOrUpdate(ResLoyaltyPoints resLoyaltyPoints)
	{
		return  resLoyaltyPointsDAO.saveOrUpdate( resLoyaltyPoints);
	}
	
	@Override
	public ResLoyaltyPoints load(Long id )
	{
		return resLoyaltyPointsDAO.load( id );

	}
	

	@Override
	public List<ResLoyaltyPoints> loadAll()
	{
		return resLoyaltyPointsDAO.loadAll();
	}

	@Override
	public List<ResLoyaltyPoints> loadByNamedQuery(String queryName)
	{
		 return resLoyaltyPointsDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResLoyaltyPoints> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resLoyaltyPointsDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResLoyaltyPoints> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resLoyaltyPointsDAO.countAll();

	}

	@Override
	public List<ResLoyaltyPoints> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resLoyaltyPointsDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResLoyaltyPoints> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resLoyaltyPointsDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResLoyaltyPoints> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResLoyaltyPoints> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResLoyaltyPoints> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResLoyaltyPoints> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resLoyaltyPointsDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResLoyaltyPoints> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resLoyaltyPointsDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResLoyaltyPoints> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resLoyaltyPointsDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resLoyaltyPointsDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resLoyaltyPointsDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
