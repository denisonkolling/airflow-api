package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ab_permission")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "ab_permission_id")
    @SequenceGenerator(name = "ab_permission_id", sequenceName = "ab_permission_id_seq", allocationSize = 1)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "permission", cascade = CascadeType.ALL)
    private List<PermissionAndViewMenuMapping> permissionAndViewMenuMappings;

}
