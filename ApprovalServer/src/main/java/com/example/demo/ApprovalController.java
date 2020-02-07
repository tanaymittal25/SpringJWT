package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(method= {RequestMethod.POST, RequestMethod.GET})
public class ApprovalController 
{
	@RequestMapping("/approve")
	public String approve()
	{
		return "approve.html";
	}
}
