package Collections;

public class Book {
    private String title;
    private boolean isFinished;
    private double stars;

    public Book(String title, boolean isFinished, double stars) {
        this.title = title;
        this.isFinished = isFinished;
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public double getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isFinished=" + isFinished +
                ", stars=" + stars +
                '}';
    }
}
