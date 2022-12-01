/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Node {
	private int data;
	private Node lChild;
	private Node rChild;
	private int height;
	
	public Node(int data) {
		lChild = null;
		rChild = null;
		this.data = data;
		}
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}
	
	/**
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}
	/**
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}
	
	/**
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}
	
	/**
	 * @param height the height of the node
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
}
