package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCustomerAddressService;
import com.itigeeks.restaurant.common.entity.schema.ResCustomerAddress;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerAddressDAO;
/**
 * Implementation of ResCustomerAddressService
 */
@Service
public class ResCustomerAddressServiceImpl implements ResCustomerAddressService {


	@Autowired
	private ResCustomerAddressDAO resCustomerAddressDAO;
	@Override
	public void delete(ResCustomerAddress resCustomerAddress)
	{
		 resCustomerAddressDAO.delete(resCustomerAddress);
	}
	
	
	
	@Override
	public ResCustomerAddress saveOrUpdate(ResCustomerAddress resCustomerAddress)
	{
		return  resCustomerAddressDAO.saveOrUpdate( resCustomerAddress);
	}
	
	@Override
	public ResCustomerAddress load(Long id )
	{
		return resCustomerAddressDAO.load( id );

	}
	

	@Override
	public List<ResCustomerAddress> loadAll()
	{
		return resCustomerAddressDAO.loadAll();
	}

	@Override
	public List<ResCustomerAddress> loadByNamedQuery(String queryName)
	{
		 return resCustomerAddressDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResCustomerAddress> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resCustomerAddressDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResCustomerAddress> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resCustomerAddressDAO.countAll();

	}

	@Override
	public List<ResCustomerAddress> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resCustomerAddressDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResCustomerAddress> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resCustomerAddressDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResCustomerAddress> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCustomerAddress> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResCustomerAddress> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCustomerAddress> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCustomerAddressDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResCustomerAddress> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCustomerAddressDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResCustomerAddress> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resCustomerAddressDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resCustomerAddressDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resCustomerAddressDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
