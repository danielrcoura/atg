package src;

import static org.junit.Assert.*;

import org.junit.Test;
import src.SinglyLinkedListImpl;

public class SinglyLinkedListImplTest {

	private SinglyLinkedListImpl<Object> sll;
	
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
}
