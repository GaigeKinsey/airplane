package airplane;

public class AirplaneFactory implements CanBeSavedFactory {

	@Override
	public CanBeSaved createInstance() {
		return new Airplane();
	}
}
