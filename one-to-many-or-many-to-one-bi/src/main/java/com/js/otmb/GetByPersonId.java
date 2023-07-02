package com.js.otmb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByPersonId {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class, 10);
		
		if(p != null) {
			System.out.println();
			System.out.println("Person Id = "+p.getId());
			System.out.println("Person Name = "+p.getName());
			System.out.println("Person Emain = "+p.getEmail());
			System.out.println("Person Phone Number = "+p.getPhone());
			System.out.println("==========================================");
			
			List<Bank> banks = p.getBanks();
			if(banks.size()>0) {
				for(Bank b : banks) {
					System.out.println();
					System.out.println("Bank Id = "+b.getId());
					System.out.println("Bank Name = "+b.getB_name());
					System.out.println("Account No = "+b.getAccount_no());
					System.out.println("IFSC Code = "+b.getIFSC_code());
					System.out.println("----------------------------------");
				}
			}else {
				System.out.println("No Bank Account with= this Person");
			}
		}else {
			System.out.println("No Person With the given ID");
		}
	}

}
