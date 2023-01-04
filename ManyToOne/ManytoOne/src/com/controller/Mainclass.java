package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class Mainclass {
public static void main(String[] args) {
	
	Session sess =  new Util().getConnect();
	Transaction tr = sess.beginTransaction();
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st name:");
	Person p = new Person();
	p.setName(sc.next());
	
	System.out.println("Enter 2nd name:");
	Person p1 = new Person();
	p1.setName(sc.next());
	

	Address ad = new Address();
	System.out.println("Enter Address 1:");
	ad.setAddr(sc.next());
	
	
	
	List<Person> list =  new ArrayList<>();
	list.add(p);
	list.add(p1);
	
	ad.setPerson(list);
	p.setAdd(ad);
	p1.setAdd(ad);

	/*p.setAdd(ad);
	p.setAdd(ad2);
	*/
	
	
	/*p.setAdd(ad);
	p1.setAdd(ad);*/
	
	
/*	List<Person> list =  new ArrayList<>();
	list.add(p1);
	list.add(p);

	ad.setPerson(list);*/
	
	sess.save(p);
	sess.save(p1);
	sess.save(ad);

	tr.commit();
	sess.close();
}
}
