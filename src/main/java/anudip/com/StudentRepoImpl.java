
package anudip.com;
import java.util.Iterator;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class StudentRepoImpl implements StudentRepo
{
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate.config.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory sfactory=meta.buildSessionFactory();
	
	//insertion
	@Override
	public void insertStudent(Student s)
	{
		Session session=sfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(s);
		transaction.commit();
	}
    //updation
	@Override
	public void updateStudent(Student s) 
	{
		Session session=sfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(s);
		transaction.commit();
		
	}

	@Override
	public void deleteStudent(Student s) 
	{
		Session session=sfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(s);
		transaction.commit();
		
	}

	@Override
	public void selectStudent() 
	{
		Session session=sfactory.openSession();
		Query q=session.createQuery("from Student");
		List<Student> list=q.getResultList();
		Iterator<Student> i=list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		
		//count of names
		Query q2=session.createQuery("Select count(sname) from Student");
		List<Student> count=q2.getResultList();
		Iterator<Student> itr1=count.iterator();
		System.out.println("records updated"+count);
		
		//max function
		Query q3=session.createQuery("Select max(age) from Student");
		List<Student> a=q3.getResultList();
		Iterator<Student> itr2=a.iterator();
		System.out.println("Maximum age of Students"+a);
		
		//min function
		Query q4=session.createQuery("Select min(age) from Student");
		List<Student> b=q4.getResultList();
		Iterator<Student> itr3=b.iterator();
		System.out.println("Minimum age of Students"+b);
		
		//average function
		Query q5=session.createQuery("Select avg(age) from Student");
		List<Student> c=q5.getResultList();
		Iterator<Student> itr4=c.iterator();
		System.out.println("average age of Students is"+c);
		
	}

}
