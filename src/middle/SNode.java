package middle;

import java.util.Random;

public class SNode {

    Random rr = new Random();
    String str = "";

    public String getSource() {
        str = "";
        str = "Node  " + String.valueOf(rr.nextInt(10))
                + String.valueOf(rr.nextInt(10))
                + String.valueOf(rr.nextInt(10));
        return str;
    }

    public int getPort() {
        String str = "";
        str = String.valueOf(rr.nextInt(10)) + String.valueOf(rr.nextInt(10))
                + String.valueOf(rr.nextInt(10))
                + String.valueOf(rr.nextInt(10));
        return Integer.parseInt(str);
    }

    public int getEnergy() {
        return rr.nextInt(101);
    }
}