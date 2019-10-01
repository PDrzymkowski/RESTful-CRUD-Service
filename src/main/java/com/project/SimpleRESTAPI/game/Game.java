package com.project.SimpleRESTAPI.game;

import com.project.SimpleRESTAPI.gameCollection.GameCollection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Game {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private GameCollection gameCollection;


    public Game(String id, String name, String description, String gameCollectionId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.gameCollection = new GameCollection(gameCollectionId, "", "");
    }

    public Game(){
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

    public void setGameCollection(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

    public GameCollection getGameCollection() {
        return gameCollection;
    }

}
