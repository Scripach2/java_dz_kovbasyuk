package prez11;

public class dz0 {
    public static void main(String[] args) {
    }

    public class Pizza {
        public String name() {
            return "Just tasty pizza";
        }
    }

    public class PizzaExtraCheese extends Pizza {
        @Override
        public String name() {
            return "Just tasty pizza with extra cheese pizza";
        }
    }

    public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
        @Override
        public String name() {
            return "Just tasty pizza with extra cheese pizza and extra tomato";
        }
    }
}
