package id.sutan.openbmt;

/* 
 * Sep 15, 2014 1:43:05 PM created by : sutan
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MainApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplication.class, args);
	}
}
