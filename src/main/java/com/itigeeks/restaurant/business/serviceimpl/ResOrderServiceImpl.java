package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderService;
import com.itigeeks.restaurant.common.entity.schema.ResOrder;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderDAO;
/**
 * Implementation of ResOrderService
 */
@Service
public class ResOrderServiceImpl implements ResOrderService {


	@Autowired
	private ResOrderDAO resOrderDAO;
	@Override
	public void delete(ResOrder resOrder)
	{
		 resOrderDAO.delete(resOrder);
	}
	
	
	
	@Override
	public ResOrder saveOrUpdate(ResOrder resOrder)
	{
		return  resOrderDAO.saveOrUpdate( resOrder);
	}
	
	@Override
	public ResOrder load(Long id )
	{
		return resOrderDAO.load( id );

	}
	

	@Override
	public List<ResOrder> loadAll()
	{
		return resOrderDAO.loadAll();
	}

	@Override
	public List<ResOrder> loadByNamedQuery(String queryName)
	{
		 return resOrderDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resOrderDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResOrder> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resOrderDAO.countAll();

	}

	@Override
	public List<ResOrder> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resOrderDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResOrder> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resOrderDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResOrder> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrder> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResOrder> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrder> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResOrder> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResOrder> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resOrderDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
