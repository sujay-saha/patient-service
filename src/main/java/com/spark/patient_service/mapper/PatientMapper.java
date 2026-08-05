package com.spark.patient_service.mapper;

import java.time.LocalDate;

import com.spark.patient_service.dto.PatientRequestDTO;
import com.spark.patient_service.dto.PatientResponseDTO;
import com.spark.patient_service.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(patient.getId().toString());
        dto.setName(patient.getName());
        dto.setEmail(patient.getEmail());
        dto.setAddress(patient.getAddress());
        dto.setDateOfBirth(patient.getDateOfBirth().toString());
        return dto;
    }

    public static Patient toModel(PatientRequestDTO PatientRequestDTO){
        Patient newPatient = new Patient();
        newPatient.setName(PatientRequestDTO.getName());
        newPatient.setEmail(PatientRequestDTO.getEmail());
        newPatient.setAddress(PatientRequestDTO.getAddress());
        newPatient.setDateOfBirth(LocalDate.parse(PatientRequestDTO.getDateOfBirth()));
        newPatient.setRegisteredDate(LocalDate.parse(PatientRequestDTO.getRegisteredDate()));
        return newPatient;
    }
}
