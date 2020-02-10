import java.util.ArrayList;
import java.util.Iterator;

public class Movieofthe90s implements MovieIterator{
	
	ArrayList<MovieInfo> bestMovies;
	
	public Movieofthe90s() {
		
		bestMovies = new ArrayList<MovieInfo>();
		
		addMovie("Titanic", "Leonardo Dicaprio", 1997);
		addMovie("10 things I hate about you", "Heath Ledger", 1999);
		addMovie("The Sixth Sense", "Haley Joel Osment", 1999 );
	}
	
	public void addMovie(String movieName, String castName, int yearReleased) {
		MovieInfo movieInfo = new MovieInfo(movieName, castName, yearReleased);
		
		bestMovies.add(movieInfo);
	}
	
	

	public Iterator createIterator() {
		
		return bestMovies.iterator();
	}
}