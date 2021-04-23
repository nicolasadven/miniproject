package com.example.med_id.model;

import javax.persistence.*;

@Entity
@Table(name = "m_menu")
public class Menu extends CommonEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long Id;

    @Column(name = "nama", length = 20, nullable = true)
    private String Nama;

    @Column(name = "url", length = 50, nullable = true)
    private String Url;

    @Column(name = "parent_id", nullable = true)
    private Long ParentId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Long getParentId() {
        return ParentId;
    }

    public void setParentId(Long parentId) {
        ParentId = parentId;
    }
}
