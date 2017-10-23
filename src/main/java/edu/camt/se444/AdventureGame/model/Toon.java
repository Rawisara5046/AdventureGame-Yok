package edu.camt.se444.AdventureGame.model;

/**
 * Created by admin on 10/23/2017 AD.
 */
public class Toon {

    private String id;
    private String name;

    public Toon() {
    }

    /**
     *
     * @param id
     * @param name
     */
    public Toon(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}