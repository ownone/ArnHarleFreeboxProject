package bts.sio;

public class Occasion extends Voiture
{
	private int nbKms;
	private int age;
	
	public Occasion(String numero, double prix, int nbKms, int age) 
	{
		super(numero, prix);
		this.age=age;
		this.nbKms=nbKms;
	}
	
	public String toString()
	  { 

      return "Numero:"+this.getNumero() + "\tPrix:"+  this.getPrix() + "\tAncienneté:" + this.getAge() + "\tKilométrage:" + this.getNbKms(); 

    } 

	public int getNbKms()
	{
		return this.nbKms;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public double getPrix() 
	{
		int majmin = this.nbKms/this.age;
		
		if (majmin>20000)
		{
			majmin=majmin-20000;
			prix= (int) (prix - (majmin*0.05)*age);
		}	
			else
			{
				majmin=20000-majmin;
				prix=(int) (prix + (majmin*0.05)*age);
			}
		return prix;
		
	}
	
}
