import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PRA1 {
    private static Random r = new Random();

    static class Battery {
        @Override
        public String toString() {
            return "Battery [chargeLeft=" + chargeLeft + ", timeLeft=" + timeLeft + "]";
        }

        public final int consumptionRate;
        public double chargeLeft;
        public double timeLeft;

        public Battery(int consumption, double initCharge) {
            this.consumptionRate = consumption;
            this.chargeLeft = initCharge;
            this.timeLeft = initCharge / consumption;
        }

        public void charge(double chargeRate, double time) {
            double charged = (time * chargeRate);
            double chargeDrained = consumptionRate * time;
            chargeLeft = chargeLeft + charged - chargeDrained;

            timeLeft = chargeLeft / consumptionRate;
        }

        public void drain(double time) {
            double chargeDrained = consumptionRate * time;
            chargeLeft = chargeLeft - chargeDrained;
            timeLeft = chargeLeft / consumptionRate;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        List<Double> outputs = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            String input = in.nextLine();
            String[] inputArr = input.split(" ");
            int n = Integer.parseInt(inputArr[0]);
            long c = Long.parseLong(inputArr[1]);

            List<Battery> batteries = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                String phone = in.nextLine();
                String[] phoneArray = phone.split(" ");

                int consumption = Integer.parseInt(phoneArray[0]);
                double initCharge = Integer.parseInt(phoneArray[1]);

                Battery battery = new Battery(consumption, initCharge);
                batteries.add(battery);
            }

            outputs.add(phoneCharger(batteries, c));
        }
        for (double d : outputs) {
            String s = String.format("%.10f", d);
            System.out.println(s);
        }
        in.close();
    }

    public static double phoneCharger(List<Battery> batteries, double c) {
        double totalChargeTime = 0f;
        double chargeLeft = Double.MAX_VALUE;

        while (chargeLeft >= 0.00001f) {
            double min = Double.MAX_VALUE;

            chargeLeft = Double.MAX_VALUE;

            List<Integer> minTimeLeftBatteries = new ArrayList<>();
            for (int i = 0; i < batteries.size(); i++) {
                Battery b = batteries.get(i);
                double elem = b.timeLeft;
                if (isEqual(elem, min)) {
                    minTimeLeftBatteries.add(i);
                } else if (elem < min) {
                    min = elem;
                    minTimeLeftBatteries.clear();
                    minTimeLeftBatteries.add(i);
                }

                if (b.chargeLeft < chargeLeft) {
                    chargeLeft = b.chargeLeft;
                }
            }
            if (chargeLeft < 0.00001f) {
                // System.out.println("chargeleft : " + chargeLeft);
                return totalChargeTime;
            }

            int index = -1;
            double time;
            if (minTimeLeftBatteries.size() == 1) {
                index = minTimeLeftBatteries.get(0);
                time = batteries.get(index).timeLeft;
            } else if (minTimeLeftBatteries.size() == 2) {
                int idx = r.nextInt(minTimeLeftBatteries.size());
                index = minTimeLeftBatteries.get(idx);
                time = batteries.get(index).timeLeft / (minTimeLeftBatteries.size());
            } else {
                int idx = r.nextInt(minTimeLeftBatteries.size());
                index = minTimeLeftBatteries.get(idx);
                time = batteries.get(index).timeLeft / (minTimeLeftBatteries.size() - 1);
            }

            // System.out.println("time of charge: " + time);

            /*
             * charging battery index
             */
            Battery chargingBattery = batteries.get(index);
            totalChargeTime = totalChargeTime + time;
            chargingBattery.charge(c, time);

            for (int in = 0; in < batteries.size(); in++) {
                if (in != index) {
                    batteries.get(in).drain(time);
                }
            }

            /*
             * System.out.println("battery charged: " + index); for (Battery b :
             * batteries) { System.out.println(b.toString()); }
             */
            // System.out.println();
            // System.out.println();

        }

        return totalChargeTime;
    }

    public static double phoneCharger2(List<Battery> batteries, double c) {
        double totalChargeTime = 0f;
        double chargeLeft = Double.MAX_VALUE;

        while (chargeLeft >= 0.00001f) {
            double min = Double.MAX_VALUE;

            chargeLeft = Double.MAX_VALUE;

            List<Integer> minTimeLeftBatteries = new ArrayList<>();
            for (int i = 0; i < batteries.size(); i++) {
                Battery b = batteries.get(i);
                double elem = b.timeLeft;
                if (elem < min) {
                    min = elem;
                    minTimeLeftBatteries.clear();
                    minTimeLeftBatteries.add(i);
                } else if (elem == min) {
                    minTimeLeftBatteries.add(i);
                }

                if (b.chargeLeft < chargeLeft) {
                    chargeLeft = b.chargeLeft;
                }
            }
            if (chargeLeft < 0.00001f) {
                // System.out.println("chargeleft : " + chargeLeft);
                return totalChargeTime;
            }

            int index = -1;
            double time;
            if (minTimeLeftBatteries.size() == 1) {
                index = minTimeLeftBatteries.get(0);
                time = batteries.get(index).timeLeft;
            } else if (minTimeLeftBatteries.size() == 2) {
                int idx = r.nextInt(minTimeLeftBatteries.size());
                index = minTimeLeftBatteries.get(idx);
                time = batteries.get(index).timeLeft / (minTimeLeftBatteries.size());
            } else {
                int idx = r.nextInt(minTimeLeftBatteries.size());
                index = minTimeLeftBatteries.get(idx);
                time = batteries.get(index).timeLeft / (minTimeLeftBatteries.size() - 1);
            }

            // System.out.println("time of charge: " + time);

            /*
             * charging battery index
             */
            Battery chargingBattery = batteries.get(index);
            totalChargeTime = totalChargeTime + time;
            chargingBattery.charge(c, time);

            for (int in = 0; in < batteries.size(); in++) {
                if (in != index) {
                    batteries.get(in).drain(time);
                }
            }

            /*
             * System.out.println("battery charged: " + index); for (Battery b :
             * batteries) { System.out.println(b.toString()); }
             */
            // System.out.println();
            // System.out.println();

        }

        return totalChargeTime;
    }

    private static boolean isEqual(double a, double b) {
        return Math.abs(a - b) < 0.01d;
    }
}
