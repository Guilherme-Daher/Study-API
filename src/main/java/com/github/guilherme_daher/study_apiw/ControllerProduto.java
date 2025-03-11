package com.github.guilherme_daher.study_apiw;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("produtos")
@RestController
public class ControllerProduto {


    @PostMapping
    public ResponseEntity <String> create(@RequestBody Produto produto){
        return ResponseEntity.status(201).body("Produto Cadastrado: Laranja!");
    }
        
    @PutMapping
    public ResponseEntity <String> update(){
        return ResponseEntity.status(200).body("Produto Atualizado!");
    }

    @GetMapping
    public ResponseEntity <String> find (){
        return ResponseEntity.status(200).body("Laranja");
    }

    @DeleteMapping
    public ResponseEntity <Void> delete(){
        return ResponseEntity.status(204).build();
    }
}
