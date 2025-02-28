package prez11;

public class dz1 {
    public static void main(String[] args) {
    }

    public class Bus {

        public interface Transport {

            public void run();

            public void passengers(int num);

            default double getOil(int litres) {
                return (double) litres * 50.0;
            }
        }
    }
}
