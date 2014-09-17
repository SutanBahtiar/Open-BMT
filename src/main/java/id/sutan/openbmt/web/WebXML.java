package id.sutan.openbmt.web;

import id.sutan.openbmt.MainApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/* 
 * Sep 16, 2014 9:19:43 AM created by : sutan
 */

public class WebXML extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		// TODO Auto-generated method stub
		return application.sources(MainApplication.class);
	}

}
