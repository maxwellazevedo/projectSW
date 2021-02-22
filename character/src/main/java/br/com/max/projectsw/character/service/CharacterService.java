package br.com.max.projectsw.character.service;

import br.com.max.projectsw.character.request.CharacterRequest;
import br.com.max.projectsw.character.response.CharacterResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@Service
public class CharacterService {

    public List<CharacterResponse> findAll(){
        final List<CharacterResponse> characterList = new ArrayList<>();

        characterList.add(new CharacterResponse(1L, "Oliver Tsubasa", 3L, 35, 2L));
        characterList.add(new CharacterResponse(2L, "GLodi", 1L, 21, 3L));
        characterList.add(new CharacterResponse(3L, "Max", 2L, 29, 4L));

        return characterList;
    }

    public CharacterResponse findById(final Long id){
        final List<CharacterResponse> characterList = new ArrayList<>();

        characterList.add(new CharacterResponse(1L, "Oliver Tsubasa", 3L, 35, 2L));
        characterList.add(new CharacterResponse(2L, "GLodi", 1L, 21, 3L));
        characterList.add(new CharacterResponse(3L, "Max", 2L, 29, 4L));

        return characterList.stream()
                .filter(character -> character.getId().equals(id))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    public void save(final CharacterRequest characterRequest){
        log.info("salvando o personagem: {}", characterRequest);
    }
}
