package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCardTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResCardType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCardTypeDAO;
/**
 * Implementation of ResCardTypeService
 */
@Service
public class ResCardTypeServiceImpl implements ResCardTypeService {


	@Autowired
	private ResCardTypeDAO resCardTypeDAO;
	@Override
	public void delete(ResCardType resCardType)
	{
		 resCardTypeDAO.delete(resCardType);
	}
	
	
	
	@Override
	public ResCardType saveOrUpdate(ResCardType resCardType)
	{
		return  resCardTypeDAO.saveOrUpdate( resCardType);
	}
	
	@Override
	public ResCardType load(Long id )
	{
		return resCardTypeDAO.load( id );

	}
	

	@Override
	public List<ResCardType> loadAll()
	{
		return resCardTypeDAO.loadAll();
	}

	@Override
	public List<ResCardType> loadByNamedQuery(String queryName)
	{
		 return resCardTypeDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResCardType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resCardTypeDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResCardType> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resCardTypeDAO.countAll();

	}

	@Override
	public List<ResCardType> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resCardTypeDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResCardType> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resCardTypeDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResCardType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCardType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResCardType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCardType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCardTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResCardType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCardTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResCardType> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resCardTypeDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resCardTypeDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resCardTypeDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
