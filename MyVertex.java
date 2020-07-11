
public class MyVertex {
	private int degree;
	private int row;
	private char column;
	private MyEdge edge1;
	private MyEdge edge2;
	
	MyVertex(){
		degree = 0;
		row = 0;
		column = 0;
		edge1 = null;
		edge2 = null;
	}
	MyVertex(int row, char column){
		degree = 0;
		this.row = row;
		this.column = column;
		edge1 = null;
		edge2 = null;
	}
	
	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	public void setColumn(char column) {
		this.column = column;
	}

	public MyEdge getEdge1() {
		return edge1;
	}

	public void setEdge1(MyEdge edge1) {
		this.edge1 = edge1;
	}

	public MyEdge getEdge2() {
		return edge2;
	}

	public void setEdge2(MyEdge edge2) {
		this.edge2 = edge2;
	}


}
