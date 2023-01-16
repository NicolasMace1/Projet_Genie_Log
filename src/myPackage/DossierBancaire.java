package myPackage;

public class DossierBancaire {
	
	private CompteCourant CC;
	private CompteEpargne CE;
	private double m_solde;
	
	//Constructeur
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
