package com.sales.football_statistics_app.controllers;

import com.sales.football_statistics_app.dtos.SingleTeamDTO;
import com.sales.football_statistics_app.dtos.TeamStatsDTO;
import com.sales.football_statistics_app.models.ResponseModel;
import com.sales.football_statistics_app.models.TeamsModel;
import com.sales.football_statistics_app.services.SofascoreService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class TeamsControllers {
    //Metodo get de exemplo em uma API de conselhos
    @GetMapping("/teams")
    public ResponseEntity<String> getTeam(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.adviceslip.com/advice";

        ResponseEntity<String> response =
                restTemplate.getForEntity(url, String.class);
        return response;
    }

    @Autowired
    private SofascoreService service;

    //Método GET para consumir informações seletas de um time pelo seu ID na API
    @GetMapping("/teams/{id}/stats")
    public SingleTeamDTO stats(@PathVariable("id") long id) throws Exception{
        return service.getTeamStats(id);
    }

    //Método GET para retornar informações de dois times pelos seus IDs
    @GetMapping("/teams/{id1}/{id2}/stats")
    public TeamStatsDTO twostats(@PathVariable long id1, @PathVariable long id2) throws Exception{
        return service.getTwoTeamStats(id1, id2);
    }
}
