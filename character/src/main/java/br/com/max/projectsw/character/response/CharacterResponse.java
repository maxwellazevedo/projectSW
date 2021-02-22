package br.com.max.projectsw.character.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CharacterResponse {

    private Long id;
    private String name;
    private Long specie;
    private Integer age;
    private Long planet;


}
