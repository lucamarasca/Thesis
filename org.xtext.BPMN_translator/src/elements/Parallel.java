package elements;

public class Parallel extends Elements{
	public Parallel() {
		this.id = "global_id";
		this.type = "thread";
	}
	public Parallel(Boolean var) {
		this.id = "global_id";
		this.type = "end_thread";
	}
}
