package vn.cloud.cardservice;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class CardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardServiceApplication.class, args);
	}

}

@RestController
@RequestMapping("/cards")
@RequiredArgsConstructor
class CardController {

	@GetMapping("/count")
	long count() {
		return 20;
	}
}






