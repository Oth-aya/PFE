package tn.enig.DappUnv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@ComponentScan ({"com.server", "com.server.config"})
@EnableJdbcRepositories ("com.server.repository")
public class DappUnvApplication {

	public static void main(String[] args) {
		SpringApplication.run(DappUnvApplication.class, args);
	}

}
