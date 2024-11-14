package br.com.cantaruttim.arquitetura.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import br.com.cantaruttim.arquitetura.montadora.Motor;
import br.com.cantaruttim.arquitetura.montadora.TipoMotor;


@Configuration
public class MontadoraConfiguration {
    // definimos os Beans da aplicação.


    @Bean(name = "motorAspirado") // método que retorna um objeto construído
    @Primary
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico") // método que retorna um objeto construído
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(4);
        motor.setModelo("TH10");
        motor.setLitragem(1.8);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo") // método que retorna um objeto construído
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPT2O");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
    
    
    
}
