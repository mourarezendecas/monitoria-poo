package lista02.exercicio03;

public class ControleRemoto {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();

        System.out.println(televisao.toString());

        televisao.aumentarVolume();
        televisao.diminuirVolume();

        televisao.aumentarCanal();
        televisao.diminuirCanal();

        televisao.trocarCanal(13);
    }
}
