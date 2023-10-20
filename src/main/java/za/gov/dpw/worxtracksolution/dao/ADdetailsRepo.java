package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ADdetails;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface ADdetailsRepo extends JpaRepository<ADdetails,Integer> {

    ADdetails findByEmailIgnoreCase(String email);

    default ADdetails findByEmailAndPassowrdIgnoreCase(String email, String password) {

        ADdetails act = findByEmailIgnoreCase(email);

//        if(act != null) {
//
//            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//            if (passwordEncoder.matches(password, act.getPassword())) {
//                return act;
//            }
//
//        }

        return null;
    }
}
