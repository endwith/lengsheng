package com.ptteng.model;

import java.io.Serializable;

public class RoleManage implements Serializable {
    @Override
    public String toString() {
        return "RoleManage{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", founder='" + founder + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", modifier='" + modifier + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }

    private Long id;

    private String role;

    private String founder;

    private Long createAt;

    private Long updateAt;

    private String modifier;

    private String authority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    public RoleManage() {
    }

    public RoleManage( String role, String founder, Long createAt, Long updateAt, String modifier, String authority) {
        this.role = role;
        this.founder = founder;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.modifier = modifier;
        this.authority = authority;
    }
}