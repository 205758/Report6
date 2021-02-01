package jp.ac.uryukyu.ie.e205758;

import java.util.Scanner;

public class Quiz {
    public static void QuizDate(){
        System.out.println("\n第１問　「寝耳に水」の水とは何を指しているでしょう");
        System.out.println("\n1:海水　2:井戸の水 3:洪水");
        
        Scanner scan = new Scanner(System.in);
        
            System.out.println("\n答えを入力してください");
            while(true){
            String a = scan.nextLine();

                if(a.equals("1")){
                    Mistake();
                    break;
                }
                else if(a.equals("2")){
                    Mistake();
                    break;
                }
                else if(a.equals("3")){
                    System.out.println("\n\nおめでとう！大正解！！");
                    Commentary();
                    break;
                }
                else {
                    System.out.println("\n\n１〜３の番号を入力してください");
                }
            }
        
    }
    private static void Mistake() {
        System.out.println("\n\n残念不正解！！");
        System.out.println("正解は３の洪水です");
        Commentary();
    }
    private static void Commentary() {
        System.out.println("昔の日本は、川の氾濫の対策がまだ不十分だった時があり、寝て起きたら洪水の音が聞こえてビックリ！ってことも時折起こり、そこから作られた慣用句です");    
    }


}
