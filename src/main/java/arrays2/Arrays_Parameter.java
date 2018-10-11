package main.java.arrays2;

public class Arrays_Parameter {

    public static void main(String[] args){
        if(args != null){
            for(String wort : args){
                System.out.print(wort+" ");
            }
        }
    }

}
