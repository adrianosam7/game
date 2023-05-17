//é uma Interface responsável pelas consultas no banco de dados - caso game // 
package com.sam7.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam7.gamelist.entities.Game;

//está extendendo o o JPAREPOSITORY com o tipo da entidade e seu ID//
public interface GameRepository extends JpaRepository<Game,Long> {

}
