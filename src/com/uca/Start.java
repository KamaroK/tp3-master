// Auteurs: Passy-Kevis KAMARO & Arnaud NSENGIYUMVA
package com.uca;


public class Start{
	public static void main(String[] args){
		
		RomanNumber numberA = new RomanNumber();
		if (args.length > 0)
		{
			try 
			{
				numberA.setValue(Integer.parseInt(args[0]));
				System.out.println(numberA.compareTo(5));
				if (numberA.getRoman() != ""){
					System.out.println("La valeur romaine de " + args[0] + " est "+ numberA.getRoman());
				}

			} catch (Exception e)
			{
				// Appel de la méthode setRoman pour gérer les cas de lettres en minuscules 
				numberA.setRoman(args[0]);
				System.out.println(numberA.compareTo(5));
				
				if (numberA.getValue() != 0)
				{
					System.out.println("La valeur arabe de " + args[0].toUpperCase() + " est "+ numberA.getValue());
				}
			}
		}

		
	}
	
}