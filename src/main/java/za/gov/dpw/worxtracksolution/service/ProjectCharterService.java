package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ProjectCharterDao;
import za.gov.dpw.worxtracksolution.entity.ProjectCharter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectCharterService {

    @Autowired
    private ProjectCharterDao projectCharterDao;

    public ProjectCharter saveProjectCharter(ProjectCharter projectCharter){
        return projectCharterDao.save(projectCharter);
    }

    public List<ProjectCharter> getAllByPtsRef(String ptsRef) {
        return projectCharterDao.findAllByPtsRef(ptsRef);
    }
}
