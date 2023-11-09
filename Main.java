import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("小数点第一位まで身長を入力してください(cm)");
        double tall = Double.parseDouble(sc.nextLine());
        System.out.println("小数点第一位まで体重を入力してください(kg)");
        double weight = Double.parseDouble(sc.nextLine());
        tall = tall/100;
        double result = weight/(tall*tall);
        System.out.print("あなたのBMIは");
        System.out.print(String.format("%.2f",result));
        System.out.println("です");
        if(result<16){
            System.out.println("痩せ過ぎそれを自慢すんじゃねえぞ不健康の証だからな恥だと思ったほうがいい");
        } else if (result<18.5) {
            System.out.println("もっと食え");
        } else if (result>=30) {
            System.out.println("太りすぎやデブが");
        } else if (result>=25) {
            System.out.println("ちょっと太ってきたんじゃない？");
        } else{
            System.out.println("健康的で非常にいいね");
        }
    }
}
