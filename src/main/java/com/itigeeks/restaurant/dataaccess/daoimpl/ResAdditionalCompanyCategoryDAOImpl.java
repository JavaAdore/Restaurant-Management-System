package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompanyCategory;
import com.itigeeks.restaurant.dataaccess.dao.ResAdditionalCompanyCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResAdditionalCompanyCategoryDAOImpl extends AbstractDAO implements ResAdditionalCompanyCategoryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResAdditionalCompanyCategory resAdditionalCompanyCategory) 
	{
		super.delete(resAdditionalCompanyCategory);
	}
	
	public ResAdditionalCompanyCategory saveOrUpdate(ResAdditionalCompanyCategory resAdditionalCompanyCategory) 
	{
		return (ResAdditionalCompanyCategory) super.saveOrUpdate(resAdditionalCompanyCategory);
	}

	public ResAdditionalCompanyCategory load(Long id )
	{
		return (ResAdditionalCompanyCategory) super.get(ResAdditionalCompanyCategory.class , id);
	}

	
	public List<ResAdditionalCompanyCategory> loadAll()
	{
		return (List<ResAdditionalCompanyCategory>) super.loadAll(ResAdditionalCompanyCategory.class);
	}


	public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName)
	{
		
		return (List<ResAdditionalCompanyCategory>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResAdditionalCompanyCategory>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResAdditionalCompanyCategory> search( Map<String, Object> criteria )
	{
		return super.search( ResAdditionalCompanyCategory.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResAdditionalCompanyCategory.class);
	}
}
