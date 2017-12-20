package middle;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Get extends Thread {

    private Socket soc;
    private ServerSocket serSoc;
    private ObjectInputStream ois;
    int port;
    Node_Design node;
    Save action;
    boolean flag;
    int len;
    public TreeMap<Integer, String> allPaths = new TreeMap<Integer, String>();

    public Get(Node_Design node, int port, Save action) {
        this.node = node;
        this.port = port;
        this.action = action;
        start();
    }

    public void run() {
        try {
            receive();
        } catch (Exception e) {
        }
    }

    public void receive() {
        try {
            serSoc = new ServerSocket(port);
            while (true) {
                soc = serSoc.accept();
                ois = new ObjectInputStream(soc.getInputStream());
                String str = (String) ois.readObject();
                checkStatus(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkStatus(String str) {
        try {
            if (str.equals("REQ")) {

                Vector<String> path = (Vector<String>) ois.readObject();
                String dest = (String) ois.readObject();
                if (node.source.equals(dest)) {
                    path.add(node.source);
                    Vector<String> retvec = new Vector<String>();
                    for (int i = 0; i < path.size(); i++) {
                        retvec.add(path.get(i));
                    }
                    retvec.remove(retvec.size() - 1);
                    int en = 0;
                    sendCTS(en, retvec, path);

                } else {
                    path.add(node.source);
                    node.action.routing(node.mrx, path, dest);
                }

            } else if (str.equals("REP")) {
                Vector<String> path = (Vector<String>) ois.readObject();
                Vector<String> retvec = (Vector<String>) ois.readObject();
                int en = (Integer) ois.readObject();
                String fPath = "";
                if (retvec.get(0).equals(node.source)) {
                    for (int i = 0; i < path.size(); i++) {
                        if (i < path.size() - 1) {
                            fPath += path.get(i) + "->";
                        } else {
                            fPath += path.get(i);
                        }
                    }
                    en += node.energy;
                    //node.dft.addRow(new Object[] { fPath + "  [ Path Energy : " + en + " ]" });
                    String g = fPath + "  [ Path Energy : " + en + " ]";
                   // node.jTextArea2.setText(g);
                    allPaths.put(en, fPath);
                } else {
                    retvec.remove(retvec.size() - 1);
                    sendCTS(en, retvec, path);
                }
            } else if (str.equals("DATA")) {
                Vector<String> path = (Vector<String>) ois.readObject();
                String text = (String) ois.readObject();
                if (node.source.equals(path.get(path.size() - 1))) {
                    JOptionPane.showMessageDialog(null, "Data Received Successfully...");
                    node.jTextArea3.setText(text);
                } else {
                    action.sendData(node.mrx, path, text);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendCTS(int en, Vector<String> retvec, Vector<String> path) {
        // TODO Auto-generated method stub
        try {
            en += node.energy;
            String neigh = retvec.get(retvec.size() - 1);
            Set<String> set = node.mrx.hm.keySet();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                String[] data = key.split(",");
                String nnode = data[0];
                String nsys = data[2];
                int nport = Integer.parseInt(data[3]);
                if (neigh.equals(nnode)) {
                    Socket socket = new Socket(nsys, nport);
                    ObjectOutputStream oos = new ObjectOutputStream(socket
                            .getOutputStream());
                    oos.writeObject("REP");
                    oos.writeObject(path);
                    oos.writeObject(retvec);
                    oos.writeObject(en);
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
