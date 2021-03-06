/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishexportandimportinformationsystem;


import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ImportForm extends javax.swing.JFrame {
 
    private String man_id;
    private String m_id;
    /**
     * Creates new form ImportForm
     */
    public ImportForm() {
        initComponents();
        DBConnection db=new DBConnection();
        db.dbconnection();
        this.setLocationRelativeTo(null);
            try{
            String sql="select C_id,C_name,C_country,C_contact_no from Company";
            db.pst=db.con.prepareStatement(sql);
            db.rs=db.pst.executeQuery();
            DefaultTableModel row=(DefaultTableModel) tblCompanyImport.getModel();
            while(db.rs.next()){
                row.addRow(new Object[]{
                    db.rs.getString("C_id"),db.rs.getString("C_name"),db.rs.getString("C_country"),db.rs.getString("C_contact_no")
                } );
            }
            db.con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
         Company();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIProductId = new javax.swing.JLabel();
        lblIProductName = new javax.swing.JLabel();
        lblIPrice = new javax.swing.JLabel();
        lblIQuantity = new javax.swing.JLabel();
        lblICompanyId = new javax.swing.JLabel();
        txtIProductId = new javax.swing.JTextField();
        txtIPrice = new javax.swing.JTextField();
        txtIQuantity = new javax.swing.JTextField();
        lblITax = new javax.swing.JLabel();
        txtITax = new javax.swing.JTextField();
        lblIDate = new javax.swing.JLabel();
        dateImport = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        btnBackImportForm = new javax.swing.JButton();
        btnInsertImportForm = new javax.swing.JButton();
        btnUpdateImportForm = new javax.swing.JButton();
        btnDeleteImportForm = new javax.swing.JButton();
        cmboxImportForm = new javax.swing.JComboBox<>();
        lblIManagerId = new javax.swing.JLabel();
        txtIManagerId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompanyImport = new javax.swing.JTable();
        cmbCompanyIDImportF = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imported Product Information");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lblIProductId.setBackground(new java.awt.Color(0, 102, 204));
        lblIProductId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIProductId.setForeground(new java.awt.Color(255, 255, 255));
        lblIProductId.setText("Product ID:");

        lblIProductName.setBackground(new java.awt.Color(0, 102, 204));
        lblIProductName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblIProductName.setText("Product Name:");

        lblIPrice.setBackground(new java.awt.Color(0, 102, 204));
        lblIPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblIPrice.setText("Price Per Kg:");

        lblIQuantity.setBackground(new java.awt.Color(0, 102, 204));
        lblIQuantity.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblIQuantity.setText("Quantity(KG):");

        lblICompanyId.setBackground(new java.awt.Color(0, 102, 204));
        lblICompanyId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblICompanyId.setForeground(new java.awt.Color(255, 255, 255));
        lblICompanyId.setText("Company ID:");

        txtIProductId.setText("P");

        txtIPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPriceActionPerformed(evt);
            }
        });
        txtIPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIPriceKeyTyped(evt);
            }
        });

        lblITax.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblITax.setForeground(new java.awt.Color(255, 255, 255));
        lblITax.setText("Tax (%):");

        lblIDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIDate.setForeground(new java.awt.Color(255, 255, 255));
        lblIDate.setText("Date:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TK");

        btnBackImportForm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBackImportForm.setText("Back");
        btnBackImportForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackImportFormActionPerformed(evt);
            }
        });

        btnInsertImportForm.setBackground(new java.awt.Color(0, 102, 0));
        btnInsertImportForm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInsertImportForm.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertImportForm.setText("Insert");
        btnInsertImportForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertImportFormActionPerformed(evt);
            }
        });

        btnUpdateImportForm.setBackground(new java.awt.Color(0, 0, 51));
        btnUpdateImportForm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdateImportForm.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateImportForm.setText("Update");
        btnUpdateImportForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateImportFormActionPerformed(evt);
            }
        });

        btnDeleteImportForm.setBackground(new java.awt.Color(153, 0, 0));
        btnDeleteImportForm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDeleteImportForm.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteImportForm.setText("Delete");
        btnDeleteImportForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteImportFormActionPerformed(evt);
            }
        });

        cmboxImportForm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmboxImportForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apache Trout", "Brook Trout", "Eels", "Frogfish", "Fugu", "Golden Trout", "King Salmon", "Octopus", "Oyster", "Snapper", "Squid", "Tuna" }));

        lblIManagerId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIManagerId.setForeground(new java.awt.Color(255, 255, 255));
        lblIManagerId.setText("Manager ID:");

        txtIManagerId.setText("M");

        tblCompanyImport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company ID", "Company Name", "Country", "Contact NO."
            }
        ));
        jScrollPane1.setViewportView(tblCompanyImport);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblITax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIProductName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(lblIProductId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIProductId)
                    .addComponent(txtIQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIPrice)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtITax, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateImport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmboxImportForm, 0, 213, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeleteImportForm, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackImportForm, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblICompanyId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsertImportForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateImportForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIManagerId, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(cmbCompanyIDImportF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateImport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lblIDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lblICompanyId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCompanyIDImportF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIManagerId)
                    .addComponent(lblIManagerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIProductId, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(lblIProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsertImportForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateImportForm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteImportForm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBackImportForm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmboxImportForm, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtIQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblITax, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtITax, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Company(){
        try{
            DBConnection db=new DBConnection();
            db.dbconnection();
            String sql="select C_id from Company";
            db.st=db.con.createStatement();
            db.rs=db.st.executeQuery(sql);
            while(db.rs.next()){
                String c_id=db.rs.getString("C_id");
                cmbCompanyIDImportF.addItem(c_id);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error!!!");
        }
    }
    
    private void btnBackImportFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackImportFormActionPerformed
        setVisible(false);
        new AfterLogin().setVisible(true);
    }//GEN-LAST:event_btnBackImportFormActionPerformed

    private void btnInsertImportFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertImportFormActionPerformed

       try{
           float price=(float) 0.0;
           float quantity=(float) 0.0;
           float tax=(float) 0.0;
            try{
                 price=Float.parseFloat(txtIPrice.getText());
            }
            catch(NumberFormatException nfe){
                txtIPrice.setText("");
                JOptionPane.showMessageDialog(null,"Insert numeric Value of Price..");
            }
            try{
                quantity=Float.parseFloat(txtIQuantity.getText());
            }
            catch(NumberFormatException nfe){
                txtIQuantity.setText("");
                JOptionPane.showMessageDialog(null,"Insert numeric Value of Quantity..");
            }
            try{
                tax=Float.parseFloat(txtITax.getText());
            }
            catch(NumberFormatException nfe){
                txtITax.setText("");
                JOptionPane.showMessageDialog(null,"Insert numeric Value of Tax..");
            }
            float tax_in_tk=(float) ((price*tax)/100.0);
            float sub_total_price=(tax_in_tk*quantity)+(price*quantity);
            String fish=(String)cmboxImportForm.getSelectedItem();
            
            DBConnection db=new DBConnection();
            db.dbconnection();
            String sql="insert into Import values(?,?,?,?,?,?,?,?,?)";
            db.pst=db.con.prepareStatement(sql);
            db.pst.setString(1,((JTextField)dateImport.getDateEditor().getUiComponent()).getText());
            db.pst.setString(2,txtIProductId.getText());
            db.pst.setString(3,fish);
            db.pst.setFloat(4, price);
            db.pst.setFloat(5,quantity);
            db.pst.setFloat(6,tax_in_tk);
            db.pst.setFloat(7,sub_total_price);
            db.pst.setString(8,cmbCompanyIDImportF.getSelectedItem().toString());
            db.pst.setString(9,txtIManagerId.getText());
            
              String sql1="select IP_id from Import";
                db.rs=db.st.executeQuery(sql1);
                while(db.rs.next()){
                String id=db.rs.getString("IP_id");
                if(id.equals(txtIProductId.getText()))
                {
                    JOptionPane.showMessageDialog(null,"Product ID is already exists!!!");
                    txtIProductId.setText(" ");
                    break;
               }
             }
                
            if(txtIProductId.getText().isEmpty() || txtIPrice.getText().isEmpty() || txtIQuantity.getText().isEmpty() || txtITax.getText().isEmpty() || txtIManagerId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill up all information");
            }
           else{
                String sql2="select C_id from Company";
                db.rs=db.st.executeQuery(sql2);
                
                String sql3="select M_id from Manager";
                db.rs=db.st.executeQuery(sql3);
                while(db.rs.next()){
                  m_id=db.rs.getString("M_id");
            
                  if(m_id.equals(txtIManagerId.getText()))
                  {
                    man_id=m_id;
                    break;
                  }
                }
                if(man_id.equals(txtIManagerId.getText())){
                      db.pst.executeUpdate();
                      close();
                      JOptionPane.showMessageDialog(null,"Successful inserted");
                      db.con.close();
                    }
                   else
                   {
                       txtIManagerId.setText("M");
                       JOptionPane.showMessageDialog(null,"Company or Manager ID is incorrect.");
                   }
            }       
       }  
       catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
       }  
       
    }//GEN-LAST:event_btnInsertImportFormActionPerformed
    
    private void close(){
        txtIManagerId.setText("M");
        txtIPrice.setText("");
        txtIProductId.setText("P");
        txtIQuantity.setText("");
        txtITax.setText("");
        dateImport.setDate(null);

    }
    private void txtIPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPriceActionPerformed

    }//GEN-LAST:event_txtIPriceActionPerformed

    private void txtIPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIPriceKeyTyped

    }//GEN-LAST:event_txtIPriceKeyTyped

    private void btnUpdateImportFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateImportFormActionPerformed
        DBConnection db=new DBConnection();
        db.dbconnection();
        try{
            float price=(float) 0.0;
           float quantity=(float) 0.0;
           float tax=(float) 0.0;
            try{
                 price=Float.parseFloat(txtIPrice.getText());
            }
            catch(NumberFormatException nfe){
                txtIPrice.setText("");
                JOptionPane.showMessageDialog(null,"Insert numeric Value of Price..");
            }
            try{
                quantity=Float.parseFloat(txtIQuantity.getText());
            }
            catch(NumberFormatException nfe){
                txtIQuantity.setText("");
                JOptionPane.showMessageDialog(null,"Insert numeric Value of Quantity..");
            }
            try{
                tax=Float.parseFloat(txtITax.getText());
            }
            catch(NumberFormatException nfe){
                txtITax.setText("");
                JOptionPane.showMessageDialog(null,"Insert numeric Value of Tax..");
            }
            float tax_in_tk=(float) ((price*tax)/100.0);
            float sub_total_price=(tax_in_tk*quantity)+(price*quantity);
            String fish=(String)cmboxImportForm.getSelectedItem();
            
            String sql="update Import set Date=?,P_name=?,Price=?,Quantity_KG=?,Tax=?,Sub_Total=? where IP_id=?";
            
            db.pst=db.con.prepareStatement(sql);
            db.pst.setString(1,((JTextField)dateImport.getDateEditor().getUiComponent()).getText());
            db.pst.setString(2,fish);
            db.pst.setFloat(3, price);
            db.pst.setFloat(4,quantity);
            db.pst.setFloat(5,tax);
            db.pst.setFloat(6,sub_total_price);
            db.pst.setString(7,txtIProductId.getText());
            if(txtIProductId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please Insert only Company ID Number.");
            }
            else{
                db.pst.executeUpdate();
                close();
                JOptionPane.showMessageDialog(null,"Successfully Updated");
            }
            db.con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            close();
        }
    }//GEN-LAST:event_btnUpdateImportFormActionPerformed

    private void btnDeleteImportFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteImportFormActionPerformed
        DBConnection db=new DBConnection();
        db.dbconnection();
        try{
            String sql="Delete from Import where IP_id=?";
            db.pst=db.con.prepareStatement(sql);
            db.pst.setString(1,txtIProductId.getText());
            if(txtIProductId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please Insert only Company ID Number.");
            }
            else{
                db.pst.executeUpdate();
                close();
                JOptionPane.showMessageDialog(null,"Successfully Deleted.");
            }
            db.con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please Insert only Company ID Number.");
            close();
        }
    }//GEN-LAST:event_btnDeleteImportFormActionPerformed

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
            java.util.logging.Logger.getLogger(ImportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackImportForm;
    private javax.swing.JButton btnDeleteImportForm;
    private javax.swing.JButton btnInsertImportForm;
    private javax.swing.JButton btnUpdateImportForm;
    private javax.swing.JComboBox<String> cmbCompanyIDImportF;
    private javax.swing.JComboBox<String> cmboxImportForm;
    private com.toedter.calendar.JDateChooser dateImport;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblICompanyId;
    private javax.swing.JLabel lblIDate;
    private javax.swing.JLabel lblIManagerId;
    private javax.swing.JLabel lblIPrice;
    private javax.swing.JLabel lblIProductId;
    private javax.swing.JLabel lblIProductName;
    private javax.swing.JLabel lblIQuantity;
    private javax.swing.JLabel lblITax;
    private javax.swing.JTable tblCompanyImport;
    private javax.swing.JTextField txtIManagerId;
    private javax.swing.JTextField txtIPrice;
    private javax.swing.JTextField txtIProductId;
    private javax.swing.JTextField txtIQuantity;
    private javax.swing.JTextField txtITax;
    // End of variables declaration//GEN-END:variables
}
