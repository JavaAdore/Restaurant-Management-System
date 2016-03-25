package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPrinterModelService;
import com.itigeeks.restaurant.common.entity.schema.ResPrinterModel;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrinterModelDAO;
/**
 * Implementation of ResPrinterModelService
 */
@Service
public class ResPrinterModelServiceImpl implements ResPrinterModelService {


	@Autowired
	private ResPrinterModelDAO resPrinterModelDAO;
	@Override
	public void delete(ResPrinterModel resPrinterModel)
	{
		 resPrinterModelDAO.delete(resPrinterModel);
	}
	
	
	
	@Override
	public ResPrinterModel saveOrUpdate(ResPrinterModel resPrinterModel)
	{
		return  resPrinterModelDAO.saveOrUpdate( resPrinterModel);
	}
	
	@Override
	public ResPrinterModel load(Long id )
	{
		return resPrinterModelDAO.load( id );

	}
	

	@Override
	public List<ResPrinterModel> loadAll()
	{
		return resPrinterModelDAO.loadAll();
	}

	@Override
	public List<ResPrinterModel> loadByNamedQuery(String queryName)
	{
		 return resPrinterModelDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResPrinterModel> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resPrinterModelDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResPrinterModel> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resPrinterModelDAO.countAll();

	}

	@Override
	public List<ResPrinterModel> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resPrinterModelDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResPrinterModel> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resPrinterModelDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResPrinterModel> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPrinterModel> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResPrinterModel> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPrinterModel> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPrinterModelDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResPrinterModel> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPrinterModelDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResPrinterModel> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resPrinterModelDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resPrinterModelDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resPrinterModelDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
