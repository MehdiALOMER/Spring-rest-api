package tr.com.mergentech.apideneme.apideneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApidenemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidenemeApplication.class, args);
	}

}
