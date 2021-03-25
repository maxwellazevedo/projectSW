package br.com.max.projectsw.character.dao;

import br.com.max.projectsw.character.domain.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDAO extends JpaRepository<CharacterEntity,Long> {
}
