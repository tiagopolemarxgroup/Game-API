package com.api.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.game.domain.Game;
@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
