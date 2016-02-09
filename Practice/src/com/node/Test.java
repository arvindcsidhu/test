package com.node;

public class Test {
	public static void main(String[] args) {
	System.out.println(a());
	}
	
	public static String ma(int x){
		int j =1;
		int l = 4;
		switch(x){
		case 0:break;
		case 4:
			j++;
		
		}
		return "succ";
		
	}
	
	public static int a(){
		
		try{
			System.out.println("a");
			return 1;
		}
		catch(Exception e){
			e.printStackTrace();
			return 2;
		}
		finally{
			
			try{
				System.out.println("b");
				return 3;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
