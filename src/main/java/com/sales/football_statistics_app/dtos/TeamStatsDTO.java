// src/main/java/com/sales/football_statistics_app/dtos/TeamStatsDTO.java
package com.sales.football_statistics_app.dtos;

import java.util.List;

public class TeamStatsDTO {
    private final String avgRating;
    private final int position;

    public TeamStatsDTO(String avgRating, int position) {
        this.avgRating = avgRating;
        this.position = position;
    }

    // Getters
    public String getAvgRating() {
        return avgRating;
    }

    public int getPosition() {
        return position;
    }

}
