package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import myPackage.CompteCourant;


public class TestsCompteCourant {

	@Test  
	public void should_Initiate_A_Compte_Courant() 
	{
		CompteCourant CC = new CompteCourant();
		assertEquals(0, (int)CC.getSolde());
	}
	
	@Test  
	public void should_Be_Able_To_Modify_The_Solde() 
	{
		CompteCourant CC = new CompteCourant();
		CC.setSolde(100);
		assertEquals(100, (int)CC.getSolde());
	}
}
