package org.example.civic_action.repository;

import org.example.civic_action.entity.Law;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawRepository extends JpaRepository<Law, Long> {
}