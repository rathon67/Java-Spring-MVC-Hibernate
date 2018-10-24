package com.rathon.myapp.model.dao;

import com.rathon.myapp.model.Layout;
import com.rathon.myapp.ds.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 * @author rathon
 * 
 */

/**
 * @method for generate table on view
 * 
 * */
@SuppressWarnings("unchecked")
public class LayoutDao {
	//SHOW DATA FROM HIBERNATE ORDER DESC
	public static List<Layout> getLayout(){
		Session session= HibernateUtil.getSessionFactory().openSession();
		Criteria cr = (Criteria) session.createCriteria(Layout.class);
		cr.addOrder(Order.desc("value"));		
		cr.setMaxResults(3);
		List<Layout> result = cr.list();	
		return result;
	}
	
	public static List<Layout> getMidText(){
		Session session= HibernateUtil.getSessionFactory().openSession();
		Criteria cr = (Criteria) session.createCriteria(Layout.class);
		cr.addOrder(Order.asc("value"));
		cr.setFirstResult(4);		
		cr.setMaxResults(5);
		List<Layout> result = cr.list();	
		return result;
	}
	
	public static List<Layout> getBottomText(){
		Session session= HibernateUtil.getSessionFactory().openSession();
		Criteria cr = (Criteria) session.createCriteria(Layout.class);
		cr.addOrder(Order.asc("value"));		
		cr.setMaxResults(3);
		List<Layout> result = cr.list();	
		return result;
	}
	
	//EXECUTE PARAM FROM VIEW IN HIBERNATE
	public static int incValue(String name){
		Session session= HibernateUtil.getSessionFactory().openSession();
		Criteria cr = (Criteria) session.createCriteria(Layout.class);
		cr.add(Restrictions.eq("name", name));
		List<Layout> result = cr.list();
		
		//execute list value using looping  
		int hasil=0;
		for(Layout data : result) {
			hasil = data.getValue();
			hasil+=1;
		}
		return hasil;
	}	

	//method for execute hibernate using where clause
	public static String updateLayout(String name, int value) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		//do execute update value in HQL
		String hasil = "";
		try {
			Session session = sf.openSession();
			String hql = "UPDATE Layout set value = :hasil WHERE name = :name";
			Query query = session.createQuery(hql);
			query.setParameter("hasil", value);
			query.setParameter("name", name);
			
			session.beginTransaction();
			query.executeUpdate();
			session.getTransaction().commit();
			hasil = "berhasil update";
		}catch(Exception e) {
			//do catch error information
			hasil = "gagal update";
		}	
		
		return hasil;
	}	
	
	//method for execute hibernate using where clause
	public static List<Layout> getDetail(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT L.pictureDetail, L.pictureDetail2, L.name FROM Layout L WHERE name = :name";
		Query query = session.createQuery(hql);
		query.setParameter("name", name);
		List<Layout> results = query.list();		
		return results;
		}	
	
}
