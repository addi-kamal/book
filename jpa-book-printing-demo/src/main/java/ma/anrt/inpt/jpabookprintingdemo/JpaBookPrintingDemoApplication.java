package ma.anrt.inpt.jpabookprintingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ma.anrt.inpt.jpabookprintingdemo.model.Role;
import ma.anrt.inpt.jpabookprintingdemo.model.User;
import ma.anrt.inpt.jpabookprintingdemo.model.repository.UserRepository;

@SpringBootApplication
public class JpaBookPrintingDemoApplication {
   
	@Autowired
	private UserRepository userRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaBookPrintingDemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args ->{
			User user = new User("asbik", "asbik", "asbik", "asbik", Role.ADMIN);
			userRepo.save(user);
			
		};
	}

}
