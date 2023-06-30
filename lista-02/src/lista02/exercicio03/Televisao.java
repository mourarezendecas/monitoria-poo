package lista02.exercicio03;

public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 0;
        this.canal = 0;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal(){
        return canal;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("VOLUME ATUAL: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("VOLUME ATUAL: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("CANAL ATUAL: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("CANAL ATUAL: " + canal);
    }

    public void trocarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("CANAL: " + canal);
    }

    @Override
    public String toString() {
        return "VOL: " + volume + "\nCANAL: " + canal;
    }

}
