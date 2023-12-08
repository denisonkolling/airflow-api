package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "dna_project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DnaProject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "dna_project_id")
    @SequenceGenerator(name = "dna_project_id", sequenceName = "dna_project_id_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "project_id", length = 64, nullable = false, unique = true)
    private String projectId;
    @Column(name = "project_name", length = 64, nullable = true, unique = false)
    private String projectName;
    @Column(name = "project_description", length = 256, nullable = true, unique = false)
    private String projectDescription;
    @Column(name = "created_by", length = 64, nullable = false, unique = false)
    private String createdBy;
    @OneToMany(mappedBy = "dnaProject", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<DnaProjectAndUserMapping> dnaProjectUserMappings;

}
