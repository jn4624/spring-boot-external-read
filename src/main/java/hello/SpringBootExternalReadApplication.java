package hello;

import hello.config.MyDataSourceEnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MyDataSourceEnvConfig.class)
@SpringBootApplication(scanBasePackages = "hello.datasource")
public class SpringBootExternalReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExternalReadApplication.class, args);
	}

}
