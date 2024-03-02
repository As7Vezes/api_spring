package br.com.project.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.api.model.Pessoa;

@RestController
public class Controller {
    
    @GetMapping("/Hello")
    public String mesnagem () {
        return "Hello Wordl!";
    }

    @GetMapping("/bemVindo")
    public String boasVindas () {
        return "Seja bem vindo(a) " ;
    }

    @GetMapping("/bemVindo/{nome}")
    public String boasVindas (@PathVariable String nome) {
        return "Seja bem vindo(a) " + nome;
    }

    @PostMapping("Pessoa")
    public Pessoa pessoa (@RequestBody Pessoa pessoa) {
        return pessoa;
    }


}
