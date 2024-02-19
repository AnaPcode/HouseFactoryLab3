/**
 * A Stone Block Factory that takes in a resource, produces a stone block, and can display it's inventory.
 */
public class StoneBlockFactory implements Factory {
	
	Resource resourceBin;
	
	/**
	 * Constructor that initializes resourceBin object to keep track of inventory.
	 */
	public StoneBlockFactory() {
		resourceBin = new Resource(0, ResourceType.STONE);
	}
	
	@Override
	public void takeResource(Resource resource) throws IllegalArgumentException {
		if (!(resource instanceof Resource) || resource == null) {
			throw new IllegalArgumentException("Object is not a resource.");
		}
		Resource isResource = (Resource) resource;
		resourceBin.addWeight(isResource.getWeight());
	}

	@Override
	public Block produce() {
		if (resourceBin.getWeight() > Const.WEIGHT_OF_STONE) {
			resourceBin.subtractWeight(Const.WEIGHT_OF_STONE);
			Block newBlock = new StoneBlock();
			return newBlock;
		}
		return null;
	}

	@Override
	public void displayInventory() {
		System.out.println("Stone Block Factory Inventory: weight = " + String.format("%.2f", resourceBin.getWeight()));
	}

	@Override
	public void takeResource(Block block) throws IllegalArgumentException {
		//Method not implemented since takeResource method accepting a Resource type of object is implemented.
	}
}
