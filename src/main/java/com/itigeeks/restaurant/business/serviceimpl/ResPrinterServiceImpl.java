package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPrinterService;
import com.itigeeks.restaurant.common.entity.schema.ResPrinter;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrinterDAO;
/**
 * Implementation of ResPrinterService
 */
@Service
public class ResPrinterServiceImpl implements ResPrinterService {


	@Autowired
	private ResPrinterDAO resPrinterDAO;
	@Override
	public void delete(ResPrinter resPrinter)
	{
		 resPrinterDAO.delete(resPrinter);
	}
	
	
	
	@Override
	public ResPrinter saveOrUpdate(ResPrinter resPrinter)
	{
		return  resPrinterDAO.saveOrUpdate( resPrinter);
	}
	
	@Override
	public ResPrinter load(Long id )
	{
		return resPrinterDAO.load( id );

	}
	

	@Override
	public List<ResPrinter> loadAll()
	{
		return resPrinterDAO.loadAll();
	}

	@Override
	public List<ResPrinter> loadByNamedQuery(String queryName)
	{
		 return resPrinterDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResPrinter> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resPrinterDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResPrinter> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resPrinterDAO.countAll();

	}

	@Override
	public List<ResPrinter> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resPrinterDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResPrinter> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resPrinterDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResPrinter> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPrinter> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResPrinter> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPrinter> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPrinterDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResPrinter> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPrinterDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResPrinter> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resPrinterDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resPrinterDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resPrinterDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
