import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //leser inn utsyr fra fil
        EquipmentReader reader = new EquipmentReader();
        ArrayList<Equipment> list = reader.getEquipment();

        //kaller på de tre metodnene
        AnalyzedEquipment  Analyzer = new AnalyzedEquipment(list);
        Analyzer.printBallsNeedingMoreAir();
        Analyzer.printEquipmentNeedingToBeReplaced();
        Analyzer.printTableTennisRacketsNeedingNewPad();




    }
}
