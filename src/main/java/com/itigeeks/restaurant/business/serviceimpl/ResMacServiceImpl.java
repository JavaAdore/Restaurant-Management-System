package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResMacService;
import com.itigeeks.restaurant.common.entity.schema.ResMac;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResMacDAO;
/**
 * Implementation of ResMacService
 */
@Service
public class ResMacServiceImpl implements ResMacService {


	@Autowired
	private ResMacDAO resMacDAO;
	@Override
	public void delete(ResMac resMac)
	{
		 resMacDAO.delete(resMac);
	}
	
	
	
	@Override
	public ResMac saveOrUpdate(ResMac resMac)
	{
		return  resMacDAO.saveOrUpdate( resMac);
	}
	
	@Override
	public ResMac load(Long id )
	{
		return resMacDAO.load( id );

	}
	

	@Override
	public List<ResMac> loadAll()
	{
		return resMacDAO.loadAll();
	}

	@Override
	public List<ResMac> loadByNamedQuery(String queryName)
	{
		 return resMacDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResMac> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resMacDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResMac> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resMacDAO.countAll();

	}

	@Override
	public List<ResMac> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resMacDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResMac> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resMacDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResMac> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResMac> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResMac> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResMac> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resMacDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResMac> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resMacDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResMac> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resMacDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resMacDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resMacDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
