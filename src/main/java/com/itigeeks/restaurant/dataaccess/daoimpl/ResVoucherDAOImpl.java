package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResVoucher;
import com.itigeeks.restaurant.dataaccess.dao.ResVoucherDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResVoucherDAOImpl extends AbstractDAO implements ResVoucherDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResVoucher resVoucher) 
	{
		super.delete(resVoucher);
	}
	
	public ResVoucher saveOrUpdate(ResVoucher resVoucher) 
	{
		return (ResVoucher) super.saveOrUpdate(resVoucher);
	}

	public ResVoucher load(Long id )
	{
		return (ResVoucher) super.get(ResVoucher.class , id);
	}

	
	public List<ResVoucher> loadAll()
	{
		return (List<ResVoucher>) super.loadAll(ResVoucher.class);
	}


	public List<ResVoucher> loadByNamedQuery(String queryName)
	{
		
		return (List<ResVoucher>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResVoucher> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResVoucher>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResVoucher> search( Map<String, Object> criteria )
	{
		return super.search( ResVoucher.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResVoucher.class);
	}

	public List<ResVoucher> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResVoucher.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResVoucher> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResVoucher.class , startPage , pageSize);
	}

}
