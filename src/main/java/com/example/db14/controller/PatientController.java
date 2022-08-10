package com.example.db14.controller;

import com.example.db14.model.Doctor;
import com.example.db14.model.Patient;
import com.example.db14.model.Specialty;
import com.example.db14.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/patients/all")
    public List<Patient> getAllPatients() { return patientService.getAllPatients();}

    @PostMapping(path="/patients/addpatient/")
    public void addPatients(@RequestBody Patient patient) {patientService.addPatients(patient);
    }

    @GetMapping("/patients/{cnp}")
    public Patient getByCnp(@PathVariable(value ="cnp") String cnp){
        return patientService.getByCnp(cnp);

}
    }
