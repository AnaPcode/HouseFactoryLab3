/**
 * A class to represent a resource that consists of a weight and type (stone, wood, or house).
 */
public class Resource {
	private double weight;
	private ResourceType type;
	
	/**
	 * Constructor which initializes the weight and type of this resource object.
	 * @param weight weight of raw material/resource
	 * @param type type of resource (stone, wood, or house)
	 */
	public Resource(double weight, ResourceType type) {
		this.weight = weight;
		this.type = type;
	}
	
	/**
	 * addWeight method increases weight of a resource of the same type.
	 * @param weightToAdd
	 */
	public void addWeight(double weightToAdd) {
		this.weight += weightToAdd;
	}
	
	/**
	 * weightToSubtract method decreases weight of a resource of the same type.
	 * @param weightToSubtract weight to be subtracted from current object weight
	 * @throws IllegalArgumentException exception thrown if weight to be 
	 * subtracted is greater than current object weight for weight cannot be negative.
	 */
	public void subtractWeight(double weightToSubtract) throws IllegalArgumentException {
		if (weightToSubtract > this.weight) {
			throw new IllegalArgumentException("Weight cannot be negative, subtraction resulted in negative weight");
		}
		this.weight -= weightToSubtract;
	}
	
	/**
	 * Getter method allows other classes to retrieve the weight of this resource.
	 * @return this.weight weight of resource
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/**
	 * Getter method allows other classes to retrieve the type of this resource.
	 * @return this.type type of resource
	 */
	public ResourceType getType() {
		return this.type;
	}
	
	/**
	 * toString() method prints the object weight and type. 
	 * This method was written for aiding in unit-testing the constructor of this class
	 * as well as methods which add and subtract weight. 
	 */
	public String toString() {
		return String.format("Resource: weight = %.2f, type = %s", this.weight, this.type);
	}
	
}
