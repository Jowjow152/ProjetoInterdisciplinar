package usjt.br.Projeto_PI_2020.controller;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import usjt.br.Projeto_PI_2020.model.Leitura;
import usjt.br.Projeto_PI_2020.service.LeituraService;

@Controller
public class EstacaoController {
	
	@Autowired
	LeituraService leituraService;
	
	@GetMapping("/incluir")
	public ModelAndView previsaoDoTempo() {
		ModelAndView mv = new ModelAndView("incluir");
		List<Leitura> leituras = leituraService.listarTodos();
		mv.addObject(new Leitura());
		mv.addObject("leituras", leituras);
		return mv;

	}
	
	@PostMapping("/incluir")
	public String salvar(Leitura leitura) {
		leitura.setTempo(LocalDateTime.now());
		leituraService.salvar(leitura);
		return "redirect:/incluir";
	}
}
