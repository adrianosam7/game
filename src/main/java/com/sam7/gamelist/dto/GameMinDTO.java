//Essa Classe serve para determinar os dados exibidos (projetados), diminuir o trafego da API e copia os dados da entity //
package com.sam7.gamelist.dto;

import com.sam7.gamelist.entities.Game;//importa a "game entity"

public class GameMinDTO {
	//selecionado só os dados que vair ser listado//
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	//construtor sem argumentos//
	public GameMinDTO() {
		}

	public GameMinDTO(Game entity) {//importa a "game entity"//
		//esse é construtor com argumentos que copia os dados da entidade, não é necessario colocar o "THIS"//
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
//metodos getters os setter não é necessario//
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
