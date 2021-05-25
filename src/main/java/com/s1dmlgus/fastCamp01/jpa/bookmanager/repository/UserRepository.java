package com.s1dmlgus.fastCamp01.jpa.bookmanager.repository;

import com.s1dmlgus.fastCamp01.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
