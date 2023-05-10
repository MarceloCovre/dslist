package com.marcelocovre.dslist.services;

import com.marcelocovre.dslist.dto.GameListDTO;
import com.marcelocovre.dslist.dto.GameMinDTO;
import com.marcelocovre.dslist.entities.Game;
import com.marcelocovre.dslist.entities.GameList;
import com.marcelocovre.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
