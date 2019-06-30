package com.neuedu.controller;

import com.neuedu.pojo.HandleTrial;
import com.neuedu.service.EmpService;
import com.neuedu.service.HandleTrialService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/handletrial")
public class HandleTrialController {
    @Resource
    HandleTrialService handleTrialService;
    @Resource
    EmpService empService;
    @PostMapping("/update")
    public int update(HandleTrial handleTrial){
        int i=empService.updateResults(handleTrial.getEmpId(),handleTrial.getCommentsResults());
        return handleTrialService.update(handleTrial);
    }
}
