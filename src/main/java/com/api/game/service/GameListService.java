package com.api.game.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.game.domain.GameList;
import com.api.game.dto.GameListDTO;
import com.api.game.repository.GameListRepository;


import java.util.List;
@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;


	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> gameLists = gameListRepository.findAll();
		return gameLists.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	
}
