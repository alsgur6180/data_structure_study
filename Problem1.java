
public class Problem1 {
	public static void main(String[] args) throws Exception {
		
		MyAVLTree avl = new MyAVLTree(new Integer(44));
		
		avl.insert(new Integer(17));
		avl.insert(new Integer(78));
		avl.insert(new Integer(32));
		avl.insert(new Integer(50));
		avl.insert(new Integer(88));
		avl.insert(new Integer(48));
		avl.insert(new Integer(62));
		avl.inOrder(avl.root());
		
		avl.insert(new Integer(15));
		avl.insert(new Integer(46));
		avl.insert(new Integer(70));
		avl.remove(new Integer(17));
		avl.remove(new Integer(15));
		avl.remove(new Integer(32));
		avl.remove(new Integer(78));
		avl.remove(new Integer(88));
		avl.remove(new Integer(70));
		avl.insert(new Integer(50));
		avl.insert(new Integer(25));
		avl.find(new Integer(48));
		avl.find(new Integer(70));
		avl.findAll(new Integer(50));
		avl.inOrder(avl.root());
	}
}
