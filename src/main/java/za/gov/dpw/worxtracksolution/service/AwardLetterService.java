package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.AwardLetterDao;
import za.gov.dpw.worxtracksolution.entity.AwardLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwardLetterService {

    @Autowired
    private AwardLetterDao awardLetterDao;

//    public AwardLetter saveAward(AwardLetter awardLetter){
//        AwardLetter existingAwardLetter = awardLetterDao.findByPtsRef(awardLetter.getPtsRef());
//        if (existingAwardLetter != null) {
//            existingAwardLetter.setAwardLetterStatus(awardLetter.getAwardLetterStatus());
//            existingAwardLetter.setAwardLetterDate(awardLetter.getAwardLetterDate());
//            existingAwardLetter.setProjectTitle(awardLetter.getProjectTitle());
//            // update other fields as needed
//            return awardLetterDao.save(existingAwardLetter);
//        } else {
//            return awardLetterDao.save(awardLetter);
//        }
//    }

    public AwardLetter saveAward(AwardLetter awardLetter){return awardLetterDao.save(awardLetter);}

    public AwardLetter getAwardLetterByPtsRef(String ptsRef) {
        return awardLetterDao.findByPtsRef(ptsRef);
    }

    public List<AwardLetter> getAllByPtsRef(String ptsRef) {
        return awardLetterDao.findAllByPtsRef(ptsRef);
    }

    public List<AwardLetter> getAllAwardLetter(){
        return (List<AwardLetter>) awardLetterDao.findAll();
    }
}

