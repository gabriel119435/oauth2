package oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableAutoConfiguration
// allows @PreAuthorize("hasAuthority('someService')") to be used
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
