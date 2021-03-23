package com.ltts.DetailInfo.Controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.DetailInfo.model.Player;
import com.ltts.DetailInfo.model.Team;
import com.ltts.DetailInfo.model.Team;

@RestController
public class DetailController {
	
	@Autowired
	RestTemplate rt;
	
	
	@RequestMapping("/detail")
	public List<Team> getExternalTeam(){

		ResponseEntity<Team[]> response =  rt.getForEntity("http://localhost:8080/teams/",Team[].class);
				Team[] teams = response.getBody();
				List<Team> lt=Arrays.asList(teams);

				return lt;
	}
	@RequestMapping("/details")
	public List<Player> getExternalPlayer(){

		ResponseEntity<Player[]> response =  rt.getForEntity("http://localhost:8088/player/",Player[].class);
				Player[] player = response.getBody();
				List<Player> lt=Arrays.asList(player);

				return lt;
	}
	
	

}