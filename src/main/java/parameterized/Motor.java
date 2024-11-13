package parameterized;

public class Motor{
    private double power;

    public void increaseFivePercentPower () {
        this.power = this.power * 1.05;
    }

    public void increaseTenPercentPower () {
        this.power = this.power * 1.10;
    }
}

