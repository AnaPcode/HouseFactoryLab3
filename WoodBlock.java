/**
 * A Wood block class that is a child of the Block class.
 */
public class WoodBlock extends Block {
	/**
	 * Default constructor. Calls parent's constructor to initialize type and weight.
	 */
	public WoodBlock() {
		super(ResourceType.WOOD, Const.WEIGHT_OF_WOOD);
	}

	/**
	 * breakBlock method takes current weight, and halves it since wood can only
	 * be half reused. Returns the new weight value.
	 */
	@Override
	public double breakBlock() {
		return getWeight() / 2;
	}
}
