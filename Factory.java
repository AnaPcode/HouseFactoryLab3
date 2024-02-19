/**
 * This interface contains all operations that all types of factories should support.
 */

public interface Factory {
	
	/**
	 * Takes in a resource and adds to resource bin. 
	 * Method is used in StoneBlockFactory and WoodBlockFactory.
	 * @param resource the object of type Resource to take in
	 */
	public void takeResource(Resource resource) throws IllegalArgumentException;
	
	/**
	 * Takes in a block and adds to number of wood or stone blocks depending on block passed in.
	 * Method is used in HouseFactory.
	 * @param block
	 */
	public void takeResource(Block block) throws IllegalArgumentException;
	
	/**
	 * Produces block and returns a new block of resource.
	 * @return newBlock new block of resource. If not enough resource, returns null.
	 */
	public Block produce();
	
	/**
	 * Prints out the result of running the resourceBin's toString method.
	 */
	public void displayInventory();
	
}
