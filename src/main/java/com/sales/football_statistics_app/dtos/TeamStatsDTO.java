// src/main/java/com/sales/football_statistics_app/dtos/TeamStatsDTO.java
package com.sales.football_statistics_app.dtos;

import java.util.List;

public class TeamStatsDTO {
    private final String name1;
    private final String avgRating1;
    private final int position1;
    private final String name2;
    private final String avgRating2;
    private final int position2;

    public TeamStatsDTO(String name1, String avgRating, int position, String name2, String avgRating2, int position2) {
        this.avgRating1 = avgRating;
        this.name1 = name1;
        this.name2 = name2;
        this.position1 = position;
        this.position2 = position2;
        this.avgRating2 = avgRating2;
    }

    // Getters
    public String getAvgRating1() {
        return avgRating1;
    }

    public int getPosition1() {
        return position1;
    }

    public String getAvgRating2() {
        return avgRating2;
    }

    public int getPosition2() {
        return position2;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }
}
