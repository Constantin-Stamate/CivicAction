package org.example.civic.service;

import org.example.civic.dto.SuggestionDto;
import org.example.civic.entity.Suggestion;
import org.example.civic.repository.SuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuggestionServiceImpl implements SuggestionService {

    @Autowired
    private SuggestionRepository suggestionRepository;

    @Override
    public void saveSuggestion(SuggestionDto suggestionDto) {
        Suggestion suggestion = new Suggestion();

        suggestion.setUserName(suggestionDto.getUserName());
        suggestion.setEmail(suggestionDto.getEmail());
        suggestion.setPriorityArea(suggestionDto.getPriorityArea());
        suggestion.setImprovement(suggestionDto.getImprovement());

        suggestionRepository.save(suggestion);
    }
}
