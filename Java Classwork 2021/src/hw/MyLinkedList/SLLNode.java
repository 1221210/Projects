/*
       cs2300
       name: Ian J. Selby
       700720666
       Assignment / Exercise: Homework 1
       */
package hw.MyLinkedList;

public class SLLNode<E> {
	E info;
	SLLNode<E> next;
	public SLLNode(E val) {
		info = val;
		next = null;
		//last = null;
	}

}
