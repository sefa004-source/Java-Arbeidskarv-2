import java.security.PublicKey;

//superklasse
//arves av ball og bordtenissracket
public abstract class Equipment {
    //alt utstyr
        private int id;
        private  String location;
        private  boolean needsReplacemant;
        private  boolean needNewPad;

        //konstruktør
        public Equipment (int id, String location, boolean needsReplacemant, boolean needNewPad){ //konstukrører
            this.id = id;
            this.location =location;
            this.needsReplacemant = needsReplacemant;
            this.needNewPad = needNewPad;}

        // gettere- lar klassene hente verdier
        public  int getId() {           //lage getterer, lar andre klasser hente verdiene
            return id;
        }
        public String getLocation() {
            return location;
        }
        public boolean getneedsReplacemant(){
            return needsReplacemant;
        }
         public boolean getneedsNewPad(){
                return needNewPad;
         }
}


