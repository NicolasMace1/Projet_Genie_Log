package myPackage;

public class CompteEpargne {
	private double _soldeEpargne;
	private double _tauxInteret = 1.032;
	public CompteEpargne()
	{
		_soldeEpargne = 0;
	}
	public void setSolde(double montant)
	{
		_soldeEpargne = montant;
	}
	public double getSolde()
	{
		return _soldeEpargne;
	}
	public void remunerer()
	{
		_soldeEpargne *= _tauxInteret;
	}
}
