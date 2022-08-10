package com.example.db14.service;

import com.example.db14.model.Doctor;
import com.example.db14.model.Patient;
import com.example.db14.model.Specialty;
import com.example.db14.model.Visit;
import com.example.db14.repository.DoctorRepository;
import com.example.db14.repository.PatientRepository;
import com.example.db14.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitService {

    final VisitRepository visitRepository;
    final PatientRepository patientRepository;
    final DoctorRepository doctorRepository;

    public void addVisit(Visit visit, Integer idPac, Integer idDoc) {
        Visit v = new Visit();
        Patient p = patientRepository.getById(idPac);
        Doctor d = doctorRepository.getById(idDoc);
        v.setDoctor(d);
        v.setPatient(p);
        v.setDate(visit.getDate());
        visitRepository.save(v);
    }


    public List<Visit> getAllVisitByCnpAndSpeciality(String cnp, Specialty specialty) {
        Patient patient = patientRepository.getByCnp(cnp);
        List<Visit> myLst = new ArrayList<Visit>();
        List<Doctor> doctors = doctorRepository.getAllBySpecialty(specialty);
        for (Doctor d : doctors) {
            myLst.addAll(visitRepository.getAllByPatientDoctor(patient, d));
        }
        return myLst;
    }

}
