package main.java.com.gb.statistics.webservice.jdbc;

/**
 * Created by Kogut Sergey on 12.06.17.
 */
public class Persons {
    private int id;
    private String name;

    public Persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
