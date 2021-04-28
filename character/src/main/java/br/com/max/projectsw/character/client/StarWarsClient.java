package br.com.max.projectsw.character.client;

import br.com.max.projectsw.character.domain.response.PersonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "starWarsClient", url = "${feign.url.starwars}")
public interface StarWarsClient {

    @GetMapping("/people/{id}/")
    PersonResponse findPersonById(@PathVariable Integer id);
}
