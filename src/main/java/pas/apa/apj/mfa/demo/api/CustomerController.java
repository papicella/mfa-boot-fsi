package pas.apa.apj.mfa.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping ("/api/customers/all")
    public List<Customer> getAllCustomers ()
    {
        return (List<Customer>) customerRepository.findAll();
    }

}
