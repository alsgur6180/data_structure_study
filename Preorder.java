package 자바과제;
import java.util.ArrayList;
public class Preorder {
	public static void main(String[] args) {
		MyTree t = new MyTree();
		MyTree[] tree = new MyTree[t.size()];
		
		MyNode title = t.addRoot("Make Money Fast");
		MyNode chap1 = t.addNode("Motivation");
		MyNode chap2 = t.addNode("Methosds");
		MyNode chap3 = t.addNode("References");
		MyNode a = t.addChild(chap1, "1.1 Greed");
		MyNode b = t.addChild(chap1,"1.2 Avidity");
		MyNode c = t.addChild(chap2, "2.1 Stock Fraud");
		MyNode d = t.addChild(chap2, "2.2 Ponzi Scheme");
		MyNode e = t.addChild(chap2, "2.3 Bank Robbery");
		
		
	}
	
	public void preOrder() {
		MyNode v = new MyNode();
		MyTree t = new MyTree();
		for(int i =0; i< t.size(); i++) {
			System.out.print(t.root());
			
		}
		
	}


}
