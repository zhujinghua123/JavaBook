package chap03;

/**
 * @author: 洪洛安
 * @date: 2022年9月16日 下午10:33:58
 * @description: number的值对应牌的大小，color用switch转为花色
 */
public class Homework24 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int number = (int) (Math.random() * 13 + 1);
        int color = (int) (Math.random() * 4);


        String cardNumber;
        if (number == 1)
            cardNumber = "ACE";
        else if (number == 11)
            cardNumber = "Jack";
        else if (number == 12)
            cardNumber = "Queen";
        else if (number == 13)
            cardNumber = "King";
        else
            cardNumber = "" + number;


        String cardColor;
        switch (color) {
            case 0:
                cardColor = "Clubs";
                break;
            case 1:
                cardColor = "Diamonds";
                break;
            case 2:
                cardColor = "Heart";
                break;
            default:
                cardColor = "Spades";
        }


        System.out.println("The card you picked is " + cardNumber + " of " + cardColor);
    }


}
