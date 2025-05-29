package intershipTest;

public class Notebook {
    private int batteryLvl = 50;

    public void insertCharges(int[] charges) {
        for (int charge : charges) {
            if (charge > 0) {
                this.batteryLvl += charge;
                if (this.batteryLvl > 100) {
                    setBatteryLvl(100);

                }
            } else {
                this.batteryLvl += charge;
                if (batteryLvl < 0) {
                    setBatteryLvl(0);
                }
            }
        }
    }

    public int getBattery() {
        return this.batteryLvl;
    }

    private void setBatteryLvl(int batteryLvl) {
        this.batteryLvl = batteryLvl;
    }

}
