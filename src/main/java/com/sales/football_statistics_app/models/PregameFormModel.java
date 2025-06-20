package com.sales.football_statistics_app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PregameFormModel implements Serializable {
    private String avgRating;
    private int position;
    private String value;
    private List<String> form;

    public String getAvgRating() {
        return avgRating;
    }

    public List<String> getForm() {
        return form;
    }

    public void setForm(List<String> form) {
        this.form = form;
    }

    public void setAvgRating(String avgRating) {
        this.avgRating = avgRating;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
