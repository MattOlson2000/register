
public class Sides extends Food{
	
	public Sides() {
		super();
	}

	public Sides(String name) {
		super (name);
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String toString() {
		return getName() + "\n";
	}

	public void defaultSides() {
		price = 0;
		name = "";
		
	}
	
}
