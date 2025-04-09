package org.example.civic.repository;

import org.example.civic.entity.Law;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawRepository extends JpaRepository<Law, Long> {
}