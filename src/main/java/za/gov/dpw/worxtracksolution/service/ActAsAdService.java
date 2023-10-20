package za.gov.dpw.worxtracksolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.gov.dpw.worxtracksolution.dao.ActAsAdDao;
import za.gov.dpw.worxtracksolution.entity.ActAsAD;

import java.util.List;

@Service
public class ActAsAdService {

    @Autowired
    private ActAsAdDao actAsAdDao;

    public List<ActAsAD> listAll(){
        return actAsAdDao.findAll();
    }
}
