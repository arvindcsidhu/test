package com.node;

public class Node<T> implements Comparable<T>{
	
	public T data;
	
	public Node<T> nextRef;

	

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}

	@Override
	public int compareTo(T arg) {
		  if(arg == this.data){
	            return 0;
	        } else {
	            return 1;
	        }
	
	}


}
