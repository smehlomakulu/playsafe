/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playsafe.resource.config;

import com.playsafe.resource.ConversionResource;
import javax.annotation.PostConstruct;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 *
 * @author shadrack
 */
@Component
public class JerseyConfig extends ResourceConfig {
	
        public JerseyConfig() {
	}
	
	@PostConstruct
	public void setUp() {
            register(ConversionResource.class);
	}
}
