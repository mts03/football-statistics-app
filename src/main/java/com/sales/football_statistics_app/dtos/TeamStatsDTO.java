// src/main/java/com/sales/football_statistics_app/dtos/TeamStatsDTO.java
package com.sales.football_statistics_app.dtos;

import java.util.List;

public class TeamStatsDTO {
    private final String name1;
    private final String avgRating1;
    private final List<String> form1;
    private final String name2;
    private final String avgRating2;
    private final List<String> form2;
    private final String tournament1;
    private final String tournament2;

    public TeamStatsDTO(String name1, String tournament1, String avgRating, List<String> form1,
                        String name2, String tournament2, String avgRating2, List<String> form2) {
        this.avgRating1 = avgRating;
        this.name1 = name1;
        this.name2 = name2;
        this.form1 = form1;
        this.form2 = form2;
        this.avgRating2 = avgRating2;
        this.tournament1 = tournament1;
        this.tournament2 = tournament2;
    }

    // Getters
    public String getAvgRating1() {
        return avgRating1;
    }

    public String getTournament1() {
        return tournament1;
    }

    public String getTournament2() {
        return tournament2;
    }

    public List<String> getForm1() {
        return form1;
    }

    public String getAvgRating2() {
        return avgRating2;
    }

    public List<String> getForm2() {
        return form2;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }
}
