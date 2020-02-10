
public class MovieInfo {

	String movieName;
	String castName;
	int yearReleased;
	
	public MovieInfo(String newMovieName, String newCastName,
	 int newYearReleased){

		movieName = newMovieName;
		castName = newCastName;
		yearReleased = newYearReleased;
	}

	public String getMovieName() {
		return movieName;
	}
	
	public String getCastName() {
		return castName;
	}
	
	public int getYearReleased() {
		return yearReleased;
	}

}
