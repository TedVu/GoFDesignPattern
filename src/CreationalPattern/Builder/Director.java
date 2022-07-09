package CreationalPattern.Builder;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Car buildSportCar() {
		builder.setSeats(2);
		builder.setEngine(1);
		//

		return builder.getResult();
	}
}
