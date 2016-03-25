package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPromotionProductDiscountService;
import com.itigeeks.restaurant.common.entity.schema.ResPromotionProductDiscount;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionProductDiscountDAO;
/**
 * Implementation of ResPromotionProductDiscountService
 */
@Service
public class ResPromotionProductDiscountServiceImpl implements ResPromotionProductDiscountService {


	@Autowired
	private ResPromotionProductDiscountDAO resPromotionProductDiscountDAO;
	@Override
	public void delete(ResPromotionProductDiscount resPromotionProductDiscount)
	{
		 resPromotionProductDiscountDAO.delete(resPromotionProductDiscount);
	}
	
	
	
	@Override
	public ResPromotionProductDiscount saveOrUpdate(ResPromotionProductDiscount resPromotionProductDiscount)
	{
		return  resPromotionProductDiscountDAO.saveOrUpdate( resPromotionProductDiscount);
	}
	
	@Override
	public ResPromotionProductDiscount load(Long id )
	{
		return resPromotionProductDiscountDAO.load( id );

	}
	

	@Override
	public List<ResPromotionProductDiscount> loadAll()
	{
		return resPromotionProductDiscountDAO.loadAll();
	}

	@Override
	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName)
	{
		 return resPromotionProductDiscountDAO.loadByNamedQuery( queryName);

	}

	@Override
	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return 	resPromotionProductDiscountDAO.loadByNamedQuery( queryName,  queryParameters);

	}
	
	@Override
	public List<ResPromotionProductDiscount> load( Map<String, Object> criteria )
	{
		return loadWithAllCriteria(criteria);
	}

	@Override
	public Integer countAll()
	{
		return 	resPromotionProductDiscountDAO.countAll();

	}

	@Override
	public List<ResPromotionProductDiscount> loadWithAllCriteria( Map<String, Object> criteria  ) 
	{
		return 	resPromotionProductDiscountDAO.load( criteria , QueryConjunctionType.AND  );

	}

	
	@Override
	public List<ResPromotionProductDiscount> loadAll(Integer startPage , Integer pageSize )
	{
		return 	resPromotionProductDiscountDAO.loadAll( startPage ,  pageSize );
	}

	
	
	@Override
	public List<ResPromotionProductDiscount> load( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAllCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPromotionProductDiscount> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  )
	{
		return loadWithAllCriteria(  criteria ,  startPage ,  pageSize , null , null  );
	
	}
	
	@Override
	public List<ResPromotionProductDiscount> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize )
	{
		return loadWithAnyCriteria( criteria ,  startPage ,  pageSize , null , null);

	}
	
	@Override
	public List<ResPromotionProductDiscount> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPromotionProductDiscountDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.AND );

	}

	@Override
	public List<ResPromotionProductDiscount> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending )
	{
		return 	resPromotionProductDiscountDAO.load(  criteria ,  startPage ,  pageSize ,  sortField,  ascending , QueryConjunctionType.OR );

	}
	
	

	public List<ResPromotionProductDiscount> loadWithAnyCriteria( Map<String, Object> criteria  )
	{
		return 	resPromotionProductDiscountDAO.load( criteria , QueryConjunctionType.OR  );
	}
	
	@Override
	public Integer getCount( Map<String, Object> criteria  )
	{
		return getCountOfAllCriteria(criteria);
	}

	@Override
	public Integer getCountOfAllCriteria( Map<String, Object> criteria  )
	{
		return 	resPromotionProductDiscountDAO.getCount(criteria , QueryConjunctionType.AND );
	}
	
	@Override
	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  )
	{
			return 	resPromotionProductDiscountDAO.getCount(criteria , QueryConjunctionType.OR );

	}




	

}
