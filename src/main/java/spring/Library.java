package spring;

/**
 * Created by Aleksey on 19.07.2018.
 */
public class Library {
    private int year;
    private String autor;
    private String kind;

    public Library(int year, String autor, String kind) {
        this.year = year;
        this.autor = autor;
        this.kind = kind;
    }

    public Library() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    @Override
    public String toString() {
        return "Library{" +
                "year=" + year +
                ", autor='" + autor + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
