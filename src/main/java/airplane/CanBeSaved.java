package airplane;

public interface CanBeSaved {

	String getFileName();
	
	String serialize();
	
	void deserialize(String s);
}
