/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "system")
@XmlRootElement
public class System implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @Column(name = "sec_user_id")
    private long secUserId;
    @Column(name = "description")
    private String description;
    @Column(name = "enable")
    private Short enable;
    @Column(name = "version")
    private Integer version;
    @Column(name = "min_version")
    private Integer minVersion;
    @Column(name = "create_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecUser secUser;

    public System() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(long secUserId) {
        this.secUserId = secUserId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getEnable() {
        return enable;
    }

    public void setEnable(Short enable) {
        this.enable = enable;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(Integer minVersion) {
        this.minVersion = minVersion;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof System)) return false;
        System system = (System) o;
        return getId() == system.getId() && getSecUserId() == system.getSecUserId() && Objects.equals(getDescription(), system.getDescription()) && Objects.equals(getEnable(), system.getEnable()) && Objects.equals(getVersion(), system.getVersion()) && Objects.equals(getMinVersion(), system.getMinVersion()) && Objects.equals(getCreateDatetime(), system.getCreateDatetime()) && Objects.equals(getSecUser(), system.getSecUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSecUserId(), getDescription(), getEnable(), getVersion(), getMinVersion(), getCreateDatetime(), getSecUser());
    }

    @Override
    public String toString() {
        return "System{" +
                "id=" + id +
                ", secUserId=" + secUserId +
                ", description='" + description + '\'' +
                ", enable=" + enable +
                ", version=" + version +
                ", minVersion=" + minVersion +
                ", createDatetime=" + createDatetime +
                ", secUser=" + secUser +
                '}';
    }
}
