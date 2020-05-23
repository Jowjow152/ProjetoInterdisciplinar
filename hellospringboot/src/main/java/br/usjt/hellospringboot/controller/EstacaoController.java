package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Estacao;
import br.usjt.hellospringboot.repository.EstacaoRepository;

@Controller
public class EstacaoController {

	@Autowired
	private EstacaoRepository estacaoRepo;
	


@GetMapping("/lista.html")
public ModelAndView lista() {
	ModelAndView mv = new ModelAndView("lista");
	List<Estacao> estacoes = estacaoRepo.findAll();
	mv.addObject(new Estacao());
	mv.addObject("lista", estacoes);
	return mv;
}

@PostMapping("/estacaos")
public String salvar(Estacao estacao) {
	estacaoRepo.save(estacao);
	return "redirect:/estacoes";
}
}


