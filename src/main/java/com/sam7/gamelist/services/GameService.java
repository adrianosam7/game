//é o componente responsavel pela regra de sistema(negocio)orquestra a camada de serviço
package com.sam7.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam7.gamelist.dto.GameMinDTO;
//import com.sam7.gamelist.dto.GameMinDTO;
import com.sam7.gamelist.entities.Game;
import com.sam7.gamelist.repositories.GameRepository;

@Service //registra a classe Service como componentes do sistemas
public class GameService {
	
	@Autowired //injeta um game repository
	private GameRepository gameRepository;
	

	public List<GameMinDTO>findAll() {//retorno do metodo é uma lista de obijetos do DTO findall(função que busca todos os games)
		List<Game> result = gameRepository.findAll();//variavel result = recebe a consulta e tras todos os games do banco de dados e é convertida em uma lista de games e cai na variavel result
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();//essa operação transforma uma lista de Games em uma ListMinDTO usando o "map"
		return dto;
	}
}
 