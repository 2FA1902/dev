
public class Player {
	private String name = "";
	private int pointAttaque = 0;
	private int pointVie = 0;
	
	public Player(String name, int pointAttaque, int pointVie) {
		this.name = name;
		this.pointAttaque = pointAttaque;
		this.pointVie = pointVie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPointAttaque() {
		return pointAttaque;
	}

	public void setPointAttaque(int pointAttaque) {
		this.pointAttaque = pointAttaque;
	}

	public int getPointVie() {
		return pointVie;
	}

	public void setPointVie(int pointVie) {
		this.pointVie = pointVie;
	}
	
	public void damage(int degat, String assaillant){
		this.pointVie -= degat;
		System.out.println(this.name + " vient de subir " + degat + " de dégats par "+ assaillant);
		System.out.println("Ses points de vie s'élève à "+ this.pointVie);
	}
}
