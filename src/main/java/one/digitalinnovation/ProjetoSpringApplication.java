package one.digitalinnovation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Inializr com os seguinte módulos:
 * - Spring data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author lucarauj
 *
 */

@EnableFeignClients
@SpringBootApplication
public class ProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringApplication.class, args);
	}
}
