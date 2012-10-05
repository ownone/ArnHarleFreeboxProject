package bts.sio;

public abstract class Voiture 
{
	private String numero;
	protected double prix;
	
	
	public Voiture(String numero, double prix)
	{
		this.numero=numero;
		this.prix=prix;
	}
	
	public String getNumero()
	{
		return this.numero;
	}
	
	public abstract double getPrix();

	public String toString()
	  { 

      return "Numero:"+this.getNumero(); 

    } 
}


