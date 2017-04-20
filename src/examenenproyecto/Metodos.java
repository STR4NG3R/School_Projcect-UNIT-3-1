package examenenproyecto;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
public class Metodos {
    int conta=0;
    Datos a1[]=new Datos[100000];
        String mensa = "";
      public void seleccion(){
          int opcion;
           do{
          opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"----------Eventos Solis-----------\n1.-Regitrar Servicio.\n2.-Ver servicios\n3.-Eliminar servicios\n4.-Salir"));
          switch(opcion){
              case 1:
               a1[conta]=Registrar();
               conta++;
               break;
               case 2:{
                   verRegistrado();
               break;}
               case 3:{
                   
               break;}
               case 4:break;
               default:{
                   JOptionPane.showMessageDialog(null,"Haga las cosas bien por favor");
               break;}
          }    
          }while (opcion!=4);
          JOptionPane.showMessageDialog(null,"Hasta luego");
      }
      
 public Datos Registrar(){
     Datos a=new Datos();
        double precioSalon[]=new double[]{4000,10000,30000};
        String salones[]=new String[] {"Economico","Estandar","Deluxe"};
        ArrayList<String> salon = new ArrayList<>(Arrays.asList(salones));
        Object sa = JOptionPane.showInputDialog(null, "Salones","Salón", JOptionPane.QUESTION_MESSAGE, null,salones,"");
        int cualsalon = salon.indexOf(sa.toString());
        a.setPreciosalon(precioSalon[cualsalon]);
        fechaEntra();
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
         System.out.println(cualPlato);
     }
      sn=(String) JOptionPane.showInputDialog(null, "Postres", "¿Habra postre en su evento?", JOptionPane.QUESTION_MESSAGE, null,son, "");
       if(sn.equals("Si")){
        double precioplatos[]=new double[]{34,53,45.25,43.5,25,60};
        String platillos[]=new String[] {"Timarasú.", "Pastel de queso.", "Natilla de azucar moreno.","Budin.","Personalizado"};
        ArrayList<String> pal = new ArrayList<>(Arrays.asList(platillos));
        Object me = JOptionPane.showInputDialog(null, "Postres","Postres", JOptionPane.QUESTION_MESSAGE, null,platillos, "");
        int cualPlato = pal.indexOf(me.toString());
        a.setPreciocomida(precioplatos[cualPlato]);
        System.out.println(cualPlato);
       }
        sn=(String) JOptionPane.showInputDialog(null, "Bebidas", "¿Habra bebidas en su  evento?", JOptionPane.QUESTION_MESSAGE, null,son, "");
        if(sn.equals("Si")){
        double precioplatos[]=new double[]{20,20,20,350.5,400,85.75,60};
        String bebidas[]=new String[] {"Coca-Cola","Miranda","Fresca","Tequila","Whiskey","Sidra","Personalizado"};
        ArrayList<String> bebid = new ArrayList<>(Arrays.asList(bebidas));
        Object me = JOptionPane.showInputDialog(null, "Bebidas", "Bebida", JOptionPane.QUESTION_MESSAGE, null,bebidas,"");
        int cualPlato = bebid.indexOf(me.toString());
        a.setPrecioBebida(precioplatos[cualPlato]);
        System.out.println(cualPlato);
       }
         sn=(String) JOptionPane.showInputDialog(null, "Música", "¿Quiere el servicio de musica que le ofrecemos?", JOptionPane.QUESTION_MESSAGE, null,son, "");
        if(sn.equals("Si")){
        a.setPreciomusica(500);
        }
        System.out.println(año());
        a.setAño(año());
        a.generarId();
return a; 
 }
void verRegistrado(){
for (int i=0;i<conta;i++){
    System.out.println( a1[i].getNopersonas());  
    mensa=a1[i].generarId()+"\n";
}
JOptionPane.showMessageDialog(null, mensa);
} 
 String fechaEntra(){
     Fecha syste=new Fecha();
     syste.asignarFecha();
   String fecha=syste.getDia()+"/"+syste.getMes()+"/"+syste.getAño()+"."+syste.getHora()+"."+syste.getMinute()+"."+syste.getSeg();       
 return fecha; 
 }
 int año(){
    Fecha syste=new Fecha();
    syste.asignarFecha();
    return syste.getAño();
 }
}
