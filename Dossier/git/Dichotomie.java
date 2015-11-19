public class Dichotomie 
{ 
	private int tab[]; 
	
	public Dichotomie(int tab[]) 
	{ 
		this.tab = tab; 
	} 

	public boolean recherche(int val) 
	{ 
		int n = this.tab.length-1;
		int bas = 0, haut = n, milieu;
		boolean ok = false;
		do{ milieu = (bas + haut) / 2; 
			if ( this.tab[milieu] == val) 
				ok = true; 
			else if ( this.tab[milieu] < val ) 
				bas = milieu + 1; 
			else haut = milieu - 1; 
		} 
		
		while ( (this.tab[milieu] != val ) & ( bas <= haut ) );
			return ok; 
	}
}