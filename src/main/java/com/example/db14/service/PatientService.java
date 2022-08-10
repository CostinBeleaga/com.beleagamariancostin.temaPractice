package com.example.db14.service;

import com.example.db14.model.Doctor;
import com.example.db14.model.Patient;
import com.example.db14.model.Specialty;
import com.example.db14.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    final PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public List<Patient> getAllByDoctor(Doctor doctor){
        return patientRepository.getAllByDoctor(doctor);
    }

    public void addPatients(Patient patient){
        patientRepository.save(patient);
    }

    public Patient getByCnp(String cnp){
        return patientRepository.getByCnp(cnp);
    }
}
