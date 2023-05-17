//responsavel pela ligação a entrada o controle do back end ele disponibiliza a API (chama Serviço, 
package com.sam7.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam7.gamelist.dto.GameMinDTO;
import com.sam7.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/games")//mapea o recurso configurando o caminho respondido dentro da API// 
public class GameController {
	
	
	@Autowired //injetando o Service
	private GameService gameService;
	
	
	
	//metodo é Get pois é para buscar /obter 
	
	@GetMapping 
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
		}
	}
