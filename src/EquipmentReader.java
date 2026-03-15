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

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Equipment> EquipmentArrayList = new ArrayList<>();
        while (input.hasNextLine()){
            String s = input.nextLine();
            if (s.equals("Ball")) {
                String idlLine = input.nextLine();
                int id = Integer.parseInt(idlLine);
                String location = input.nextLine();
                boolean needsReplacement = Boolean.parseBoolean(input.nextLine());
                String type = input.nextLine();
                boolean needsAir = Boolean.parseBoolean(input.nextLine());

                Ball ball =  new Ball(id,location,needsReplacement,type,needsAir);
                EquipmentArrayList.add(ball);

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
        return EquipmentArrayList;

    }

}

