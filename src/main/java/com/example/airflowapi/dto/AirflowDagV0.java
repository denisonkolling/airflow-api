package com.example.airflowapi.dto;

import java.util.List;

public class AirflowDagV0 {
    private String dagContent;
    private String dagName;
    private boolean active;
    private List<ProjectUser> collaborators;
}
