package com.project.SimpleRESTAPI.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

@Autowired
private GameRepository gameRepository;


public List<Game> getAllGames(String gameCollectionId) {

    List<Game> mGames = new ArrayList<>();
    gameRepository.findGameByGameCollectionId(gameCollectionId)
            .forEach(mGames::add);
    return mGames;
}

public Optional<Game> getGame(String id) {

    return gameRepository.findById(id);
}

public void addGame(Game game) {

    gameRepository.save(game);
}

public void updateGame(Game game) {

    gameRepository.save(game);
}

public void deleteGame(String id) {

    gameRepository.deleteById(id);
}

}
