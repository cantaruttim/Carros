package br.com.cantaruttim.arquitetura.montadora.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.cantaruttim.arquitetura.montadora.CarroStatus;
import br.com.cantaruttim.arquitetura.montadora.Chave;
import br.com.cantaruttim.arquitetura.montadora.HondaHRV;
import br.com.cantaruttim.arquitetura.montadora.Motor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/carros")
public class TesteFabricaController {
    

    @Autowired // ingestão de dependência
    @Qualifier("motorTurbo")
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }

}
