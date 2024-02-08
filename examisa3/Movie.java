package examisa3;

public class Movie {

	private String title;
	private String director;
	public Movie(String title,String director) {
		this.title=title;
		this.director=director;
	}
	
	public String getTitle() {
		return this.title;
	}
  public String getDirector() {
	  return this.director;
  }
}
