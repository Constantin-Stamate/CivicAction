package org.example.civic_action.service;

import org.example.civic_action.dto.LawDto;
import org.example.civic_action.entity.Law;
import org.example.civic_action.repository.LawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawServiceImpl implements LawService {

    @Autowired
    private LawRepository lawRepository;

    @Override
    public void saveLaw(LawDto lawDto) {
        Law law = new Law();
        law.setUserName(lawDto.getUserName());
        law.setUserGender(lawDto.getUserGender());
        law.setLawDescription(lawDto.getLawDescription());
        law.setLawCategory(lawDto.getLawCategory());

        lawRepository.save(law);
    }

    @Override
    public List<Law> getAllLaws() {
        return lawRepository.findAll();
    }
}