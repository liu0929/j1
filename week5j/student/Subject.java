package student;

public class Subject {

	private String id;
	private String name;

	public Subject() {
		super();
	}

	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		String info = "";
		info = ":" + this.id + "\t" + ":" + this.name;
		return info;
	}

}