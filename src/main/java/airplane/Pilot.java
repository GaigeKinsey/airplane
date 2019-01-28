package airplane;

public class Pilot extends Person {

	private PilotRank rank;
	
	public Pilot() {}
	
	public Pilot(String n, PilotRank r) {
		super(n);
		this.setRank(r);
	}

	public PilotRank getRank() {
		return rank;
	}

	public void setRank(PilotRank rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + this.getRank() + ")";
	}
	
	@Override
	public String serialize() {
		return super.serialize() + "," + this.getRank().toString();
	}
	
	@Override
	public void deserialize(String rawData) {
		String[] parts = rawData.split(",");
		super.deserialize(parts[0].trim());
		this.setRank(PilotRank.valueOf(parts[1].trim()));
	}
}








