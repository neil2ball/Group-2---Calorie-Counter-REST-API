package payroll;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
        log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "600","Sat May 18 16:29:57 EDT 2019" ,"8d79ed87f8191a51")));
    	log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "500", "Thu Jun 20 16:29:24 EDT 2019", "8d79ed87f8191a51")));
        log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "500", "Wed Jul 10 16:29:24 EDT 2019", "8d79ed87f8191a51")));
        log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "600","Thu Jul 18 16:29:57 EDT 2019" ,"8d79ed87f8191a51")));
        log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "600","Thu Jul 18 16:29:58 EDT 2019" ,"8d79ed87f8191a52")));
    };
  }
}