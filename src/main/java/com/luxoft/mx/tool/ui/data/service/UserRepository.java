package com.luxoft.mx.tool.ui.data.service;

import com.luxoft.mx.tool.ui.data.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import com.luxoft.mx.tool.ui.data.Role;
import javax.persistence.Lob;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}