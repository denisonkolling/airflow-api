package com.example.airflowapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "ab_user_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "user_role_mapping_seq")
    @SequenceGenerator(name = "user_role_mapping_seq", sequenceName = "ab_user_role_id_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;

}

