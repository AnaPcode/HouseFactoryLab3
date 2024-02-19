
public class HouseFactory implements Factory {

	private double numStoneBlocks = 0;
	private double numWoodBlocks = 0;
	
	@Override
	public void takeResource(Block block) throws IllegalArgumentException {
		if (block == null) {
		}
		else if (!(block instanceof Block)) {
			throw new IllegalArgumentException("Object is not a block.");
		}
		else {
			switch(block.getType()) {
				case STONE: numStoneBlocks++;
				case WOOD: numWoodBlocks++;
			}
		}
	}

	@Override
	public Block produce() {
		if ((numStoneBlocks >= Const.NUM_OF_STONE_BLOCKS) 
				&& (numWoodBlocks >= Const.NUM_OF_WOOD_BLOCKS)) {
			return new HouseBlock(new Resource(Const.WEIGHT_OF_STONE, ResourceType.STONE),
					new Resource(Const.NUM_OF_WOOD_BLOCKS, ResourceType.WOOD));
		}
		return null;
	}

	@Override
	public void displayInventory() {
		System.out.println(String.format("House Factory Inventory - Wood Blocks: %.2f, Stone Blocks: %.2f", numWoodBlocks, numStoneBlocks));
	}
	
	@Override
	public void takeResource(Resource resource) throws IllegalArgumentException {
		//Method not implemented since takeResource method accepting a Block type of object is implemented.
	}
}
