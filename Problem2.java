
public class Problem2 {
	public static void main(String[] args) {
		int depth = 0;
		MyVertex v = new MyVertex();
		
		MyGraph g = new MyGraph();
		g.insertVertex(1, 'a');
		g.insertVertex(3, 'a');
		g.insertVertex(2, 'b');
		g.insertVertex(3, 'b');
		g.insertVertex(2, 'c');
		g.insertVertex(1, 'd');
		g.insertVertex(2, 'd');
		g.insertVertex(3, 'd');
		g.insertVertex(1, 'g');
		g.insertVertex(4, 'g');
		g.insertVertex(6, 'g');
		g.insertEdge(1, 'a',3,'a');
		g.insertEdge(3, 'a',3,'b');
		g.insertEdge(2, 'b',3,'b');
		g.insertEdge(2, 'b',2,'c');
		g.insertEdge(2, 'd',2,'c');
		g.insertEdge(1, 'd',2,'d');
		g.insertEdge(2, 'd',3,'d');
		g.insertEdge(1, 'g',4,'g');
		g.insertEdge(1, 'g',0,' ');
		
		for(int i =1;i<=depth;i++) {
		System.out.printf("Levei: ");
			for(int k =0;k<v.getDegree();k++) {
			System.out.printf("%c%d",v.getColumn(),v.getRow());
			}
		}
		System.out.printf("Mininum number of vertices : " + g.pathNum((MyVertex)g.vl.get(1 + (int)'a'), (MyVertex)g.vl.get(6 + (int)'g'))+"\n");
		for(int i =0;i<g.dl.size();i++) {
			System.out.printf(g.dl.get(i) + "->");
		}
		System.out.printf("Total number of cycles : "+ g.cycleNum(g) );
		for(int i = 1; i<=g.cycleNum(g);i++) {
			System.out.printf("Cycle " + i + ": ");
			for(int k = 0; k<g.cl.size();k++) {
				System.out.printf(g.cl.get(i) + "->");
			}
		}
	}
	
}
