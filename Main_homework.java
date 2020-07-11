public class Main_homework {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MyAVLTree mvl = null;								
		
		// insert random integer object 1~100
		System.out.println("------------------- insert -------------------");
		for(int i=0; i<32; i++) {
			
			int random = (int)(Math.random() * 100) + 1;						
			if(i == 0) {
				mvl = new MyAVLTree(new Integer(random));
			}
			else {				
				mvl.insert(new Integer(random));
			}
		}
		
		mvl.inOrder(mvl.root());
		System.out.println();
		
		// remove random integer object 1~100
		System.out.println("------------------- remove -------------------");
		for(int i=0; i<16; i++) {
			
			int random = (int)(Math.random() * 100) + 1;			
			mvl.remove(new Integer(random));			
			
		}
		
		mvl.inOrder(mvl.root());
		System.out.println();

	}

}
