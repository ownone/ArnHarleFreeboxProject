package bts.sio;

import java.util.ArrayList;

public class Garage 
{
	private ArrayList <Voiture> mesVoitures;
	private ArrayList <Option> mesOptions;
	private String adresse;
	
	public Garage (String adresse, ArrayList<Option> mesOptions, ArrayList<Voiture> mesVoitures)
	{
		this.setAdresse(adresse);
		this.setMesOptions(mesOptions);
		this.setMesVoitures(mesVoitures);
	}

	public void addVoitures(Voiture v)
	{
		mesVoitures.add(v);
	}
	
	public void addOptions (Option o)
	{
		mesOptions.add(o);
	}
	
	public void setMesVoitures(ArrayList <Voiture> mesVoitures) {
		this.mesVoitures = mesVoitures;
	}

	public ArrayList <Voiture> getMesVoitures() {
		return mesVoitures;
	}

	public void setMesOptions(ArrayList <Option> mesOptions) {
		this.mesOptions = mesOptions;
	}

	public ArrayList <Option> getMesOptions() {
		return mesOptions;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}
}
