package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileModelRepository extends JpaRepository<FileModel, String> {

    List<FileModel> findByPtsRef(String ptsRef);

}
