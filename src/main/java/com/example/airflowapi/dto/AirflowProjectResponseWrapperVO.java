package com.example.airflowapi.dto;

import java.util.List;

public class AirflowProjectResponseWrapperVO {
    private String status;
    private AirflowProjectV0 data;
    private List<String> warnings;
    private List<String> errors;
}
