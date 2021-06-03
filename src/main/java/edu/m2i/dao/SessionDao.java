package edu.m2i.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.m2i.entities.Session;

public interface SessionDao extends JpaRepository<Session, Integer> {

}
