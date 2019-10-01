package com.project.SimpleRESTAPI.gameCollection;

import com.project.SimpleRESTAPI.game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameCollectionService {

    @Autowired
    private GameCollectionRepository gameCollectionRepository;


    public List<GameCollection> getAllGameCollections() {

        List<GameCollection> mGameCollections = new ArrayList<>();
        gameCollectionRepository.findAll()
                .forEach(mGameCollections::add);
        return mGameCollections;
    }

    public Optional<GameCollection> getGameCollection(String id) {

        return gameCollectionRepository.findById(id);
    }

    public void addGameCollection(GameCollection gameCollection) {

        gameCollectionRepository.save(gameCollection);
    }

    public void updateGameCollection(GameCollection gameCollection, String id) {

        gameCollectionRepository.save(gameCollection);
    }

    public void deleteGameCollection(String id) {

        gameCollectionRepository.deleteById(id);
    }
}
