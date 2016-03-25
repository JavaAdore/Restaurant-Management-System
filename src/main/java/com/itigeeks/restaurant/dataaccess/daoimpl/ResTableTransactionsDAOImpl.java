package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTableTransactions;
import com.itigeeks.restaurant.dataaccess.dao.ResTableTransactionsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResTableTransactionsDAOImpl extends AbstractDAO implements ResTableTransactionsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResTableTransactions resTableTransactions) 
	{
		super.delete(resTableTransactions);
	}
	
	public ResTableTransactions saveOrUpdate(ResTableTransactions resTableTransactions) 
	{
		return (ResTableTransactions) super.saveOrUpdate(resTableTransactions);
	}

	public ResTableTransactions load(Long id )
	{
		return (ResTableTransactions) super.get(ResTableTransactions.class , id);
	}

	
	public List<ResTableTransactions> loadAll()
	{
		return (List<ResTableTransactions>) super.loadAll(ResTableTransactions.class);
	}


	public List<ResTableTransactions> loadByNamedQuery(String queryName)
	{
		
		return (List<ResTableTransactions>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResTableTransactions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResTableTransactions>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResTableTransactions> search( Map<String, Object> criteria )
	{
		return super.search( ResTableTransactions.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResTableTransactions.class);
	}

	public List<ResTableTransactions> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResTableTransactions.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResTableTransactions> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResTableTransactions.class , startPage , pageSize);
	}

}
