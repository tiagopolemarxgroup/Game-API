package com.api.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.game.dto.GameListDTO;
import com.api.game.dto.GameMinDTO;
import com.api.game.service.GameListService;
import com.api.game.service.GameService;
@RestController
@RequestMapping("/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<List<GameListDTO>> listarTodos(){
		return ResponseEntity.ok(gameListService.findAll());
	}
	
	@GetMapping("/{listId}/games")
	public ResponseEntity<List<GameMinDTO>> listarTodos(@PathVariable Long listId){
		List<GameMinDTO> findByList = gameService.findByList(listId);
		return ResponseEntity.ok(findByList);
	}
}
