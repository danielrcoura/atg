package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class DieAllTests {
	private Die die;
	
	
	
	@Test
	public void testaConstrutorVazio() {
		this.die = new Die();
	}
	
	@Test(expected = AssertionError.class)
	public void testaConstrutorCom1Inteiro() {
		this.die = new Die(0);
	}
	
	@Test
	public void testaConstrutorComInteiroMaior1() {
		this.die = new Die(2);
	}
	
	@Test
	public void testaConstrutorCom2Inteiros() {
		this.die = new Die(2,2);
	}
	
	@Test(expected = AssertionError.class)
	public void testaConstrutorCom2Inteiros1() {
		this.die = new Die(1,1);
	}
	
	@Test(expected = NullPointerException.class)
	public void testaRollSemMontagem() {
		this.die.roll();
	}
	
	@Test
	public void testeRoll() {
		this.die = new Die(2);
		this.die.roll();
	}
	
	@Test
	public void testaEqualsNull() {
		this.die = new Die(2);
		assertFalse(this.die.equals(null));
		}
	
	@Test
	public void testaEqualsOutroObjeto(){
		String outroObjeto = "OutroObjeto";
		this.die = new Die(2);
		assertFalse(this.die.equals(outroObjeto));
	}
	
	@Test
	public void testaEqualsObjetosIguais() {
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
	public void testaEqualsComObjetosDieDiferentes() {
		this.die = new Die(2);
		Die die2 = new Die(3);
		assertFalse(this.die.equals(die2));
	}
	
	@Test
	public void testaToString() {
		this.die = new Die(2);
		assertEquals("Num sides 2 result 1",die.toString());
	}
	
	
	
}