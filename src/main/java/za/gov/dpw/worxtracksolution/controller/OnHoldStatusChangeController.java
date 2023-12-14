package za.gov.dpw.worxtracksolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.gov.dpw.worxtracksolution.dao.OnHoldStatusChangeDao;
import za.gov.dpw.worxtracksolution.entity.OnHoldStatusChange;

import java.util.List;

@RestController
@RequestMapping("/project")
@CrossOrigin
public class OnHoldStatusChangeController {

    @Autowired
    private OnHoldStatusChangeDao onHoldStatusChangeDao;

    @PostMapping("/saveStatus")
    public OnHoldStatusChange saveStatus(@RequestBody OnHoldStatusChange statusChange) {
        // You might want to add validation or other logic before saving
        OnHoldStatusChange savedStatusChange = onHoldStatusChangeDao.save(statusChange);
        return savedStatusChange;
    }


    @GetMapping("/getStatus/{ptsRef}")
    public List<OnHoldStatusChange> getProjectsStatusByPtaRef(@PathVariable String ptsRef) {

        List<OnHoldStatusChange> statuses = onHoldStatusChangeDao.selectByPtsRef(ptsRef);

        return statuses;
    }

    @DeleteMapping("/deleteStatus/{statusId}")
    public void deleteStatus(@PathVariable Long statusId) {
        // You might want to add validation or other logic before deleting
        onHoldStatusChangeDao.deleteById(statusId);
    }
}
