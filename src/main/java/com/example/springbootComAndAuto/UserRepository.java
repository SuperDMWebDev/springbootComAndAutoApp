package com.example.springbootComAndAuto;

import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //find property
    List<User> findAllByAtk(int atk);

    // find between
    List<User> findAllByAgiBetween(int start, int end);

    //find one data  upon propert
    @Query("select u from User u where u.def = :def")
    User findUserByDefQuery(@Param("def") Integer def);

    // find larger than
    List<User> findAllByAgiGreaterThan(int agiThreshold);
}
