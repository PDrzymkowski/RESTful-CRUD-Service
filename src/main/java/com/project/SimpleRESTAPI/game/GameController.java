package com.project.SimpleRESTAPI.game;

import com.project.SimpleRESTAPI.gameCollection.GameCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GameController {


    @Autowired
    private GameService gameService;


    @RequestMapping("/gameCollections/{id}/games")
    public List<Game> getAllGames(@PathVariable("id") String id) {

        return gameService.getAllGames(id);
    }

    @RequestMapping("/gameCollections/{gameCollectionId}/games/{id}")
    public Optional<Game> getGame(@PathVariable("id") String id) {

        return gameService.getGame(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/gameCollections/{gameCollectionId}/games")
    public void addGame(@RequestBody Game game, @PathVariable String gameCollectionId) {

        game.setGameCollection(new GameCollection(gameCollectionId, "", ""));
        gameService.addGame(game);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/gameCollections/{gameCollectionId}/games/{id}")
    public void updateGame(@RequestBody Game game, @PathVariable("id") String gameCollectionId, @PathVariable("id") String id) {

        game.setGameCollection(new GameCollection(gameCollectionId, "", ""));
        gameService.updateGame(game);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/gameCollections/{gameCollectionId}/games/{id}")
    public void deleteGame(@PathVariable("id") String id) {

        gameService.deleteGame(id);
    }
}
