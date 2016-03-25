package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPrepLocationService;
import com.itigeeks.restaurant.common.entity.schema.ResPrepLocation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrepLocationDAO;
/**
 * Implementation of ResPrepLocationService
 */
@Service
public class ResPrepLocationServiceImpl implements ResPrepLocationService {


	@Autowired
	private ResPrepLocationDAO resPrepLocationDAO;
	@Override
	public void delete(ResPrepLocation resPrepLocation)
	{
		 resPrepLocationDAO.delete(resPrepLocation);
	}
	
	
	
	@Override
	public ResPrepLocation saveOrUpdate(ResPrepLocation resPrepLocation)
	{
		return  resPrepLocationDAO.saveOrUpdate( resPrepLocation);
	}
	
	@Override
	public ResPrepLocation load(Long id )
	{
		return resPrepLocationDAO.load( id );

	}
	

	@Override
	public List<ResPrepLocation> loadAll()
	{
		return resPrepLocationDAO.loadAll();
	}

	@Override
	public List<ResPrepLocation> loadByNamedQuery(String queryName)
	{
		 return resPrepLocationDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResPrepLocation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resPrepLocationDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResPrepLocation> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resPrepLocationDAO.countAll();

	}

	@Override
	public List<ResPrepLocation> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resPrepLocationDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResPrepLocation> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resPrepLocationDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResPrepLocation> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPrepLocation> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResPrepLocation> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPrepLocation> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPrepLocationDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResPrepLocation> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPrepLocationDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResPrepLocation> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resPrepLocationDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resPrepLocationDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resPrepLocationDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
