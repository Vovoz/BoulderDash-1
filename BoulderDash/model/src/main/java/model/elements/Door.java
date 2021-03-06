package model.elements;

import model.Map;

/**
 * <h1>The Class MetadataDAO.</h1>
 * 
 * @author Vuillaume Gautier
 * @version 1.0
 */


public class Door extends Element {

	private static String SPRITE = "DOOR.png";

	public Door() {
		super(SPRITE);

	}

	/**
	 * Determine the action when you walk on the Door
	 * @param position, direction of the object which launched the method and map pointer
	 */
	public void walkOver(int x, int y, char direction, Map map) {
		map.setLevelEnded(true);
	}

}
