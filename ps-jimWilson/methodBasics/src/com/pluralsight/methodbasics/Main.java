package com.pluralsight.methodbasics;

public class Main {

    public static void main(String[] args) {
        Joseph j = new Joseph();
        j.josephAdd(5, 5, 0);
        System.out.println("KoGaMa sux");
    }

    public static class Joseph {
        public void josephAdd (double x, double y, int count) {
            double sum = x + y;
            if (count < 1)
                return;
            for (int i=0; i<count; i++)
                System.out.println(sum);
        }
    }
}
