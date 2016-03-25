package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResInvoiceService;
import com.itigeeks.restaurant.common.entity.schema.ResInvoice;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResInvoiceDAO;
/**
 * Implementation of ResInvoiceService
 */
@Service
public class ResInvoiceServiceImpl implements ResInvoiceService {


	@Autowired
	private ResInvoiceDAO resInvoiceDAO;
	@Override
	public void delete(ResInvoice resInvoice)
	{
		 resInvoiceDAO.delete(resInvoice);
	}
	
	
	
	@Override
	public ResInvoice saveOrUpdate(ResInvoice resInvoice)
	{
		return  resInvoiceDAO.saveOrUpdate( resInvoice);
	}
	
	@Override
	public ResInvoice load(Long id )
	{
		return resInvoiceDAO.load( id );

	}
	

	@Override
	public List<ResInvoice> loadAll()
	{
		return resInvoiceDAO.loadAll();
	}

	@Override
	public List<ResInvoice> loadByNamedQuery(String queryName)
	{
		 return resInvoiceDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResInvoice> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resInvoiceDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResInvoice> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resInvoiceDAO.countAll();

	}

	@Override
	public List<ResInvoice> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resInvoiceDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResInvoice> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resInvoiceDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResInvoice> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResInvoice> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResInvoice> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResInvoice> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resInvoiceDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResInvoice> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resInvoiceDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResInvoice> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resInvoiceDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resInvoiceDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resInvoiceDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
