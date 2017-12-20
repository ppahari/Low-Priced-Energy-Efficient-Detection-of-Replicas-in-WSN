package middle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import middle.SaveR;

public class Save {

    public String getSource() {
        return new SNode().getSource();
    }

    public int getPort() {
        return new SNode().getPort();
    }

    public void setProperty(String file, String source, String text) {
        try {
            Properties properties = new Properties();
            FileOutputStream fos = new FileOutputStream(file, true);
            properties.setProperty(source, text);
            properties.store(fos, source);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void routing(SaveR mrx, Vector<String> path, String dest) {
      try {
            Set<String> set = mrx.hm.keySet();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                String[] data = key.split(",");
                String nnode = data[0];
                String nsys = data[2];
                int nPort = Integer.parseInt(data[3]);
                if (getAvailable(path, nnode)) {
                    Socket socket = new Socket(nsys, nPort);
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject("REQ");
                    oos.writeObject(path);
                    oos.writeObject(dest);
                }

            }

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private boolean getAvailable(Vector<String> path, String nei) {
        // TODO Auto-generated method stub
        return !path.contains(nei);
    }

    public void sendData(SaveR mrx, Vector<String> path, String text) {
        // TODO Auto-generated method stub
        try {
            path.remove(0);
            String neigh = path.get(0);
            Set<String> set = mrx.hm.keySet();
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
                    oos.writeObject("DATA");
                    oos.writeObject(path);
                    oos.writeObject(text);
                    break;
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getEnergy() {
        // TODO Auto-generated method stub
        return new SNode().getEnergy();
    }

    public int getMPCR(int size) {
        // TODO Auto-generated method stub
        return new Random().nextInt(size);
    }

    public Vector<String> getPath(String mpcrPath) {
        // TODO Auto-generated method stub
        Vector<String> vec = new Vector<String>();
        StringTokenizer st = new StringTokenizer(mpcrPath, "->");
        while (st.hasMoreElements()) {
            String object = (String) st.nextElement();
            vec.add(object);
        }
        return vec;
    }
}
