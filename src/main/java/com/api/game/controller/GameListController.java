package com.api.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.game.dto.GameListDTO;
import com.api.game.service.GameListService;
@RestController
@RequestMapping("/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public ResponseEntity<java.util.List<GameListDTO>> listarTodos(){
		return ResponseEntity.ok(gameListService.findAll());
	}
}
