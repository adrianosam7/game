package com.sam7.gamelist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity /*configura a classe java para que ela seja equivalente a uma tabela do banco relacional*/
@Table(name = "tb_game")/*contumiza o nome da tabela*/
public class Game {
		
@Id //configurando o id como chave primaria//
@GeneratedValue (strategy = GenerationType.IDENTITY) //para o id ser auto-incrementavel pelo banco dados//
	private Long id;
	private String title;
	
	@Column(name = "game_year")//constumizando o nome da coluna ano pois year é uma palavra reservada do banco de dados (SQL)// 
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")//INSTRUÇÃO PARA A JPA GERE O CAMPO COMO TEXTO PARA NÃO LIMITAR O CAMPO PARA APENAS 255 CARACTERES//
	private String shortDescription;
	@Column(columnDefinition = "TEXT")//INSTRUÇÃO PARA A JPA GERE O CAMPO COMO TEXTO PARA NÃO LIMITAR O CAMPO PARA APENAS 255 CARACTERES//
	private String longDescription;

	
	/*construtor sem argumento */
	public Game() {
	
	}
	
	/*construtor com argumentos para estanciar um game já passando os argumentos  - (constructor using fields)(opcional)*/ 
	
	public Game(Long id, String title, Integer year, String genre, String platforms,Double score, String imgUrl,
			String shortDescription, String longDescription) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	/*Getters e Setters*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platform) {
		this.platforms = platform;
	}
	
	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	//metodo equals e hash code usado para comparar dois games se eles são iguais ou não no caso//
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
