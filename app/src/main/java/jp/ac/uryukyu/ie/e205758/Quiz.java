package jp.ac.uryukyu.ie.e205758;

import java.util.Scanner;

public class Quiz {
    public static void QuizDate(){
        System.out.println("\n第１問　「寝耳に水」の水とは何を指しているでしょう");
        System.out.println("\n1:海水　\n2:井戸の水 \n3:洪水");
        
        Scanner scan = new Scanner(System.in);
        
            System.out.println("\n答えを入力してください");
            while(true){
                String a = scan.nextLine();
                //
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
            System.out.println("\n\n\n第２問　お医者さんや看護師さんは、基本的に白い白衣を着ますが、手術の時には、青緑色の制服を着る人が多いのはなぜでしょう");
            System.out.println("\n1:色によって役割分担があるため　\n2:目を疲れにくくするため \n3:菌が繁殖しないための、特殊な加工をしているから");
            
            
                System.out.println("\n答えを入力してください");
                while(true){
                    String a = scan.nextLine();
                    //
                    if(a.equals("1")){
                        Mistake２();
                        break;
                    }
                    else if(a.equals("2")){
                        Mistake２();
                        break;
                    }
                    else if(a.equals("3")){
                        System.out.println("\n\nおめでとう！大正解！！");
                        Commentary2();
                        break;
                    }
                    else {
                        System.out.println("\n\n１〜３の番号を入力してください");
                    }
                }
        
    }
    public static void Mistake() {
        System.out.println("\n\n残念不正解！！");
        System.out.println("正解は３の洪水です");
        Commentary();
    }
    public static void Commentary() {
        System.out.println("昔の日本は、川の氾濫の対策がまだ不十分だった時があり、寝て起きたら洪水の音が聞こえてビックリ！ってことも時折起こり、そこから作られた慣用句です");    
    }

    public static void Mistake２() {
        System.out.println("\n\n残念不正解！！");
        System.out.println("正解は2の目を疲れにくくするためです");
        Commentary2();
    }
    public static void Commentary2() {
        System.out.println("n手術中は、血液など「赤」系統のものをたくさん見ることになります。見続けていると、反動で青緑系の残像が見えてしまうことがあり、大切な手術中にその状態になるのは少々危険なので、手術着や壁の色を青緑色にして、バランスをとっているんです");    
    }


}
