package com.mvk.zjcms;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mvk.framework.interecptor.EncodeHandler;
/**
 * 
 * @description 拦截器注册配置
 * @author ldw
 * @datetime 2016年12月9日 上午10:51:58
 */
@Configuration
public class HandlerConfiguration extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new EncodeHandler()).addPathPatterns("/**");
	}

}
