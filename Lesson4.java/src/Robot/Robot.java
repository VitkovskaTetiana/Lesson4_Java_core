package Robot;

public class Robot {
	private String name;
	private String job;

	public Robot(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public Robot() {
		this.name = "Robot";
		this.job = "just work";
	}

	public void work() {
		System.out.println("I am " + this.name + " and i " + this.job + "!");
	}
}
