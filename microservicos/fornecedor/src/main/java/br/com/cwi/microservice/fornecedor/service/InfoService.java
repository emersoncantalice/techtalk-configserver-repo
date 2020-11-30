package br.com.cwi.microservice.fornecedor.service;

import br.com.cwi.microservice.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cwi.microservice.fornecedor.model.InfoFornecedor;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		InfoFornecedor infoFornecedor = infoRepository.findByEstado(estado);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(infoFornecedor.toString());
		return infoFornecedor;
	}
}
