package prez11;

public class dz2 {
    public interface Convert {
        public abstract double convert(double temp);
    }

    public static class ConvertToKelvin implements Convert {
        @Override
        public double convert(double temp) {
            return temp + 273.15;
        }
    }

    public static class ConvertToCelsius implements Convert {
        @Override
        public double convert(double temp) {
            return temp - 273.15;
        }
    }

    public static class Run {
        public void runMethod(ConvertToKelvin temp1, ConvertToCelsius temp2, double temp) {
            System.out.println(temp1.convert(temp));
            System.out.println(temp2.convert(temp));
        }
    }

    public static void main(String[] args) {
        ConvertToCelsius temp2 = new ConvertToCelsius();
        ConvertToKelvin temp1 = new ConvertToKelvin();
        double temp = 0.00;
        Run run = new Run();
        run.runMethod(temp1, temp2, temp);
    }
}
