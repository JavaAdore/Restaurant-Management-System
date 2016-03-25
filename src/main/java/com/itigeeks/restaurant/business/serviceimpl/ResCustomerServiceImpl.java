package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCustomerService;
import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerDAO;
/**
 * Implementation of ResCustomerService
 */
@Service
public class ResCustomerServiceImpl implements ResCustomerService {


	@Autowired
	private ResCustomerDAO resCustomerDAO;
	@Override
	public void delete(ResCustomer resCustomer)
	{
		 resCustomerDAO.delete(resCustomer);
	}
	
	
	
	@Override
	public ResCustomer saveOrUpdate(ResCustomer resCustomer)
	{
		return  resCustomerDAO.saveOrUpdate( resCustomer);
	}
	
	@Override
	public ResCustomer load(Long id )
	{
		return resCustomerDAO.load( id );

	}
	

	@Override
	public List<ResCustomer> loadAll()
	{
		return resCustomerDAO.loadAll();
	}

	@Override
	public List<ResCustomer> loadByNamedQuery(String queryName)
	{
		 return resCustomerDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResCustomer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resCustomerDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResCustomer> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resCustomerDAO.countAll();

	}

	@Override
	public List<ResCustomer> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resCustomerDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResCustomer> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resCustomerDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResCustomer> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCustomer> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResCustomer> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCustomer> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCustomerDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResCustomer> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCustomerDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResCustomer> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resCustomerDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resCustomerDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resCustomerDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
