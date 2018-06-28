package com.tex.hackathon.demo.dao.repository;

import com.tex.hackathon.demo.dao.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findByName(@Param("name") String name);

    List<User> findByUserType(@Param("userType") String userType);
}
