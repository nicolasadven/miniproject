package com.example.med_id.model;

import javax.persistence.*;

public class MenuRole extends CommonEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long Id;

    @ManyToMany
    @JoinColumn(name = "menu_id", insertable = false, updatable = false)
    public Menu menu;
    @Column(name = "menu_id", length = 20, nullable = true)
    private String MenuId;

    @ManyToMany
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    public Role role;
    @Column(name = "role_id", length = 50, nullable = true)
    private String RoleId;


}
