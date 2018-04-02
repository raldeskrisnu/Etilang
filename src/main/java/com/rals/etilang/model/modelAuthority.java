package com.rals.etilang.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "AUTHORITY")
public class modelAuthority {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authority_seq")
    @SequenceGenerator(name = "authority_seq", sequenceName = "authority_seq", allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 50, columnDefinition="VARCHAR")
    @NotNull
    private modelAuthorityName name;

    @ManyToMany(mappedBy = "authorities", fetch = FetchType.LAZY)
    private List<modelUserManagement> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public modelAuthorityName getName() {
        return name;
    }

    public void setName(modelAuthorityName name) {
        this.name = name;
    }

    public List<modelUserManagement> getUsers() {
        return users;
    }

    public void setUsers(List<modelUserManagement> users) {
        this.users = users;
    }
}
