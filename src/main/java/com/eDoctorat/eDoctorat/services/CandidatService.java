package com.eDoctorat.eDoctorat.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eDoctorat.eDoctorat.models.Candidat;
import com.eDoctorat.eDoctorat.repositories.CandidatRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;

    
    public List<Candidat> getAllCandidats() {
      return candidatRepository.findAll();
    }

    public Optional<Candidat> getCandidatById(Long id) {
      return candidatRepository.findById(id);
  }

    public Candidat insertCandidat(Candidat book) {
      return candidatRepository.save(book);
    }

    public Candidat updateCandidat(Candidat book,Long id) {
      Candidat existingBook = candidatRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Livre non trouvé avec ID : " + id));

      BeanUtils.copyProperties(book, existingBook, "id");

      candidatRepository.save(existingBook);
      return book;
    }



  public Optional<Candidat> getCandidatByName(String name) {
    Optional optional = Optional.empty();
    for (Candidat candidat : getAllCandidats()) {
        if (candidat.getNomCandidatAr().equals(name)) {
          optional = Optional.of(candidat);
            return optional;
        }
    }
      return optional;
  }

    
    
    public void deleteCandidatById(Long id) {
      candidatRepository.deleteById(id);
    }

    
  

  
}
