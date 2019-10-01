package com.project.SimpleRESTAPI.game;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameRepository extends CrudRepository<Game, String> {

    public List<Game> findGameByGameCollectionId(String gameCollectionId);
}
