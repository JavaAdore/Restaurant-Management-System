package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPromotionProductService;
import com.itigeeks.restaurant.common.entity.schema.ResPromotionProduct;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionProductDAO;
/**
 * Implementation of ResPromotionProductService
 */
@Service
public class ResPromotionProductServiceImpl implements ResPromotionProductService {


	@Autowired
	private ResPromotionProductDAO resPromotionProductDAO;
	@Override
	public void delete(ResPromotionProduct resPromotionProduct)
	{
		 resPromotionProductDAO.delete(resPromotionProduct);
	}
	
	
	
	@Override
	public ResPromotionProduct saveOrUpdate(ResPromotionProduct resPromotionProduct)
	{
		return  resPromotionProductDAO.saveOrUpdate( resPromotionProduct);
	}
	
	@Override
	public ResPromotionProduct load(Long id )
	{
		return resPromotionProductDAO.load( id );

	}
	

	@Override
	public List<ResPromotionProduct> loadAll()
	{
		return resPromotionProductDAO.loadAll();
	}

	@Override
	public List<ResPromotionProduct> loadByNamedQuery(String queryName)
	{
		 return resPromotionProductDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResPromotionProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resPromotionProductDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResPromotionProduct> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resPromotionProductDAO.countAll();

	}

	@Override
	public List<ResPromotionProduct> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resPromotionProductDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResPromotionProduct> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resPromotionProductDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResPromotionProduct> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPromotionProduct> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResPromotionProduct> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPromotionProduct> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPromotionProductDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResPromotionProduct> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPromotionProductDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResPromotionProduct> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resPromotionProductDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resPromotionProductDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resPromotionProductDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
