package kr.pe.cortez.msa.service1.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="/config")
public class ConfigClientController {
	
	@Autowired
	ConfigClientService configClientService;
	
	@GetMapping(value="/example-property")
	public String exampleProperty() {
		return configClientService.exampleProperty();
	}
	
	@GetMapping(value="/example-password")
	public String examplePassword() {
		return configClientService.examplePassword();
	}
}