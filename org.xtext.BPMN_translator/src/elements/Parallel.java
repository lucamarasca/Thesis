package elements;

public class Parallel extends Elements{
	static int thread_number = 0;
	String body;
	int number;
	public Parallel() {
		this.id = "global_id";
		this.type = "thread";
		this.body = "";
		this.number = thread_number;
		thread_number++;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Parallel(Boolean var) {
		this.id = "global_id";
		this.type = "end_thread";
	}
	public String getBody() {
		return this.body;
	}
	public void setBody(String body){
		this.body = body;
	}
	public void addBody(String body) {
		this.body += body;
	}
}
