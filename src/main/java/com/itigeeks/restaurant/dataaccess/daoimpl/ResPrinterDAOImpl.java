package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrinter;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrinterDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPrinterDAOImpl extends AbstractDAO implements ResPrinterDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPrinter resPrinter) 
	{
		super.delete(resPrinter);
	}
	
	public ResPrinter saveOrUpdate(ResPrinter resPrinter) 
	{
		return (ResPrinter) super.saveOrUpdate(resPrinter);
	}

	public ResPrinter load(Long id )
	{
		return (ResPrinter) super.get(ResPrinter.class , id);
	}

	
	public List<ResPrinter> loadAll()
	{
		return (List<ResPrinter>) super.loadAll(ResPrinter.class);
	}


	public List<ResPrinter> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPrinter>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPrinter> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPrinter>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResPrinter.class);
	}

	

	public List<ResPrinter> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPrinter.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResPrinter> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResPrinter> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResPrinter>) super.load(ResPrinter.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResPrinter> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResPrinter> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResPrinter> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResPrinter>) super.load(ResPrinter.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResPrinter.class  , criteria ,conjuncationType) ;
	}
			


	

}
