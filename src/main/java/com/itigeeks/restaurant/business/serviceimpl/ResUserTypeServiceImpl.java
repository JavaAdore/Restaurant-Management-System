package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResUserTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResUserType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResUserTypeDAO;
/**
 * Implementation of ResUserTypeService
 */
@Service
public class ResUserTypeServiceImpl implements ResUserTypeService {


	@Autowired
	private ResUserTypeDAO resUserTypeDAO;
	@Override
	public void delete(ResUserType resUserType)
	{
		 resUserTypeDAO.delete(resUserType);
	}
	
	
	
	@Override
	public ResUserType saveOrUpdate(ResUserType resUserType)
	{
		return  resUserTypeDAO.saveOrUpdate( resUserType);
	}
	
	@Override
	public ResUserType load(Long id )
	{
		return resUserTypeDAO.load( id );

	}
	

	@Override
	public List<ResUserType> loadAll()
	{
		return resUserTypeDAO.loadAll();
	}

	@Override
	public List<ResUserType> loadByNamedQuery(String queryName)
	{
		 return resUserTypeDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResUserType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resUserTypeDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResUserType> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resUserTypeDAO.countAll();

	}

	@Override
	public List<ResUserType> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resUserTypeDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResUserType> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resUserTypeDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResUserType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResUserType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResUserType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResUserType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resUserTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResUserType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resUserTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResUserType> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resUserTypeDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resUserTypeDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resUserTypeDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
