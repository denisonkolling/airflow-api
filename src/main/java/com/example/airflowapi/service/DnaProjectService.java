package com.example.airflowapi.service;

import com.example.airflowapi.dto.AirflowProjectResponseWrapperVO;
import com.example.airflowapi.dto.AirflowProjectV0;
import com.example.airflowapi.dto.AirflowProjectsByUserVO;
import com.example.airflowapi.dto.AirflowRetryDagV0;
import com.example.airflowapi.model.DnaProject;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DnaProjectService {

    List<AirflowProjectsByUserVO> getAllProjects(int offset, int limit);

    AirflowProjectV0 getByProjectId(String projectId);

    ResponseEntity<AirflowProjectResponseWrapperVO> createAirflowProject(AirflowProjectV0 dnaProject);

    ResponseEntity<AirflowProjectResponseWrapperVO> updateAirflowProject(AirflowProjectV0 dnaProject, String projectId);

    String getProjectId();

    ResponseEntity<DnaProject> createAirflowProject(DnaProject dnaProject);

    ResponseEntity<DnaProject> updateAirflowProject(DnaProject dnaProject, String projectId);

    String getProjectId(String projectId);

    List<String> getPermissions(String dagName, String userName);

    void updatePermisions(AirflowRetryDagV0 airflowRetryDagVo, String projectId, boolean defaultPermission);

}
