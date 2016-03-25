package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResSettingsService;
import com.itigeeks.restaurant.common.entity.schema.ResSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResSettingsDAO;
/**
 * Implementation of ResSettingsService
 */
@Service
public class ResSettingsServiceImpl implements ResSettingsService {


	@Autowired
	private ResSettingsDAO resSettingsDAO;
	@Override
	public void delete(ResSettings resSettings)
	{
		 resSettingsDAO.delete(resSettings);
	}
	
	
	
	@Override
	public ResSettings saveOrUpdate(ResSettings resSettings)
	{
		return  resSettingsDAO.saveOrUpdate( resSettings);
	}
	
	@Override
	public ResSettings load(Long id )
	{
		return resSettingsDAO.load( id );

	}
	

	@Override
	public List<ResSettings> loadAll()
	{
		return resSettingsDAO.loadAll();
	}

	@Override
	public List<ResSettings> loadByNamedQuery(String queryName)
	{
		 return resSettingsDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resSettingsDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResSettings> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resSettingsDAO.countAll();

	}

	@Override
	public List<ResSettings> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resSettingsDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResSettings> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resSettingsDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResSettings> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResSettings> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResSettings> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResSettings> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resSettingsDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResSettings> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resSettingsDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResSettings> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resSettingsDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resSettingsDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resSettingsDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
