package examenenproyecto;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
public class Metodos {
    int conta=0;
    Datos a1[]=new Datos[1000];
    Fecha syste=new Fecha();
      public void seleccion(){
          String opcion;
          int valida;
           do{ 
               do{
          opcion=JOptionPane.showInputDialog(null,"----------Eventos Solis-----------\n1.-Registrar Servicio.\n2.-Ver servicios\n3.-Eliminar servicios\n4.-Salir");
          if(!"".equals(opcion));{
          valida=Integer.parseInt(opcion);
               }
               }while("".equals(opcion)||!(valida>0&&valida<5));
          switch(valida){
              case 1:
               a1[conta]=Registrar();
               conta++;
               break;
               case 2:
                   if (conta==0){
                   JOptionPane.showMessageDialog(null,"No tiene absolutamente nada registrado");
                   break;}
                   verRegistrado();
               break;
               case 3:{
                 consultar();  
               break;}
          }    
          }while (valida==4);
          JOptionPane.showMessageDialog(null,"Hasta luego");
      }
 public Datos Registrar(){
     Datos a=new Datos();
        double precioSalon[]=new double[]{4000,10000,30000};
        String salones[]=new String[] {"Economico","Estandar","Deluxe"};
        ArrayList<String> salon = new ArrayList<>(Arrays.asList(salones));
        Object sa = JOptionPane.showInputDialog(null,"Salones","Salón",JOptionPane.QUESTION_MESSAGE,null,salones,"");
        int cualsalon = salon.indexOf(sa.toString());
        a.setPreciosalon(precioSalon[cualsalon]);
        a.fechaEntra();
     int personasAsistiran;
     String sn;
     a.setNopersonas(personasAsistiran=Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese el numero de personas que se tienen programadas para el evento")));
     String son[]=new String[]{ "Si", "No"};
        sn=(String) JOptionPane.showInputDialog(null, "Platillos", "¿Habra comida en su evento?", JOptionPane.QUESTION_MESSAGE, null,son, "");
     if(sn.equals("Si")){
         double precioplatos[]=new double[]{60,40,35.25,50.5,35,30.75,60};
        String platillos[]=new String[] {"Bacalao con costra de mahonesa de pera", "Corvina con salsa de chile", "Magret de pato y granada", "Bacalao a la gallega", "Rosbif", "Rodaballo","Personalizado"};
        ArrayList<String> pal = new ArrayList<>(Arrays.asList(platillos));
        Object me = JOptionPane.showInputDialog(null, "Platillos", "Platillo Fuerte", JOptionPane.QUESTION_MESSAGE, null,platillos, "");
        int cualPlato = pal.indexOf(me.toString());
        a.setPreciocomida(precioplatos[cualPlato]);
     }
      sn=(String) JOptionPane.showInputDialog(null, "Postres", "¿Habra postre en su evento?", JOptionPane.QUESTION_MESSAGE, null,son, "");
       if(sn.equals("Si")){
        double precioplatos[]=new double[]{34,53,45.25,43.5,25,60};
        String platillos[]=new String[] {"Timarasú.", "Pastel de queso.", "Natilla de azucar moreno.","Budin.","Personalizado"};
        ArrayList<String> pal = new ArrayList<>(Arrays.asList(platillos));
        Object me = JOptionPane.showInputDialog(null, "Postres","Postres", JOptionPane.QUESTION_MESSAGE, null,platillos, "");
        int cualPlato = pal.indexOf(me.toString());
        a.setPreciocomida(precioplatos[cualPlato]);
       }
        sn=(String) JOptionPane.showInputDialog(null, "Bebidas", "¿Habra bebidas en su  evento?", JOptionPane.QUESTION_MESSAGE, null,son, "");
        if(sn.equals("Si")){
        double precioplatos[]=new double[]{10,10,8,25.5,23,25.75,25};
        String bebidas[]=new String[] {"Coca-Cola","Mirinda","Fresca","Tequila","Whiskey","Sidra","Personalizado"};
        ArrayList<String> bebid = new ArrayList<>(Arrays.asList(bebidas));
        Object me = JOptionPane.showInputDialog(null, "Bebidas", "Bebida", JOptionPane.QUESTION_MESSAGE, null,bebidas,"");
        int cualPlato = bebid.indexOf(me.toString());
        a.setPreciobebida(precioplatos[cualPlato]);
        }
         sn=(String) JOptionPane.showInputDialog(null, "Música", "¿Quiere el servicio de musica que le ofrecemos?", JOptionPane.QUESTION_MESSAGE, null,son, "");
        if(sn.equals("Si")){
        a.setPreciomusica(500);
        }
        do{
        int dia,mes,año;
        a.setAño(año=Integer.parseInt(JOptionPane.showInputDialog("Introducir el año que se realizara el evnto")));
        a.setDia(dia=Integer.parseInt(JOptionPane.showInputDialog("Introducir el dia que se realizara el evento")));
        a.setMes(mes=Integer.parseInt(JOptionPane.showInputDialog("Introducir el mes en el que se hara el evento")));
        a.fechaCorrecta();
            System.out.println(a.fecha2());
        }while((a.fechaCorrecta())==false);
        a.setAño(año());
        a.generarId();
        a.gTotal();
return a; 
 }
void verRegistrado(){
    String mensa = "";
    String cabecera=String.format("%s%n%s%44s%15s%30s%n%s%n",
            "-----------------------------------------------------------------------------------------------------------",
            "|ID","|FECHA DE REGISTRO","|PRECIO","|DIA DEL CONVIVIO|",
            "-----------------------------------------------------------------------------------------------------------"); 
    int c=cabecera.length();
    System.out.println(c);
for (int i=0;i<conta;i++){  
    if (!(a1[i]==null)){
    mensa=mensa+String.format(" %s%30s%22s%19s%n",a1[i].getID(),a1[i].getFechaEntra(),a1[i].getTotal(),a1[i].fecha2());
    }
}
JOptionPane.showMessageDialog(null,cabecera+mensa);
} 

 int año(){
    syste.asignarFecha();
    return syste.getAño();
 }
 void consultar(){
    String idn="";
    boolean a=true;
    idn=JOptionPane.showInputDialog("Ingrese el ID para eliminar el evento");
    for (int i=0;i<conta;i++){
        if (a1[i].getID().equals(idn)){   
        JOptionPane.showMessageDialog(null,"Se ha elimiado elvento: "+a1[i].getID()+". Que es el numero: "+i);
        a1[i]=null;
        i=conta;
        a=false;
        break;
        }
        if (a==true){
        JOptionPane.showMessageDialog(null,"No hay ningun ID así. intentelo de nuevo.");    
        break;}
        }    
}
}