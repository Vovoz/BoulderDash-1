package model.elements;

import model.Map;

/**
 * <h1>The Class MetadataDAO.</h1>
 * 
 * @author Vuillaume Gautier
 * @version 1.0
 */


public abstract class Element implements IElement{

	String sprite;
	int walk = 0;
	/**
	 *
	 * @param sprite
	 */
	public Element(String sprite) {
		this.sprite = sprite;

	}

	public String getSprite() {
		return this.sprite;
	}

	/**
	 *
	 * @param x
	 * @param y
	 */
	public void destruction(int x, int y, Map map) {

	}

	/** 
	 *d
	 * @param x
	 * @param y
	 */
	public void walkOver(int x, int y, char direction, Map map) {

	}

	/**
	 *
	 * @param x
	 * @param y
	 */
	public void move(int x, int y, int direction, Map map) {

	}

	public int isWalk() {
		return walk;
	}

	public void setWalk(int walk) {
		this.walk = walk;
	}

}
