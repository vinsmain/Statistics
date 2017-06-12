package main.java.com.gb.statistics.webservice.jdbc;

/**
 * Created by Kogut Sergey on 12.06.17.
 */
public class KeyWords {
    private int id;
    private String name;
    private int personId;

    public KeyWords(int id, String name, int personId) {
        this.id = id;
        this.name = name;
        this.personId = personId;
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

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
