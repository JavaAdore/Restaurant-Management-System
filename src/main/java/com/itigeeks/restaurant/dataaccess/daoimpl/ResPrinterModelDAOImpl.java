package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrinterModel;
import com.itigeeks.restaurant.dataaccess.dao.ResPrinterModelDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPrinterModelDAOImpl extends AbstractDAO implements ResPrinterModelDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPrinterModel resPrinterModel) 
	{
		super.delete(resPrinterModel);
	}
	
	public ResPrinterModel saveOrUpdate(ResPrinterModel resPrinterModel) 
	{
		return (ResPrinterModel) super.saveOrUpdate(resPrinterModel);
	}

	public ResPrinterModel load(Long id )
	{
		return (ResPrinterModel) super.get(ResPrinterModel.class , id);
	}

	
	public List<ResPrinterModel> loadAll()
	{
		return (List<ResPrinterModel>) super.loadAll(ResPrinterModel.class);
	}


	public List<ResPrinterModel> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPrinterModel>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPrinterModel> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPrinterModel>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPrinterModel> search( Map<String, Object> criteria )
	{
		return super.search( ResPrinterModel.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPrinterModel.class);
	}

	public List<ResPrinterModel> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPrinterModel.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPrinterModel> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPrinterModel.class , startPage , pageSize);
	}

}
