package org.example.civic.service;

import org.example.civic.dto.LawDto;
import org.example.civic.entity.Law;
import org.example.civic.repository.LawRepository;
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