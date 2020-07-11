package �ڹٰ���;

import java.util.ArrayList;
public class MyNode {
	private Object element;
	private MyNode parent;
	private ArrayList children;
	private Object volume;
	MyNode() {
		element = null;
		parent = null;
		children = null;
		volume = null;
	}
	MyNode(Object e) 
	{
		this.element = e; 
		this.parent = null;
		this.children = null;
	}
	public Object volume() {
		return this.volume;
	}
	public Object element() {
		return this.element;
		
	}
	public MyNode parent() {
		return this.parent;
		
	}
	public ArrayList children() {
		return this.children;
		
	}
	public int degree() {
		return this.children.size();
	}
	public void setElement(Object e) {
		this.element = e;
	}
	public void setParent(MyNode p) {
		this.parent = p;
		
	}
	public void setChildren(ArrayList c) {
		this.children = c;
		
	}


}


