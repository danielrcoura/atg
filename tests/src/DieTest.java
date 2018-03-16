package src;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Die;

public class DieTest {

	private Die die;

	// *----- CONSTRUTOR SEM PARÂMETROS -----*

	@Test
	public void testCriaDie() {
		this.die = new Die();
	}

	// *----- CONSTRUTOR PASSANDO O NÚMERO DE LADOS -----*

	@Test(expected = AssertionError.class)
	public void testaConstrutorComInteiroMenorQueUm() {
		this.die = new Die(0);
	}

	@Test(expected = AssertionError.class)
	public void testaConstrutorComInteiroUm() {
		this.die = new Die(1);
	}

	@Test
	public void testaConstrutorComInteiroMaiorQueUm() {
		this.die = new Die(2);
	}

	// *----- CONSTRUTOR PASSANDO O NÚMERO DE LADO E O RESULTADO -----*

	@Test
	public void testConstrutorComResultNumSideSimples() {
		this.die = new Die(2, 2);
	}
	
	@Test(expected = AssertionError.class)
	public void testConstrutorComResultNumResultMaiorQueNumSide() {
		this.die = new Die(2, 3);
	}
	
	@Test(expected = AssertionError.class)
	public void testConstrutorComResultNumResultZero() {
		this.die = new Die(2, 0);
	}
	
	@Test(expected = AssertionError.class)
	public void testConstrutorComResultNumSideUm() {
		this.die = new Die(1, 2);
	}
	
	@Test(expected = AssertionError.class)
	public void testConstrutorComResultNumResult1NumSide1() {
		this.die = new Die(1, 0);
	}

	// *----- MÉTODO ROLL -----*

	@Test
	public void testRoll() {
		this.die = new Die(2, 2);
		assertTrue(this.die.roll() >= 1 && this.die.roll() <= 2);
	}
	// *----- MÉTODO PEGAR O NÚMERO DE LADOS -----*

	@Test
	public void testGetNumSide() {
		this.die = new Die(4, 3);
		assertEquals(this.die.getNumSides(), 4);
	}

	// *----- METODO PEGAR O RESULTADO -----*

	@Test
	public void testGetResult() {
		this.die = new Die();
		assertEquals(1, this.die.getResult());
	}

	// *----- EQUALS -----*

	@Test
	public void testaEqualsNull() {
		this.die = new Die(2);
		assertFalse(this.die.equals(null));
	}

	@Test
	public void testaEqualsObjetoQualquer() {
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
	public void testaEqualsObjetosDieComNumSideDiferentes() {
		this.die = new Die(2, 1);
		Die die2 = new Die(3, 1);
		assertFalse(this.die.equals(die2));
	}
	
	@Test
	public void testaEqualsObjetosDieComResultDiferentes() {
		this.die = new Die(4, 1);
		Die die2 = new Die(4, 2);
		assertFalse(this.die.equals(die2));
	}
	
	@Test
	public void testaEqualsObjetosDieComResultNumSidesDiferentes() {
		this.die = new Die(4, 1);
		Die die2 = new Die(5, 3);
		assertFalse(this.die.equals(die2));
	}

	// *----- TOSTRING -----*

	@Test
	public void testToString() {
		this.die = new Die();
		String str = "Num sides 6 result 1";
		assertEquals(str, this.die.toString());
	}

}
