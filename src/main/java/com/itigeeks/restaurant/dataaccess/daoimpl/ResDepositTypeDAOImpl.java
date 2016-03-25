package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDepositType;
import com.itigeeks.restaurant.dataaccess.dao.ResDepositTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDepositTypeDAOImpl extends AbstractDAO implements ResDepositTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDepositType resDepositType) 
	{
		super.delete(resDepositType);
	}
	
	public ResDepositType saveOrUpdate(ResDepositType resDepositType) 
	{
		return (ResDepositType) super.saveOrUpdate(resDepositType);
	}

	public ResDepositType load(Long id )
	{
		return (ResDepositType) super.get(ResDepositType.class , id);
	}

	
	public List<ResDepositType> loadAll()
	{
		return (List<ResDepositType>) super.loadAll(ResDepositType.class);
	}


	public List<ResDepositType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDepositType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDepositType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDepositType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResDepositType> search( Map<String, Object> criteria )
	{
		return super.search( ResDepositType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResDepositType.class);
	}

	public List<ResDepositType> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResDepositType.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResDepositType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDepositType.class , startPage , pageSize);
	}

}
