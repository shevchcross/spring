package spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aleksey on 17.07.2018.
 */
public class Kitchen{
    private String table;
    private String chair;
    private List <String> plates;
    private Set<String> cutlery;
    private Map<String,String> frig;
    private String q;
    private int e;
    private boolean r;

    public Kitchen() {
    }

    public Kitchen(String q, int e, boolean r) {
        this.q = q;
        this.e = e;
        this.r = r;
        System.out.println("Hello I am constructor");
    }

    public void get() {
        System.out.println("Color of Table: " + table + "    Color of Chair: " + chair);
    }

    public void setMyMessage(String table) {
        this.table = table;
        chair = table;
    }

    public void Unit(){
        System.out.println(" Hello I am from Kitchen.Unit");
        table = "yellow I chage";
       chair = "green I chage";
    }

    public List<String> getPlates() {
        return plates;
    }

    public void setPlates(List<String> plates) {
        this.plates = plates;
    }

    public Set<String> getCutlery() {
        return cutlery;
    }

    public void setCutlery(Set<String> cutlery) {
        this.cutlery = cutlery;
    }

    public Map<String, String> getFrig() {
        return frig;
    }

    public void setFrig(Map<String, String> frig) {
        this.frig = frig;
    }
}
