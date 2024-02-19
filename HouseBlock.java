/**
 * A House block that is a child of the Block class.
 */
public class HouseBlock extends Block {
	/**
	 * Constructor takes in two Resource objects as parameters, and calls the parent class
	 * for initialization.
	 * @param resourceWood
	 * @param resourceStone
	 */
	public HouseBlock(Resource resourceWood, Resource resourceStone) {
		super(resourceWood, resourceStone);
	}
	
	/**
	 * Returns the weight only of the stone used, not of the wood.
	 */
	@Override
	public double breakBlock() {
		return getWeight();  //TODO: Not implemented correctly yet.
	}
}
