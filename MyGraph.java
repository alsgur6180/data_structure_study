import java.util.ArrayList;

public class MyGraph{
	ArrayList vl = new ArrayList();
	ArrayList el = new ArrayList();
	ArrayList il = new ArrayList();
	ArrayList dl = new ArrayList();
	ArrayList cl = new ArrayList();
	MyGraph() {
		vl = null;
		el = null;
		il = null;
	}
	
	public void insertVertex(int row,char column) {
		MyVertex v = new MyVertex();
		v.setRow(row);
		v.setColumn(column);
		int temp = row + (int)column;
		vl.add(temp, v);
	}
	public void insertEdge(int row1,char column1,int row2,char column2) {
		vl.get(row1 + (int)column1);
		MyEdge e = new MyEdge();
		e.setEndVertex1((MyVertex)vl.get(row1 + (int)column1));
		e.setEndVertex2((MyVertex)vl.get(row1 + (int)column1));
		el.add(e);
	}
	public ArrayList incidentEdges(MyVertex v) {
		il.add(v.getEdge1());
		il.add(v.getEdge2());
		return il;
		
	}
	public MyVertex DFS(MyGraph g) {
		
	}
	public int pathNum(MyVertex a, MyVertex b) {
		dl.add(this.DFS(this));
		return dl.size();
	}
	public int cycleNum(MyGraph g) {
		cl.add(g.DFS(g));
		return cl.size();
		
	}
}
