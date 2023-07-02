package com.js.otmb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByBankId {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Bank b = em.find(Bank.class, 1);
		
		if(b != null) {
			System.out.println("Bank Id = "+b.getId());
			System.out.println("Bank Name = "+b.getB_name());
			System.out.println("Account No = "+b.getAccount_no());
			System.out.println("IFSC Code = "+b.getIFSC_code());
			System.out.println("=================================");
			
			List<Person> persons = (List<Person>) b.getPerson();
			
			if(persons.size()>0) {
				for(Person p : persons) {
					System.out.println("Person Id = "+p.getId());
					System.out.println("Person Name = "+p.getName());
					System.out.println("Person Emain = "+p.getEmail());
					System.out.println("Person Phone Number = "+p.getPhone());
					System.out.println("==========================================");
				}
				
			}else {
				System.out.println("No person had bank account in the given id");
			}
			
		}else {
			System.out.println("No Bank Account In the Given Id");
		}
	}

}
