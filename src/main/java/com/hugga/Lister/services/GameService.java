package com.hugga.Lister.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hugga.Lister.dto.GameMinDTO;
import com.hugga.Lister.entities.Game;
import com.hugga.Lister.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
