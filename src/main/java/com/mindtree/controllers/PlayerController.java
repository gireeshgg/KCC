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

import com.mindtree.entity.Player;
import com.mindtree.exceptions.ServiceException;
import com.mindtree.service.PlayerService;
import com.mindtree.service.TypeService;
import com.mindtree.service.impl.PlayerServiceImpl;
import com.mindtree.service.impl.TypeServiceImpl;

@RestController
public class PlayerController {
	
	
	PlayerService playerService=new PlayerServiceImpl();
	TypeService typeService=new TypeServiceImpl();
	String message;
		
	
	@RequestMapping(value="/addPlayer",method=RequestMethod.POST)
	public ModelAndView addplayers(@ModelAttribute("player") @Validated Player player,BindingResult bindingResult,Model model,HttpServletRequest request){
		
		
		System.out.println(request.getParameter("type"));
		try {
			player.setType(typeService.getType(Integer.parseInt(request.getParameter("type"))));
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (ServiceException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(player);
		try {
			message=playerService.addPlayer(player);
		} catch (ServiceException e) {
			return new ModelAndView("display","msg",e);
		}
		System.out.println("display");
		return new ModelAndView("display","msg",message);
	}
	@RequestMapping(value = "/showPlayers",method = RequestMethod.GET)
	public ModelAndView mymethoda( ){
		List<Player> playerlist;
		try {
			playerlist = playerService.displayAll();
			System.out.println(playerlist);
		} catch (ServiceException e) {
			return new ModelAndView("display","msg",e);
		}
		return new ModelAndView("displayplayer","playerList",playerlist);
	}




}
