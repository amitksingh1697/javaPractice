
package code;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewUsers extends javax.swing.JFrame {

    public ViewUsers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nm = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        g1 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        d = new com.toedter.calendar.JDateChooser();
        c = new javax.swing.JComboBox<>();
        sk1 = new javax.swing.JCheckBox();
        sk2 = new javax.swing.JCheckBox();
        sk3 = new javax.swing.JCheckBox();
        sk4 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        UID = new javax.swing.JLabel();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Users");
        setMinimumSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        nm.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        nm.setForeground(new java.awt.Color(255, 255, 255));
        nm.setText("Name : ");

        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });
        tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfKeyReleased(evt);
            }
        });

        rTable.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        rTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Gender", "DOB", "Country", "Skills", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rTable);

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name : ");

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender :");

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DOB :");

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Country :");

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Skills :");

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address :");

        buttonGroup1.add(g1);
        g1.setSelected(true);
        g1.setText("Male");

        buttonGroup1.add(g2);
        g2.setText("Female");

        buttonGroup1.add(g3);
        g3.setText("Other");

        c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "Nepal", "Bhutan", "Braseil", "Japan", "Afganistan", "Israeil", "Austrailia", "Russia", "Canada", "United Arab Emirates", "United States of America", "United Kingdom", " " }));

        sk1.setText("Cricket");

        sk2.setText("Dance");
        sk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sk2ActionPerformed(evt);
            }
        });

        sk3.setText("Singing");

        sk4.setText("Coding");

        addr.setColumns(20);
        addr.setRows(5);
        jScrollPane2.setViewportView(addr);

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User ID :");

        UID.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        UID.setForeground(new java.awt.Color(255, 255, 255));
        UID.setText("--------------------------------");

        UPDATE.setText("Update");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        DELETE.setText("Delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(d, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(g1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(g2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(g3))
                                                .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(UID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(sk1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(sk2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(sk3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(sk4)))
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nm))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(UID)
                    .addComponent(UPDATE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(g1)
                    .addComponent(g3)
                    .addComponent(g2)
                    .addComponent(DELETE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sk1)
                    .addComponent(sk4)
                    .addComponent(sk3)
                    .addComponent(sk2))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfActionPerformed

    private void tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKeyReleased
        String n=tf.getText();
        try {
            DefaultTableModel dtm=(DefaultTableModel)rTable.getModel();
            int rc=dtm.getRowCount();
            while(rc--!=0){
                dtm.removeRow(0);
            }
            db.DBConnect.getUserLike.setString(1, "%"+n+"%");
            ResultSet rs=db.DBConnect.getUserLike.executeQuery();
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getDate(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                dtm.addRow(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tfKeyReleased

    private void sk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sk2ActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        int uid=Integer.parseInt(UID.getText());
        String s1=n.getText();
        String s2="";
        if(g1.isSelected()){
            s2=g1.getText();
        }else if(g2.isSelected()){
            s2=g2.getText();
        }else if(g3.isSelected()){
            s2=g3.getText();
        }
        java.util.Date dt=d.getDate();
        if(dt!=null){
        java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
//        String s3=sdf.format(dt);
            String s4=(String)c.getSelectedItem();
            String s5="";
            if(sk1.isSelected()){
                s5=s5+" "+sk1.getText();
            }
            if(sk2.isSelected()){
                s5=s5+" "+sk2.getText();
            }
            if(sk3.isSelected()){
                s5=s5+" "+sk3.getText();
            }
            if(sk4.isSelected()){
                s5=s5+" "+sk4.getText();
            }
            String s6=addr.getText();
        //code to convert java.util.Date to java.sql.Date
        java.sql.Date sdt=new java.sql.Date(dt.getTime());
            try{
              db.DBConnect.updateUser.setString(1, s1);
              db.DBConnect.updateUser.setString(2, s2);
              db.DBConnect.updateUser.setDate(3, sdt);
              db.DBConnect.updateUser.setString(4, s4);
              db.DBConnect.updateUser.setString(5, s5);
              db.DBConnect.updateUser.setString(6, s6);
              db.DBConnect.updateUser.setInt(7, uid);
              db.DBConnect.updateUser.executeUpdate();
              JOptionPane.showMessageDialog(this, "Your details are updated into Database.");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,ex);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
            try{
            int U=Integer.parseInt(UID.getText());
            db.DBConnect.deleteUser.setInt(1, U);
            db.DBConnect.deleteUser.executeUpdate();
            JOptionPane.showMessageDialog(this,"User Deleted");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,ex);
                ex.printStackTrace();
            }
    }//GEN-LAST:event_DELETEActionPerformed

    private void rTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rTableMouseClicked
            int ri = rTable.getSelectedRow();
            if(ri!=-1){
                int x=(Integer)rTable.getValueAt(ri, 0);
                UID.setText(String.valueOf(x));
//                UID.setText(String.valueOf((Integer)rTable.getValueAt(ri, 0)));
                n.setText((String)rTable.getValueAt(ri, 1));
                String g=(String)rTable.getValueAt(ri, 2);
                
                if(g.equals("Male"))
                    g1.setSelected(true);
                else if(g.equals("Female"))
                    g2.setSelected(true);
                else
                    g3.setSelected(true);
                
                d.setDate((java.util.Date)rTable.getValueAt(ri, 3));
                c.setSelectedItem((String)rTable.getValueAt(ri, 4));
                
                String s=(String)rTable.getValueAt(ri,5);
                sk1.setSelected(false);
                sk2.setSelected(false);
                sk3.setSelected(false);
                sk4.setSelected(false);
                StringTokenizer st=new StringTokenizer(s," ");
                while(st.hasMoreTokens()){
                    String stk=st.nextToken();
                    if(stk.equals("Cricket"))
                        sk1.setSelected(true);
                    if(stk.equals("Dance"))
                        sk2.setSelected(true);
                    if(stk.equals("Singing"))
                        sk3.setSelected(true);
                    if(stk.equals("Coding"))
                        sk4.setSelected(true);
                }
                addr.setText((String)rTable.getValueAt(ri,6));
            }
    }//GEN-LAST:event_rTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel UID;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextArea addr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> c;
    private com.toedter.calendar.JDateChooser d;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField n;
    private javax.swing.JLabel nm;
    private javax.swing.JTable rTable;
    private javax.swing.JCheckBox sk1;
    private javax.swing.JCheckBox sk2;
    private javax.swing.JCheckBox sk3;
    private javax.swing.JCheckBox sk4;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
