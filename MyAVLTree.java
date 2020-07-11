public class MyAVLTree extends MyBST {
	
	// Constructor
	public MyAVLTree() {
		super();
	}
	
	public MyAVLTree(Object e) {
		super(e);
	}
	
	// height - using left and right subtree height
	public int height(MyBinNode v) {
		if(v == null)
			return 0;
		
		return 1 + Math.max(height(v.left()), height(v.right()));
	}
	
	public Object insert(Object k) {
						
		// insert normal BST		
		MyBinNode recentNode = (MyBinNode)super.insert(k);
		if(recentNode == null) {
			return recentNode;
		}
		
		// check balanced
		MyBinNode temp = recentNode; // w is insertedNode		
		MyBinNode z = null; // first unbalanced node !
		MyBinNode y = null;
		MyBinNode x = null;
		
		while(true) {
			
			x = temp;
			y = ((MyBinNode)x.parent() != null) ? (MyBinNode)x.parent() : null ;
			z = ((MyBinNode)y.parent() != null) ? (MyBinNode)y.parent() : null ;
			
			int gap = 0;
			if(y == null || z == null) {
				break;
			}			
			
			gap = Math.abs(this.height(z.left()) - this.height(z.right()));
//			System.out.println("gap : " + gap);
			
			if(gap > 1) {
				// unbalanced and restructure													
				this.restructure(x, y, z);
//				System.out.println("unbalanced!! gap : " + gap + ", x : " + x.element() + ", y : " + y.element() + ", z : " + z.element());
				break;
			}						
						
			temp = (MyBinNode)temp.parent();
		}
		
		return recentNode;
	}
		
	public void restructure(MyBinNode x, MyBinNode y, MyBinNode z) {							
		
		if((int)z.element() < (int)x.element()) {
			
			if((int)y.element() < (int)x.element()) {
				// single rotation
				this.singleRotation(z, y, x);
			}
			else {
				// double rotation
				this.doubleRotation(z, x, y);
			}
			
		}
		else if((int)y.element() < (int)z.element()) {
			
			if((int)x.element() < (int)y.element()) {
				// single rotation
				this.singleRotation(x, y, z);
			}
			else {
				// double rotation
				this.doubleRotation(y, x, z);
			}
		}
				
	}
	
	public void singleRotation(MyBinNode a, MyBinNode b, MyBinNode c) {				
		if(b.parent() == this.root()) {
			// b parent is root case
//			System.out.println("Single - b parent is root case");
			
			// make new root
			super.addRoot(b.element());						
			
			if(b.parent() == a) {
				// b parent is a
				if(super.hasLeft(b)) {
					b.left().setParent(a);
					a.setRight(b.left());
				}
				else {
					a.setRight(null);
				}							
				
			}
			else {
				// b parent is c
				if(super.hasRight(b)) {
					b.right().setParent(c);
					c.setLeft(b.right());
				}
				else {
					c.setLeft(null);
				}
			}
			
			this.root().setLeft(a);
			a.setParent(this.root());
			this.root().setRight(c);
			c.setParent(this.root());
			
		}
		else {
			// normal case
//			System.out.println("Single - noraml case");
			
			// find z_parent
			MyBinNode z_parent = (MyBinNode)b.parent().parent();
			
			// check b parent is left or right child of z_parent
			boolean b_parent_left;
			if(z_parent.left() == b.parent()) {
				// a is z_parent left child		
				b_parent_left = true;
			}
			else {
				// a is a_parent right child
				b_parent_left = false;
			}			
			
			if(b.parent() == a) {
				// b parent is a
				if(super.hasLeft(b)) {
					b.left().setParent(a);
					a.setRight(b.left());
				}
				else {
					a.setRight(null);
				}								
				
				b.setLeft(a);
				a.setParent(b);																
			}
			else {
				// b parent is c
				if(super.hasRight(b)) {
					b.right().setParent(c);
					c.setLeft(b.right());
				}
				else {
					c.setLeft(null);
				}
				
				b.setRight(c);
				c.setParent(b);
			}
			
			if(b_parent_left) {
				z_parent.setLeft(b);				
			}
			else {
				z_parent.setRight(b);
			}
			b.setParent(z_parent);						
		}
	}
	
	public void doubleRotation(MyBinNode a, MyBinNode b, MyBinNode c) {		
		
		if(b.parent().parent() == this.root()) {
			// b grand parent is root case
//			System.out.println("Double - b grand parent is root case");
			
			// make new root			
			super.addRoot(b.element());
			
			if(super.hasLeft(b)) {
				b.left().setParent(a);
				a.setRight(b.left());
			}
			else {
				a.setRight(null);
			}
			
			if(super.hasRight(b)) {
				b.right().setParent(c);
				c.setLeft(b.right());
			}
			else {
				c.setLeft(null);
			}
			
			this.root().setLeft(a);
			a.setParent(this.root());
			this.root().setRight(c);
			c.setParent(this.root());
			
		}
		else {
			// normal case
//			System.out.println("Double - normal case");
			
			// find z_parent
			MyBinNode z_parent = (MyBinNode)b.parent().parent().parent();
			
			// check b grand parent is left or right child of z_parent
			boolean b_parent_left;
			if(z_parent.left() == b.parent().parent()) {
				// a is z_parent left child		
				b_parent_left = true;
			}
			else {
				// a is a_parent right child
				b_parent_left = false;
			}			
			
			if(super.hasLeft(b)) {
				b.left().setParent(a);
				a.setRight(b.left());
			}
			else {
				a.setRight(null);
			}
			
			if(super.hasRight(b)) {
				b.right().setParent(c);
				c.setLeft(b.right());
			}
			else {
				c.setLeft(null);
			}
			
			if(b_parent_left) {
				z_parent.setLeft(b);				
			}
			else {
				z_parent.setRight(b);
			}
			b.setParent(z_parent);
			
			b.setLeft(a);
			a.setParent(b);
			b.setRight(c);
			c.setParent(b);			
		}												
	}
	
	public Object remove(Object k) throws TwoChildrenException {
		
		// remove normal BST
		MyBinNode removedNode = (MyBinNode)super.remove(k);
		if(removedNode == null) {
			return removedNode;
		}
		
		MyBinNode temp = (MyBinNode)removedNode.parent(); // w is parent of removedNode
		MyBinNode z = null; // first unbalanced node !
		MyBinNode y = null;
		MyBinNode x = null;
		while(temp != null) {			
			
			int gap = Math.abs(this.height(temp.left()) - this.height(temp.right()));
//			System.out.println("gap : " + gap);
			
			if(gap > 1) {
				// unbalanced and restructure							
				z = temp;
				y = ((int)z.element() > (int)removedNode.element()) ? z.right() : z.left();
				x = (super.hasRight(y)) ? y.right() : y.left();				
				this.restructure(x, y, z);
//				System.out.println("unbalanced!! gap : " + gap + ", x : " + x.element() + ", y : " + y.element() + ", z : " + z.element());
				break;
			}
			
			temp = (MyBinNode)temp.parent();
		}
				
		return removedNode;
	}

}
