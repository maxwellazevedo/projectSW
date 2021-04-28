package br.com.max.projectsw.character;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CharacterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharacterApplication.class, args);
	}

}
