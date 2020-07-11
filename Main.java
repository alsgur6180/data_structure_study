

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub	
		
		// example 1 - single rotation test (normal case)
		MyAVLTree mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(17));
		mvl.insert(new Integer(78));
		mvl.insert(new Integer(90));
		mvl.insert(new Integer(100));
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));
		System.out.println("-----------------------------------");
		
		mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(17));
		mvl.insert(new Integer(78));
		mvl.insert(new Integer(13));
		mvl.insert(new Integer(8));
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));
		System.out.println("-----------------------------------");
		
		// example 2 - single rotation test (b parent is root case)
		mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(20));
		mvl.insert(new Integer(60));
		mvl.insert(new Integer(50));
		mvl.insert(new Integer(70));
		mvl.insert(new Integer(80));
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));
		System.out.println(mvl.root().left().right().element());
		System.out.println("-----------------------------------");
						
		mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(20));
		mvl.insert(new Integer(60));
		mvl.insert(new Integer(30));
		mvl.insert(new Integer(10));
		mvl.insert(new Integer(5));
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));
		System.out.println(mvl.root().right().left().element());
		System.out.println("-----------------------------------");				
						
		mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(20));
		mvl.insert(new Integer(60));
		mvl.insert(new Integer(50));
		mvl.insert(new Integer(70));
		mvl.insert(new Integer(10));
		mvl.insert(new Integer(65));
		mvl.insert(new Integer(80));
		mvl.insert(new Integer(30));
		mvl.insert(new Integer(5));
		mvl.insert(new Integer(49));
		mvl.insert(new Integer(48));		
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));					
		System.out.println("-----------------------------------");
				
		
		// example 3 - double rotation test (b grand parent is root case)
		mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(20));
		mvl.insert(new Integer(60));
		mvl.insert(new Integer(50));
		mvl.insert(new Integer(70));
		mvl.insert(new Integer(47));		
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));		
		System.out.println("-----------------------------------");
				
		
		// example 4 - double rotation test (normal case)
		mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(17));
		mvl.insert(new Integer(78));
		mvl.insert(new Integer(32));
		mvl.insert(new Integer(50));
		mvl.insert(new Integer(88));
		mvl.insert(new Integer(48));
		mvl.insert(new Integer(62));
		mvl.insert(new Integer(54));
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));
		System.out.println("-----------------------------------");				
		
		// example 5 - remove test (single rotation)
		mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(17));
		mvl.insert(new Integer(62));
		mvl.insert(new Integer(32));
		mvl.insert(new Integer(50));
		mvl.insert(new Integer(78));
		mvl.insert(new Integer(48));
		mvl.insert(new Integer(54));
		mvl.insert(new Integer(88));
		mvl.remove(new Integer(32));
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));
		System.out.println("-----------------------------------");
		
		// example 6 - remove test (double rotation)
		mvl = new MyAVLTree(new Integer(44));
		mvl.insert(new Integer(17));
		mvl.insert(new Integer(62));
		mvl.insert(new Integer(30));
		mvl.insert(new Integer(10));
		mvl.insert(new Integer(78));
		mvl.insert(new Integer(20));
		mvl.insert(new Integer(40));		
		mvl.remove(new Integer(78));
		mvl.inOrder(mvl.root());
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));
		System.out.println("-----------------------------------");
		
		// example 7 - duplication case 
		// MyBST nextNode occur problem - NullPointException
		// because nextNode is general method and using sorting 
		// change MyBST remove method or use nextNode2 method in remove method
		mvl = new MyAVLTree(new Integer(44));		
		mvl.insert(new Integer(20));
		mvl.insert(new Integer(60));
		mvl.insert(new Integer(5));		
		mvl.insert(new Integer(30));
		mvl.insert(new Integer(20));				
		mvl.remove(new Integer(20));
		mvl.inOrder(mvl.root());		
		System.out.println();
		System.out.println("root : " + mvl.root().element());
		System.out.println(mvl.height(mvl.root()));
		System.out.println("-----------------------------------");

	}

}
