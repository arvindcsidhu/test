package com.node;

public class ClassSinglyLinkedList {
	private static ClassNode HEAD;

	private int NodeLength(ClassNode node) {

		int count = 0;
		while (node != null) {
			node = node.getNext();
			count++;
		}
		return count;
	}

	private void insertNode(ClassNode node) {

		ClassNode temp = HEAD;
		if (HEAD == null) {
			HEAD = node;
		} else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}

	}

	private void deleteNode(int nodeNumber) {

		ClassNode temp = HEAD;
		ClassNode prev = null;
		if (temp.getData() == nodeNumber) {
			while (temp.getNext() != null) {

				temp = temp.getNext();
				if (prev == null) {
					prev = temp;
				} else {
					prev.setNext(temp);
				}

			}

			temp = null;
			HEAD = prev;

		} else {
			while (temp != null && temp.getNext() != null) {
				prev = temp;
				temp = temp.getNext();
				if (temp.getData() == nodeNumber) {
					temp = temp.getNext();
					prev.setNext(null);
					prev.setNext(temp);
				}

			}
		}
	}

	public static void main(String[] args) {

		ClassSinglyLinkedList list = new ClassSinglyLinkedList();
		ClassNode node = new ClassNode(3);
		ClassNode node1 = new ClassNode(4);
		ClassNode node2 = new ClassNode(9);
		list.insertNode(node);
		list.insertNode(node1);
		list.insertNode(node2);
		list.deleteNode(3);
		list.deleteNode(4);
		list.deleteNode(9);
		ClassNode node3 = new ClassNode(8);
		ClassNode node4 = new ClassNode(7);
		ClassNode node5 = new ClassNode(6);
		list.insertNode(node3);
		list.insertNode(node4);
		list.insertNode(node5);
		int count = list.NodeLength(HEAD);
		System.out.println(count);

	}
}
