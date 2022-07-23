package test.com.createBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigration {

	@Bean
	public Notebook getNotebook() {
		Notebook nb=new Notebook();
		
		nb.setModel_name("angNote");
		nb.setPrice(400000000);
		return new Notebook();
	}
	
}
