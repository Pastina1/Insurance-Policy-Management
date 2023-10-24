package com.policy.controller;
import com.policy.model.Policy;
import com.policy.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;

@Controller
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    // Default home path '/' will return view index with message
    @RequestMapping(method = RequestMethod.GET,value="/")
    public String printHello(ModelMap model){
        model.addAttribute("message","Welcome to the Insurance Management System");
        return "index";
    }
    // When the path is routed to '/home' below method to be called and view returned is home
    @RequestMapping(method = RequestMethod.GET, value="/home")
    public ModelAndView home1(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("pageTitle","Home Page");
        modelAndView.addObject("message","Welcome to the Insurance Management System");
        return modelAndView;
    }


    // When the path is routed to '/policymanage' below method to be called and view returned is policymanage
    @RequestMapping(method = RequestMethod.GET, value = "/policymanage")
    public ModelAndView home() {
        List<Policy> listPolicy = policyService.listAll();
        for (Policy Policy : listPolicy) {
            System.out.println(Policy.toString());
        }
        ModelAndView mav = new ModelAndView("policymanage");
        mav.addObject("listPolicy", listPolicy);
        return mav;
    }
    // When the path is routed to '/new' below method to be called and view returned is newPolicy
    @RequestMapping(method = RequestMethod.GET, value ="/new")
    public String newPolicyForm(Map<String, Object> model) {
        Policy Policy = new Policy();
        model.put("policy", Policy);
        return "newPolicy";
    }
    // When a form is submitted in POST and action method as 'save' below method to be called returned to home '/' i.e. index
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public String savePolicy(@ModelAttribute("policy") Policy policy) {
        policyService.save(policy);
        return "redirect:/";
    }
    // When the path is routed to '/edit' below method to be called and view returned is editPolicy
    @RequestMapping(method = RequestMethod.GET, value = "/edit")
    public ModelAndView editPolicyForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("editPolicy");
        Policy policy = policyService.get(id);
        mav.addObject("policy", policy);
        return mav;
    }
    // When the path is routed to '/delete' below method to be called and view returned is policymanage
    @RequestMapping(method = RequestMethod.GET, value ="/delete")
    public String deletePolicyForm(@RequestParam long id) {
        policyService.delete(id);
        return "redirect:/policymanage";
    }
    // When the path is routed to '/search' below method to be called and view returned is searchPolicy
    @RequestMapping(method = RequestMethod.GET, value ="/search")
    public ModelAndView search(@RequestParam String keyword) {
        List<Policy> result = policyService.search(keyword);
        ModelAndView mav = new ModelAndView("searchPolicy");
        mav.addObject("result", result);
        return mav;
    }
}
