package com.mindtree.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.Team;
import com.mindtree.exceptions.ServiceException;
import com.mindtree.service.PlayerService;
import com.mindtree.service.TeamService;
import com.mindtree.service.impl.PlayerServiceImpl;
import com.mindtree.service.impl.TeamServiceImpl;

@RestController
public class TeamController {
	
	TeamService teamService= new TeamServiceImpl();
	PlayerService playerService=new PlayerServiceImpl();
	String message;
		
	
	@RequestMapping(value="/addTeam",method=RequestMethod.POST)
	public ModelAndView addteam(@ModelAttribute("team") @Validated Team team,BindingResult bindingResult,Model model,HttpServletRequest request){
		
				
		System.out.println(team);
		try {
			message=teamService.addTeam(team);
		} catch (ServiceException e) {
			return new ModelAndView("display","msg",e);
		}
		System.out.println("display");
		return new ModelAndView("display","msg",message);
	}
	
	
	@RequestMapping(value = "/showTeams",method = RequestMethod.GET)
	public ModelAndView mymethoda( ){
		System.out.println("team display");
		List<Team> teamlist;
		try {
			System.out.println("team display in");

			teamlist = teamService.displayAll();
			System.out.println(teamlist);
		} catch (ServiceException e) {
			return new ModelAndView("display","msg",e);
		}
		return new ModelAndView("displayTeam","teamList",teamlist);
	}
	
	

}
