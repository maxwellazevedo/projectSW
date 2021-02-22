package br.com.max.projectsw.character.request;

import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CharacterRequest {

    private String name;
    private Long specie;
    private Integer age;
    private Long planet;

}
