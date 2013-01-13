package com.pod.opentrace.repository

import com.pod.opentrace.domain.User
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.RelationshipOperationsRepository;

public interface UserRepository extends GraphRepository<User>,
        RelationshipOperationsRepository<String> {

    User findByLogin(String login);
}