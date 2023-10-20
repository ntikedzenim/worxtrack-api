package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ArchitecturalDesignDao;
import za.gov.dpw.worxtracksolution.entity.ArchitecturalDesign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchitecturalDesignService {

    @Autowired
    private ArchitecturalDesignDao architecturalDesignDao;

    public ArchitecturalDesign saveArchitecturalDesign(ArchitecturalDesign architecturalDesign) {
        ArchitecturalDesign existingArchitecturalDesign = architecturalDesignDao.findByPtsRef(architecturalDesign.getPtsRef());
        if (existingArchitecturalDesign != null){
            existingArchitecturalDesign.setArchitecturalDesignStatus(architecturalDesign.getArchitecturalDesignStatus());
            existingArchitecturalDesign.setArchitecturalDesignDate(architecturalDesign.getArchitecturalDesignDate());

            return architecturalDesignDao.save(existingArchitecturalDesign);
        } else {
            return architecturalDesignDao.save(architecturalDesign);
        }
    }

    public List<ArchitecturalDesign> getAllByPtsRef(String ptsRef) {
        return architecturalDesignDao.findAllByPtsRef(ptsRef);
    }
}
