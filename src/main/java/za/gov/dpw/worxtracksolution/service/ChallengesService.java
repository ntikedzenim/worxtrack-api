package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ChallengesDao;
import za.gov.dpw.worxtracksolution.entity.Challenges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengesService {

    @Autowired
    private ChallengesDao challengesDao;

    public Challenges saveChallenges(Challenges challenges){
        return challengesDao.save(challenges);
    }

    public List<Challenges> getAllByPtsRef(String ptsRef) {
        return challengesDao.findAllByPtsRef(ptsRef);
    }
}
