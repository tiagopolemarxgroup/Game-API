package com.api.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.game.domain.GameList;
@Repository
public interface GameListRepository extends JpaRepository<GameList, Long>{

}
