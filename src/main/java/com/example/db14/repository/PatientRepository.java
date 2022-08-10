package com.example.db14.repository;

import com.example.db14.model.Doctor;
import com.example.db14.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    List<Patient> findAll();
    Patient getById(Integer id);

    List<Patient> getAllByDoctor(Doctor doctor);
    Patient getByCnp(String cnp);
}
