import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentReader {
    public static void main(String[] args) {
    }

    public ArrayList <Equipment> getEquipment() {
        File file = new File("src/equipment.txt");
        Scanner input;

        //Åpne filem
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // liste over utsyr-objektene
        ArrayList<Equipment> EquipmentArrayList = new ArrayList<>();

        //lese linjen linje for linje
        while (input.hasNextLine()){
            String s = input.nextLine();

            // ball-objekt
            if (s.equals("Ball")) {
                String idlLine = input.nextLine();
                int id = Integer.parseInt(idlLine);
                String location = input.nextLine();
                boolean needsReplacement = Boolean.parseBoolean(input.nextLine());
                String type = input.nextLine();
                boolean needsAir = Boolean.parseBoolean(input.nextLine());

                Ball ball =  new Ball(id,location,needsReplacement,type,needsAir);
                EquipmentArrayList.add(ball);
            // nordtenisracket - object
            } else  if (s.equals("TableTennisRacket")){
                String idlLine = input.nextLine();
                int id = Integer.parseInt(idlLine);
                String location = input.nextLine();
                boolean needsReplacement = Boolean.parseBoolean(input.nextLine());
                boolean needsNewPad = Boolean.parseBoolean(input.nextLine());

                Bordtennisracket racket = new Bordtennisracket(id,location,needsReplacement,needsNewPad);
                EquipmentArrayList.add(racket);
                }
            }
        // Returner listen med alle objektene
        return EquipmentArrayList;

    }

}

