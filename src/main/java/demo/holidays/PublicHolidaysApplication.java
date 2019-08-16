package demo.holidays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class PublicHolidaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicHolidaysApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean(){
		return new ServletRegistrationBean(new PublicHolidaysServlet(),"/public-holidays/main");
	}

}
