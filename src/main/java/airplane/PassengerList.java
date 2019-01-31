package airplane;

import java.util.ArrayList;

public class PassengerList extends ArrayList<Passenger> {

	private static final long serialVersionUID = 1L;
//	
//	public String serializePassengers() {
//		String serializedPassengers = "[";
//		for(Passenger p : this) {
//			serializedPassengers += "{" + p.serialize() + "},";
//		}
//		serializedPassengers = serializedPassengers.substring(0, serializedPassengers.length() - 1);
//		serializedPassengers += "]";
//		return serializedPassengers;
//	}
//
//	public void deserializePassenger(String rawData) {
//		rawData = rawData.trim().substring(1, rawData.length() - 2);
//		String[] parts = rawData.split(",");
//		for(int i=0;i<parts.length;i++) {
//			String part = parts[i].trim();
//			part = part.substring(1, part.length() - 2);
//			Passenger passenger = new Passenger();
//			passenger.deserialize(part.trim());
//			this.add(passenger);
//		}
//	}

}



