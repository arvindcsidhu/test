package com.node;

public class IntNode {
	
	private int data;
	
	private IntNode next;
	
	public IntNode(int data,IntNode next){

		this.data = data;
		this.next = next;
		
	}
	
	public String toString(){
		
		return data+"";
	}

}
