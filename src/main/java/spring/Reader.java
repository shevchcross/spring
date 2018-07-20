package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Olya on 19.07.2018.
 */

public class Reader {
    @Autowired
    @Qualifier("libraryBean1")
    private Library book;
    private String name;
    private int age;

    public Library getBook() {
        return book;
    }

    public void setBook(Library book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "book=" + book +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
