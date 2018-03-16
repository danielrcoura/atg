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

	// *----- MÉTODO DE ADICIONAR -----*

	@Test
	public void testAddUmElementoSemHead() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
	}
	
	@Test
	public void testAddUmElementoComHead() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.add(2);
	}

	// *----- METODO DE ADICIONAR APÓS -----*

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

	// *----- METODO DE DELETAR O PRIMEIRO ELEMENTO -----*

	@Test
	public void testDeleteFront() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.add(2);
		this.sll.addAfter(1, 2);
		this.sll.deleteFront();
	}

	@Test(expected = NullPointerException.class)
	public void testDeleteFrontSemElementos() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.deleteFront();
	}

	@Test
	public void testDeleteFrontProxElementoNull() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.deleteFront();
	}

	// *----- METODO DE ADICIONAR ELEMENTO APÓS OUTRO -----*

	@Test
	public void testDeleteAfterProxElementoNaoPossuiProximo() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.add(2);
		this.sll.add(3);
		this.sll.deleteAfter(2);
	}

	@Test
	public void testDeleteAfterProxElementoPossuiProximo() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.add(2);
		this.sll.add(3);
		this.sll.add(4);
		this.sll.deleteAfter(2);
	}

	@Test(expected = NullPointerException.class)
	public void testDeleteAfterSemProxElemento() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.add(2);
		this.sll.deleteAfter(2);
	}

	@Test
	public void testDeleteAfterNaoExisteAfter() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.deleteAfter(2);
	}

	@Test
	public void testDeleteAfterSemElementos() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.deleteAfter(1);
	}

	// *----- METODO DE PERCORRER O ELEMENTOS -----*

	@Test
	public void testTraverseSemElementos() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.traverse();
	}

	@Test
	public void testTraverse() {
		this.sll = new SinglyLinkedListImpl<Object>();
		this.sll.add(1);
		this.sll.add(2);
		this.sll.add(2);
		this.sll.traverse();
	}

	// *----- METODO DE PEGAR O VALOR DE UM NÓ -----*

	@Test
	public void testGetValue() {
		assertEquals(this.n.getValue(), null);
	}

	// *----- METODO DE ALTERAR O VALOR DE UM NÓ -----*

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
		this.n.setValue(-1);
		assertEquals(this.n.getValue(), -1);
	}

	// *----- MÉTODO DE PEGAR O PRÓXIMO ELEMENTO DE UM NÓ -----*

	@Test
	public void testGetNextRef() {
		Node<Object> n2 = new Node<>();
		this.n.setValue(1);
		n2.setValue(2);
		this.n.setNextRef(n2);
		assertTrue(this.n.getNextRef().equals(n2));
	}

	@Test
	public void testGetNextRefProxNull() {
		this.n.getNextRef();
	}

	// *----- METODO DE ALTERAR O PRÓXIMO ELEMENTO DE UM NÓ -----*

	@Test
	public void testaSetNextRefNull() {
		this.n.setNextRef(null);
	}

	@Test
	public void testaSetNextRef() {
		Node<Object> next = new Node<Object>();
		this.n.setNextRef(next);
	}

	// *----- METODO DE COMPARAR DOIS NÓS -----*

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
