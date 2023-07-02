package com.js.otmb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setName("bbb");
		p.setEmail("bbb@123gmail.com");
		p.setPhone(112233344);
		
		Bank b = new Bank();
		b.setB_name("xyz");
		b.setAccount_no(12345688);
		b.setIFSC_code("xyzbbb123");
		
		Bank b1 = new Bank();
		b1.setB_name("pqr");
		b1.setAccount_no(223345688);
		b1.setIFSC_code("pqrbbb123");
		
		Bank b2 = new Bank();
		b2.setB_name("mno");
		b2.setAccount_no(12345555);
		b2.setIFSC_code("mnoxyz123");
		
		
		b.setPerson(p);
		b1.setPerson(p);
		b2.setPerson(p);
		
		
		List<Bank> banks = new ArrayList<Bank>();
		banks.add(b);
		banks.add(b1);
		banks.add(b2);
		
		p.setBanks(banks);
		
		et.begin();
		em.persist(p);
		et.commit();
	}

}
