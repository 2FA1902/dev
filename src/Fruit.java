public abstract class Fruit {
	
	private String name;
	
	public Fruit(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void gout();
	public abstract int size();
	public abstract boolean aDesGraines();

	public void miam(){
		System.out.println("Miam manger 5 fruits et légumes par jour / le fruit est "+ getName());
	}
}
