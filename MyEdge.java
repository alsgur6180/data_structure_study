
public class MyEdge {
	private MyVertex endVertex1;
	private MyVertex endVertex2;
	
	MyEdge(){
		MyVertex endVertex1 = null;
		MyVertex endVertex2 = null;
		
	}

	public MyVertex getEndVertex1() {
		return endVertex1;
	}

	public void setEndVertex1(MyVertex endVertex1) {
		this.endVertex1 = endVertex1;
	}

	public MyVertex getEndVertex2() {
		return endVertex2;
	}

	public void setEndVertex2(MyVertex endVertex2) {
		this.endVertex2 = endVertex2;
	}

}
