// src/main/java/com/sales/football_statistics_app/dtos/TeamStatsDTO.java
package com.sales.football_statistics_app.dtos;

import java.util.List;

public class SingleTeamDTO {
    private final String avgRating1;
    private final int position1;
    private final String name;

    public SingleTeamDTO(String name, String avgRating, int position) {
        this.avgRating1 = avgRating;
        this.position1 = position;
        this.name = name;
    }

    // Getters
    public String getAvgRating1() {
        return avgRating1;
    }

    public String getName() {
        return name;
    }

    public int getPosition1() {
        return position1;
    }

}

