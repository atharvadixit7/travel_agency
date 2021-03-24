
import SQLConnection.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    static Connection conn = null;

    public login() {
        initComponents();
        conn = SQLConnection.connect();
    }

    private void closeWindow() {
        try {
            conn.close();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Excetpion caught in closing Connection" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        p = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter User Name");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(20, 110, 150, 21);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Password");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(20, 170, 140, 21);

        n.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        n.setForeground(new java.awt.Color(255, 255, 255));
        n.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        n.setOpaque(false);
        jLayeredPane1.add(n);
        n.setBounds(230, 110, 200, 25);

        p.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        p.setOpaque(false);
        jLayeredPane1.add(p);
        p.setBounds(230, 170, 199, 31);

        jButton1.setBackground(new java.awt.Color(203, 237, 231));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setMnemonic('h');
        jButton1.setText("LOGIN");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(90, 320, 100, 29);

        jButton2.setBackground(new java.awt.Color(203, 237, 231));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(330, 320, 98, 31);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("NAKSHATRA  TRAVELS");
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(110, 20, 290, 50);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wonders-of-the-world.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(0, 0, 570, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ?", "Exit Confirmation", 0, JOptionPane.PLAIN_MESSAGE);
        if (a == 0) {
            System.exit(0);
        }
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = n.getText();
        String pass = new String(p.getPassword());
        name = name.trim();
        pass = pass.trim();
        if (!(name.equals("") || pass.equals(""))) {
            try {
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String query = "select * from login where username='" + name + "' and password='" + pass + "';";
                ResultSet rs = stmt.executeQuery(query);
                rs.first();
                String access = rs.getString("AccessType");
                if (rs.first()) {
                    if (access.equals("admin")) {
                        JOptionPane.showMessageDialog(null, "welcome," + access + " " + name + " to the system");
                        new adminmenu().setVisible(true);
                        closeWindow();
                    }
                    if (access.equals("agent")) {
                        JOptionPane.showMessageDialog(null, "WELCOME," + access + " " + name + " To The System");
                        new agentmenu().setVisible(true);
                        closeWindow();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, " please! check your userid and password");
                }
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Userid and Password compulsory! Please enter them.");
            n.setText("");
            p.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField n;
    private javax.swing.JPasswordField p;
    // End of variables declaration//GEN-END:variables

}
