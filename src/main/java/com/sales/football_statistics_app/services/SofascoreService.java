package com.sales.football_statistics_app.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sales.football_statistics_app.dtos.TeamStatsDTO;
import com.sales.football_statistics_app.models.PregameFormModel;
import com.sales.football_statistics_app.models.ResponseModel;
import com.sales.football_statistics_app.models.TeamsModel;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class SofascoreService {
    @Autowired
    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    private final String API_HOST = "sofascore.p.rapidapi.com";
    private final String API_KEY = "9f7cb6c4e3msh2c3610f5629bb39p14e2cejsn02c95c403107";

    public TeamStatsDTO getTeamStats(long teamId) throws Exception {
        String url = "https://sofascore.p.rapidapi.com/teams/detail?teamId=" + teamId;

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", API_HOST);
        headers.set("X-RapidAPI-Key", API_KEY);

        ResponseEntity<String> resp = restTemplate.exchange(
                url, HttpMethod.GET, new HttpEntity<>(headers), String.class);

        ResponseModel wrapper = objectMapper.readValue(resp.getBody(), ResponseModel.class);
        TeamsModel team = wrapper.getTeam();
        PregameFormModel p = team.getPregameForm();
        if (p == null) {
            throw new IllegalStateException("PregameFormModel não encontrado para o timeId: " + teamId);
        }

        return new TeamStatsDTO(p.getAvgRating(), p.getPosition());
    }
}
