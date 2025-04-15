package com.example.conta.conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<ContaModel> findAll(){
        return contaRepository.findAll();
    }

    public ContaModel contaModel(ContaModel )
}
