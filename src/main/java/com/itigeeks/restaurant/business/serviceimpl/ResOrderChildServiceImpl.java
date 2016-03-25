package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderChildService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderChild;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderChildDAO;
/**
 * Implementation of ResOrderChildService
 */
@Service
public class ResOrderChildServiceImpl implements ResOrderChildService {


	@Autowired
	private ResOrderChildDAO resOrderChildDAO;
	@Override
	public void delete(ResOrderChild resOrderChild)
	{
		 resOrderChildDAO.delete(resOrderChild);
	}
	
	
	
	@Override
	public ResOrderChild saveOrUpdate(ResOrderChild resOrderChild)
	{
		return  resOrderChildDAO.saveOrUpdate( resOrderChild);
	}
	
	@Override
	public ResOrderChild load(Long id )
	{
		return resOrderChildDAO.load( id );

	}
	

	@Override
	public List<ResOrderChild> loadAll()
	{
		return resOrderChildDAO.loadAll();
	}

	@Override
	public List<ResOrderChild> loadByNamedQuery(String queryName)
	{
		 return resOrderChildDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResOrderChild> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resOrderChildDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResOrderChild> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resOrderChildDAO.countAll();

	}

	@Override
	public List<ResOrderChild> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resOrderChildDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResOrderChild> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resOrderChildDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResOrderChild> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrderChild> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResOrderChild> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResOrderChild> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderChildDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResOrderChild> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resOrderChildDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResOrderChild> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderChildDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resOrderChildDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resOrderChildDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
