import java.util.ArrayList;

public class MyAVLTree extends MyBST{
	private int height1;
	private int height2;
	MyAVLTree() {super();}
	MyAVLTree(Object e){super(e);}
	
	public MyBinNode nextNode(MyBinNode v) {
		return super.nextNode(v);
		
	}
	private int height1(MyBinNode v) {
		height1 = 0;
		while(true) {
			if(v.left() !=null) {
				height1++;
				height1(v.left());
			}
			else if(v.right() != null){
				height1++;
				height1(v.right());
			}
			else break;
		}
		return height1;
	}
	private int height2(MyBinNode v) {
		height2 = 0;
		while(true) {
			if(v.right() != null){
				height2++;
				height2(v.right());
			}
			if(v.left() !=null) {
				height2++;
				height2(v.left());
			}
			else break;
		}
		return height2;
	}
	private int height(MyBinNode v) {
		this.height1(v);
		this.height2(v);
		if(height1 >= height2)return height2;
		else return height1;
	}
	private MyBinNode restruct(MyBinNode x,MyBinNode y,MyBinNode z) {
		if(z.left() == y&&y.left() == x) {
			lRotate(x,y,z);
			return y;
		}
		else if(z.right() == y&&y.right() == x) {
			rRotate(x,y,z);
			return y;
		}
		else if(z.left() == y&&y.right() == x) {
			rRotate(x.right(),x,y);
			lRotate(y,x,z);
			return x;
		}
		else {
			lRotate(x.left(),x,y);
			rRotate(y,x,z);
			return x;
		}
		
	}
	public void rRotate(MyBinNode x,MyBinNode y,MyBinNode z) {
		MyBinNode temp = y.left();
		y.setParent(z.parent());
		y.setLeft(z);
		z.setRight(temp);	
	}
	public void lRotate(MyBinNode x,MyBinNode y,MyBinNode z) {
		MyBinNode temp = y.right();
		y.setParent(z.parent());
		y.setRight(z);
		z.setLeft(temp);	
		
	}
	public Object find(Object k) {
		return super.find(k);
		
	}
	public ArrayList findAll(Object k) {
		return super.findAll(k);
		
	}
	public Object insert(Object k) {
		return super.insert(k);
		
	}
	public Object remove(Object k) throws TwoChildrenException {
		return super.remove(k);
	}
	
	
}
