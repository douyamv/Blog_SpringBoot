package a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String greeting() {
		return "Hello World2!";
	}

	@RequestMapping("/p")
	public String greeting2() {
		return "Hello World pp2!";
	}
	@RequestMapping("/h")
	public String greeting3() {
		return "Hello World pp2!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}