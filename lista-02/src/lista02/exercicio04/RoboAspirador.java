package lista02.exercicio04;

import java.sql.SQLOutput;

public class RoboAspirador {
    private int identificacao;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;

    public void ligar(){
        status = "LIGADO";
        System.out.println(status);
    }

    public void desligar(){
        status = "DESLIGADO";
        System.out.println(status);
    }

    public void aspirar(int qtd){
        if(status.equals("DESLIGADO")){
            System.out.println("O ROBÔ DEVE SER LIGADO ANTES");
        }
        else {
            if(qtd>limitePo){
                System.out.println("LIMITE ALÉM DO COMPORTAMENTO");
            }
            else if(quantidadePo+qtd > limitePo){
                System.out.println("LIMITE EXCEDIDO");
                desligar();
            }
            else{
                quantidadePo +=qtd;
                System.out.println("QUANTIDADE ASPIRADA: " + quantidadePo);
            }
        }

    }

    public void andar(int x, int y){
        if(status.equals("DESLIGADO")){
            System.out.println("O ROBÔ DEVE SER LIGADO ANTES");
        }
        else {
            status = "ANDANDO";
            posicaoX += x;
            posicaoY += y;
            System.out.println(status);
            System.out.println("POS. X: " +posicaoX + "\nPOS. Y: " +posicaoY);
        }

    }

    public void parar(){
        if(status.equals("DESLIGADO")){
            System.out.println("O ROBÔ DEVE SER LIGADO ANTES");
        }
        else {
            status = "PARADO";
            System.out.println(status);
        }
    }

    public RoboAspirador(int limitePo) {
        this.status = "DESLIGADO";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
        this.limitePo = limitePo;
    }
}