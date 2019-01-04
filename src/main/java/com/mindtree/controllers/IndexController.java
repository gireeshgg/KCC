package com.mindtree.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.Player;
import com.mindtree.entity.Team;
import com.mindtree.entity.Types;
import com.mindtree.exceptions.ServiceException;
import com.mindtree.service.TeamService;
import com.mindtree.service.TypeService;
import com.mindtree.service.impl.TeamServiceImpl;
import com.mindtree.service.impl.TypeServiceImpl;

@Controller
public class IndexController {
	TypeService typeService=new TypeServiceImpl();
	
	@RequestMapping("/")
	public ModelAndView index( ){
		System.out.println("adding types");
		Types t=new Types(1,"Batsman");
		
			
			try {
				System.out.println(typeService.addType(t));
			} catch (ServiceException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(t);
		
		
		 t=new Types(2,"Bowler");
		try {
			typeService.addType(t);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 t=new Types(3,"Allrounder");
		try {
			typeService.addType(t);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("index");
	}
	
	@RequestMapping("/player")
	public ModelAndView indexp( ){		
		return new ModelAndView("Player");
	}
	
	
	
	@RequestMapping(value ="/team",method = RequestMethod.GET)
	public ModelAndView mymethodc( ){
		TeamService teamService=new TeamServiceImpl();
		System.out.println("available players entered");
		List<Player> avaPlayer=new ArrayList<>();
		try {
			avaPlayer=teamService.displayAvailable();			
			System.out.println(avaPlayer);
		} catch (ServiceException e) {
			return new ModelAndView("display","msg",e);

		}
		return new ModelAndView("Team","avaPlayer",avaPlayer);

	
	}
	
	
	@RequestMapping("/index")
	public ModelAndView indexi( ){
		return new ModelAndView("index");
	}
	
	
	
	

}
