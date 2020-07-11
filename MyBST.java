import java.util.ArrayList;

public class MyBST extends MyBinTree {

	// Constructor
	MyBST() { super(); }
	MyBST(Object e) { super(e); }
	
	public void inOrder(MyBinNode v) {
		
		if(this.hasLeft(v)) {			
			inOrder(this.left(v));
		}
					
		System.out.print(v.element()+" ");		
		
		if(this.hasRight(v)) {
			inOrder(this.right(v));			
		}
		
	}
	
	// using inorder - general next node - this may occur some problem MyAVLTree remove duplication exist case
	// check out [Main.java example 7] case
	private MyBinNode nextNode(MyBinNode v) {		
		ArrayList inorderList = new ArrayList();
		this.inorderNextNode(inorderList, v);
		MyBinNode result = null;
		
		for(int i=0; i<inorderList.size(); i++) {
			MyBinNode temp = (MyBinNode)inorderList.get(i);
			if((int)temp.element() == (int)v.element()) {				
				result = (MyBinNode)inorderList.get(i+1);
//				System.out.println("@@@" + result.element());
				break;
			}
		}
		
		return result;
	}
	
	// using way
	private MyBinNode nextNode2(MyBinNode v) {
		
		MyBinNode result = null;
		
		if(super.hasRight(v)) {
			MyBinNode temp = v.right();
			
			while(true) {
				if(super.hasLeft(temp)) {
					temp = temp.left();
				}
				else {
					result = temp;
//					System.out.println("@@@" + result.element());
					break;
				}
			}
		}
		else {
			System.out.println("No Next Node!");			
		}
		
		return result;		
	}
	
	public void inorderNextNode(ArrayList al, MyBinNode v) {
		
		if(this.hasLeft(v)) {			
			inorderNextNode(al, super.left(v));
		}
					
		al.add(v);
		
		if(this.hasRight(v)) {
			inorderNextNode(al, super.right(v));			
		}
		
	}
	
	public Object find(Object k) {
		
		MyBinNode temp = this.root();
		Object result = null;
		
		while(true) {						
			
			if(temp == null) break;
			
			if((int)temp.element() == (int)k) {
				// find key
				result = temp;
				break;
			}
			else if((int)temp.element() < (int)k) {
				// case - key is bigger than temp
				temp = temp.right();				
			}
			else {
				// case - key is smaller than temp
				temp = temp.left();				
			}
			
		}
		
		if(result == null)
			System.out.println("Can't find Key!");
		else
			System.out.println("FIND KEY : " + ((MyBinNode)result).element());
		
		return result;
	}
	
	public ArrayList findAll(Object k) {
		
		ArrayList findList = new ArrayList();
		
		// using inorder traversal
		this.inorderfindAll(findList, this.root(), k);
		System.out.println("FIND ALL KEY : " + (int)k + ", COUNT : " + findList.size());
		
		return findList;
	}
	
	public void inorderfindAll(ArrayList al, MyBinNode v, Object k) {
		if(this.hasLeft(v)) {			
			inorderfindAll(al, this.left(v), k);
		}
		
		if((int)v.element() == (int)k)
			al.add(k);
		
		if(this.hasRight(v)) {
			inorderfindAll(al, this.right(v), k);			
		}
	}
	
	public Object insert(Object k) {
		
		MyBinNode temp = this.root();	
		MyBinNode result = null;
		
		while(true) {											
						
			if((int)temp.element() == (int)k) {
				// case - key is already exist in tree				
				if(super.hasLeft(temp)) {
					temp = temp.left();
				}
				else if(super.hasRight(temp)) {					
					temp = temp.right();
				}
				else {
					System.out.println("Same Key Exception Occurs - same key no child !");
					break;
				}																	
			}
			else if((int)temp.element() < (int)k) {
				// case - key is bigger than temp
				if(!super.hasRight(temp)) {
					// insert do it
					result = super.inserRight(temp, k);
					break;
				}
				else {
					// continue search
					temp = temp.right();
				}
			}
			else {
				// case - key is smaller than temp
				if(!super.hasLeft(temp)) {
					// insert do it
					result = super.inserLeft(temp, k);
					break;
				}
				else {
					// continue search
					temp = temp.left();
				}
			}
		}
		
		
		return result;
	}
	
	public Object remove(Object k) throws TwoChildrenException {
		
		MyBinNode temp = this.root();	
		Object result = null;
		
		while(true) {						
			
			if(temp == null) break;
			
			if((int)temp.element() == (int)k) {
				// find key and remove
																	
				if(this.hasLeft(temp) && this.hasRight(temp)) {
					// case - internal both child
					
					// find next node & copy & remove
//					MyBinNode nextNode = this.nextNode(temp); 
					MyBinNode nextNode = this.nextNode2(temp);
					temp.setElement(nextNode.element());
					MyBinNode nextNodeParent = (MyBinNode)nextNode.parent();					
					result = super.remove(nextNode);
					
				}
				else {
					// case - one child & external									
					result = super.remove(temp);
				}
				
				break;
			}
			else if((int)temp.element() < (int)k) {
				// case - key is bigger than temp
				temp = temp.right();				
			}
			else {
				// case - key is smaller than temp
				temp = temp.left();				
			}
			
		}
		
		if(result == null)
			System.out.println("Can't remove Key !");
		
		return result;
	}
}
