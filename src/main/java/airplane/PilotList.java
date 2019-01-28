package airplane;

import java.util.ArrayList;

public class PilotList extends ArrayList<Pilot> implements CanBeSaved {

	private static final long serialVersionUID = 1L;
	
	public String serialize() {
		String serializedPilots = "[";
		for(Pilot p : this) {
			serializedPilots += "{" + p.serialize() + "},";
		}
		serializedPilots = serializedPilots.substring(0, serializedPilots.length() - 1);
		serializedPilots += "]";
		return serializedPilots;
	}

	//parts[0] = "Jim Hensen,Captain";
	//parts[1] = "Jerry Pay,CoPilot";
	public void deserialize(String rawData) {
		rawData = rawData.trim().substring(1, rawData.length() - 2);
		String[] objParts = rawData.split("},");
		for(int i=0;i<objParts.length;i++) {
			String objString = objParts[i].trim();
			if(i + 1 == objParts.length) {
				objString = objString.substring(0, objString.length() - 1).trim();
			}
			objString = objString.substring(1);
			Pilot pilot = new Pilot();
			pilot.deserialize(objString);
			this.add(pilot);
		}
	}

	@Override
	public String getFileName() {
		return "pilot_list.txt";
	}
}







