package it.polito.tdp.parole.model;

import java.util.Comparator;

public class ordineAlfabetico implements Comparator<String> 
{
	@Override
	public int compare(String a, String b) 
	{
		return (int)(a.compareTo(b)); 
	}
}
