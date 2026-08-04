package com.spark.patient_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spark.patient_service.dto.PatientResponseDTO;
import com.spark.patient_service.mapper.PatientMapper;
import com.spark.patient_service.model.Patient;
import com.spark.patient_service.repository.PatientRepository;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();
       List<PatientResponseDTO> patientResponseDTOs = patients.stream()
                                                                .map(PatientMapper::toDTO).toList();
        return patientResponseDTOs;
    }
}