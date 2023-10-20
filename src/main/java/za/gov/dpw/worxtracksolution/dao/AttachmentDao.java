package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttachmentDao extends JpaRepository<Attachment, String> {

    List<Attachment> findByPtsRef(String ptsRef);

    Attachment findByFileName(String fileName);
}
