package myPackage;

public class CompteCourant implements Compte {
	
	private double _soldeCourant;
	public CompteCourant()
	{
		_soldeCourant = 0;
	}
	public void setSolde(double montant)
	{
		_soldeCourant = montant;
	}
	public double getSolde()
	{
		return _soldeCourant;
	}
}
