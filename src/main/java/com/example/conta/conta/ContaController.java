package com.example.conta.conta;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URI;

@RestController
@RequestMapping(path = "/")

public class ContaController {
    @Autowired
    private ContaService contaService;

    @GetMapping
    private ResponseEntity<List<ContaModel>> findAll(){
        List<ContaModel> findAll = contaService.findAll();
        return ResponseEntity.ok().body(findAll);
    }

    @PostMapping
    private ResponseEntity<ContaModel> criarConta(ContaModel contaModel){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path
    }

}
