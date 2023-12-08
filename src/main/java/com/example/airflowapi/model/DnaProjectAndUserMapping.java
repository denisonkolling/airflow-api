package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "dna_project_user", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "user_dag_id", "dna_project_id" }) })
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DnaProjectAndUserMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "dna_project_user_seq")
    @SequenceGenerator(name = "dna_project_user_seq", sequenceName = "dna_project_user_id_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_dag_id")
    private DnaProjectUserAndDagMapping dnaProjectUserAndDagMapping;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dna_project_id")
    private DnaProject dnaProject;

}
