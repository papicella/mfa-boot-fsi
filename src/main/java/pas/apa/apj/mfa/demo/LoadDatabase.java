package pas.apa.apj.mfa.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pas.apa.apj.mfa.demo.api.Customer;
import pas.apa.apj.mfa.demo.api.CustomerRepository;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDB(CustomerRepository customerRepository) {
        return args -> {
            log.info("Pre loading " + customerRepository.save(new Customer("Motor repairs", "56 Peaches Street, Melbourne, Victoria 3000")));
            log.info("Pre loading " + customerRepository.save(new Customer("Electronic Parts", "1 Apples Street, Melbourne, Victoria 3000")));
            log.info("Pre loading " + customerRepository.save(new Customer("GTS Solutions", "1 Oranges Street, Melbourne, Victoria 3000")));
            log.info("Pre loading " + customerRepository.save(new Customer("Bob's Sporting Goods", "1 Lemons Street, Melbourne, Victoria 3000")));
            log.info("Pre loading " + customerRepository.save(new Customer("Warehouse Sales", "1 Strawberry Street, Melbourne, Victoria 3000")));
            log.info("Pre loading " + customerRepository.save(new Customer("Pethouse Supplies", "1 Pears Street, Melbourne, Victoria 3000")));
        };
    }
}
