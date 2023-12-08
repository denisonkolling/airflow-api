package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ab_view_menu")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViewMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "ab_view_menu_id")
    @SequenceGenerator(name = "ab_view_menu_id", sequenceName = "ab_view_menu_id_seq", allocationSize = 1)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "viewMenu")
    private List<PermissionAndViewMenuMapping> permissionAndViewMenuMappings;

}
