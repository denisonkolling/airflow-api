package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dag")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dag implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String dagId;
    private Boolean isPaused;
    private Boolean isSubdag;
    private Boolean isActive;
    private Date lastSchedulerRun;
    private Date lastPickled;
    private Date lastExpired;
    private Boolean schedulerLock;
    private Integer pickleId;
    private String fileloc;
    private String owners;
    private String description;
    private String defaultView;
    private String scheduleInterval;
    private String rootDagId;

    @OneToMany(mappedBy = "dag", cascade = CascadeType.ALL)
    private List<DnaProjectUserAndDagMapping> dnaProjectUserAndDagMapping;
}
