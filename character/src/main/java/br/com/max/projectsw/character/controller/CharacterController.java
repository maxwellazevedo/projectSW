package br.com.max.projectsw.character.controller;

import br.com.max.projectsw.character.request.CharacterRequest;
import br.com.max.projectsw.character.response.CharacterResponse;
import br.com.max.projectsw.character.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping
    public List<CharacterResponse> findAll(){
        return characterService.findAll();
    }

    @GetMapping(value = "/{id}")
    public CharacterResponse findById(@PathVariable final Long id){
        return characterService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void add (@RequestBody CharacterRequest characterRequest){
        characterService.save(characterRequest);
    }

}
