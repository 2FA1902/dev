
public class Pomme extends Fruit  implements IntFruit{

	public Pomme() {
		super("Pomme");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gout() {
		// TODO Auto-generated method stub
		System.out.println("La pomme a un gout plutot sucré");		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean aDesGraines() {
		return true;
	}

	@Override
	public boolean ispeeled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String typeDePeau() {
		// TODO Auto-generated method stub
		return "La pomme a une peau mangeable";
	}

}
