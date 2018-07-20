package spring;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aleksey on 16.07.2018.
 */
public class HelloWorld {
    private  String message;
    private String a;
    private int c;
    private String d;
    private List<Integer> myList = new LinkedList<Integer>();
    private Set<String> mySet;
    private Map<Integer, String> myMap;

    public Set getMySet() {
        return mySet;
    }

    public void setMySet(Set mySet) {
        this.mySet = mySet;
    }

    public Map getMyMap() {
        return myMap;
    }

    public void setMyMap(Map myMap) {
        this.myMap = myMap;
    }



    public List<Integer> getMyList() {
        return myList;
    }

    public void setMyList(List<Integer> myList) {
        this.myList = myList;
    }

    public HelloWorld(String a, int c, String d) {
        this.a = a;
        this.c = c;
        this.d = d;
        System.out.println("a= " +  a + " c= " + c + " d= " + d);
    }

    public HelloWorld() {
        System.out.println("create hello world");
    }

    public void getMessege() {
        System.out.println("Your message : " + message);
    }
    public void init (){
        System.out.println("this is init");
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
