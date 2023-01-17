package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.CompteCourant;
import myPackage.CompteEpargne;

public class TestsCompteEpargne {

	@Test  
	public void should_Initiate_A_Compte_Courant() 
	{
		CompteEpargne CE = new CompteEpargne();
		assertEquals(0, (int)CE.getSolde());
	}
	
	@Test  
	public void should_Be_Able_To_Modify_The_Solde() 
	{
		CompteEpargne CE = new CompteEpargne();
		CE.setSolde(100);
		assertEquals(100, (int)CE.getSolde());
	}
	
	@Test  
	public void should_Be_Able_To_Remunerate() 
	{
		CompteEpargne CE = new CompteEpargne();
		CE.setSolde(1000);
		CE.remunerer();
		assertEquals(1032, (int)CE.getSolde());
	}

}
