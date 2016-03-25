package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResVoucherService;
import com.itigeeks.restaurant.common.entity.schema.ResVoucher;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResVoucherDAO;
/**
 * Implementation of ResVoucherService
 */
@Service
public class ResVoucherServiceImpl implements ResVoucherService {


	@Autowired
	private ResVoucherDAO resVoucherDAO;
	@Override
	public void delete(ResVoucher resVoucher)
	{
		 resVoucherDAO.delete(resVoucher);
	}
	
	
	
	@Override
	public ResVoucher saveOrUpdate(ResVoucher resVoucher)
	{
		return  resVoucherDAO.saveOrUpdate( resVoucher);
	}
	
	@Override
	public ResVoucher load(Long id )
	{
		return resVoucherDAO.load( id );

	}
	

	@Override
	public List<ResVoucher> loadAll()
	{
		return resVoucherDAO.loadAll();
	}

	@Override
	public List<ResVoucher> loadByNamedQuery(String queryName)
	{
		 return resVoucherDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResVoucher> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resVoucherDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResVoucher> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resVoucherDAO.countAll();

	}

	@Override
	public List<ResVoucher> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resVoucherDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResVoucher> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resVoucherDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResVoucher> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResVoucher> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResVoucher> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResVoucher> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resVoucherDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResVoucher> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resVoucherDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResVoucher> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resVoucherDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resVoucherDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resVoucherDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
