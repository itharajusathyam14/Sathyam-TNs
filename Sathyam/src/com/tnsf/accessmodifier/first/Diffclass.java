package com.tnsf.accessmodifier.first;


public class Diffclass {
	public static void main(String args[])
	{
		SameClass sc = new SameClass();
		sc.defaultmethod();
		sc.privatemethod();
		sc.protmethod();
		sc.publicmethod();
		
		//private member can't accessible
		//System.out.println(sc.privari);
		
		System.out.println(sc.defvari);
		System.out.println(sc.protvari);
		System.out.println(sc.pubvari);
		
	}
	
}