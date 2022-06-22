package com.shopcar.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberControllerImpl implements MemberController {

	@RequestMapping(value = "/member/memjoin", method = RequestMethod.GET)
	public ModelAndView memjoin() {

		ModelAndView mav = new ModelAndView("/member/memjoin");

		return mav;

	}

}
