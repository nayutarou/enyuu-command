import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //player1
        System.out.println("player1さん小数点第一位まで身長を入力してください(cm)");
        double tall = Double.parseDouble(sc.nextLine());
        System.out.println("続けて小数点第一位まで体重を入力してください(kg)");
        double weight = Double.parseDouble(sc.nextLine());
        tall = tall/100;
        double result = weight/(tall*tall);
        //player2
        System.out.println("player2さん小数点第一位まで身長を入力してください(cm)");
        double tall2 = Double.parseDouble(sc.nextLine());
        System.out.println("続けて小数点第一位まで体重を入力してください(kg)");
        double weight2 = Double.parseDouble(sc.nextLine());
        tall2 = tall2/100;
        double result2 = weight2/(tall2*tall2);
        //player1
        System.out.print("player1のBMIは");
        System.out.print(String.format("%.2f",result));
        System.out.println("です");
        if(result<16){
            System.out.println("コメント : 痩せ過ぎそれを自慢すんじゃねえぞ不健康の証だからな恥だと思ったほうがいい");
        } else if (result<18.5) {
            System.out.println("コメント : もっと食え");
        } else if (result>=30) {
            System.out.println("コメント : 太りすぎやデブが");
        } else if (result>=25) {
            System.out.println("コメント : ちょっと太ってきたんじゃない？");
        } else{
            System.out.println("コメント : 健康的で非常にいいね");
        }
        //player2
        System.out.print("player2のBMIは");
        System.out.print(String.format("%.2f",result2));
        System.out.println("です");
        if(result2<16){
            System.out.println("コメント : 痩せ過ぎそれを自慢すんじゃねえぞ不健康の証だからな恥だと思ったほうがいい");
        } else if (result2<18.5) {
            System.out.println("コメント : もっと食え");
        } else if (result2>=30) {
            System.out.println("コメント : 太りすぎやデブが");
        } else if (result2>=25) {
            System.out.println("コメント : ちょっと太ってきたんじゃない？");
        } else{
            System.out.println("コメント : 健康的で非常にいいね");
        }
    }
}
