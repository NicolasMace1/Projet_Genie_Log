package myPackage;

public class DossierBancaire {
	
	private CompteCourant CC;
	private CompteEpargne CE;
	private double m_solde;
	
	//Constructeur autre commit
    public DossierBancaire()
    {
    	m_solde=0;
    	CC = new CompteCourant();
    	CE = new CompteEpargne();
    }

    public void deposer(double value) 
    {
    	CE.setSolde(CE.getSolde() + 0.6 * value);
    	CC.setSolde(CC.getSolde() + 0.4 * value);
    	m_solde = CC.getSolde() + CE.getSolde();
    }
    public void retirer(double valeur) throws IllegalArgumentException
    {
    	double CEs = CE.getSolde();
    	double CCs = CC.getSolde();
    	
    	if(valeur > CEs + CCs)
    	{
    		throw new IllegalArgumentException("Vous n'avez pas assez d'argent sur votre compte");
    	}
    	else if(0.6 * valeur > CCs)
    	{
    		CC.setSolde(0);
    		valeur -= CCs;
    		CE.setSolde(CEs - valeur);
    	}
    	else if(0.4 * valeur > CEs)
    	{
    		CE.setSolde(0);
    		valeur -= CEs;
    		CC.setSolde(CCs - valeur);
    	}
    	else
    	{
    		CE.setSolde(CEs - 0.4 * valeur);
    		CC.setSolde(CCs - 0.6 * valeur);
    	}
    	m_solde = CC.getSolde() + CE.getSolde();
    }
    
    public double get_solde() 
    {
    	return m_solde;
    }
    
    public void remunerer() 
    {
    	CE.remunerer();
    	m_solde = CC.getSolde() + CE.getSolde();
    }
	
}
