package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ArchitecturalDesign;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArchitecturalDesignDao extends JpaRepository<ArchitecturalDesign, Long> {

    ArchitecturalDesign findByPtsRef(String ptsRef);

    List<ArchitecturalDesign> findAllByPtsRef(String ptsRef);
}
