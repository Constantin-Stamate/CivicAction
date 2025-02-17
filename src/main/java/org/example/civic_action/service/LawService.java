package org.example.civic_action.service;

import org.example.civic_action.dto.LawDto;
import org.example.civic_action.entity.Law;

import java.util.List;

public interface LawService {
    void saveLaw(LawDto lawDto);
    List<Law> getAllLaws();
}