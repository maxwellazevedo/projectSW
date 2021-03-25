package br.com.max.projectsw.character.integration;

import br.com.max.projectsw.character.domain.request.CharacterRequest;
import br.com.max.projectsw.character.service.CharacterService;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;


public class CharacterTest {

    @Autowired
    private CharacterService characterService;

    @Test
    void shouldReturnAllCharactersTest() {

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("characters")
                .then()
                .statusCode(HttpStatus.OK.value());
    }

    @Test
    void shouldReturnASpecificCharacterTest() {

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("characters/1")
                .then()
                .statusCode(HttpStatus.OK.value());
    }

    @Test
    void shouldReturnErrorWhenCharacterNonExistentTest() {

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("characters/5")
                .then()
                .statusCode(HttpStatus.NOT_FOUND.value());
    }

    @Test
    void shouldSaveCharacterWithSuccessTest() {

        given()
                .contentType(ContentType.JSON)
                .when().body(characterBuild())
                .post("characters")
                .then()
                .statusCode(HttpStatus.CREATED.value());
    }

    private CharacterRequest characterBuild() {
        return new CharacterRequest("Adebayor", 5L, 114, 5L);
    }
}
