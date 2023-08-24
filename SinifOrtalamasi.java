import java.util.Scanner;
public class SinifOrtalamasi {
    public static void  main(String[] args){
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat=input.nextInt();
        if((0<mat) && (mat<100)){
            mat=input.nextInt();
        }else{
            mat=0;
        }
        System.out.print("Fizik notunuz: ");
        fizik=input.nextInt();
        if((0<mat) && (mat<100)){
            fizik=input.nextInt();
        }else{
            fizik=0;
        }

        System.out.print("Türkçe notunuz: ");
        turkce=input.nextInt();
        if((0<mat) && (mat<100)){
            turkce=input.nextInt();
        }else{
            turkce=0;
        }

        System.out.print("Kimya notunuz: ");
        kimya=input.nextInt();
        if((0<mat) && (mat<100)){
            kimya=input.nextInt();
        }else{
            kimya=0;
        }

        System.out.print("Müzik notunuz: ");
        muzik=input.nextInt();
        if((0<mat) && (mat<100)){
            muzik=input.nextInt();
        }else{
            muzik=0;
        }

        double avarage = (mat+fizik+turkce+kimya+muzik)/5;
        if(avarage<=55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }else{
            System.out.println("Tebrikler sınıfı geçtiniz!");

        }
        System.out.println("Ortalamanız: "+avarage);
    }
}
