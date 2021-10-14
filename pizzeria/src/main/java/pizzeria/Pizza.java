package pizzeria;

public class Pizza {
	
	private boolean stuffedCrust;
	private int slices;
	private String toppings;
	
	public Pizza(boolean stuffedCrust, int slices, String toppings) {
		super();
		this.stuffedCrust = stuffedCrust;
		this.slices = slices;
		this.toppings = toppings;
	}

	public boolean isStuffedCrust() {
		return stuffedCrust;
	}

	public void setStuffedCrust(boolean stuffedCrust) {
		this.stuffedCrust = stuffedCrust;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + slices;
		result = prime * result + (stuffedCrust ? 1231 : 1237);
		result = prime * result + ((toppings == null) ? 0 : toppings.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (slices != other.slices)
			return false;
		if (stuffedCrust != other.stuffedCrust)
			return false;
		if (toppings == null) {
			if (other.toppings != null)
				return false;
		} else if (!toppings.equals(other.toppings))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pizza [stuffedCrust=" + stuffedCrust + ", slices=" + slices + ", toppings=" + toppings + "]";
	}
	
	
	
	

}
