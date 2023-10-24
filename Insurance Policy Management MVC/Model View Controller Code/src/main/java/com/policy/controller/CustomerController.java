package com.policy.controller;
import com.policy.model.Customer;
import com.policy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    // When the path is routed to '/customermanage' below method to be called and view returned is customermanage
    @RequestMapping(method = RequestMethod.GET, value = "/customermanage")
    public ModelAndView home() {
        List<Customer> listCustomer = customerService.listAll();
        for (Customer Customer : listCustomer) {
            System.out.println(Customer.toString());
        }
        ModelAndView mav = new ModelAndView("customermanage");
        mav.addObject("listCustomer", listCustomer);
        return mav;
    }
    // When the path is routed to '/new' below method to be called and view returned is newPolicy
    @RequestMapping(method = RequestMethod.GET, value ="/newCustomer")
    public String newCustomerForm(Map<String, Object> model) {
        Customer Customer = new Customer();
        model.put("customer", Customer);
        return "newCustomer";
    }
    // When a form is submitted in POST and action method as 'save' below method to be called returned to home '/' i.e. index
    @RequestMapping(method = RequestMethod.POST, value = "/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/editCustomer")
    public ModelAndView editCustomerForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("editCustomer");
        Customer customer = customerService.get(id);
        mav.addObject("customer", customer);
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value ="/deleteCustomer")
    public String deleteCustomerForm(@RequestParam long id) {
        customerService.delete(id);
        return "redirect:/customermanage";
    }
    // When the path is routed to '/search' below method to be called and view returned is searchPolicy
    @RequestMapping(method = RequestMethod.GET, value ="/searchCustomer")
    public ModelAndView search(@RequestParam String keyword) {
        List<Customer> result = customerService.search(keyword);
        ModelAndView mav = new ModelAndView("searchCustomer");
        mav.addObject("customerResult", result);
        return mav;
    }
    // When errors are detected in the customer web page, the form is cleared and redirected back to itself
    @PostMapping("newCustomer/")
    public String checkPersonInfo(@Valid Customer customer, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "newCustomer/";
        }

        return "redirect:/results";
    }

}
