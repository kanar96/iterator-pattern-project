import java.util.Hashtable;
import java.util.Iterator;

public class NewMovies implements MovieIterator{
	
	Hashtable<Integer, MovieInfo> bestMovies = new Hashtable<Integer, MovieInfo>();
	int hashKey=0;
	
	public NewMovies() {
		
		
		
		addMovie("My Bossy Girlfriend", "Lee Elijah", 2019);
		addMovie("Avengers", "Robert Downey Jr", 2019);
		addMovie("Spider-man:Far from Home", "Tom Holland", 2019);
	}
	
	public void addMovie(String movieName, String castName, int yearReleased) {
		MovieInfo movieInfo = new MovieInfo(movieName, castName, yearReleased);
		
		bestMovies.put(hashKey, movieInfo);
		hashKey++;
	}
	
	
	
	public Iterator createIterator() {
		
		return bestMovies.values().iterator();
	}
}