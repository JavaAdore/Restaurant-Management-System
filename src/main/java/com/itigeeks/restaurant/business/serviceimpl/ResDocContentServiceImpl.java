package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResDocContentService;
import com.itigeeks.restaurant.common.entity.schema.ResDocContent;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDocContentDAO;
/**
 * Implementation of ResDocContentService
 */
@Service
public class ResDocContentServiceImpl implements ResDocContentService {


	@Autowired
	private ResDocContentDAO resDocContentDAO;
	@Override
	public void delete(ResDocContent resDocContent)
	{
		 resDocContentDAO.delete(resDocContent);
	}
	
	
	
	@Override
	public ResDocContent saveOrUpdate(ResDocContent resDocContent)
	{
		return  resDocContentDAO.saveOrUpdate( resDocContent);
	}
	
	@Override
	public ResDocContent load(Long id )
	{
		return resDocContentDAO.load( id );

	}
	

	@Override
	public List<ResDocContent> loadAll()
	{
		return resDocContentDAO.loadAll();
	}

	@Override
	public List<ResDocContent> loadByNamedQuery(String queryName)
	{
		 return resDocContentDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResDocContent> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resDocContentDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResDocContent> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resDocContentDAO.countAll();

	}

	@Override
	public List<ResDocContent> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resDocContentDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResDocContent> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resDocContentDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResDocContent> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResDocContent> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResDocContent> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResDocContent> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resDocContentDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResDocContent> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resDocContentDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResDocContent> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resDocContentDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resDocContentDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resDocContentDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
