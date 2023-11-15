package com.api.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.game.domain.Game;
import com.api.game.dto.GameDTO;
import com.api.game.dto.GameMinDTO;
import com.api.game.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long gameId) {
		Game game = gameRepository.findById(gameId).get();
		return new GameDTO(game);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> games = gameRepository.findAll();
		return games.stream().map(x -> new GameMinDTO(x)).toList();

	}

}
