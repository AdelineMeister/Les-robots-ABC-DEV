package Robot;

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
		
	}
	
	public boolean eteindreRobot()
	{
		
	}
	
	public boolean seDeplacer(Deplacement deplacement, int distance)
	{
		
	}
	
	public boolean chargerCargaison()
	{
		
	}
	
	public boolean dechargerCargaison()
	{
		
	}
	
	public Robot(String _nomRobot, boolean _estAllumer, boolean _peutSeDeplacer,boolean _avecCargaison )
	{
		this.nomRobot = _nomRobot;
		this.estAllumer = _estAllumer;
		this.peutSeDeplacer = _peutSeDeplacer;
		this.avecCargaison = _avecCargaison;
	}
	
	public String getname()
	{
		
	}
	
	public void setname()
	{
		
	}
	
	public String toString()
	{
		
	}
	
	public int calculerDistance()
	{
		
	}
	

}
