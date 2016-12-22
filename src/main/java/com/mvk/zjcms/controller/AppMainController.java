package com.mvk.zjcms.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @description
 * @author ldw
 * @datetime 2016年12月12日 下午2:30:01
 */
@EnableAutoConfiguration
@RestController
public class AppMainController {

	private static String appId= "7ReHxZUNWZUko0ZgV7Go";
	private static String appSecrect = "QgjQCPdtftLvyg1ZGwkHkO1TgbDfVbqS";
	
	private static String accessToken = "http://www.oschina.net/action/openapi/token";
	
	/**
	 * osc咨询list
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping("/osc/news/list")
	public JSONObject loadOSC(HttpServletRequest request, HttpServletResponse response, Model model) {

		try {
			Document doc = Jsoup.connect("http://www.oschina.net/news/industry").get();
			doc.select("");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	/**
	 * osc咨询详情
	 * @param request
	 * @param response
	 * @param version
	 * @return
	 */
	@RequestMapping("/osc/news/detail/{version}")
	public JSONObject oscNewsDetail(HttpServletRequest request, HttpServletResponse response,
			@PathVariable String version) {
		return null;
	}
}
