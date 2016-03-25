package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCityService;
import com.itigeeks.restaurant.common.entity.schema.ResCity;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCityDAO;
/**
 * Implementation of ResCityService
 */
@Service
public class ResCityServiceImpl implements ResCityService {


	@Autowired
	private ResCityDAO resCityDAO;
	@Override
	public void delete(ResCity resCity)
	{
		 resCityDAO.delete(resCity);
	}
	
	
	
	@Override
	public ResCity saveOrUpdate(ResCity resCity)
	{
		return  resCityDAO.saveOrUpdate( resCity);
	}
	
	@Override
	public ResCity load(Long id )
	{
		return resCityDAO.load( id );

	}
	

	@Override
	public List<ResCity> loadAll()
	{
		return resCityDAO.loadAll();
	}

	@Override
	public List<ResCity> loadByNamedQuery(String queryName)
	{
		 return resCityDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResCity> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resCityDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResCity> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resCityDAO.countAll();

	}

	@Override
	public List<ResCity> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resCityDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResCity> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resCityDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResCity> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCity> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResCity> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResCity> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCityDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResCity> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resCityDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResCity> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resCityDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resCityDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resCityDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
