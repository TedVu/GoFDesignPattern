package CreationalPattern.Builder;

public interface Builder {
	
	void reset();
	
	void setSeats(int number);
	
	void setEngine(int engineType);
	
	void setTripComputer();
	
	void setGPS();
	
	Car getResult();
}
