package airplane;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Person() {}
	
	public Person(String n) {
		this.setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.compareTo((Person)obj) == 0;
	}

	@Override
	public int compareTo(Person o) {
		return this.getName().compareTo(o.getName());
	}
//	
//	public String serialize() {
//		return this.getName();
//	}
//	
//	public void deserialize(String rawData) {
//		this.setName(rawData.trim());
//	}
}
