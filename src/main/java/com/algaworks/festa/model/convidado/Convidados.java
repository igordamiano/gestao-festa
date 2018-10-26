package com.algaworks.festa.model.convidado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.festa.model.Convidado;

@Repository
public class Convidados {
	
	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();
	
	
	static {
		
		LISTA_CONVIDADOS.add(new Convidado("João", 1));
		LISTA_CONVIDADOS.add(new Convidado("Maria", 3));
		LISTA_CONVIDADOS.add(new Convidado("Antonio", 5));
		
	}
	
	public List<Convidado> todos(){
		return Convidados.LISTA_CONVIDADOS;
	}
	
	public void adicionar (Convidado convidado) {
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}
	

}
