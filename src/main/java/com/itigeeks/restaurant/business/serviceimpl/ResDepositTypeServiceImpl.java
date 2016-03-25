package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResDepositTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResDepositType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDepositTypeDAO;
/**
 * Implementation of ResDepositTypeService
 */
@Service
public class ResDepositTypeServiceImpl implements ResDepositTypeService {


	@Autowired
	private ResDepositTypeDAO resDepositTypeDAO;
	@Override
	public void delete(ResDepositType resDepositType)
	{
		 resDepositTypeDAO.delete(resDepositType);
	}
	
	
	
	@Override
	public ResDepositType saveOrUpdate(ResDepositType resDepositType)
	{
		return  resDepositTypeDAO.saveOrUpdate( resDepositType);
	}
	
	@Override
	public ResDepositType load(Long id )
	{
		return resDepositTypeDAO.load( id );

	}
	

	@Override
	public List<ResDepositType> loadAll()
	{
		return resDepositTypeDAO.loadAll();
	}

	@Override
	public List<ResDepositType> loadByNamedQuery(String queryName)
	{
		 return resDepositTypeDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResDepositType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resDepositTypeDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResDepositType> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resDepositTypeDAO.countAll();

	}

	@Override
	public List<ResDepositType> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resDepositTypeDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResDepositType> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resDepositTypeDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResDepositType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResDepositType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResDepositType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResDepositType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resDepositTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResDepositType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resDepositTypeDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResDepositType> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resDepositTypeDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resDepositTypeDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resDepositTypeDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
