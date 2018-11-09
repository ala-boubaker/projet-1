package com.sdz.exception;

public class NomVilleException extends Exception { 
	  public NomVilleException(String ville){

	    System.out.println("Vous essayez d'instancier une classe Ville avec un nom inf a 3 lettres !");
	    System.out.println("\t => " + ville);
	  }        
	}
