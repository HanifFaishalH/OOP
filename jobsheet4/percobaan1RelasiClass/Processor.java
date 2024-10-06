package jobsheet4.percobaan1RelasiClass;

public class Processor {
        private String merk;
        private double cache;

        Processor() {
        
        }

        Processor(String mk, double cch) {
            this.merk = mk;
            this.cache = cch;
        }

        public void setMerk(String newMerk) {
            merk = newMerk;
        }
        public void setCache(double newCache) {
            cache = newCache;
        }
        
        public String getMerk() {
            return merk;
        }
        public double getCache() {
            return cache;
        }
        
        public void info() {
            System.out.printf("Merk Processor = %s\n", merk);
            System.out.printf("Cache memory = %s\n", cache);
        }
}

