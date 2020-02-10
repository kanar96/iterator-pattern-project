public class MovieTV{
	
	public static void main(String[] args) {
		
		Movieofthe90s movies90s = new Movieofthe90s();
		MoviesOfThe2000s movies2000s = new MoviesOfThe2000s();
		NewMovies newmovies = new NewMovies();
		
		
		AllMovies happyK = new AllMovies(movies90s, movies2000s, newmovies);
		
		happyK.showTheMovies2();
	}
}