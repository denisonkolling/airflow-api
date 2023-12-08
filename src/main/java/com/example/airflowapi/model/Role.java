package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ab_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "role_seq")
    @SequenceGenerator(name = "role_seq", sequenceName = "ab_role_id_seq", allocationSize = 1)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "role")
    private List<UserRoleMapping> roleMaping;

    @OneToMany(mappedBy = "role")
    private List<PermissionAndRoleMapping> permissionAndRoleMapping;
}
