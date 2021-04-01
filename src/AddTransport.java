
import SQLConnection.SQLConnection;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddTransport extends javax.swing.JFrame {

    /**
     * Creates new form addtransport
     */
    public AddTransport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c = new javax.swing.JRadioButton();
        t = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        vrn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        d = new javax.swing.JComboBox();
        m = new javax.swing.JComboBox();
        y = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        acn = new javax.swing.JTextField();
        ab = new javax.swing.JButton();
        cb = new javax.swing.JButton();
        bb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("ADD TRANSPORT DETAILS");

        jLabel2.setText("TYPE:-");

        buttonGroup2.add(c);
        c.setText("Cab");
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        c.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cStateChanged(evt);
            }
        });

        buttonGroup2.add(t);
        t.setText("Traveller");
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        t.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tStateChanged(evt);
            }
        });

        buttonGroup2.add(b);
        b.setText("Bus");
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        b.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bStateChanged(evt);
            }
        });

        jLabel3.setText("vehicle registration number");

        vrn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vrnFocusLost(evt);
            }
        });
        vrn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vrnKeyPressed(evt);
            }
        });

        jLabel4.setText("Maximum number of persons");

        np.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                npKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                npKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DRIVER DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel5.setText("Name");

        jLabel6.setText("Date Of Birth");

        d.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        m.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        y.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", " " }));

        jLabel7.setText("Address");

        jLabel8.setText("Identity Card Number");

        acn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                acnFocusLost(evt);
            }
        });
        acn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(acn, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addComponent(jLabel8))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(acn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        ab.setText("Add");
        ab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abActionPerformed(evt);
            }
        });

        cb.setText("Clear");
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        bb.setText("Back");
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(c)
                                .addGap(18, 18, 18)
                                .addComponent(t))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vrn, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(b)
                            .addComponent(np)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(ab)
                        .addGap(34, 34, 34)
                        .addComponent(cb)
                        .addGap(29, 29, 29)
                        .addComponent(bb)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c)
                    .addComponent(t)
                    .addComponent(b))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ab)
                    .addComponent(cb)
                    .addComponent(bb))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String removeCharAt(String s, int p) {
        return s.substring(0, p) + s.substring(p + 1);
    }
    private void abActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abActionPerformed
        String type = null;
        if (c.isSelected()) {
            type = "cab";
        } else if (t.isSelected()) {
            type = "traveller";
        } else if (b.isSelected()) {
            type = "bus";
        }
        String reg = vrn.getText();
        String s = np.getText();
        String name = n.getText();
        String date = (String) d.getSelectedItem();
        String month = (String) m.getSelectedItem();
        String year = (String) y.getSelectedItem();
        String address = ad.getText();
        String an = acn.getText();
        if (reg.length() == 0 || name.length() == 0 || address.length() == 0 || an.length() == 0) {
            JOptionPane.showMessageDialog(null, "Field cannot be empty!");
        } else if (d.getSelectedIndex() == 0 || m.getSelectedIndex() == 0 || y.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select a valid date!");
        } else {
            try {
                Connection conn = SQLConnection.connect();
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String query = "insert into transport values('" + type + "','" + reg + "','" + s + "','" + name + "','" + year + "-" + month + "-" + date + "','" + an + "','" + address + "')";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "The information about transport and driver has been added to database");
                stmt.close();
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_abActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        c.setSelected(false);
        b.setSelected(false);
        t.setSelected(false);
        vrn.setText("");
        np.setText("");
        n.setText("");
        d.setSelectedIndex(0);
        m.setSelectedIndex(0);
        y.setSelectedIndex(0);
        ad.setText("");
        acn.setText("");
    }//GEN-LAST:event_cbActionPerformed

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
        this.dispose();
        new AdminMenu().setVisible(true);
    }//GEN-LAST:event_bbActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        vrn.setEnabled(false);
        np.setEnabled(false);
        jPanel1.setVisible(false);
        ab.setVisible(false);
        cb.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void cStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cStateChanged

    }//GEN-LAST:event_cStateChanged

    private void tStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tStateChanged

    }//GEN-LAST:event_tStateChanged

    private void bStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bStateChanged

    }//GEN-LAST:event_bStateChanged

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        vrn.setEnabled(true);
        np.setEnabled(true);
        jPanel1.setVisible(true);
        ab.setVisible(true);
        cb.setVisible(true);
    }//GEN-LAST:event_cMouseClicked

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
        vrn.setEnabled(true);
        np.setEnabled(true);
        jPanel1.setVisible(true);
        ab.setVisible(true);
        cb.setVisible(true);
    }//GEN-LAST:event_tMouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        vrn.setEnabled(true);
        np.setEnabled(true);
        jPanel1.setVisible(true);
        ab.setVisible(true);
        cb.setVisible(true);
    }//GEN-LAST:event_bMouseClicked

    private void vrnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vrnKeyPressed

    }//GEN-LAST:event_vrnKeyPressed

    private void acnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acnKeyPressed

    }//GEN-LAST:event_acnKeyPressed

    private void npKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npKeyPressed
        np.setBackground(Color.white);
    }//GEN-LAST:event_npKeyPressed

    private void npKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npKeyTyped

    }//GEN-LAST:event_npKeyTyped

    private void vrnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vrnFocusLost
        String s = vrn.getText();
        if (s.length() != 10) {
            JOptionPane.showMessageDialog(null, "Vehicle number Invalid:Cannot enter more or less than 10 characters");
        }
    }//GEN-LAST:event_vrnFocusLost

    private void acnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acnFocusLost
        String s = acn.getText();
        if (s.length() != 12) {
            JOptionPane.showMessageDialog(null, "identity number Invalid:Cannot enter more or less than 12 characters");
        }
    }//GEN-LAST:event_acnFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTransport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ab;
    private javax.swing.JTextField acn;
    private javax.swing.JTextField ad;
    private javax.swing.JRadioButton b;
    private javax.swing.JButton bb;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton c;
    private javax.swing.JButton cb;
    private javax.swing.JComboBox d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox m;
    private javax.swing.JTextField n;
    private javax.swing.JTextField np;
    private javax.swing.JRadioButton t;
    private javax.swing.JTextField vrn;
    private javax.swing.JComboBox y;
    // End of variables declaration//GEN-END:variables

}
