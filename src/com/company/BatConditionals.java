package com.company;

public class BatConditionals {

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return (aSmile == bSmile);
    }

    public static boolean negPos(int num1, int num2, boolean parameter){
        if (parameter== false){
            return num1*num2 < 0;
        }
        else {
            return num1<0 && num2<0;
        }
    }
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep == false){
            if (isMorning == false){
                return true;
            }
            else {
                if(isMom == true){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else {
            return false;
        }

    }
    public static String setAlarm(int day,boolean vacation){
        if (vacation==true){
            if (day ==6|| day ==0) {
                return ("off");
            }
            else {
                return ("10:00");
            }
        }
        else if (day ==6|| day ==0){
            return ("10:00");
        }
        else {
            return ("7:00");
        }

    }
    public static boolean onesDigitSame(int a, int b, int c){
        int num1 = a%10;
        int num2 = b%10;
        int num3 = c%10;
        return (num1==num2 || num1==num3 || num2==num3);
    }

    public static int blackjack(int cards1, int cards2){
        if (cards1 > 21 && cards2 >21){
            return 0;
        }
        else if (cards2 > 21){
            return cards1;
        }
        else if (cards1 > 21){
            return cards2;
        }
        else{
            if (cards1>cards2){
                return cards1;
            }
            else {
                return cards2;
            }

        }
    }






    public static void main(String[] args) {

        // Chimp Trouble
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false, false));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));
        System.out.println(" ");

        //Neg Pos
        System.out.println(negPos(1, -1, false));
        System.out.println(negPos (-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos (-1, -1, false));
        System.out.println(negPos (-4, -5, true));
        System.out.println(negPos (-4, 5, true));
        System.out.println(negPos (4, 5, true));
        System.out.println(negPos (4, -5, true));
        System.out.println(" ");

        //pickup phone
        System.out.println(pickUpPhone (false, false, true) );
        System.out.println(pickUpPhone (true, true, true) );
        System.out.println(pickUpPhone (true, true, false));
        System.out.println(pickUpPhone (false, true, false));
        System.out.println(pickUpPhone (true, false, false) );
        System.out.println(pickUpPhone (false, false, false) );
        System.out.println(" ");

        //set alarm
        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm (0, false));
        System.out.println(setAlarm (2, true) );
        System.out.println(setAlarm (4, true));
        System.out.println(setAlarm (6, true));
        System.out.println(" ");

        //one digit same
        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame(23, 19, 12));
        System.out.println(onesDigitSame(23, 19, 3));
        System.out.println(onesDigitSame(423, 13, 3));
        System.out.println(onesDigitSame(23, 29, 25));
        System.out.println(" ");

        //blackjack
        System.out.println(blackjack(19, 21) );
        System.out.println(blackjack(21, 19) );
        System.out.println(blackjack(19, 22) );
        System.out.println(blackjack(8, 8) );
        System.out.println(blackjack(25, 24) );
        System.out.println(" ");



    }
}
