package pas.apa.apj.mfa.demo.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pas.apa.apj.mfa.demo.api.CustomerRepository;

@Controller
public class CustomerUI {
    private CustomerRepository customerRepository;

    public CustomerUI(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public String allCustomers (Model model){
        model.addAttribute("customers", customerRepository.findAll());
        model.addAttribute("customersCount", customerRepository.count());
        return "customer";
    }
}
