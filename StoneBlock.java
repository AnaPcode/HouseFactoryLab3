/**
 * A Stone block class that is a child of the Block class.
 */
public class StoneBlock extends Block {
	/**
	 * Default constructor. Calls parent's constructor to initialize type and weight.
	 */
	public StoneBlock() {
		super(ResourceType.STONE, Const.WEIGHT_OF_STONE);
	}

	/**
	 * breakBlock() method takes current weight and returns all of the weight since
	 * stone can be reused.
	 */
	@Override
	public double breakBlock() {
		return getWeight();
	}
}
