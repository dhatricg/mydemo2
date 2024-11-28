package com.cg.emp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.emp.persistance.HibernateUtil;

public class UseEmployeeHql {
	 
    // Method to insert a new employee record
    public void insertRecord(Session session, Employee employee) {
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        System.out.println("Employee inserted successfully: " + employee);
    }
 
    public List<Employee> getAllRecords(Session session) {
        String hql = "FROM Employee";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        return query.list();
    }
 
    public Employee getRecordById(Session session, int id) {
        return session.get(Employee.class, id);
    }
 
    public List<Employee> getRecordsByFirstName(Session session, String firstName) {
        String hql = "FROM Employee WHERE firstName = :firstName";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("firstName", firstName);
        return query.list();
    }
 
    public List<Employee> getRecordsByLastName(Session session, String lastName) {
        String hql = "FROM Employee WHERE lastName = :lastName";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("lastName", lastName);
        return query.list();
    }
 
    public List<Employee> getEmployeesByFullName(Session session, String firstName, String lastName) {
        String hql = "FROM Employee WHERE firstName = :firstName AND lastName = :lastName";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("firstName", firstName);
        query.setParameter("lastName", lastName);
        return query.list();
    }
 
    public List<Employee> getEmployeesByIdAndSalary(Session session, int id, int salary) {
        String hql = "FROM Employee WHERE id = :id AND salary = :salary";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("id", id);
        query.setParameter("salary", salary);
        return query.list();
    }
 
    public static void getEmployeeStartDatetoToday(String startDate, String endDate) {
		String str="from Employee where doj between :startDate and :endDate";
		Session session=HibernateUtil.getSessionFactory().openSession();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date start=sdf.parse(startDate);
			Date end=sdf.parse(endDate);
		Query<Employee> query5=session.createQuery(str, Employee.class);
		query5.setParameter("startDate", start);
		query5.setParameter("endDate", end);
		List<Employee> result=query5.list();
		for(Employee e:result) {
			System.out.println(e);
		}
		}catch(Exception e) {
			e.printStackTrace();
        }
    }
}
 