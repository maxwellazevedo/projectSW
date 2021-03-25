package br.com.max.projectsw.character.service;

import br.com.max.projectsw.character.dao.CharacterDAO;
import br.com.max.projectsw.character.domain.entity.CharacterEntity;
import br.com.max.projectsw.character.domain.request.CharacterRequest;
import br.com.max.projectsw.character.domain.response.CharacterResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class CharacterService {

    private CharacterDAO characterDAO;

    public List<CharacterResponse> findAll(){
        final List<CharacterEntity> characterList = characterDAO.findAll();

        return characterList.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    public CharacterResponse findById(final Long id){

        return characterDAO.findById(id)
                .map(character -> convertToResponse(character))
                .orElseThrow(NoSuchElementException::new);
    }

    public void save(final CharacterRequest characterRequest){
        log.info("salvando o personagem: {}", characterRequest);

        final CharacterEntity characterEntity = CharacterEntity.builder()
                .name(characterRequest.getName())
                .age(characterRequest.getAge())
                .planet(characterRequest.getPlanet())
                .specie(characterRequest.getSpecie())
                .build();

        characterDAO.save(characterEntity);
    }

    private CharacterResponse convertToResponse(final CharacterEntity character) {
        return CharacterResponse.builder()
                .id(character.getId())
                .name(character.getName())
                .age(character.getAge())
                .planet(character.getPlanet())
                .specie(character.getSpecie())
                .build();

    }
}
