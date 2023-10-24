package com.policy.controller;
import com.policy.model.PolicyHolderRecord;
import com.policy.service.PolicyHolderRecordService;
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
public class PolicyHolderRecordController {
    @Autowired
    private PolicyHolderRecordService policyHolderRecordService;

    // When the path is routed to '/policyHolderRecordManage' below method to be called and view returned is policyHolderRecordManage
    @RequestMapping(method = RequestMethod.GET, value = "/policyHolderRecordManage")
    public ModelAndView home() {
        List<PolicyHolderRecord> listPolicyHolderRecord = policyHolderRecordService.listAll();
        for (PolicyHolderRecord PolicyHolderRecord : listPolicyHolderRecord) {
            System.out.println(PolicyHolderRecord.toString());
        }
        ModelAndView mav = new ModelAndView("policyHolderRecordManage");
        mav.addObject("listPolicyHolderRecord", listPolicyHolderRecord);
        return mav;
    }
    // When the path is routed to '/new' below method to be called and view returned is newPolicyHolderRecord
    @RequestMapping(method = RequestMethod.GET, value ="/newPolicyHolderRecord")
    public String newPolicyHolderRecordForm(Map<String, Object> model) {
        PolicyHolderRecord PolicyHolderRecord = new PolicyHolderRecord();
        model.put("policyHolderRecord", PolicyHolderRecord);
        return "newPolicyHolderRecord";
    }
    // When a form is submitted in POST and action method as 'save' below method to be called returned to home '/' i.e. index
    @RequestMapping(method = RequestMethod.POST, value = "/savePolicyHolderRecord")
    public String savePolicyHolderRecord(@ModelAttribute("policyHolderRecord") PolicyHolderRecord policyHolderRecord) {
        policyHolderRecordService.save(policyHolderRecord);
        return "redirect:/";
    }
    // When the path is routed to '/edit' below method to be called and view returned is editPolicyHolderRecord
    @RequestMapping(method = RequestMethod.GET, value = "/editPolicyHolderRecord")
    public ModelAndView editPolicyHolderRecordForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("editPolicyHolderRecord");
        PolicyHolderRecord policyHolderRecord = policyHolderRecordService.get(id);
        mav.addObject("policyHolderRecord", policyHolderRecord);
        return mav;
    }
    // When the path is routed to '/delete' below method to be called and view returned is policyHolderRecordManage
    @RequestMapping(method = RequestMethod.GET, value ="/deletePolicyHolderRecord")
    public String deletePolicyHolderRecordForm(@RequestParam long id) {
        policyHolderRecordService.delete(id);
        return "redirect:/policyHolderRecordManage";
    }
    // When the path is routed to '/search' below method to be called and view returned is searchPolicyHolderRecord
    @RequestMapping(method = RequestMethod.GET, value ="/searchPolicyHolderRecord")
    public ModelAndView searchPolicyHolderRecord(@RequestParam String keyword) {
        List<PolicyHolderRecord> result = policyHolderRecordService.search(keyword);
        ModelAndView mav = new ModelAndView("searchPolicyHolderRecord");
        mav.addObject("policyHolderRecordResult", result);
        return mav;
    }
}
