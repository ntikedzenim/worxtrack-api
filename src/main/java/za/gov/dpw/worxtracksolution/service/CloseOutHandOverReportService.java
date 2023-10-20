package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.CloseOutHandOverReportDao;
import za.gov.dpw.worxtracksolution.entity.CloseOutHandOverReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloseOutHandOverReportService {

    @Autowired
    private CloseOutHandOverReportDao closeOutHandOverReportDao;

    public CloseOutHandOverReport saveCloseOut(CloseOutHandOverReport closeOutHandOverReport){
        return closeOutHandOverReportDao.save(closeOutHandOverReport);
    }

    public List<CloseOutHandOverReport> getAllByPtsRef(String ptsRef) {
        return closeOutHandOverReportDao.findAllByPtsRef(ptsRef);
    }
}
