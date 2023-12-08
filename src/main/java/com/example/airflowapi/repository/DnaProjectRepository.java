package com.example.airflowapi.repository;

import com.example.airflowapi.model.DnaProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DnaProjectRepository extends JpaRepository<DnaProject, Integer> {
}
