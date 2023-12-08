package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "dna_project_user_dag")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DnaProjectUserAndDagMapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "dna_project_user_dag_role")
    @SequenceGenerator(name = "dna_project_user_dag_role", sequenceName = "dna_project_user_dag_id_seq", allocationSize = 1)
    private Integer id;

//    private Integer permissionViewId; private Integer roleId;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "dag_id")
    private Dag dag;

    @OneToMany(mappedBy = "dnaProjectUserAndDagMapping", cascade = CascadeType.ALL)
    private List<DnaProjectAndUserMapping> dnaProjectUserMappings;
}
