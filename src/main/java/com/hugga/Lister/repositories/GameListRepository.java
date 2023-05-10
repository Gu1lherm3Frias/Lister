package com.hugga.Lister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugga.Lister.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{}
