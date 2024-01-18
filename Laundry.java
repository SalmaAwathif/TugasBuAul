
    public class Laundry {
        // instane field declaration
        
        String nama;
        int telpon;
        String alamat;
        
    
        // overload constructor
        public customer(String nama, int telpon, String alamat) {
            this.nama = nama;
            this.telpon = telpon;
            this.alamat = alamat;
    
        }
    
        // Getter (Accessor)
       
    
        public String getnama() {
            return nama;
    
        }
    
        public String gettelepon() {
            return telpon;
        }
    
        public String getalamat() {
            return alamat;
        }
    
        public String settelepon() {
            return telepon;
        }
    
        public String setalamat() {
            return alamat;
        }
    
    
        // Overide tosstring method
        @Override
        public String toString() {
           return "\customer (String nama: " + nama+ "\telpon:" + telpon+ "\alamat: " + alamat);         
        }
    }
        
    

