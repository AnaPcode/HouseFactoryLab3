/**
 * A Wood Block Factory that takes in a resource and produces wood blocks. As well as can display its' inventory.
 */
public class WoodBlockFactory implements Factory {

	Resource resourceBin;
	
	/**
	 * Constructor that initializes resourceBin object to keep track of inventory.
	 */
	public WoodBlockFactory() {
		resourceBin = new Resource(0, ResourceType.WOOD);
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
		if (resourceBin.getWeight() > Const.WEIGHT_OF_WOOD) {
			resourceBin.subtractWeight(Const.WEIGHT_OF_WOOD);
			Block newBlock = new WoodBlock();
			return newBlock;
		}
		return null;
	}

	@Override
	public void displayInventory() {
		System.out.println("Wood Block Factory Inventory: weight = " + String.format("%.2f", resourceBin.getWeight()));
	}

	@Override
	public void takeResource(Block block) throws IllegalArgumentException {
		//Method not implemented since takeResource method accepting a Resource type of object is implemented.
	}
}
