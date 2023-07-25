public class Televisao {
    public static final byte CANAL_MAX = 55;
    public static final byte CANAL_MIN = 0;
    public static final byte VOLUME_MIN = 0;
    public static final byte VOLUME_MAX = 100;

    private byte volume = VOLUME_MIN;
    private byte canal = CANAL_MIN;
    public boolean tvLigada = false;

    public void ligaDesliga(){
        if(tvLigada){
            tvLigada = false;
            return;
        }
        tvLigada = true;
    }

/*    public byte getVolume() {
        return volume;
    }

    public void setVolume(byte volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }*/

    @java.lang.Override
    public java.lang.String toString() {
        return "A televisao esta agora no canal "+canal+" e com volume "+volume+"\n--------------------------------------------------";
    }

    public void aumentarVolume(){
        if(volume==VOLUME_MAX){
            return;
        }
        volume++;

    }

    public void reduzirVolume(){
        if(volume==VOLUME_MIN) return;
        volume--;
    }

    public void passarCanal(){
        if(canal==CANAL_MAX){
            canal = CANAL_MIN;
            return;
        }
        canal++;
    }

    public void voltarCanal(){
        if(canal==CANAL_MIN){
            canal = CANAL_MAX;
            return;
        }
        canal--;
    }
}
