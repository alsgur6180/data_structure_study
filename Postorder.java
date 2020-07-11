package 자바과제;

public class Postorder {

	public static void main(String[] args) {
		MyTree t = new MyTree();
		MyTree[] tree = new MyTree[t.size()];
		
		MyNode sum = t.addRoot("cs16");
		MyNode sort1 = t.addNode("homeworks/");
		MyNode sort2 = t.addNode("progreams/");
		MyNode sort3 = t.addNode("todo.txt");
		MyNode a = t.addChild(sort1, "h1c.doc");
		MyNode b = t.addChild(sort1,"h1nc.doc");
		MyNode c = t.addChild(sort2, "DDR.java");
		MyNode d = t.addChild(sort2, "Stocks.java");
		MyNode e = t.addChild(sort2, "Robot.java");

	}
	public void postOrder() {
		MyNode v = new MyNode();
		MyTree t = new MyTree();
		for(int i =0; i< t.size(); i++) {
			System.out.print(t.children(Object e, Object volume));
			
		}
		
	}

}
