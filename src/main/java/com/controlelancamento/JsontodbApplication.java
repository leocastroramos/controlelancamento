package com.controlelancamento;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.controlelancamento.domain.ControleLancamento;
import com.controlelancamento.service.ControleLancamentoService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsontodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsontodbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ControleLancamentoService controleLancamentoService){
	    return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<ControleLancamento>> typeReference = new TypeReference<List<ControleLancamento>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/lancamento-conta-legado.json");
			try {
				List<ControleLancamento> controleLancamento = mapper.readValue(inputStream,typeReference);
				controleLancamentoService.save(controleLancamento);
				System.out.println("Controle de Lancamento Salvo!");
			} catch (IOException e){
				System.out.println("Erro ao salvar o controle de lancamento: " + e.getMessage());
			}
	    };
	}
}
