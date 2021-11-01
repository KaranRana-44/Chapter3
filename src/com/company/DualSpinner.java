package com.company;
public class DualSpinner {
    public int spin(int min, int max)
    {
        return (int)((Math.random() * (max - min + 1))+ min);
    }

    public void playRound()
    {
        int player = this.spin(1,10);
        int computer = this.spin(2,8);
        System.out.println(player);
        System.out.println(computer);
        int pReroll= player+spin(1,10);
        int cReroll= computer+spin(2,8);

        if (player == computer){
            if (pReroll == cReroll) {
                System.out.println(pReroll - player);
                System.out.println(cReroll - computer);
                System.out.println("Tie. 0 points.");
            }
            else if (pReroll>cReroll){
                System.out.println(pReroll-player);
                System.out.println(cReroll-computer);
                System.out.println("You win! 1 points");
            }

            else{
                System.out.println(pReroll-player);
                System.out.println(cReroll-computer);
                System.out.println("You lose! -1 point.");
            }

        }
        else if (player > computer){
            System.out.println("You win! "+(player-computer)+" points.");
        }
        else {
            System.out.println("You lose! "+(player-computer)+" points.");
        }
    }
    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for(int i = 0; i < 10; i++){
            ds.playRound();
        }

    }
}