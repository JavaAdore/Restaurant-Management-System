package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrintBlock;
import com.itigeeks.restaurant.dataaccess.dao.ResPrintBlockDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPrintBlockDAOImpl extends AbstractDAO implements ResPrintBlockDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPrintBlock resPrintBlock) 
	{
		super.delete(resPrintBlock);
	}
	
	public ResPrintBlock saveOrUpdate(ResPrintBlock resPrintBlock) 
	{
		return (ResPrintBlock) super.saveOrUpdate(resPrintBlock);
	}

	public ResPrintBlock load(Long id )
	{
		return (ResPrintBlock) super.get(ResPrintBlock.class , id);
	}

	
	public List<ResPrintBlock> loadAll()
	{
		return (List<ResPrintBlock>) super.loadAll(ResPrintBlock.class);
	}


	public List<ResPrintBlock> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPrintBlock>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPrintBlock> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPrintBlock>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPrintBlock> search( Map<String, Object> criteria )
	{
		return super.search( ResPrintBlock.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPrintBlock.class);
	}

	public List<ResPrintBlock> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPrintBlock.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPrintBlock> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPrintBlock.class , startPage , pageSize);
	}

}
