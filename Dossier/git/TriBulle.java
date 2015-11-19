
public class TriBulle {

	private int tab[]; 
	
	public TriBulle(int[] tab) 
	{ 
		super(); 
		this.tab = tab; 
	} 
	
	public int[] getTab() 
	{ 
		return tab; 
	} 
	
	public int getTab(int i) 
	{ 
		return tab[i]; 
	} 
	
	public int getTaille() 
	{ 
		return this.tab.length; 
	} 
	
	public void setTab(int[] tab) 
	{ 
		this.tab = tab; 
	} 
	
	public void triTab ()
	{ 
		for (int i=0 ;i<=(this.tab.length-2);i++) 
			for (int j=(this.tab.length-1);i < j;j--)
				if (this.tab[j] < this.tab[j-1]) 
				{ 
					int x=this.tab[j-1]; 
					this.tab[j-1]=this.tab[j]; 
					this.tab[j]=x; 
				} 
	}
}
