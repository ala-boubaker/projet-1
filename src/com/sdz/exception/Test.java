package com.sdz.exception;

public class Test {

	public static void main(String[] args) {
        
		  int j = 20, i = 0;
		  try {
		    System.out.println(j/i);
		  } catch (ClassCastException    e) {
		    System.out.println("Division par zéro !"+e.getMessage());
		  }
		  finally{

			    System.out.println("action faite systématiquement");

			  }
		}

}
