package com.example.mydreamgardenbackend.repository;




//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mydreamgardenbackend.model.Login;

public interface LoginRepo extends JpaRepository<Login,Integer>{

    // @Query("SELECT s FROM Shop s WHERE s.userName = :userName")
    // Login findPetByName(@RequestParam("userName") String userName);
    // @Query("SELECT l FROM Login l ORDER BY l.userName")
    // List<Login> findByUserName();

    // @Modifying
	// @Transactional
	// @Query(value="delete from myempdetailnew where eid=:s",nativeQuery=true)
	// public Integer deleteempInfo(@Param("s") int id);

    
}
