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


@SuppressWarnings("unchecked")
public class LayoutDao {
	//SHOW DATA FROM HIBERNATE ORDER DESC
	public static List<Layout> getLayout(){
		Session session= HibernateUtil.getSessionFactory().openSession();
		Criteria cr = (Criteria) session.createCriteria(Layout.class);
		cr.addOrder(Order.desc("value"));
		List<Layout> result = cr.list();
		
		return result;
	}

	//EXECUTE PARAM FROM VIEW IN HIBERNATE
	public static Integer incValue(Integer idMotor){
		Session session= HibernateUtil.getSessionFactory().openSession();
		Criteria cr = (Criteria) session.createCriteria(Layout.class);
		cr.add(Restrictions.eq("idMotor", idMotor));
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
	public static String updateLayout(Integer idMotor, int value) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		//do execute update value in HQL
		String hasil = "";
		try {
			Session session = sf.openSession();
			String hql = "UPDATE Layout set value = :hasil "+"WHERE idMotor = :idMotor";
			Query query = session.createQuery(hql);
			query.setParameter("hasil", value);
			query.setParameter("idMotor", idMotor);
			
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
	public static List<Layout> getDetail(Integer idMotor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT L.pictureDetail, L.pictureDetail2, L.name FROM Layout L WHERE idMotor = :idMotor";
		Query query = session.createQuery(hql);
		query.setParameter("idMotor", idMotor);
		List<Layout> results = query.list();		
		return results;
		}	
}
