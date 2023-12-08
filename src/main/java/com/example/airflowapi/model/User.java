package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ab_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "ab_user_id_seq", allocationSize = 1)
    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String password = "pbkdf2:sha256:150000$5q6JkIVM$a5a47be7a11692c4950a4b5ccf4db02281c69a37158f5160f17a0b63fa816719";
    private Boolean active;
    private String email;
    private Date lastLogin;
    private Integer loginCount;
    private Integer failLoginCount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn = new Date();

    private Date changedOn;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserRoleMapping> roleMaping;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<DnaProjectUserAndDagMapping> dnaProjectUserAndDagMapping;
}