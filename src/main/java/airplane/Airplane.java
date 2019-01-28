package airplane;

import java.util.List;

public class Airplane implements CanBeSaved {

	private int airSpeed;
	
	private PilotList pilots = new PilotList();
	
	private PassengerList passengers = new PassengerList();
	
	public Airplane() {}
	
	public Airplane(List<Passenger> p) {
		this.passengers.addAll(p);
	}

	public int getAirSpeed() {
		return airSpeed;
	}

	public void setAirSpeed(int airSpeed) {
		this.airSpeed = airSpeed;
	}


	public PilotList getPilots() {
		return pilots;
	}

	public void setPilots(PilotList pilots) {
		this.pilots = pilots;
	}
	
	public Pilot getPilot() {
		return this.getPilots().size() == 0 ? null : this.getPilots().get(0);
	}
	
	public Pilot getCoPilot() {
		return this.getPilots().size() < 2 ? null : this.getPilots().get(1);
	}
	
	public PassengerList getPassengers() {
		return passengers;
	}

	public void setPassengers(PassengerList passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Plane airspeed=" + this.getAirSpeed() + "; " +
				"pilot=" + this.getPilot() + "; " +
				"co-pilot=" + this.getCoPilot() + ";\r\n" +
				"passengers=" + this.getPassengers();
	}
	
	public String serialize() {
		return this.getAirSpeed() + "\r\n" +
				this.getPilots().serialize() + "\r\n" +
				this.getPassengers().serializePassengers() + "\r\n";
	}
	
	public void deserialize(String rawData) {
		String[] lines = rawData.trim().split("\r\n");
		this.setAirSpeed(Integer.parseInt(lines[0].trim()));
		this.getPilots().deserialize(lines[1].trim());
		this.getPassengers().deserializePassenger(lines[2].trim());
	}

	@Override
	public String getFileName() {
		return this.getAirSpeed() + ".txt";
	}
	
}







