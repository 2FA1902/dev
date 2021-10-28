
public class Ananas extends Fruit implements IntFruit {

	public Ananas() {
		super("Ananas");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gout() {
		// TODO Auto-generated method stub
		System.out.println("L'ananas a un gout plutot acide");
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean aDesGraines() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ispeeled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String typeDePeau() {
		// TODO Auto-generated method stub
		return "L'ananas a une peau piquante";
	}

}
