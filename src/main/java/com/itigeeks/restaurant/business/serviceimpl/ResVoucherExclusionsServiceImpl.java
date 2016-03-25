package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResVoucherExclusionsService;
import com.itigeeks.restaurant.common.entity.schema.ResVoucherExclusions;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResVoucherExclusionsDAO;
/**
 * Implementation of ResVoucherExclusionsService
 */
@Service
public class ResVoucherExclusionsServiceImpl implements ResVoucherExclusionsService {


	@Autowired
	private ResVoucherExclusionsDAO resVoucherExclusionsDAO;
	@Override
	public void delete(ResVoucherExclusions resVoucherExclusions)
	{
		 resVoucherExclusionsDAO.delete(resVoucherExclusions);
	}
	
	
	
	@Override
	public ResVoucherExclusions saveOrUpdate(ResVoucherExclusions resVoucherExclusions)
	{
		return  resVoucherExclusionsDAO.saveOrUpdate( resVoucherExclusions);
	}
	
	@Override
	public ResVoucherExclusions load(Long id )
	{
		return resVoucherExclusionsDAO.load( id );

	}
	

	@Override
	public List<ResVoucherExclusions> loadAll()
	{
		return resVoucherExclusionsDAO.loadAll();
	}

	@Override
	public List<ResVoucherExclusions> loadByNamedQuery(String queryName)
	{
		 return resVoucherExclusionsDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResVoucherExclusions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resVoucherExclusionsDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResVoucherExclusions> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resVoucherExclusionsDAO.countAll();

	}

	@Override
	public List<ResVoucherExclusions> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resVoucherExclusionsDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResVoucherExclusions> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resVoucherExclusionsDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResVoucherExclusions> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResVoucherExclusions> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResVoucherExclusions> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResVoucherExclusions> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resVoucherExclusionsDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResVoucherExclusions> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resVoucherExclusionsDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResVoucherExclusions> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resVoucherExclusionsDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resVoucherExclusionsDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resVoucherExclusionsDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
