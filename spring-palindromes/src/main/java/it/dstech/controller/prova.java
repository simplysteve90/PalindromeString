package it.dstech.controller;

import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("inserisci il testo");
		String str= in.nextLine();
		String[] currencies = str.split("\\s+");
		System.out.println("la frase che hai inserito e' composta da "+ conta(str)+" parole");
		System.out.println( check(str));

}
	public static int conta(String currencies) {
		int count=0;
		for(int i = 0; i < currencies.length(); i++){
            if(currencies.charAt(i) != ' '){
                count++;
                while(currencies.charAt(i) != ' ' && i < currencies.length()-1){
                    i++;
                }
            }
        }
        return count;
		  
		
	}
	public static boolean  check(String currencies) {
		int n= currencies.length();
		for(int i=0; i<n; i++,n--)
			if(currencies.charAt(i)!= currencies.charAt(n-1))
				return false;
		return true;
		
	}
	

}
