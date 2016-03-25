package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPredefinedMessage;
import com.itigeeks.restaurant.dataaccess.dao.ResPredefinedMessageDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPredefinedMessageDAOImpl extends AbstractDAO implements ResPredefinedMessageDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPredefinedMessage resPredefinedMessage) 
	{
		super.delete(resPredefinedMessage);
	}
	
	public ResPredefinedMessage saveOrUpdate(ResPredefinedMessage resPredefinedMessage) 
	{
		return (ResPredefinedMessage) super.saveOrUpdate(resPredefinedMessage);
	}

	public ResPredefinedMessage load(Long id )
	{
		return (ResPredefinedMessage) super.get(ResPredefinedMessage.class , id);
	}

	
	public List<ResPredefinedMessage> loadAll()
	{
		return (List<ResPredefinedMessage>) super.loadAll(ResPredefinedMessage.class);
	}


	public List<ResPredefinedMessage> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPredefinedMessage>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPredefinedMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPredefinedMessage>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPredefinedMessage> search( Map<String, Object> criteria )
	{
		return super.search( ResPredefinedMessage.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPredefinedMessage.class);
	}

	public List<ResPredefinedMessage> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPredefinedMessage.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPredefinedMessage> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPredefinedMessage.class , startPage , pageSize);
	}

}
