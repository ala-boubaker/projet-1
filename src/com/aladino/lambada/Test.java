package com.aladino.lambada;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Dialoguer d = new Dialoguer() {

		    public void parler(String question) {

		        System.out.println("Tu as dis : " + question);  

		    }

		};

		d.parler("Bonjour");*/

		
		Dialoguer d = (s) -> System.out.println("Tu as dis : " + s);

		d.parler("Bonjour");
	}

}
