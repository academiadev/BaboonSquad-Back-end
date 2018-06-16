package br.com.academiadev.reembolsoazul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academiadev.reembolsoazul.dto.UserDTO;
import br.com.academiadev.reembolsoazul.service.UserService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	public UserService userService;

	@PostMapping(value = "/gravar")
	public ResponseEntity<?> cadastrar(@RequestBody UserDTO pessoaDTO) {
		userService.cadastrar(pessoaDTO);
		return ResponseEntity.ok(pessoaDTO);
	}
	
	@PostMapping(value ="/alterar")
	public void alterar() {
		
	}
	
	
}
