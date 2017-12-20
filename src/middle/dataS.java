/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middle;

import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author IBN 03
 */
public class dataS extends javax.swing.JFrame {

    /**
     * Creates new form dataS
     */
    public dataS() {
        initComponents();
        a1.setVisible(false);
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        a5.setVisible(false);
        a6.setVisible(false);
        a7.setVisible(false);
        a8.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        c6.setVisible(false);
        c7.setVisible(false);
        c8.setVisible(false);
        d1.setVisible(false);
        d2.setVisible(false);
        d3.setVisible(false);
        d4.setVisible(false);
        d5.setVisible(false);
        d6.setVisible(false);
        d7.setVisible(false);
        d8.setVisible(false);
        e1.setVisible(false);
        e2.setVisible(false);
        e3.setVisible(false);
        e4.setVisible(false);
        e5.setVisible(false);
        e6.setVisible(false);
        e7.setVisible(false);
        e8.setVisible(false);
        f1.setVisible(false);
        f2.setVisible(false);
        f3.setVisible(false);
        f4.setVisible(false);
        f5.setVisible(false);
        f6.setVisible(false);
        f7.setVisible(false);
        f8.setVisible(false);
        g1.setVisible(false);
        g2.setVisible(false);
        g3.setVisible(false);
        g4.setVisible(false);
        g5.setVisible(false);
        g6.setVisible(false);
        g7.setVisible(false);
        g8.setVisible(false);
        h1.setVisible(false);
        h2.setVisible(false);
        h3.setVisible(false);
        h4.setVisible(false);
        h5.setVisible(false);
        h6.setVisible(false);
        h7.setVisible(false);
        h8.setVisible(false);
        i1.setVisible(false);
        i2.setVisible(false);
        i3.setVisible(false);
        i4.setVisible(false);
        i5.setVisible(false);
        i6.setVisible(false);
        aaa2.setVisible(false);
        aaa3.setVisible(false);
        aaa4.setVisible(false);
        aaa5.setVisible(false);
        aaa6.setVisible(false);
        aaa7.setVisible(false);
        aaa8.setVisible(false);
        aaa1.setVisible(false);
        bbb2.setVisible(false);
        
        Thread t = new Thread(new connect());
        t.start();

    }

    class connect implements Runnable {

        public void run() {
            try {
                Thread.sleep(500);
              //  bbb1.setVisible(false);
                bbb2.setVisible(true);
                Thread.sleep(500);
                a1.setVisible(true);
                a2.setVisible(true);
                a3.setVisible(true);
                a4.setVisible(true);
                a5.setVisible(true);
                a6.setVisible(true);
                a7.setVisible(true);
                a8.setVisible(true);
              //  gg1.setVisible(false);
                Thread.sleep(500);
              //  ar1.setVisible(false);
                aaa1.setVisible(true);
                Thread.sleep(500);
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(true);
                b6.setVisible(true);
                b7.setVisible(true);
                b8.setVisible(true);
              //  gg2.setVisible(false);
                Thread.sleep(500);
              //  ar2.setVisible(false);
                aaa2.setVisible(true);
                Thread.sleep(500);
                c1.setVisible(true);
                c2.setVisible(true);
                c3.setVisible(true);
                c4.setVisible(true);
                c5.setVisible(true);
                c6.setVisible(true);
                c7.setVisible(true);
                c8.setVisible(true);
             //   gg3.setVisible(false);
                Thread.sleep(500);
              //  ar3.setVisible(false);
                aaa3.setVisible(true);
                Thread.sleep(500);
                d1.setVisible(true);
                d2.setVisible(true);
                d3.setVisible(true);
                d4.setVisible(true);
                d5.setVisible(true);
                d6.setVisible(true);
                d7.setVisible(true);
                d8.setVisible(true);
              //  gg4.setVisible(false);
                Thread.sleep(500);
               // ar4.setVisible(false);
                aaa4.setVisible(true);
                Thread.sleep(500);
                e1.setVisible(true);
                e2.setVisible(true);
                e3.setVisible(true);
                e4.setVisible(true);
                e5.setVisible(true);
                e6.setVisible(true);
                e7.setVisible(true);
                e8.setVisible(true);
              //  gg5.setVisible(false);
                Thread.sleep(500);
              //  ar5.setVisible(false);
                aaa5.setVisible(true);
                Thread.sleep(500);
                f1.setVisible(true);
                f2.setVisible(true);
                f3.setVisible(true);
                f4.setVisible(true);
                f5.setVisible(true);
                f6.setVisible(true);
                f7.setVisible(true);
                f8.setVisible(true);
              //  gg6.setVisible(false);
                Thread.sleep(500);
              //  ar6.setVisible(false);
                aaa6.setVisible(true);
                Thread.sleep(500);
                g1.setVisible(true);
                g2.setVisible(true);
                g3.setVisible(true);
                g4.setVisible(true);
                g5.setVisible(true);
                g6.setVisible(true);
                g7.setVisible(true);
                g8.setVisible(true);
              //  gg7.setVisible(false);
                Thread.sleep(500);
              //  ar7.setVisible(false);
                aaa7.setVisible(true);
                Thread.sleep(500);
                h1.setVisible(true);
                h2.setVisible(true);
                h3.setVisible(true);
                h4.setVisible(true);
                h5.setVisible(true);
                h6.setVisible(true);
                h7.setVisible(true);
                h8.setVisible(true);
              //  gg8.setVisible(false);
                Thread.sleep(500);
              //  ar8.setVisible(false);
                aaa8.setVisible(true);
                Thread.sleep(500);
                i1.setVisible(true);
                i2.setVisible(true);
                i3.setVisible(true);
                i4.setVisible(true);
                i5.setVisible(true);
                i6.setVisible(true);
                JOptionPane.showMessageDialog(null, "Reached Destination");
                try {
                    new Node_Design().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(dataS.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(dataS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        aaa2 = new javax.swing.JLabel();
        aaa7 = new javax.swing.JLabel();
        aaa8 = new javax.swing.JLabel();
        aaa5 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        f8 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f6 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f7 = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        g8 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        g6 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g7 = new javax.swing.JLabel();
        g5 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e8 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h8 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h6 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h7 = new javax.swing.JLabel();
        h5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aaa3 = new javax.swing.JLabel();
        aaa4 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        i6 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        aaa1 = new javax.swing.JLabel();
        bbb2 = new javax.swing.JLabel();
        aaa6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        e9 = new javax.swing.JLabel();
        i7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/anim_ant.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 660, 110, 83);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(b6);
        b6.setBounds(110, 510, 20, 20);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(b4);
        b4.setBounds(130, 490, 20, 20);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(b8);
        b8.setBounds(90, 490, 20, 20);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(b2);
        b2.setBounds(110, 470, 16, 20);

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(a5);
        a5.setBounds(220, 600, 16, 25);

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(a3);
        a3.setBounds(240, 580, 16, 25);

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(a7);
        a7.setBounds(200, 580, 16, 25);

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(a1);
        a1.setBounds(220, 560, 16, 25);

        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(c5);
        c5.setBounds(80, 320, 20, 20);

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(c4);
        c4.setBounds(100, 310, 20, 20);

        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(c8);
        c8.setBounds(60, 300, 20, 20);

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(c1);
        c1.setBounds(80, 290, 20, 20);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(b5);
        b5.setBounds(110, 500, 20, 16);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(b3);
        b3.setBounds(130, 480, 20, 16);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(b7);
        b7.setBounds(90, 480, 20, 16);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(b1);
        b1.setBounds(110, 460, 20, 16);

        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(d1);
        d1.setBounds(220, 140, 20, 20);

        d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(d4);
        d4.setBounds(240, 170, 20, 20);

        d8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(d8);
        d8.setBounds(200, 170, 20, 20);

        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(d2);
        d2.setBounds(220, 150, 20, 20);

        d6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(d6);
        d6.setBounds(220, 190, 20, 16);

        d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(d3);
        d3.setBounds(240, 160, 20, 16);

        d7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(d7);
        d7.setBounds(200, 160, 20, 16);

        d5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(d5);
        d5.setBounds(220, 180, 20, 20);

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(a6);
        a6.setBounds(220, 610, 16, 25);

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(a4);
        a4.setBounds(240, 590, 16, 25);

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(a8);
        a8.setBounds(200, 590, 16, 25);

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(a2);
        a2.setBounds(220, 570, 16, 25);

        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(c6);
        c6.setBounds(80, 330, 20, 20);

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(c3);
        c3.setBounds(100, 300, 20, 20);

        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(c7);
        c7.setBounds(60, 310, 20, 20);

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(c2);
        c2.setBounds(80, 280, 20, 20);

        aaa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/upwards_arrow8.png"))); // NOI18N
        getContentPane().add(aaa2);
        aaa2.setBounds(60, 370, 48, 40);

        aaa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downwards_arrow_u2193_icon_48x48.png"))); // NOI18N
        getContentPane().add(aaa7);
        aaa7.setBounds(700, 380, 50, 30);

        aaa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/south_west_arrow_u2199_icon_48x48.png"))); // NOI18N
        getContentPane().add(aaa8);
        aaa8.setBounds(630, 530, 48, 40);

        aaa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(aaa5);
        aaa5.setBounds(490, 140, 60, 30);

        f1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(f1);
        f1.setBounds(590, 150, 20, 20);

        f4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(f4);
        f4.setBounds(610, 180, 20, 20);

        f8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(f8);
        f8.setBounds(570, 180, 20, 20);

        f2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(f2);
        f2.setBounds(590, 160, 20, 20);

        f6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(f6);
        f6.setBounds(590, 200, 20, 16);

        f3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(f3);
        f3.setBounds(610, 170, 20, 16);

        f7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(f7);
        f7.setBounds(570, 170, 20, 16);

        f5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(f5);
        f5.setBounds(590, 190, 20, 20);

        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(g1);
        g1.setBounds(700, 280, 20, 20);

        g4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(g4);
        g4.setBounds(720, 310, 20, 20);

        g8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(g8);
        g8.setBounds(680, 310, 20, 20);

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(g2);
        g2.setBounds(700, 290, 20, 20);

        g6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(g6);
        g6.setBounds(700, 330, 20, 16);

        g3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(g3);
        g3.setBounds(720, 300, 20, 16);

        g7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(g7);
        g7.setBounds(680, 300, 20, 16);

        g5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(g5);
        g5.setBounds(700, 320, 20, 20);

        e1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(e1);
        e1.setBounds(400, 90, 20, 20);

        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(e4);
        e4.setBounds(420, 120, 20, 20);

        e8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(e8);
        e8.setBounds(380, 120, 20, 20);

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(e2);
        e2.setBounds(400, 100, 20, 20);

        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(e5);
        e5.setBounds(400, 140, 20, 16);

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(e3);
        e3.setBounds(420, 110, 20, 16);

        e7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(e7);
        e7.setBounds(380, 110, 20, 16);

        e6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(e6);
        e6.setBounds(400, 130, 20, 20);

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(h1);
        h1.setBounds(700, 450, 20, 20);

        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(h4);
        h4.setBounds(720, 480, 20, 20);

        h8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(h8);
        h8.setBounds(680, 480, 20, 20);

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(h2);
        h2.setBounds(700, 460, 20, 20);

        h6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(h6);
        h6.setBounds(700, 500, 20, 16);

        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(h3);
        h3.setBounds(720, 470, 20, 16);

        h7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(h7);
        h7.setBounds(680, 470, 20, 16);

        h5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        getContentPane().add(h5);
        h5.setBounds(700, 490, 20, 20);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 504, 0, 20);

        aaa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/north_east_.png"))); // NOI18N
        getContentPane().add(aaa3);
        aaa3.setBounds(130, 210, 40, 30);

        aaa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rightwards_arrow_u2192_icon_48x48.png"))); // NOI18N
        getContentPane().add(aaa4);
        aaa4.setBounds(290, 120, 40, 30);

        i4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-circle-icone-4156-16.png"))); // NOI18N
        getContentPane().add(i4);
        i4.setBounds(620, 580, 20, 20);

        i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-circle-icone-4156-16.png"))); // NOI18N
        getContentPane().add(i2);
        i2.setBounds(580, 570, 20, 20);

        i3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-circle-icone-4156-16.png"))); // NOI18N
        getContentPane().add(i3);
        i3.setBounds(600, 580, 20, 20);

        i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-circle-icone-4156-16.png"))); // NOI18N
        getContentPane().add(i5);
        i5.setBounds(580, 590, 20, 20);

        i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-circle-icone-4156-16.png"))); // NOI18N
        getContentPane().add(i6);
        i6.setBounds(570, 610, 20, 20);

        i1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-circle-icone-4156-16.png"))); // NOI18N
        getContentPane().add(i1);
        i1.setBounds(570, 550, 20, 20);

        aaa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/north_west_arrow_u2196_icon_48x48.png"))); // NOI18N
        getContentPane().add(aaa1);
        aaa1.setBounds(140, 540, 50, 30);

        bbb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/north_west_arrow_u2196_icon_48x48.png"))); // NOI18N
        getContentPane().add(bbb2);
        bbb2.setBounds(290, 650, 50, 30);

        aaa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(aaa6);
        aaa6.setBounds(650, 230, 60, 30);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Wireless Sensor Networks");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 40, 450, 40);

        e9.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        e9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circle_orange (1).png"))); // NOI18N
        e9.setText("Data");
        getContentPane().add(e9);
        e9.setBounds(20, 90, 80, 20);

        i7.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        i7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-circle-icone-4156-16.png"))); // NOI18N
        i7.setText("Destination");
        getContentPane().add(i7);
        i7.setBounds(20, 120, 140, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1607253.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, 0, 800, 730);

        jProgressBar1.setMaximum(40);
        jProgressBar1.setMinimum(10);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(580, 60, 170, 30);

        setSize(new java.awt.Dimension(805, 766));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dataS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataS().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel aaa1;
    private javax.swing.JLabel aaa2;
    private javax.swing.JLabel aaa3;
    private javax.swing.JLabel aaa4;
    private javax.swing.JLabel aaa5;
    private javax.swing.JLabel aaa6;
    private javax.swing.JLabel aaa7;
    private javax.swing.JLabel aaa8;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel bbb2;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d7;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e6;
    private javax.swing.JLabel e7;
    private javax.swing.JLabel e8;
    private javax.swing.JLabel e9;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel f5;
    private javax.swing.JLabel f6;
    private javax.swing.JLabel f7;
    private javax.swing.JLabel f8;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g4;
    private javax.swing.JLabel g5;
    private javax.swing.JLabel g6;
    private javax.swing.JLabel g7;
    private javax.swing.JLabel g8;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel h5;
    private javax.swing.JLabel h6;
    private javax.swing.JLabel h7;
    private javax.swing.JLabel h8;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel i4;
    private javax.swing.JLabel i5;
    private javax.swing.JLabel i6;
    private javax.swing.JLabel i7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
