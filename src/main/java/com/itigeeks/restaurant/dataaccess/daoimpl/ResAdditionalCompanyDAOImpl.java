package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompany;
import com.itigeeks.restaurant.dataaccess.dao.ResAdditionalCompanyDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResAdditionalCompanyDAOImpl extends AbstractDAO implements ResAdditionalCompanyDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResAdditionalCompany resAdditionalCompany) 
	{
		super.delete(resAdditionalCompany);
	}
	
	public ResAdditionalCompany saveOrUpdate(ResAdditionalCompany resAdditionalCompany) 
	{
		return (ResAdditionalCompany) super.saveOrUpdate(resAdditionalCompany);
	}

	public ResAdditionalCompany load(Long id )
	{
		return (ResAdditionalCompany) super.get(ResAdditionalCompany.class , id);
	}

	
	public List<ResAdditionalCompany> loadAll()
	{
		return (List<ResAdditionalCompany>) super.loadAll(ResAdditionalCompany.class);
	}


	public List<ResAdditionalCompany> loadByNamedQuery(String queryName)
	{
		
		return (List<ResAdditionalCompany>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResAdditionalCompany> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResAdditionalCompany>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResAdditionalCompany> search( Map<String, Object> criteria )
	{
		return super.search( ResAdditionalCompany.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResAdditionalCompany.class);
	}

	public List<ResAdditionalCompany> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResAdditionalCompany.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResAdditionalCompany> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResAdditionalCompany.class , startPage , pageSize);
	}

}
