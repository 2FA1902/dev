 
public enum Jour {
	MATIN(8), MIDI(12), APRESMIDI(15), SOIR(20), NUIT(00);
	
	private int heure;
	
	Jour(int heure){
		this.heure = heure;
	}
	
	public int getHeure(){
		return heure;
	}
	
}
