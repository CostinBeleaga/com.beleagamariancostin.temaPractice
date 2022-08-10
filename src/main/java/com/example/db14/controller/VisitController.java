package com.example.db14.controller;

import com.example.db14.model.Patient;
import com.example.db14.model.Specialty;
import com.example.db14.model.Visit;
import com.example.db14.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitController {

    @Autowired
    VisitService visitService;

    @PostMapping(path="/visits/addvisit/{idPat}/{idDoc}")
    public void addVisits(@RequestBody Visit visit, @PathVariable(value="idPat") Integer idPat, @PathVariable(value="idDoc") Integer idDoc) {visitService.addVisit(visit,idPat, idDoc);
    }

    @GetMapping(path="/visits/getallvisits/{cnp}/{specialty}")
    public List<Visit> getAllVisitByCnpAndSpeciality (@PathVariable(value="cnp") String cnp, @PathVariable(value="specialty") Specialty specialty) {return visitService.getAllVisitByCnpAndSpeciality(cnp, specialty);}
}
