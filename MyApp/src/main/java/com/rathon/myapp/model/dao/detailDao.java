//package com.rathon.myapp.model.dao;
//
//import java.util.List;
////import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.Session;
////import org.hibernate.criterion.Restrictions;
//import com.rathon.myapp.ds.hibernateUtil;
//import com.rathon.myapp.model.detail;
//
//@SuppressWarnings("unchecked")
//public class detailDao {
//	public static List<detail> getDetail(String name){
//		Session session=hibernateUtil.getSessionFactory().openSession();
//		String hql = "FROM detail E WHERE E.name = :name";
//		Query query = session.createQuery(hql);
//		query.setParameter("name", name);
//		List<detail> results = query.list();
//	
//		return results;
//	}
//	
//
//}
