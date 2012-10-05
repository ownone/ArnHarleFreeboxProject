package bts.sio;

import java.util.ArrayList;

public class Neuve extends Voiture
{
	private ArrayList<Option> tabOptions;

	public Neuve(String numero, double prix, ArrayList<Option> tabOptions)
	{
		super(numero, prix);
		this.tabOptions=tabOptions;
	}
	
	public Neuve(String numero, double prix)
	{
		super(numero, prix);
		this.tabOptions=new ArrayList<Option>();
	}
	

	public double getPrix() 
	{	
		double calc = 0; 			
		for (Option opt : this.tabOptions) 
		{
			calc = calc + opt.getPrix();
		}
		return calc+super.prix;

	}
	
	public String toString()
	{ 
		return "Numero:" + this.getNumero() + "\tPrix:" +  this.getPrix() + "\tOptions:" + this.tabOptions; 
    } 
	
	public void addOptions(Option op)
	{
		tabOptions.add(op); 
	}

}
