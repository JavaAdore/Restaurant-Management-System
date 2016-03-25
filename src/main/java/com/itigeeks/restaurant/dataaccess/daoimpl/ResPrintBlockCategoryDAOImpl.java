package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrintBlockCategory;
import com.itigeeks.restaurant.dataaccess.dao.ResPrintBlockCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPrintBlockCategoryDAOImpl extends AbstractDAO implements ResPrintBlockCategoryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPrintBlockCategory resPrintBlockCategory) 
	{
		super.delete(resPrintBlockCategory);
	}
	
	public ResPrintBlockCategory saveOrUpdate(ResPrintBlockCategory resPrintBlockCategory) 
	{
		return (ResPrintBlockCategory) super.saveOrUpdate(resPrintBlockCategory);
	}

	public ResPrintBlockCategory load(Long id )
	{
		return (ResPrintBlockCategory) super.get(ResPrintBlockCategory.class , id);
	}

	
	public List<ResPrintBlockCategory> loadAll()
	{
		return (List<ResPrintBlockCategory>) super.loadAll(ResPrintBlockCategory.class);
	}


	public List<ResPrintBlockCategory> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPrintBlockCategory>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPrintBlockCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPrintBlockCategory>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPrintBlockCategory> search( Map<String, Object> criteria )
	{
		return super.search( ResPrintBlockCategory.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPrintBlockCategory.class);
	}

	public List<ResPrintBlockCategory> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPrintBlockCategory.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPrintBlockCategory> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPrintBlockCategory.class , startPage , pageSize);
	}

}
