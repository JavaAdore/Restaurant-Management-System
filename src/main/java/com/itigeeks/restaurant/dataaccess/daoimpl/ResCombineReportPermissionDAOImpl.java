package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCombineReportPermission;
import com.itigeeks.restaurant.dataaccess.dao.ResCombineReportPermissionDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCombineReportPermissionDAOImpl extends AbstractDAO implements ResCombineReportPermissionDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCombineReportPermission resCombineReportPermission) 
	{
		super.delete(resCombineReportPermission);
	}
	
	public ResCombineReportPermission saveOrUpdate(ResCombineReportPermission resCombineReportPermission) 
	{
		return (ResCombineReportPermission) super.saveOrUpdate(resCombineReportPermission);
	}

	public ResCombineReportPermission load(Long id )
	{
		return (ResCombineReportPermission) super.get(ResCombineReportPermission.class , id);
	}

	
	public List<ResCombineReportPermission> loadAll()
	{
		return (List<ResCombineReportPermission>) super.loadAll(ResCombineReportPermission.class);
	}


	public List<ResCombineReportPermission> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCombineReportPermission>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCombineReportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCombineReportPermission>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCombineReportPermission> search( Map<String, Object> criteria )
	{
		return super.search( ResCombineReportPermission.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCombineReportPermission.class);
	}

	public List<ResCombineReportPermission> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResCombineReportPermission.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResCombineReportPermission> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCombineReportPermission.class , startPage , pageSize);
	}

}
