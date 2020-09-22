package dk.kea;

public class Movie {
    private String filmName;
    private int likes;
    private int prodYear;
    private int duration;

    public Movie() {
    }

    public Movie(String filmName, int likes, int prodYear, int duration) {
        this.filmName = filmName;
        this.likes = likes;
        this.prodYear = prodYear;
        this.duration = duration;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "filmName='" + filmName + '\'' +
                ", likes=" + likes +
                ", prodYear=" + prodYear +
                ", duration=" + duration +
                '}';
    }
}
