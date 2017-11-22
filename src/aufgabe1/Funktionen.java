package aufgabe1;

import java.util.HashMap;
import java.util.Map;

class Funktionen {

    int punkteSpieler, punkteComputer;
    private char computer;
    private Map<String, Object> data = new HashMap<>();

    Funktionen(){
        data.put("1", 'x');
        data.put("2", 's');
        data.put("3", 'p');
        punkteComputer = 0;
        punkteSpieler = 0;
    }

    void generate(){
        int rand = (int)(Math.random() * 3)+1;
        computer = (char)(data.get(Integer.toString(rand)));
    }

    void pruefe(char spieler){
        if(spieler != computer){
            switch (spieler){
                case 'x':if(computer == 's') punkteComputer++; else punkteSpieler++;break;
                case 's':if(computer == 'p') punkteComputer++; else punkteSpieler++;break;
                case 'p':if(computer == 'x') punkteComputer++; else punkteSpieler++;break;
                default:System.out.println("Falsche Eingabe du Spasst!");
            }
        }
        else{
            System.out.println("Unentschieden");
        }
    }
}
