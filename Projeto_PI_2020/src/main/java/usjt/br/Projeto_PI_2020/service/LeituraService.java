package usjt.br.Projeto_PI_2020.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usjt.br.Projeto_PI_2020.model.Leitura;
import usjt.br.Projeto_PI_2020.repository.LeituraRepository;

@Service
public class LeituraService {

	@Autowired
	LeituraRepository leituraRepo;
	
	public void salvar(Leitura leitura) {
		leituraRepo.save(leitura);
	}
	
	public List<Leitura> listarTodos(){
		return leituraRepo.findAll();
	}
	
}
