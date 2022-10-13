package vacunación;
import java.util.Scanner;

public class Vacunación {
    public static void main(String[] args) {
        int Edad, Cont1=0, Cont2=0, Cont3=0, Cont4=0,Cont5=0,Cont6=0,Cont7=0,Cont8=0,Cont9=0;
        int Suma1, Suma2, Suma3, SumaTotal;
        String Tipo;
        
        Scanner Leer= new Scanner(System.in);
        
        for (int i=1; i<=4; i++) {
             System.out.println ("Escriba su edad ");
             Edad= Leer.nextInt();
             Leer.nextLine();
             System.out.println ("Escriba su tipo A,B y C ");
             Tipo= Leer.nextLine();
             
             if (Edad<18 & "A".equals(Tipo)){
                 Cont1= Cont1+1;}
             else{
            if (Edad>=18 & Edad<60 & "A".equals(Tipo)) {
                Cont2= Cont2+1;}
              else
            if (Edad>=60 & "A".equals(Tipo)) {
                Cont3= Cont3+1;}
            }
              if (Edad<18 & "B".equals(Tipo)){
                 Cont4= Cont4+1;}
             else{
            if (Edad>=18 & Edad<60 & "B".equals(Tipo)) {
                Cont5= Cont5+1;}
              else{
            if (Edad>=60 & "B".equals(Tipo)) {
                Cont6= Cont6+1;}
              if (Edad<18 & "C".equals(Tipo)){
                 Cont7= Cont7+1;}
             else{
            if (Edad>=18 & Edad<60 & "C".equals(Tipo)) {
                Cont8= Cont8+1;}
              else{
            if (Edad>=60 & "C".equals(Tipo)) {
                Cont9= Cont9+1;}
            }
              }
            }
              }
        }
        Suma1= Cont1+ Cont4+ Cont7;
        Suma2=  Cont2+ Cont5+ Cont8;
        Suma3=  Cont3+ Cont6+ Cont9;
        SumaTotal= Suma1+Suma2+Suma3;
        
        System.out.println ("El total de vacunas por menores de edad son "+Suma1 );
        System.out.println ("El total de vacunas por población entre 18 y 60 años "+Suma2);
        System.out.println ("El total de vacunas a mayores de 60 años "+Suma3 );
        System.out.println ("El total de vacunas en general es de "+SumaTotal );
    }
}
    

