package airplane;

import java.io.IOException;

public class TestDriver {
	
	public static final int CountPassengers = 10;

	public static void main(String[] args) throws IOException {
		Airplane plane = new Airplane();
		SavableDatabase database = new SavableDatabase();
		
//		database.load(new AirplaneFactory());
		
		plane.getPilots().add(new Pilot("Captain Jim", PilotRank.Captain));
		plane.getPilots().add(new Pilot("Co-Pilot Jerry", PilotRank.CoPilot));
		
		for(int i=0;i<CountPassengers;i++) {
			plane.getPassengers().add(new Passenger("Passenger_" + (i+1)));
		}
		
		System.out.println(plane);
		
		database.add(plane);
		database.save();
	}
	
}