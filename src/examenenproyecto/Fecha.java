package examenenproyecto;

import java.util.Calendar;
import java.util.Locale;

public class Fecha 
{
    private int dia,seg,hora,min;
    private int mes;
    private int año;
    
    public Fecha()
    {
        
    }
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        if(!fechaCorrecta()){
    asignarFecha();
    }
    }
    private boolean esBisiesto()
    {
        return ((año %4==0)&&(año%100!=0)||(año %400==0));
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    public int getSeg(){
        return seg;
    }
    public int getHora(){
        return hora;
    }
    public int getMinute(){
        return min;
    }
    public void setHora(int hora){
    this.hora = hora;
    }
    public void setSeg(int seg) {
    this.seg=seg;
    }
    public void setMinute(int min){
    this.min=min;
    }
    public void asignarFecha()
    {
        Calendar fechaSistema= Calendar.getInstance();
        setDia(fechaSistema.get(Calendar.DAY_OF_MONTH));
        setMes(fechaSistema.get(Calendar.MONTH)+1);
        setAño(fechaSistema.get(Calendar.YEAR));
        setSeg(fechaSistema.get(Calendar.SECOND));
        setHora(fechaSistema.get(Calendar.HOUR_OF_DAY));
        setMinute(fechaSistema.get(Calendar.MINUTE));
    }
    
    public void asignarFecha(int dia)
    {
        Calendar fechaSistema=Calendar.getInstance();
        setDia(fechaSistema.get(dia));
        setMes(fechaSistema.get(Calendar.MONTH)+1);
        setAño(fechaSistema.get(Calendar.YEAR));     
    }
    
    public void asignarFecha(int dia, int mes){
        Calendar fechaSistema=Calendar.getInstance();
        setDia(fechaSistema.get(dia));
        setMes(fechaSistema.get(mes));
        setAño(fechaSistema.get(Calendar.YEAR));
        
    }
    public void asignarFecha(int dia, int mes, int año)
    {
        Calendar fechaSistema=Calendar.getInstance();
        setDia(fechaSistema.get(dia));
        setMes(fechaSistema.get(mes));
        setAño(fechaSistema.get(año));
    }
   public boolean fechaCorrecta()
{
    boolean diaCorrecto, mesCorrecto, añoCorrecto;
    añoCorrecto=(año>0);
    mesCorrecto=((mes>0)&&(mes<13));
    switch(mes)
    {
        case 2:
            if(esBisiesto())
            diaCorrecto=(dia>=1&&dia<=29);
            else
            {
            diaCorrecto=(dia>=1&&dia<=28);
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            diaCorrecto=(dia>=1&&dia<=30);
            break;
            default:{
            diaCorrecto=(dia>=1&&dia<=31);break;
            }
    }
    return diaCorrecto && mesCorrecto && añoCorrecto;       
}
    }