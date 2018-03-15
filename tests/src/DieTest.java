package src;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import src.Die;

public class DieTest {

	private Die die;
	
	// *----- METODO #1 -----*
	
		@Test
		public void testCriaDie() {
			this.die = new Die();
		}
	
	// *----- METODO #2 -----*
		
		@Test(expected = AssertionError.class)
		public void testaConstrutorComInteiroNegativo() {
			this.die = new Die(-1);
		}
	
		@Test(expected = AssertionError.class)
		public void testaConstrutorComInteiroNulo() {
			this.die = new Die(0);
		}
		
		@Test(expected = AssertionError.class)
		public void testaConstrutorComInteiroUm() {
			this.die = new Die(1);
		}
		
		@Test(expected = AssertionError.class)
		public void testaConstrutorComNumNegativo() {
			this.die = new Die(-2);
		}
		
		@Test
		public void testaConstrutorComInteiroMaiorQueUm() {
			this.die = new Die(2);
		}
		
		@Test
		public void testaConstrutorComInteiroIgualDefault() {
			this.die = new Die(6);
		}
		
	// *----- METODO #3 -----*
		
		@Test (expected = AssertionError.class)
		public void testConstrutorComResultNumSide1Result1() {
			this.die = new Die(1, 1);
		}
		
		@Test (expected = AssertionError.class)
		public void testConstrutorComResultNumSide1Result2() {
			this.die = new Die(1, 2);
		}
		
		@Test (expected = AssertionError.class)
		public void testConstrutorComResultNumSide3ResultNegativo() {
			this.die = new Die(3, -1);
		}
		
		@Test 
		public void testConstrutorComResultNumSide9Result2() {
			this.die = new Die(9, 2);
		}
		
		@Test (expected = AssertionError.class)
		public void testConstrutorComResultNumSideNegativoResult2() {
			this.die = new Die(-1, 2);
		}
		
	// *----- METODO #4 -----*	
		
		@Test
		public void testRoll() {
			this.die = new Die(5, 2);
			assertEquals(this.die.roll(), 3);
		}
	// *----- METODO #5 -----*
		
		@Test
		public void testGetNumSide() {
			this.die = new Die(4, 3);
			assertEquals(this.die.getNumSides(), 4);
		}
	
	// *----- METODO #6 -----*
	
		@Test
		public void testGetResult() {
			this.die = new Die();
			assertEquals(1, this.die.getResult());
		}
		
	// *----- METODO #7 -----*
	
		@Test
		public void testaEqualsNull() {
			this.die = new Die(2);
			assertFalse(this.die.equals(null));
			}
		
		@Test
		public void testaEqualsObjetoQualquer(){
			Object outroObjeto = new Object();
			this.die = new Die(2);
			assertFalse(this.die.equals(outroObjeto));
		}
		
		@Test
		public void testaEqualsObjetoIgual() {
			this.die = new Die(2);
			Die die2 = new Die(2);
			assertTrue(this.die.equals(die2));
		}
		
		@Test
		public void testaEqualsDieComEleMesmo() {
			this.die = new Die(2);
			assertTrue(this.die.equals(die));
		}
		
		@Test
		public void testaEqualsObjetosDieDiferentes() {
			this.die = new Die(2);
			Die die2 = new Die(3);
			assertFalse(this.die.equals(die2));
		}
	
		
	
	// *----- METODO #8 -----*
	
		@Test
		public void testToString() {
			this.die = new Die();
			String str = "Num sides 6 result 1";
			assertEquals(str, this.die.toString());
		}

}
