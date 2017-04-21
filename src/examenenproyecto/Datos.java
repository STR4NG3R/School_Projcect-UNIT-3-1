package examenenproyecto;
import java.util.Random;
public class Datos {
    Fecha syste=new Fecha();
private String id="",fecha="",fecha2="";
private int nopersonas=1;
private double preciosalon,preciocomida=1,preciomusica,preciobebida=1,preciopostre=1,total;
private int dia,mes,año;
Datos(){   
}
public Datos(int nopersonas, double preciosalon, double preciocomida, double preciomusica, int diaC, int mesC,int añoC, int diaE, int mesE, int año) {
        this.nopersonas = nopersonas;
        this.preciosalon = preciosalon;
        this.preciocomida = preciocomida;
        this.preciomusica = preciomusica;
        this.dia = diaC;
        this.mes = mesC;
        this.año = añoC;
        this.dia = diaE;
        this.mes = mesE;
    }
    void gTotal(){
        total=this.nopersonas*this.preciocomida*this.getPreciobebida()*preciopostre+(this.preciosalon+this.preciomusica);
    }
    public double getTotal(){
        return total;
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

   
    public void generarId(){
    String años=Integer.toString(this.getAño());
    int x=años.length();
    char a;
        for (int i=x/2;i<x;i++){
        a = años.charAt(i);
         id=id+a;
        }
        for (int i=0;i<3;i++){
        Random rand=new Random();
        int nrdm=rand.nextInt(9);
        id=id+nrdm;
        }
            for  (int i=0;i<3;i++){
    Random rdm = new Random();
    int caso = rdm.nextInt(9);
    switch(caso){
        case 1:id=id+"a"; break;
        case 2:id=id+"q"; break;
        case 3:id=id+"R"; break;
        case 4:id=id+"Z"; break;
        default:id=id+"P";break;
    }
    }
    }
    public String getID(){
     return id;   
    }
 void fechaEntra(){
     syste.asignarFecha();
     fecha=syste.getDia()+"/"+syste.getMes()+"/"+syste.getAño()+"."+syste.getHora()+"."+syste.getMinute()+"."+syste.getSeg();       
 }
  void fechaSalida(){
 }
  String fecha2(){
      
      fecha2=getDia()+"/"+getMes()+"/"+getAño();    
      return fecha2;
  }
 String getFechaEntra(){
   return fecha;  
 }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
         public boolean fechaCorrecta(){
    boolean diaCorrecto,mesCorrecto,añoCorrecto;
    añoCorrecto=(año>0);
    mesCorrecto=((mes>0)&&(mes<13));
    switch(mes)
    {
        case 2:{
            if(esBisiesto()){
            diaCorrecto=(dia>=1&&dia<=29);}
            else{
            diaCorrecto=(dia>=1&&dia<=28);
            }break;}
        case 4:
        case 6:
        case 9:
        case 11:
            diaCorrecto=(dia>=1&&dia<=30);
            break;
        default:{
            diaCorrecto=(dia>=1&&dia<=31);
            break;}
            }
    return diaCorrecto && mesCorrecto && añoCorrecto;    
}    
    public double getPreciobebida() {
        return preciobebida;
    }

    public void setPreciobebida(double preciobebida) {
        this.preciobebida = preciobebida;
    }
          private boolean esBisiesto()
    {
        return ((año %4==0)&&(año%100!=0)||(año %400==0));
    }
}
