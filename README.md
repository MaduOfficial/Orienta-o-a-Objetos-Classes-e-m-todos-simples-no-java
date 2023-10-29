# Orienta-o-a-Objetos-Classes-e-métodos-simples-no-java

Anotações de Orienta o a Objetos Classes e métodos simples no java
                                                      Orientação a Objetos: Classes e métodos simples

Agenda
.Definição de métodos

Definição da classe Carro e seus atributos


class Carro {

    String marca
    String modelo;
    int numPassageiros; //número de passageiros
    double capCombustivel; //capacidade do tanque de combustível
    double consumoCombustivel; //consumo de combustível por km


A classe é a declaração da entidade que a gente está se referindo e na orientação a objetos essa entidade é conhecida como objeto e quando nós damos vida a
essa classe quando nós intanciamos essa classe essa variável instanciada passa a ser chamar o objeto.

Métodos simples: sem retorno e/ou parâmetro

void exibirAutononia(){
    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
}

Na tela  nós temos um exemplo de um método simples e esse método simplesmente imprime uma mensagem no output.

