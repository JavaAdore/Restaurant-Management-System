package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderTypeDAO;
/**
 * Implementation of ResOrderTypeService
 */
@Service
public class ResOrderTypeServiceImpl implements ResOrderTypeService {


	@Autowired
	private ResOrderTypeDAO resOrderTypeDAO;
	@Override
	public void delete(ResOrderType resOrderType)
	{
		 resOrderTypeDAO.delete(resOrderType);
	}
	
	
	
	@Override
	public ResOrderType saveOrUpdate(ResOrderType resOrderType)
	{
		return  resOrderTypeDAO.saveOrUpdate( resOrderType);
	}
	
	@Override
	public ResOrderType load(Long id )
	{
		return resOrderTypeDAO.load( id );

	}
	

	@Override
	public List<ResOrderType> loadAll()
	{
		return resOrderTypeDAO.loadAll();
	}

	@Override
	public List<ResOrderType> loadByNamedQuery(String queryName)
	{
		 return resOrderTypeDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResOrderType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resOrderTypeDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResOrderType> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resOrderTypeDAO.countAll();

	}

	@Override
	public List<ResOrderType> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resOrderTypeDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResOrderType> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resOrderTypeDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResOrderType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrderType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResOrderType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrderType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResOrderType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResOrderType> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderTypeDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderTypeDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resOrderTypeDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
