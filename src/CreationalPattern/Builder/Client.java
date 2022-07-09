package CreationalPattern.Builder;

public class Client {

	public static void main(String[] args) {
		Builder carBuilder = new CarBuilder();
		Director d = new Director(carBuilder);

		Car sportCar = d.buildSportCar();
	}
}
