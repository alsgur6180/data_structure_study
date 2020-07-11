package 자바과제;

import java.util.ArrayList;

public class MyTree {
	private MyNode root;
	private int size;
	
	MyTree() {root = null;}
	MyTree(Object e) {
		root = new MyNode(e); 
		root.setChildren(new ArrayList());
	}
	
	public int size() {
		this.size= 1;
		return size();
		
	}
	public MyNode root() {
		return this.root;
		
	}

	
	public ArrayList children(MyNode v) {
		return v.children();	
	}
	public boolean isExternal(MyNode v) {
		return v.children().isEmpty();
		
	}
	public MyNode addRoot(Object e) {
		this.setRoot(new MyNode(e));
		return this.root;
		
		
	
	}
	public MyNode addNode(Object e) {
		MyNode nn = new MyNode(e);
		nn.setParent(root);
		root.children().add(nn);
		size++;
		return nn;
	
		
	}
	public MyNode addChild(MyNode v,Object e) {
		MyNode nn = new MyNode(e);
		nn.setParent(v);
		v.children().add(nn);
		size++;
		return nn;
	
	}
	public MyNode addChild(MyNode v,int i, Object e) {
		MyNode nn = new MyNode(e);
		nn.setParent(v);
		v.children().add(i, nn);
		size++;
		return nn;
	
	}
	public MyNode setChild(MyNode v, int i, Object e) {
		MyNode nn = new MyNode(e);
		nn.setParent(v);
		return (MyNode)v.children().set(i,nn);
	
	}
	public MyNode removeChild(MyNode v, int i) {
		size--;
		return (MyNode) v.children().remove(i);
	}

		

}


