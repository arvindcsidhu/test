package com.node;

public class ClassNode {

	private int data;
	private ClassNode next;

	public ClassNode(int data) {

		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ClassNode getNext() {
		return next;
	}

	public void setNext(ClassNode next) {
		this.next = next;
	}

}
