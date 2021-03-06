package com.ptteng.model;

import java.io.Serializable;

public class ModuleManage implements Serializable {
    private Long id;

    private String moduleName;

    private Long parentId;

    private String moduleUrl;

    private String type;

    private Long updateAt;

    @Override
    public String toString() {
        return "ModuleManage{" +
                "id=" + id +
                ", moduleName='" + moduleName + '\'' +
                ", parentId=" + parentId +
                ", moduleUrl='" + moduleUrl + '\'' +
                ", type='" + type + '\'' +
                ", updateAt=" + updateAt +
                ", createAt=" + createAt +
                ", modifier='" + modifier + '\'' +
                ", founder='" + founder + '\'' +
                ", deleteStatus=" + deleteStatus +
                '}';
    }

    private Long createAt;

    private String modifier;

    private String founder;

    private Integer deleteStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl == null ? null : moduleUrl.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}