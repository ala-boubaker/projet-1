package com.sdz.exception;

public class NombreHabitantException extends Exception{ 
	
	  public NombreHabitantException(int nbre){
	    System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants n�gatif !");
	    System.out.println("\t => " + nbre);
	  }  
	}