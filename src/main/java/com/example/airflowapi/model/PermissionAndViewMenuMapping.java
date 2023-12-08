package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ab_permission_view")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermissionAndViewMenuMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "ab_permission_view_id")
    @SequenceGenerator(name = "ab_permission_view_id", sequenceName = "ab_permission_view_id_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "permission_id")
    private Permission permission;

    @ManyToOne()
    @JoinColumn(name = "view_menu_id")
    private ViewMenu viewMenu;

    @OneToMany(mappedBy = "permissionView")
    private List<PermissionAndRoleMapping> permissionAndRoleMapping;
}
