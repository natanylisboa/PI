package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	
	
	
	public String form() {
		return " formEvento";
		
	}

}
