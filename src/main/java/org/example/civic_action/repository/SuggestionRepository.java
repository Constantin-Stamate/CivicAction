package org.example.civic_action.repository;

import org.example.civic_action.entity.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuggestionRepository extends JpaRepository<Suggestion, Long> {
}
