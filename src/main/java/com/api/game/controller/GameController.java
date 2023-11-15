package com.api.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.game.dto.GameDTO;
import com.api.game.dto.GameMinDTO;
import com.api.game.service.GameService;
@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping("/{id}")
	public ResponseEntity<GameDTO> findById(@PathVariable Long id){
		return ResponseEntity.ok(gameService.findById(id));
	}
	@GetMapping
	public ResponseEntity<java.util.List<GameMinDTO>> listarTodos(){
		return ResponseEntity.ok(gameService.findAll());
	}
}
