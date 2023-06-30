package lista02.exercicio04;

public class Main {
    public static void main(String[] args) {
        RoboAspirador robo1 = new RoboAspirador(10);

        robo1.ligar();
        robo1.desligar();
        robo1.andar(10,10);
        robo1.ligar();
        robo1.andar(10,10);
        robo1.parar();
        robo1.aspirar(6);
        robo1.aspirar(8);

        RoboAspirador robo2 = new RoboAspirador(20);
        robo2.ligar();
        robo2.desligar();
        robo2.andar(20,10);
        robo2.ligar();
        robo2.andar(10,20);
        robo2.parar();
        robo2.aspirar(11);
        robo2.aspirar(3);
    }
}
