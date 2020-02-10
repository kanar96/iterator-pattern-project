import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MoviesOfThe2000s implements MovieIterator{
	
	MovieInfo[] bestMovies;
	int arrayValue=0;
	
	public MoviesOfThe2000s() {
		
		bestMovies = new MovieInfo[3];
		
		addMovie("Mean Girls", "Lindsay Lohan", 2004);
		addMovie("Minority Report", "Tom Cruise", 2002);
		addMovie("A Beautiful Mind", "Russel Crowe", 2001);
	}
	
	public void addMovie(String movieName, String castName, int yearReleased) {
		MovieInfo movieInfo = new MovieInfo(movieName, castName, yearReleased);
		
		
		bestMovies[arrayValue] = movieInfo;
		arrayValue++;
	}
	

	public Iterator createIterator() {
		
		return Arrays.asList(bestMovies).iterator();
	}
}