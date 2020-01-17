package com.aniket.app;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.MySQLDialect;


public class TestDao {

	
		public static void saveUser(User user) {
		
		
		Configuration configuration= new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session= factory.openSession();
		Transaction transaction= session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		
		
		
		}
		public static void main(String[] args) {
			
			//SBI-1888366563454
			//business logic or customer logic
			Random random = new Random();
			int number=4*random.nextInt();
			String accountNumber="SBI-"+number;
			
			Account account = new Account();
			account.setAccountNumber(accountNumber);
			account.setAccountType("Saving");
			account.setBalance(1000.00);
			
			
			User user= new User();
			user.setFirstname("shyam");
			user.setLastname("sharma");
			user.setEmail("shyamsharma@gmail.com");
			user.setUserName("shyamsharma");
			
			//set account object refernce to user object
			user.setAcoount(account);
			user.setUserPassword(null);
			saveUser(user);//hibernate operation
			
			
			

			
			
		}
//		public User loginUser(String email, String pwd)
//		{
//			//from user where email=? nad password=?
//		}
}
