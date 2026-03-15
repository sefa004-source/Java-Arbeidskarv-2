import java.util.ArrayList;

public class AnalyzedEquipment {
    private  ArrayList<Equipment> equipmentArrayList;

    public  AnalyzedEquipment(ArrayList<Equipment> equipmentArrayList){
        this.equipmentArrayList = equipmentArrayList;
    }

    public void  printBallsNeedingMoreAir(){
        for (Equipment e : equipmentArrayList){
            if (e instanceof Ball){
                Ball ball = (Ball) e;
                if (ball.isNeedsAir()){
                    System.out.println( "Ball with id: "+ ball.getId() + " needs air. location: " + ball.getLocation());}
            }
        }
    }
    public void printEquipmentNeedingToBeReplaced() {
        for (Equipment e : equipmentArrayList){
            if (e.getneedsReplacemant()){
                System.out.println(" Equipment with id: " +  e.getId() + " must be replaced. location:" + e.getLocation());
            }
        }
    }
    public void printTableTennisRacketsNeedingNewPad(){
        for (Equipment e : equipmentArrayList){
            if (e instanceof Bordtennisracket){
                Bordtennisracket racket = (Bordtennisracket) e;
                if (racket.isNeedsNewpad()) {
                    System.out.println("Racket with id: " + racket.getId() + " need new pad. location" + racket.getLocation());
                }
            }
        }
    }
}
    
