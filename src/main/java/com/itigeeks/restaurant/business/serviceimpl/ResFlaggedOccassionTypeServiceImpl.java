package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResFlaggedOccassionTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassionType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResFlaggedOccassionTypeDAO;
/**
 * Implementation of ResFlaggedOccassionTypeService
 */
@Service
public class ResFlaggedOccassionTypeServiceImpl implements ResFlaggedOccassionTypeService {


	@Autowired
	private ResFlaggedOccassionTypeDAO resFlaggedOccassionTypeDAO;
	@Override
	public void delete(ResFlaggedOccassionType resFlaggedOccassionType)
	{
		 resFlaggedOccassionTypeDAO.delete(resFlaggedOccassionType);
	}
	
	
	
	@Override
	public ResFlaggedOccassionType saveOrUpdate(ResFlaggedOccassionType resFlaggedOccassionType)
	{
		return  resFlaggedOccassionTypeDAO.saveOrUpdate( resFlaggedOccassionType);
	}
	
	@Override
	public ResFlaggedOccassionType load(Long id )
	{
		return resFlaggedOccassionTypeDAO.load( id );

	}
	

	@Override
	public List<ResFlaggedOccassionType> loadAll()
	{
		return resFlaggedOccassionTypeDAO.loadAll();
	}

	@Override
	public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName)
	{
		 return resFlaggedOccassionTypeDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resFlaggedOccassionTypeDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResFlaggedOccassionType> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resFlaggedOccassionTypeDAO.countAll();

	}

	@Override
	public List<ResFlaggedOccassionType> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resFlaggedOccassionTypeDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResFlaggedOccassionType> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resFlaggedOccassionTypeDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResFlaggedOccassionType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResFlaggedOccassionType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResFlaggedOccassionType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResFlaggedOccassionType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resFlaggedOccassionTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResFlaggedOccassionType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resFlaggedOccassionTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResFlaggedOccassionType> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resFlaggedOccassionTypeDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resFlaggedOccassionTypeDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resFlaggedOccassionTypeDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
