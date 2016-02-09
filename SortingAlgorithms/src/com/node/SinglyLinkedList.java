package com.node;

public class SinglyLinkedList<T> {

	private Node<T> head;

	private Node<T> tail;

	public void add(T i) {

		Node<T> nd = new Node<T>();
		nd.setData(i);
		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}
	}

	public void deleteNode(T i) {

		Node<T> nd = head;
		while (nd != null) {
			if (nd.getData() == i) {
				if (nd.getNextRef() != null) {
					nd.setData(nd.getNextRef().getData());
					nd.nextRef = null;
				} else {
					nd.setNextRef(null);
					nd.setData(null);
					
				}
			} else {

 				nd = nd.getNextRef();
			}
		}
	}

	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getData());
			tmp = tmp.getNextRef();

		}
	}

	public static void main(String[] args) {

		SinglyLinkedList<Integer> sn = new SinglyLinkedList<Integer>();

		sn.add(3);
		sn.add(4);
		sn.deleteNode(3);
		sn.traverse();
	}

}
