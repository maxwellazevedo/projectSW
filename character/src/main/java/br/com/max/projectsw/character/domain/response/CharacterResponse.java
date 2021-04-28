package br.com.max.projectsw.character.domain.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacterResponse {

    private Long id;
    private String name;
    private Long specie;
    private Integer age;
    private Long planet;
    private PersonResponse master;

}
