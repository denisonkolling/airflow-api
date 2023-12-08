package com.example.airflowapi.dto;

import java.security.Permission;
import java.util.List;

public class ProjectUser {
    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private List<Permission> permissions;
}
