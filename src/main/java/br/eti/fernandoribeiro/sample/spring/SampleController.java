package br.eti.fernandoribeiro.sample.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public final class SampleController {

	@RequestMapping("/sendMessage")
	public ModelAndView sendMessage(
			@RequestParam("message") final String message) {
		final ModelAndView modelAndView = new ModelAndView(
				"/WEB-INF/jsp/confirmation.jsp");

		modelAndView.addObject("message", message);

		return modelAndView;
	}

}