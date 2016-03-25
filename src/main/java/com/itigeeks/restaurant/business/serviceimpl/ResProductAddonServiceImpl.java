package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResProductAddonService;
import com.itigeeks.restaurant.common.entity.schema.ResProductAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductAddonDAO;
/**
 * Implementation of ResProductAddonService
 */
@Service
public class ResProductAddonServiceImpl implements ResProductAddonService {


	@Autowired
	private ResProductAddonDAO resProductAddonDAO;
	@Override
	public void delete(ResProductAddon resProductAddon)
	{
		 resProductAddonDAO.delete(resProductAddon);
	}
	
	
	
	@Override
	public ResProductAddon saveOrUpdate(ResProductAddon resProductAddon)
	{
		return  resProductAddonDAO.saveOrUpdate( resProductAddon);
	}
	
	@Override
	public ResProductAddon load(Long id )
	{
		return resProductAddonDAO.load( id );

	}
	

	@Override
	public List<ResProductAddon> loadAll()
	{
		return resProductAddonDAO.loadAll();
	}

	@Override
	public List<ResProductAddon> loadByNamedQuery(String queryName)
	{
		 return resProductAddonDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResProductAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resProductAddonDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResProductAddon> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resProductAddonDAO.countAll();

	}

	@Override
	public List<ResProductAddon> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resProductAddonDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResProductAddon> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resProductAddonDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResProductAddon> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResProductAddon> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResProductAddon> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResProductAddon> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resProductAddonDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResProductAddon> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resProductAddonDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResProductAddon> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resProductAddonDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resProductAddonDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resProductAddonDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
