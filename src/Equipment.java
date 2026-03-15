import java.security.PublicKey;

public abstract class Equipment {
        private int id;
        private  String location;
        private  boolean needsReplacemant;
        private  boolean needNewPad;

        public Equipment (int id, String location, boolean needsReplacemant, boolean needNewPad){ //konstukrører
            this.id = id;
            this.location =location;
            this.needsReplacemant = needsReplacemant;
            this.needNewPad = needNewPad;}

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


