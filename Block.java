/**
 * An Block abstract class that contains a resource type, and weight as fields. 
 * As well as contains two constructors to initialize the fields and a 
 * breakBlock method signature.
 */
public abstract class Block {
	
	private double weight;
	private ResourceType type;
	
	/**
	 * This constructor accepts a resource type and weight as arguments, 
	 * and initializes the a block's weight and type.
	 * @param type
	 * @param weight
	 */
	public Block(ResourceType type, double weight) {
		this.weight = weight;
		this.type = type;
	}
	
	/**
	 * This constructor accepts two parameters of objects of Resource. 
	 * Calculates weight by getting the weight of the resource and multiplying
	 * by number of blocks needed of the resource for a house to get total weight of a House.
	 * @param resource
	 */
	public Block(Resource resourceWood, Resource resourceStone) {
		this.type = ResourceType.HOUSE;
		this.weight = (resourceWood.getWeight()*Const.NUM_OF_WOOD_BLOCKS) 
				+ (resourceStone.getWeight()*Const.NUM_OF_STONE_BLOCKS);
	}
	
	/**
	 * breakBlock is an abstract method to be implemented by children classes.
	 */
	public abstract double breakBlock();
	
	/**
	 * Getter method that allows other classes to access the weight of the block.
	 * @return this.weight weight of the block
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/**
	 * Getter method that allows other classes to access the type of block.
	 * @return this.type type of block
	 */
	public ResourceType getType() {
		return this.type;
	}
	
	/**
	 * toString method returns a string that represents the block.
	 */
	@Override
	public String toString() {
		return String.format("Block Weight: %.2f, Block Type: %s", this.weight, this.type);
	}

}
