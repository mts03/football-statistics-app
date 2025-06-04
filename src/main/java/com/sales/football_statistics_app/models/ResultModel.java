package com.sales.football_statistics_app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultModel {
    private TeamsModel entity;

    public TeamsModel getEntity() {
        return entity;
    }

    public void setEntity(TeamsModel entity) {
        this.entity = entity;
    }
}
