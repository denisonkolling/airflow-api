package com.example.airflowapi.service;

import com.example.airflowapi.dto.*;
import com.example.airflowapi.model.DnaProject;
import com.example.airflowapi.repository.DnaProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DnaProjectServiceImpl implements DnaProjectService {

    @Autowired
    private DnaProjectRepository dnaProjectRepository;

    @Override
    public List<AirflowProjectsByUserVO> getAllProjects(int offset, int limit) {
        return null;
    }

    @Override
    public AirflowProjectV0 getByProjectId(String projectId) {
        return null;
    }

    @Override
    public ResponseEntity<AirflowProjectResponseWrapperVO> createAirflowProject(AirflowProjectV0 dnaProject) {
        return null;
    }

    @Override
    public ResponseEntity<AirflowProjectResponseWrapperVO> updateAirflowProject(AirflowProjectV0 dnaProject, String projectId) {
        return null;
    }

    @Override
    public String getProjectId() {
        return null;
    }

    @Override
    public ResponseEntity<DnaProject> createAirflowProject(DnaProject dnaProject) {
        return null;
    }

    @Override
    public ResponseEntity<DnaProject> updateAirflowProject(DnaProject dnaProject, String projectId) {
        return null;
    }

    @Override
    public String getProjectId(String projectId) {
        return null;
    }

    @Override
    public List<String> getPermissions(String dagName, String userName) {
        return null;
    }

    @Override
    public void updatePermisions(AirflowRetryDagV0 airflowRetryDagVo, String projectId, boolean defaultPermission) {

    }
}
