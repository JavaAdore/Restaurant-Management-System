package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrinter;
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
	
	
	public List<ResPrinter> search( Map<String, Object> criteria )
	{
		return super.search( ResPrinter.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPrinter.class);
	}
}
