package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResAdditionalCompanyService;
import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompany;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResAdditionalCompanyDAO;
/**
 * Implementation of ResAdditionalCompanyService
 */
@Service
public class ResAdditionalCompanyServiceImpl implements ResAdditionalCompanyService {


	@Autowired
	private ResAdditionalCompanyDAO resAdditionalCompanyDAO;
	@Override
	public void delete(ResAdditionalCompany resAdditionalCompany)
	{
		 resAdditionalCompanyDAO.delete(resAdditionalCompany);
	}
	
	
	
	@Override
	public ResAdditionalCompany saveOrUpdate(ResAdditionalCompany resAdditionalCompany)
	{
		return  resAdditionalCompanyDAO.saveOrUpdate( resAdditionalCompany);
	}
	
	@Override
	public ResAdditionalCompany load(Long id )
	{
		return resAdditionalCompanyDAO.load( id );

	}
	

	@Override
	public List<ResAdditionalCompany> loadAll()
	{
		return resAdditionalCompanyDAO.loadAll();
	}

	@Override
	public List<ResAdditionalCompany> loadByNamedQuery(String queryName)
	{
		 return resAdditionalCompanyDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResAdditionalCompany> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resAdditionalCompanyDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResAdditionalCompany> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resAdditionalCompanyDAO.countAll();

	}

	@Override
	public List<ResAdditionalCompany> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resAdditionalCompanyDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResAdditionalCompany> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resAdditionalCompanyDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResAdditionalCompany> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResAdditionalCompany> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResAdditionalCompany> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResAdditionalCompany> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resAdditionalCompanyDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResAdditionalCompany> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resAdditionalCompanyDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResAdditionalCompany> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resAdditionalCompanyDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resAdditionalCompanyDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resAdditionalCompanyDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
