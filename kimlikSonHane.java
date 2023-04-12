import java.util.Scanner;
public class kimlikSonHane {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("11 Haneli TC Kimlik Numarınızı giriniz:");
        String no= input.next();

        char lastNumber=no.charAt(10);

        switch(lastNumber){
            case '0':
                System.out.println("Maaşınız her ayın 15'inde hesabınıza yatırılacaktır.");
                 break;
            case '2':
                System.out.println("Maaşınız her ayın 16'sında hesabınıza yatırılacaktır.");
                 break;
            case '4':
                System.out.println("Maaşınız her ayın 17'sinde hesabınıza yatırılacaktır.");
                 break;
            case '6':
                System.out.println("Maaşınız her ayın 18'inde hesabınıza yatırılacaktır.");
                 break;
            case '8':
                System.out.println("Maaşınız her ayın 19'unda hesabınıza yatırılacaktır.");
                 break;
        }
    }
}
