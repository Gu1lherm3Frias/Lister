package com.hugga.Lister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hugga.Lister.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
