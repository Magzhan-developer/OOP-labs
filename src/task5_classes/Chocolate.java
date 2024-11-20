package task5_classes;

public class Chocolate implements Comparable<Chocolate>{
	private String name;
	private double weight;
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public double getWeight() {
        return weight;
    }
	
	public String getName() {
        return name;
    }
	
	@Override
	public int compareTo(Chocolate ch1) {
		return Double.compare(this.weight, ch1.weight);
	}
	
	
	@Override
	public String toString() {
		return "Chocolate with name " + name + ",with weight:" + weight;
	}
}

