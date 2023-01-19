package myPackage;

public class CompteEpargne {
	private double _solde;
	private double _tauxInteret = 1.032;
	public CompteEpargne()
	{
		_solde = 0;
	}
	public void setSolde(double montant)
	{
		_solde = montant;
	}//j
	public double getSolde()
	{
		return _solde;
	}
	public void remunerer()
	{
		_solde *= _tauxInteret;
	}
}
