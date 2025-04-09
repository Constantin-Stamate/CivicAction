package org.example.civic.service;

import org.example.civic.dto.LawDto;
import org.example.civic.entity.Law;

import java.util.List;

public interface LawService {
    void saveLaw(LawDto lawDto);
    List<Law> getAllLaws();
}