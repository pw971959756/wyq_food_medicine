/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xd.wyq.food.medicine.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pengwei
 */
@Data
@Entity
@Table(name = "monitor_folder")
public class MonitorFolder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "folder_id")
    private Integer folderId;
    @Column(name = "folder_name")
    private String folderName;
    @Column(name = "folder_status")
    private Integer folderStatus;
    @Basic(optional = false)
    @Column(name = "creation_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;
    @Column(name = "creation_by")
    private Integer creationBy;
    @Column(name = "last_update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateTime;
    @Column(name = "last_update_by")
    private Integer lastUpdateBy;
    @Column(name = "is_delete")
    private Integer isDelete;

}
