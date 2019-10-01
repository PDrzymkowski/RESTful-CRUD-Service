package com.project.SimpleRESTAPI.gameCollection;

import com.project.SimpleRESTAPI.game.Game;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GameCollection {

    @Id
    private String id;
    private String name;
    private String description;


    public GameCollection(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public GameCollection(){
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
