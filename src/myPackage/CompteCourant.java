package myPackage;

public class CompteCourant implements Compte {
	
	private double _solde;
	public CompteCourant()
	{
		_solde = 0;
	}
	public void setSolde(double montant)
	{
		_solde = montant;
	}
	public double getSolde()
	{
		return _solde;
	}
}
