package br.com.cantaruttim.arquitetura.montadora;

public class Carro {
    
    private String modelo;
    private Motor motor;
    private Montadora montadora;

    
    public Carro(Motor motor) {
        this.motor = motor;
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Montadora getMontadora() {
        return montadora;
    }
    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }


    public CarroStatus darIgnicao(Chave chave) {
        if (chave.getMontadora() != this.montadora) {
            return new CarroStatus("Não é possível iniciar o carro!");
        }
        return new CarroStatus("Carro Ligado. Rodando com o motor" + motor);
    }


    
    

}
