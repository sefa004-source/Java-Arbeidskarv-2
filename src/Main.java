import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EquipmentReader reader = new EquipmentReader();
        ArrayList<Equipment> list = reader.getEquipment();

        AnalyzedEquipment  Analyzer = new AnalyzedEquipment(list);
        Analyzer.printBallsNeedingMoreAir();
        Analyzer.printEquipmentNeedingToBeReplaced();
        Analyzer.printTableTennisRacketsNeedingNewPad();




    }
}
