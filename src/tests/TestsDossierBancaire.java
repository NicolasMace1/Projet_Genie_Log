package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire {

	@Test  
	public void should_Be_Equal_to_100_test_deposer_and_get() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100,dossier.get_solde(),0); //voir documentation en ligne sur assertions Junit 
	}
	
	@Test  
	public void should_Be_Equal_to_10000_Multiplied_By_0dot6_Multiplied_By_0dot032_test_remuneration() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(10000);
		dossier.remunerer();
		assertEquals(10192, (int)dossier.get_solde());
	}

	@Test
	public void should_Create_A_Bank_File_With_0_Credits() 
	{
		DossierBancaire dossier=new DossierBancaire();
		assertEquals(0, (int)dossier.get_solde());
	}
	
	@Test
	public void should_Take_50_Test_Retirer()
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100, (int)dossier.get_solde());
		dossier.retirer(50);
		assertEquals(50, (int)dossier.get_solde());
	}
	
	@Test
	public void should_Raise_An_Exception_When_There_Is_Not_Enough()
	{
		try {
			DossierBancaire dossier=new DossierBancaire();
			dossier.deposer(100);
			dossier.retirer(500);
		    fail("Should not be able to take 500 when there is 100 on the account");
		  }catch(IllegalArgumentException aExp){
		    assert(aExp.getMessage().contains("Vous n'avez pas assez d'argent sur votre compte"));
		  }
	}

}
