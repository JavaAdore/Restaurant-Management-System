package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderProductAddonService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderProductAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderProductAddonDAO;
/**
 * Implementation of ResOrderProductAddonService
 */
@Service
public class ResOrderProductAddonServiceImpl implements ResOrderProductAddonService {


	@Autowired
	private ResOrderProductAddonDAO resOrderProductAddonDAO;
	@Override
	public void delete(ResOrderProductAddon resOrderProductAddon)
	{
		 resOrderProductAddonDAO.delete(resOrderProductAddon);
	}
	
	
	
	@Override
	public ResOrderProductAddon saveOrUpdate(ResOrderProductAddon resOrderProductAddon)
	{
		return  resOrderProductAddonDAO.saveOrUpdate( resOrderProductAddon);
	}
	
	@Override
	public ResOrderProductAddon load(Long id )
	{
		return resOrderProductAddonDAO.load( id );

	}
	

	@Override
	public List<ResOrderProductAddon> loadAll()
	{
		return resOrderProductAddonDAO.loadAll();
	}

	@Override
	public List<ResOrderProductAddon> loadByNamedQuery(String queryName)
	{
		 return resOrderProductAddonDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResOrderProductAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resOrderProductAddonDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResOrderProductAddon> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resOrderProductAddonDAO.countAll();

	}

	@Override
	public List<ResOrderProductAddon> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resOrderProductAddonDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResOrderProductAddon> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resOrderProductAddonDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResOrderProductAddon> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrderProductAddon> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResOrderProductAddon> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrderProductAddon> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderProductAddonDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResOrderProductAddon> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderProductAddonDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResOrderProductAddon> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderProductAddonDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderProductAddonDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resOrderProductAddonDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
