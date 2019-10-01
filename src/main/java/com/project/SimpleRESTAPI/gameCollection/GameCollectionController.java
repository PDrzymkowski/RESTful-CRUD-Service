package com.project.SimpleRESTAPI.gameCollection;

import com.project.SimpleRESTAPI.game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GameCollectionController {

    @Autowired
    private GameCollectionService gameCollectionService;


    @RequestMapping("/gameCollections")
    public List<GameCollection> getAllGameCollections() {

        return gameCollectionService.getAllGameCollections();
    }

    @RequestMapping("/gameCollections/{id}")
    public Optional<GameCollection> getGameCollection(@PathVariable("id") String id) {

        return gameCollectionService.getGameCollection(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/gameCollections")
    public void addGameCollection(@RequestBody GameCollection gameCollection) {

        gameCollectionService.addGameCollection(gameCollection);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/gameCollections/{id}")
    public void updateGameCollection(@RequestBody GameCollection gameCollection, @PathVariable("id") String id) {

        gameCollectionService.updateGameCollection(gameCollection, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/gameCollections/{id}")
    public void deleteGameCollection(@PathVariable("id") String id) {

        gameCollectionService.deleteGameCollection(id);
    }
}
