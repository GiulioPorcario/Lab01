package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javafx.scene.input.MouseDragEvent;



public class Parole {
		
	public List <String> listaParole;	
	
	public Parole() 
	{
		listaParole = new LinkedList <String>();	
	}
	
	public void addParola(String p) 
	{
		listaParole.add(p);
	}
	
	public List<String> getElenco() 
	{
		List <String> listatmp = new LinkedList <String>(listaParole);
		Collections.sort(listatmp, new ordineAlfabetico());
		
		return listatmp;
	}
	
	public String stampaElenco()
	{
		return getElenco().toString();
	}
	
	public void reset()
	{
		listaParole.clear();

	}
}
