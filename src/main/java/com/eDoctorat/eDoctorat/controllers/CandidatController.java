package com.eDoctorat.eDoctorat.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eDoctorat.hellowoeld.models.Candidat;
import com.eDoctorat.hellowoeld.services.CandidatService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;


@RestController

@RequestMapping("/api/candidat/")
public class CandidatController {

  @Autowired
  public CandidatService candidatService;

  @GetMapping
  public List<Candidat> getAllCandidats() {
    return candidatService.getAllCandidats();
  }
  @GetMapping("/{id}")
  public Optional<Candidat> getOneCandidat(@PathVariable Long id){  
    return candidatService.getCandidatById(id);
  }

  @GetMapping("/name/{name}")
  public Optional<Candidat> getOneCandidat(@PathVariable String name){  
    return candidatService.getCandidatByName(name);
  }


  @PostMapping
  public ResponseEntity<Candidat> InsertCandidat(@RequestBody Candidat book) {
      Candidat Book = candidatService.insertCandidat(book);
      return ResponseEntity.ok(Book);
  }

  @PutMapping("/{id}")
  public Candidat updateCandidat(@RequestBody Candidat book,@PathVariable Long id)
  {
        return candidatService.updateCandidat(book,id);
  }


  @DeleteMapping("/{id}")
  public String deleteCandidatById(@PathVariable Long id) {
      candidatService.deleteCandidatById(id);
      return "success delete";
  }

}
