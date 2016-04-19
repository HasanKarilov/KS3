package com.springapp.mvc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hanaria on 4/17/16.
 */

@Entity
@Table(name = "positions")
public class Positions {
    @Id
    @Column(name = "positionId")
    private String positionId;

    @Column(name = "positionName")
    private String positionName;

    @Column(name = "positionGroup")
    private String positionGroup;

    @Column(name = "positionCategory")
    private String positionCategory;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionGroup() {
        return positionGroup;
    }

    public void setPositionGroup(String positionGroup) {
        this.positionGroup = positionGroup;
    }

    public String getPositionCategory() {
        return positionCategory;
    }

    public void setPositionCategory(String positionCategory) {
        this.positionCategory = positionCategory;
    }
}
