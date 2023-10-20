package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ProjectCharter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectCharterDao extends JpaRepository<ProjectCharter, Long> {

    ProjectCharter findByPtsRef(String ptsRef);

    List<ProjectCharter> findAllByPtsRef(String ptsRef);
}
