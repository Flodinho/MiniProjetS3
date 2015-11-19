import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

 

public class testTri {

TriBulle tb;


@Before public void setUp() throws IOException 
{
	int[] tab = {1,2,9,8,5,6};
	tb = new TriBulle(tab);
}

@Test public void estVide()
{
	int x = tb.getTaille();
	assertTrue(x!=0);
}

 
@Test public void estTrie()
{
	int[] x = tb.getTab();
	tb.triTab();
	int[] y = tb.getTab();
 	assertArrayEquals(x,y); 
}

}