package com.example.airflowapi.dto;

import java.util.List;

public class AirflowProjectsByUserVO {

    private String projectId;
    private String projectName;
    private String projectDescription;
    private String createdBy;
    private boolean isOwner;
    private List<AirflowDagProjectResponseVo> dags;


}
