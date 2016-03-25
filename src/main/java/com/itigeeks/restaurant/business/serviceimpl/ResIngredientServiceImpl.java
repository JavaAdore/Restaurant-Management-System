package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResIngredientService;
import com.itigeeks.restaurant.common.entity.schema.ResIngredient;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResIngredientDAO;
/**
 * Implementation of ResIngredientService
 */
@Service
public class ResIngredientServiceImpl implements ResIngredientService {


	@Autowired
	private ResIngredientDAO resIngredientDAO;
	@Override
	public void delete(ResIngredient resIngredient)
	{
		 resIngredientDAO.delete(resIngredient);
	}
	
	
	
	@Override
	public ResIngredient saveOrUpdate(ResIngredient resIngredient)
	{
		return  resIngredientDAO.saveOrUpdate( resIngredient);
	}
	
	@Override
	public ResIngredient load(Long id )
	{
		return resIngredientDAO.load( id );

	}
	

	@Override
	public List<ResIngredient> loadAll()
	{
		return resIngredientDAO.loadAll();
	}

	@Override
	public List<ResIngredient> loadByNamedQuery(String queryName)
	{
		 return resIngredientDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResIngredient> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resIngredientDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResIngredient> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resIngredientDAO.countAll();

	}

	@Override
	public List<ResIngredient> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resIngredientDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResIngredient> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resIngredientDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResIngredient> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResIngredient> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResIngredient> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResIngredient> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resIngredientDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResIngredient> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resIngredientDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResIngredient> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resIngredientDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resIngredientDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resIngredientDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
