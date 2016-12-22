package com.mvk.zjcms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvk.zjcms.model.SysWebsiteMenu;
import com.mvk.zjcms.service.SysWebsiteMenuService;
/**
 * 
 * @description mvc主函数入口
 * @author ldw
 * @datetime 2016年12月8日 下午4:20:05
 */
@EnableAutoConfiguration
@Controller
public class MainController {

	private static Logger log = LoggerFactory.getLogger(MainController.class);
	
	/**
	 * 首页
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		return "/index";
	}
	/**
	 * 跳转到登录页
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/sceutry/toLogin", method=RequestMethod.GET)
	public String toLogin(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "/sceutry/login";
	}
	/**
	 * 跳转到注册页
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/sceutry/toRegister", method=RequestMethod.GET)
	public String toRegister(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "/sceutry/register";
	}
}
