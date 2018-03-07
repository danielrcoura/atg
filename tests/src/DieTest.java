package src;

import static org.junit.Assert.*;

import org.junit.Test;
import src.Die;

public class DieTest {

	private Die die;
	
	// *----- METODO #1 -----*
	
	@Test
	public void testCriaDie() {
		this.die = new Die();
	}
	
	// *----- METODO #6 -----*
	
		@Test
		public void testGetResult() {
			this.die = new Die();
			assertEquals(1, this.die.getResult());
		}
	
	// *----- METODO #8 -----*
	
		@Test
		public void testToString() {
			this.die = new Die();
			String str = "Num sides 6 result 1";
			assertEquals(str, this.die.toString());
		}

}
