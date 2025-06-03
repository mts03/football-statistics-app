package com.sales.football_statistics_app.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sales.football_statistics_app.dtos.SingleTeamDTO;
import com.sales.football_statistics_app.dtos.TeamStatsDTO;
import com.sales.football_statistics_app.models.PregameFormModel;
import com.sales.football_statistics_app.models.ResponseModel;
import com.sales.football_statistics_app.models.TeamsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SofascoreService {
    @Autowired
    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    private final String API_HOST = "sofascore.p.rapidapi.com";
    private final String API_KEY = "9f7cb6c4e3msh2c3610f5629bb39p14e2cejsn02c95c403107";

    public SingleTeamDTO getTeamStats(long team1Id) throws Exception {
        String url1 = "https://sofascore.p.rapidapi.com/teams/detail?teamId=" + team1Id;

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", API_HOST);
        headers.set("X-RapidAPI-Key", API_KEY);

        ResponseEntity<String> resp1 = restTemplate.exchange(
                url1, HttpMethod.GET, new HttpEntity<>(headers), String.class);

        //Time 1
        ResponseModel wrapper1 = objectMapper.readValue(resp1.getBody(), ResponseModel.class);
        TeamsModel team1 = wrapper1.getTeam();
        PregameFormModel p1 = wrapper1.getPregameForm();

        return new SingleTeamDTO(team1.getName(), p1.getAvgRating(), p1.getPosition());
    }

    public TeamStatsDTO getTwoTeamStats(long team1Id, long team2Id) throws JsonProcessingException {
        String url1 = "https://sofascore.p.rapidapi.com/teams/detail?teamId=" + team1Id;
        String url2 = "https://sofascore.p.rapidapi.com/teams/detail?teamId=" + team2Id;

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", API_HOST);
        headers.set("X-RapidAPI-Key", API_KEY);

        ResponseEntity<String> resp1 = restTemplate.exchange(
                url1, HttpMethod.GET, new HttpEntity<>(headers), String.class);

        ResponseEntity<String> resp2 = restTemplate.exchange(
                url2, HttpMethod.GET, new HttpEntity<>(headers), String.class);

        //Time 1
        ResponseModel wrapper1 = objectMapper.readValue(resp1.getBody(), ResponseModel.class);
        TeamsModel team1 = wrapper1.getTeam();
        PregameFormModel p1 = wrapper1.getPregameForm();
        //Time 2
        ResponseModel wrapper2 = objectMapper.readValue(resp2.getBody(), ResponseModel.class);
        TeamsModel team2 = wrapper2.getTeam();
        PregameFormModel p2 = wrapper2.getPregameForm();

        return new TeamStatsDTO(team1.getName(), p1.getAvgRating(), p1.getPosition(), team2.getName(), p2.getAvgRating(), p2.getPosition());
    }
}
