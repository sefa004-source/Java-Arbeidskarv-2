import java.util.ArrayList;

public class AnalyzedEquipment {
    //liste med alle utstyr-objektene
    private  ArrayList<Equipment> equipmentArrayList;

    //konstruktør som tar inn listen med utstyr
    public  AnalyzedEquipment(ArrayList<Equipment> equipmentArrayList){
        this.equipmentArrayList = equipmentArrayList;
    }
        //printer ut alle baller som trenger luft
    public void  printBallsNeedingMoreAir(){
        for (Equipment e : equipmentArrayList){
            //skjekker om objektet er en ball
            if (e instanceof Ball){
                Ball ball = (Ball) e;
                //skjekker om ballen trenger luft
                if (ball.isNeedsAir()){
                    System.out.println( "Ball with id: "+ ball.getId() + " needs air. location: " + ball.getLocation());}
            }
        }
    }   //printer ut alt utstyr som må erstattes
    public void printEquipmentNeedingToBeReplaced() {
        for (Equipment e : equipmentArrayList){
            //skjekker om utsyret må erstattes
            if (e.getneedsReplacemant()){
                System.out.println(" Equipment with id: " +  e.getId() + " must be replaced. location:" + e.getLocation());
            }
        }
    }   //printer ut alle rackets som trenger nytt belegg
    public void printTableTennisRacketsNeedingNewPad(){
        for (Equipment e : equipmentArrayList){
            //skjekker om objektet er en bordtennisracket
            if (e instanceof Bordtennisracket){
                Bordtennisracket racket = (Bordtennisracket) e;
                //skjekker om racketen  trenger ny belegg
                if (racket.isNeedsNewpad()) {
                    System.out.println("Racket with id: " + racket.getId() + " need new pad. location" + racket.getLocation());
                }
            }
        }
    }
}
    
