package com.nt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nt.model.Booking;
import com.nt.pojo.BookingDao;
import com.nt.pojo.InvalidDestinationNameException;
import com.nt.repository.TravlingRepo;

@Controller
public class BookingContoller {
	@Autowired
	private TravlingRepo repo;
	
	@RequestMapping("/")    
	public String index()  
	{    
	return"index";    
	}    
	
	@RequestMapping(value="/save", method=RequestMethod.POST)    
	public ModelAndView save(@ModelAttribute BookingDao dest) throws InvalidDestinationNameException 
	{ 
		String regex="^[^\\d\\s]+$";
		
		if(!dest.getDestination().isEmpty() && dest.getDestination().matches(regex)) {
	List<Booking> booking=	 repo.findByDestination(dest.getDestination());
	System.out.println(booking);
	ModelAndView modelAndView = new ModelAndView();    
	modelAndView.setViewName("travelingreport");        
	modelAndView.addObject("index", booking);
	return modelAndView;    
		}
		else {
			throw new InvalidDestinationNameException ("the destination which you have entered is invalid");
		}
	}    
	
	 

	
	 }
	


