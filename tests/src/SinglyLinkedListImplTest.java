package src;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import src.SinglyLinkedListImpl;

public class SinglyLinkedListImplTest {

	private SinglyLinkedListImpl<Object> sll;
	
	private Node<Object> n;
	
	@Before
	public void setUp() {
		this.n = new Node<Object>();
	}
	
	// *----- METODO #6 -----*
	
	@Test
	public void testAddAfter() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.addAfter(1, 2);
	}
	
	@Test
	public void testAddAfterElementNull() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.add(2);
		this.sll.addAfter(3, 2);
	}

	@Test
	public void testAddAfterElementRepetido() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.add(1);
		this.sll.addAfter(1, 1);
	}
	
	// *----- METODO #16 -----*
		
		@Test
		public void testaSetValue0() {
			this.n.setValue(0);
			assertEquals(this.n.getValue(), 0);
		}
		
		@Test
		public void testaSetValue1() {
			this.n.setValue(1);
			assertEquals(this.n.getValue(), 1);
		}
		
		@Test
		public void testaSetValue1Negativo() {
			this.n.setValue(- 1);
			assertEquals(this.n.getValue(), - 1);
		}
		
	// *----- METODO #18 -----*
		
		@Test
		public void testaSetNextRefNull() {
			this.n.setNextRef(null);
		}
		
		@Test
		public void testaSetNextRef() {
			Node<Object> next = new Node<Object>();
			this.n.setNextRef(next);
		}
		
	// *----- METODO #19 -----*
		
		@Test
		public void testaCompareToNull() {
			assertTrue(this.n.compareTo(null) == 0);
		}
		
		@Test
		public void testaCompareToNode() {
			this.n.setValue(1);
			Node<Object> other = new Node<Object>();
			assertTrue(this.n.compareTo(other.getValue()) == 1);
		}
		
		@Test
		public void testaCompareToInteiroIgual() {
			this.n.setValue(1);
			assertTrue(this.n.compareTo(1) == 0);
		}
		
		@Test
		public void testaCompareToDiferente() {
			this.n.setValue(1);
			assertTrue(this.n.compareTo(2) == 1);
		}
		
		@Test
		public void testaCompareToEleMesmo() {
			assertTrue(this.n.compareTo(this.n.getValue()) == 0);
		}
}
