package examenenproyecto;
public class Datos {
private String id="";
private int nopersonas;
private double preciosalon,preciocomida,preciomusica,preciobebida,preciopostre;
private int diaC,mesC,añoC,diaE,mesE,año;
Datos(){   
}
public Datos(int nopersonas, double preciosalon, double preciocomida, double preciomusica, int diaC, int mesC,int añoC, int diaE, int mesE, int año) {
        this.nopersonas = nopersonas;
        this.preciosalon = preciosalon;
        this.preciocomida = preciocomida;
        this.preciomusica = preciomusica;
        this.diaC = diaC;
        this.mesC = mesC;
        this.añoC = añoC;
        this.diaE = diaE;
        this.mesE = mesE;
        this.año = año;
    }

    public double getTotal(){
        return ((this.nopersonas*this.preciocomida*this.preciobebida*preciopostre+(this.preciosalon+this.preciomusica)));
    }
    public int getNopersonas() {
        return nopersonas;
    }
    public void setNopersonas(int nopersonas) {
        this.nopersonas = nopersonas;
    }
    public double getPreciosalon() {
        return preciosalon;
    }

    public void setPreciosalon(double preciosalon) {
        this.preciosalon = preciosalon;
    }

    public double getPreciocomida() {
        return preciocomida;
    }

    public void setPreciocomida(double preciocomida) {
        this.preciocomida = preciocomida;
    }

    public double getPreciomusica() {
        return preciomusica;
    }
    public void preciopostre(double postre){
        this.preciopostre=postre;
    }
    public void setPreciomusica(double preciomusica) {
        this.preciomusica = preciomusica;
    }

    public int getDiaC() {
        return diaC;
    }

    public void setDiaC(int diaC) {
        this.diaC = diaC;
    }

    public int getMesC() {
        return mesC;
    }
    public void setPrecioBebida(double bebida){
        this.preciobebida=bebida;
    }
    public void setMesC(int mesC) {
        this.mesC = mesC;
    }

    public int getAñoC() {
        return añoC;
    }

    public void setAñoC(int añoC) {
        this.añoC = añoC;
    }

    public int getDiaE() {
        return diaE;
    }

    public void setDiaE(int diaE) {
        this.diaE = diaE;
    }

    public int getMesE() {
        return mesE;
    }

   
    public void setMesE(int mesE) {
        this.mesE = mesE;
    }

    public int getAño() {
        return año;
    }


    public void setAño(int año) {
        this.año = año;
    }
    public String generarId(){
    String años=Integer.toString(this.año);
        for (int i=4; i<=2;i--){
           char a;
           años=Integer.toString(this.año);
           a = años.charAt(i);
           id=id+a;
        }
        id=id+"hola";
        return id;
    }

}
