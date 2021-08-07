package intro;

import java.util.Scanner;

class JarvisOp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String s = new String();

            if(s1.length() == 10){

                s1 = s1 + "";

            }else if(s1.length() == 9){

                s1 += " ";

            }else if(s1.length() == 8){

                s1 += "  ";

            }else if(s1.length() == 7){

                s1 += "   ";

            }else if(s1.length() == 6){

                s1 += "    ";

            }else if(s1.length() == 5){

                s1 += "     ";

            }else if(s1.length() == 4){

                s1 += "      ";

            }else if(s1.length() == 3){

                s1 += "       ";

            }else if(s1.length() == 2){

                s1 += "        ";

            }else if(s1.length() == 1){

                s1 += "         ";

            }else{

                s1 += "          ";

            }

            if(x < 100){

                System.out.printf(s1 + "     0" + x);   

            }else if(x < 10) {
            
                System.out.printf(s1 + "     00" + x);   
            
            }else {
            
                System.out.printf(s1 + "     000" + x);   
            
            }
            System.out.println();

        }
        System.out.println("================================");

    }
}
