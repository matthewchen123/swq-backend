package irm.cm.swpbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SwpBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwpBackendApplication.class, args);
	}

}
