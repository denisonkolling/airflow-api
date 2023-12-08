package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "ab_permission_view_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermissionAndRoleMapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "ab_permission_view_role")
    @SequenceGenerator(name = "ab_permission_view_role", sequenceName = "ab_permission_view_role_id_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne()
    @JoinColumn(name = "permission_view_id")
    private PermissionAndViewMenuMapping permissionView;
}

