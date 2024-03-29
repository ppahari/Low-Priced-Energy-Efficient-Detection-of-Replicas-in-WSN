package middle;

import middle.Node_Design;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class SaveR extends Thread {

    private InetAddress ia;
    public HashMap<String, Long> hm = new HashMap<String, Long>();
    int dis;
    Node_Design node;

    public SaveR(Node_Design node) {
        this.node = node;
        dis = Integer.parseInt(node.dis);
        start();
        availability();
    }

    private void availability() {
        // TODO Auto-generated method stub
        new Thread(this) {
            @Override
            public void run() {
                // TODO Auto-generated method stub

                while (true) {
                    try {
                        Date date = new Date();
                        long pre = date.getTime();
                        Thread.sleep(1000);
                        Set<String> set = hm.keySet();
                        Iterator<String> it = set.iterator();
                        while (it.hasNext()) {
                            String key = (String) it.next();
                            long time = hm.get(key);
                            if (time < pre) {
                                hm.remove(key);
                                refresh(hm);
                                break;
                            }
                        }
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                        continue;
                    }
                }
            }
        }.start();
    }

    private void refresh(HashMap<String, Long> hm) {
        // TODO Auto-generated method stub
        node.jTextArea2.setText("");
        Set<String> set = hm.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            String[] data = key.split(",");
            String nnode = data[0];
            String nsys = data[2];
            node.jTextArea2.append(nnode + " " + nsys + "\n");

        }
    }

    private void print(String str) {
        // TODO Auto-generated method stub
        if (hm.containsKey(str)) {
            hm.put(str, new Date().getTime());
        } else {
            String[] data = str.split(",");
            String nnode = data[0];
            int ndis = Integer.parseInt(data[1]);
            String nsys = data[2];
            int min = dis - 10;
            int max = dis + 10;
            if ((!nnode.equals(node.source)) && ndis >= min && ndis <= max) {
                node.jTextArea2.append(nnode + " " + nsys + "\n");
                hm.put(str, new Date().getTime());
                System.out.println(hm);
            }
        }


    }

    public void run() {
        try {
            while (true) {
                ia = InetAddress.getByName("228.5.6.7");
                MulticastSocket ms = new MulticastSocket(4444);
                ms.joinGroup(ia);
                byte[] b = new byte[512];
                DatagramPacket dp = new DatagramPacket(b, b.length);
                ms.receive(dp);
                String str = new String(dp.getData());
                str = str.trim();
                print(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}