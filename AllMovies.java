import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class AllMovies{
	
	Movieofthe90s movies90s;
	MoviesOfThe2000s movies2000s;
	NewMovies newmovies;
	
	MovieIterator itermovies90s;
	MovieIterator itermovies2000s;
	MovieIterator iternewmovies;
	
	public AllMovies(MovieIterator newMovie90s, MovieIterator newMovies2000s, MovieIterator newNewMovies)
	{
		itermovies90s = newMovie90s;
		itermovies2000s = newMovies2000s;
		iternewmovies = newNewMovies;
}

public void showTheMovies() {
	ArrayList all90sMovies = movies90s.getBestMovies();
	
	System.out.println("Movies of the 90s");
	
	for(int i=0; i < all90sMovies.size(); i++) {
		
		MovieInfo bestMovies = (MovieInfo) all90sMovies.get(i);
		
		System.out.println(bestMovies.getMovieName());
		System.out.println(bestMovies.getCastName());
		System.out.println(bestMovies.getYearReleased());
	}
	
	
	MovieInfo[] array2000sMovies = movies2000s.getBestMovies();
	
	System.out.println("Movies of the 2000s");
	
	for(int i=0; i < array2000sMovies.length; i++) {
		
		MovieInfo bestMovies = array2000sMovies[i];
		
		System.out.println(bestMovies.getMovieName());
		System.out.println(bestMovies.getCastName());
		System.out.println(bestMovies.getYearReleased());
	}
	
	Hashtable<Integer, MovieInfo> htnewMovies = newmovies.getBestMovies();
	
	System.out.println("New Movies");
	
	for(Enumeration<Integer> e = htnewMovies.keys(); e.hasMoreElements(); ) {
		
		MovieInfo bestMovies = htnewMovies.get(e.nextElement());
		
		System.out.println(bestMovies.getMovieName());
		System.out.println(bestMovies.getCastName());
		System.out.println(bestMovies.getYearReleased());
	}
	
	public void showTheMovies2() {
		
		Iterator movies90s = itermovies90s.createIterator();
		Iterator movies2000s = itermovies2000s.createIterator();
		Iterator newmovies = iternewmovies.createIterator();
		
		System.out.println("Movies of the 90s");
		printTheMovies(movies90s);
		
		System.out.println("Movies of the 2000s");
		printTheMovies(movies2000s);
		
		System.out.println("New Movies");
		printTheMovies(newmovies);
}
	public void printTheMovies(Iterator iterator) {
		while(iterator.hasNext()) {
			
			MovieInfo movieInfo = (MovieInfo)iterator.next();
			
			System.out.println(movieInfo.getMovieName());
			System.out.println(movieInfo.getCastName());
			System.out.println(movieInfo.getYearReleased());
		}
	}
}
