package Robot;

import java.util.Random;

public class Robot {
	
	private String nomRobot;
	private boolean estAllumer;
	private boolean peutSeDeplacer;
	private boolean avecCargaison;
	
	public enum Deplacement {
		AVANT,
		ARRIERE,
		GAUCHE,
		DROITE;
	}
	
	public boolean allumerRobot()
	{
		if(this.estAllumer == false)
		{
			this.estAllumer = true;
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean eteindreRobot()
	{
		if(this.estAllumer == true)
		{
			this.estAllumer = false;
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean seDeplacer()
	{
		int distance = calculerDistance();
		if(this.estAllumer)
		{
			if( distance < 10 )
			{
				this.peutSeDeplacer = false;
				return false;
			}
			else
			{
				this.peutSeDeplacer = true;
				return true;
			}
		}
		else
		{
			return false;
		}
		
		
	}
	
	public String deplacer(Deplacement move)
	{
		String str="";
		if(this.peutSeDeplacer)
		{
			switch(move)
			{
				case AVANT: 
				{
					str = "Le robot avance";
					break;
				}
				case ARRIERE:
				{
					str = "Le robot recule";
					break;
				}
				case GAUCHE:
				{
					str = "Le robot tourne à gauche";
					break;
				}
				case DROITE:
				{
					str = "Le robot tourne à droite";
					break;
				}
				default : 
				{
					break;
				}
			}
		}
		return str;	
	}
	
	/*public boolean chargerCargaison()
	{
		
	}
	
	public boolean dechargerCargaison()
	{
		
	}*/
	
	public Robot(String _nomRobot, boolean _estAllumer, boolean _peutSeDeplacer,boolean _avecCargaison )
	{
		this.nomRobot = _nomRobot;
		this.estAllumer = _estAllumer;
		this.peutSeDeplacer = _peutSeDeplacer;
		this.avecCargaison = _avecCargaison;
	}
	
	public String getname()
	{
		return this.nomRobot;
	}
	
	public void setname(String _nomRobot)
	{
		this.nomRobot = _nomRobot;
	}
	
	/*public String toString()
	{
		
	}*/
	
	private int calculerDistance()
	{
		Random rand = new Random();
		final int borneMin = 0;
		final int borneMax = 100;
		int distance = rand.nextInt(borneMax - borneMin +1) + borneMin;
		return distance;
	}
	

}
