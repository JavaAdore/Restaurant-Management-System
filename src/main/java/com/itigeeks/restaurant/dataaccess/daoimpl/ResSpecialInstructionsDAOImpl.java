package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResSpecialInstructions;
import com.itigeeks.restaurant.dataaccess.dao.ResSpecialInstructionsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResSpecialInstructionsDAOImpl extends AbstractDAO implements ResSpecialInstructionsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResSpecialInstructions resSpecialInstructions) 
	{
		super.delete(resSpecialInstructions);
	}
	
	public ResSpecialInstructions saveOrUpdate(ResSpecialInstructions resSpecialInstructions) 
	{
		return (ResSpecialInstructions) super.saveOrUpdate(resSpecialInstructions);
	}

	public ResSpecialInstructions load(Long id )
	{
		return (ResSpecialInstructions) super.get(ResSpecialInstructions.class , id);
	}

	
	public List<ResSpecialInstructions> loadAll()
	{
		return (List<ResSpecialInstructions>) super.loadAll(ResSpecialInstructions.class);
	}


	public List<ResSpecialInstructions> loadByNamedQuery(String queryName)
	{
		
		return (List<ResSpecialInstructions>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResSpecialInstructions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResSpecialInstructions>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResSpecialInstructions> search( Map<String, Object> criteria )
	{
		return super.search( ResSpecialInstructions.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResSpecialInstructions.class);
	}

	public List<ResSpecialInstructions> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResSpecialInstructions.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResSpecialInstructions> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResSpecialInstructions.class , startPage , pageSize);
	}

}
