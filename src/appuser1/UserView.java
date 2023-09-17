/*
 * UserView.java
 *
 * Created on 17 กันยายน 2566, 9:12 น.
 */
package appuser1;

import com.pg.lib.model.UserModel;
import com.pg.lib.service.UserService;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Gus
 */
public class UserView extends javax.swing.JFrame {

    /** Creates new form UserView */
    public UserView() {
        initComponents();
        this.setTitle("โปรเเกรมจัดการข้อมูล User");
        this.setLocationRelativeTo(null);


        DefaultTableModel modeluser = new DefaultTableModel();
        modeluser.addColumn("User_ID");
        modeluser.addColumn("User_User");
        modeluser.addColumn("User_Pass");
        modeluser.addColumn("User_Name");

        tableuser.setModel(modeluser);





    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableuser = new javax.swing.JTable();
        bt_adddata = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        bt_search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edittxt_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edittxt_user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edittxt_pass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edittxt_name = new javax.swing.JTextField();
        bt_edit = new javax.swing.JButton();
        bt_del = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("เเสดงข้อมูล"));

        tableuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableuserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableuser);

        bt_adddata.setText("เพิ่มข้อมูล");
        bt_adddata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_adddataMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("ค้นหารหัสพนักงาน");

        txt_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bt_search.setText("ค้นหาข้อมูล");
        bt_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_searchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_adddata, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_adddata)
                    .addComponent(jLabel8)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("รายละเอียด"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("เเก้ไขข้อมูล");

        edittxt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edittxt_id.setEnabled(false);

        jLabel4.setText("USER_ID");

        jLabel5.setText("USER_USER");

        edittxt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("USER_PASS");

        edittxt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("USER_NAME");

        edittxt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bt_edit.setText("เเก้ไขข้อมูล");
        bt_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editMouseClicked(evt);
            }
        });

        bt_del.setText("ลบข้อมูล");
        bt_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_delMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(edittxt_pass, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(edittxt_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(edittxt_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bt_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edittxt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(bt_del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edittxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edittxt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edittxt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edittxt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_del)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("โปรเเกรมจัดการ User");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("By PakutSingJawala");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(344, 344, 344))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addGap(449, 449, 449))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void bt_adddataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_adddataMouseClicked
    JFrame jf = new UserAdd();
    jf.setTitle("เพิ่มข้อมูล");
    jf.setVisible(true);
   

}//GEN-LAST:event_bt_adddataMouseClicked

private void tableuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableuserMouseClicked
    int row = tableuser.rowAtPoint(evt.getPoint());

    if (row >= 0) {
        String id = tableuser.getValueAt(row, 0).toString();
        String user = tableuser.getValueAt(row, 1).toString();
        String pass = tableuser.getValueAt(row, 2).toString();
        String name = tableuser.getValueAt(row, 3).toString();

        edittxt_id.setText(id);
        edittxt_user.setText(user);
        edittxt_pass.setText(pass);
        edittxt_name.setText(name);
    }


}//GEN-LAST:event_tableuserMouseClicked

private void bt_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_delMouseClicked
    try {
        String id = edittxt_id.getText();

        boolean status = UserService.deleteuser(id);

        if (status) {
            JOptionPane.showMessageDialog(this, "ลบข้อมูลสำเร็จ", "ลบข้อมูล", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "ลบข้อมูลไม่สำเร็จ", "ลบข้อมูล", JOptionPane.ERROR_MESSAGE);
        }

        List<UserModel> list = UserService.getuser();
        DefaultTableModel modeluser = UserService.gettableuser(list);
        tableuser.setModel(modeluser);

        edittxt_id.setText("");
        edittxt_user.setText("");
        edittxt_pass.setText("");
        edittxt_name.setText("");


    } catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_bt_delMouseClicked

private void bt_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editMouseClicked
    try {
        String id = edittxt_id.getText();
        String user = edittxt_user.getText();
        String pass = edittxt_pass.getText();
        String name = edittxt_name.getText();

        boolean status = UserService.updateuser(id, user, pass, name);

        if (status) {
            JOptionPane.showMessageDialog(this, "เเก้ไขสำเร็จ", "เเก้ไขข้อมูล", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "เเก้ไขไม่สำเร็จ", "เเก้ไขข้อมูล", JOptionPane.ERROR_MESSAGE);
        }

        List<UserModel> list = UserService.getuser();
        DefaultTableModel modeluser = UserService.gettableuser(list);
        tableuser.setModel(modeluser);
        
        edittxt_id.setText("");
        edittxt_user.setText("");
        edittxt_pass.setText("");
        edittxt_name.setText("");

    } catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_bt_editMouseClicked

private void bt_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_searchMouseClicked
    try {
        String id = txt_search.getText();
        List<UserModel> list = UserService.getuserbyid(id);
        DefaultTableModel modeluser = UserService.gettableuser(list);
        tableuser.setModel(modeluser);// TODO add your handling code here:

        tableuser.setDefaultEditor(Object.class, null);


        if (list.size() > 0) {
            JOptionPane.showMessageDialog(this, "เเสดงข้อมูลทั้งหมด " + list.size() + " เเถว", "เเสดงข้อมูล", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "ไม่พบข้อมูล", "เเสดงข้อมูล", JOptionPane.ERROR_MESSAGE);
        }
        txt_search.setText("");

    } catch (Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_bt_searchMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adddata;
    private javax.swing.JButton bt_del;
    private javax.swing.JButton bt_edit;
    private javax.swing.JButton bt_search;
    private javax.swing.JTextField edittxt_id;
    private javax.swing.JTextField edittxt_name;
    private javax.swing.JTextField edittxt_pass;
    private javax.swing.JTextField edittxt_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableuser;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
