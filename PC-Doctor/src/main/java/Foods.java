import java.awt.Toolkit;
import java.util.*;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.File;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;
import javax.xml.crypto.Data;

/**
 *
 * @author PC-Doctor
 */
public class Foods extends javax.swing.JFrame {

    /**
     * Creates new form Foods
     */

    public Foods() {
        initComponents();
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
        jfood = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextSearch = new javax.swing.JTextField();
        jOkSearch = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jcalories = new javax.swing.JLabel();
        jname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jfat = new javax.swing.JLabel();
        jcarb = new javax.swing.JLabel();
        jprotein = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jadvantage = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnLogo = new javax.swing.JButton();
        jbtnPC_Doctor = new javax.swing.JButton();
        jMedicines = new javax.swing.JButton();
        jBandAid = new javax.swing.JButton();
        jFoods = new javax.swing.JButton();
        jbtnSystemLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(170, 80));
        setPreferredSize(new java.awt.Dimension(1460, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1352, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jfood.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jfood.setForeground(new java.awt.Color(255, 255, 255));
        jfood.setText("Foods");
        jPanel1.add(jfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextSearch.setBackground(new java.awt.Color(255, 255, 255));
        jTextSearch.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextSearch.setText(" ");
        jTextSearch.setBorder(null);
        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });
        jPanel2.add(jTextSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 40));

        jOkSearch.setBackground(new java.awt.Color(16, 18, 23));
        jOkSearch.setIcon(new javax.swing.ImageIcon(MainWindow.prefixPath + "/src/main/java/images/search.jpg")); // NOI18N
        jOkSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jOkSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOkSearchActionPerformed(evt);
            }
        });
        jPanel2.add(jOkSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1150, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setName(""); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcalories.setBackground(new java.awt.Color(204, 204, 204));
        jcalories.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jcalories.setForeground(new java.awt.Color(0, 0, 0));
        jcalories.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jcalories.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calories", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(102, 0, 102)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 0, 15), new java.awt.Color(204, 0, 204))); // NOI18N
        jcalories.setOpaque(true);
        jPanel6.add(jcalories, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 280, 130));

        jname.setBackground(new java.awt.Color(204, 204, 204));
        jname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jname.setForeground(new java.awt.Color(153, 0, 153));
        jname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jname.setText("Name ");
        jname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 2, true));
        jname.setOpaque(true);
        jPanel6.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 400, 60));

        jLabel7.setFont(new java.awt.Font("Potti Sreeramulu", 0, 36)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Advantages:");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jfat.setBackground(new java.awt.Color(204, 204, 204));
        jfat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jfat.setForeground(new java.awt.Color(0, 0, 0));
        jfat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jfat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fat", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(102, 0, 102)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)); // NOI18N
        jfat.setOpaque(true);
        jPanel6.add(jfat, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 280, 130));

        jcarb.setBackground(new java.awt.Color(204, 204, 204));
        jcarb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jcarb.setForeground(new java.awt.Color(0, 0, 0));
        jcarb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jcarb.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carbohydrate", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(102, 0, 102)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 0, 15), new java.awt.Color(102, 0, 102))); // NOI18N
        jcarb.setOpaque(true);
        jPanel6.add(jcarb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 280, 130));

        jprotein.setBackground(new java.awt.Color(204, 204, 204));
        jprotein.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jprotein.setForeground(new java.awt.Color(0, 0, 0));
        jprotein.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jprotein.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Protein", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(102, 0, 102)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)); // NOI18N
        jprotein.setOpaque(true);
        jPanel6.add(jprotein, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 280, 130));

        jadvantage.setEditable(false);
        jadvantage.setBackground(new java.awt.Color(204, 204, 204));
        jadvantage.setColumns(20);
        jadvantage.setFont(new java.awt.Font("Fira Code", 0, 24)); // NOI18N
        jadvantage.setForeground(new java.awt.Color(0, 0, 0));
        jadvantage.setLineWrap(true);
        jadvantage.setRows(5);
        jadvantage.setWrapStyleWord(true);
        jadvantage.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jadvantage);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 1030, 160));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 60, 1140, 750));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 113, -1, -1));
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 57, 102, -1));

        jbtnLogo.setBackground(new java.awt.Color(254, 254, 254));
        jbtnLogo.setIcon(new javax.swing.ImageIcon(MainWindow.prefixPath + "/src/main/java/images/Logo.jpg")); // NOI18N
        jbtnLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jbtnLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, 90));

        jbtnPC_Doctor.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPC_Doctor.setFont(new java.awt.Font("Chilanka", 1, 30)); // NOI18N
        jbtnPC_Doctor.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPC_Doctor.setText("PC Doctor");
        jbtnPC_Doctor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbtnPC_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPC_DoctorActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnPC_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 230, 180));

        jMedicines.setBackground(new java.awt.Color(255, 255, 255));
        jMedicines.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMedicines.setForeground(new java.awt.Color(0, 0, 0));
        jMedicines.setIcon(new javax.swing.ImageIcon(MainWindow.prefixPath + "/src/main/java/images/Medicines.png")); // NOI18N
        jMedicines.setText("  Medicines");
        jMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMedicinesActionPerformed(evt);
            }
        });
        jPanel3.add(jMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 270, 52));

        jBandAid.setBackground(new java.awt.Color(246, 249, 254));
        jBandAid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBandAid.setForeground(new java.awt.Color(0, 0, 0));
        jBandAid.setIcon(new javax.swing.ImageIcon(MainWindow.prefixPath + "/src/main/java/images/BandAid.png")); // NOI18N
        jBandAid.setText("   Band Aid ");
        jBandAid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBandAidActionPerformed(evt);
            }
        });
        jPanel3.add(jBandAid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 270, 49));

        jFoods.setBackground(new java.awt.Color(255, 255, 255));
        jFoods.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jFoods.setForeground(new java.awt.Color(0, 0, 0));
        jFoods.setIcon(new javax.swing.ImageIcon(MainWindow.prefixPath + "/src/main/java/images/Food.png")); // NOI18N
        jFoods.setText("    Foods      ");
        jFoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFoodsActionPerformed(evt);
            }
        });
        jPanel3.add(jFoods, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 270, -1));

        jbtnSystemLogin.setBackground(new java.awt.Color(204, 204, 204));
        jbtnSystemLogin.setFont(new java.awt.Font("FreeMono", 1, 36)); // NOI18N
        jbtnSystemLogin.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSystemLogin.setText("System");
        jbtnSystemLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jbtnSystemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSystemLoginActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnSystemLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 230, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 324, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPC_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPC_DoctorActionPerformed
        // TODO add your handling code here:
        jbtnLogo.doClick();
    }//GEN-LAST:event_jbtnPC_DoctorActionPerformed

    private void jMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMedicinesActionPerformed
        // TODO add your handling code here:
        Medicine obj = new Medicine();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMedicinesActionPerformed

    private void jBandAidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBandAidActionPerformed
        // TODO add your handling code here:
        BandAid obj = new BandAid();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBandAidActionPerformed

    private void jFoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFoodsActionPerformed

    private void jbtnLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoActionPerformed
        // TODO add your handling code here:
        MainWindow obj = new MainWindow();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnLogoActionPerformed

    private void jbtnSystemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSystemLoginActionPerformed
        Login obj = new Login();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnSystemLoginActionPerformed

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jOkSearch.doClick();
    }
    
    private void jOkSearchActionPerformed(java.awt.event.ActionEvent evt) { 
        fillDataFoods();
        DataFoods food = searchFood(jTextSearch.getText().toLowerCase().trim());
        DataFoods similar = searchFoodSimilar(jTextSearch.getText().toLowerCase().trim());
        if(food != null || (similar != null && foundSimilar(similar) == true)){
            if(food == null) food = similar;
            jTextSearch.setText(" " + food.name);
            food.name = food.name.substring(0, 1).toUpperCase() + food.name.substring(1);
            jname.setText(food.name);
            jcalories.setText(food.Calories + " calories");
            jprotein.setText(food.protein + " g");
            jcarb.setText(food.carb + " g");
            jfat.setText(food.fat + " g");
            jadvantage.setText(food.advantage);
        }
        else {
            notFound();
        }
    }


    /**
     * @param args the command line arguments
     */
//************************************************************************************************************************

    public static void notFound(){
        JFrame frame = new JFrame();
        String message = "Food not found!";
        JOptionPane.showMessageDialog(frame, message);
    }
    public static boolean foundSimilar(DataFoods food){
        JFrame frame = new JFrame();
        String message = "Did you mean " + food.name + "?";
        int reply = JOptionPane.showConfirmDialog(frame, message, "Food not found!", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            return true;
        }
        return false;
    }

    public static DataFoods searchFood(String name){
        for(DataFoods data : dataFoods){
            if (data.name.equals(name)){
                return new DataFoods(data);
            }
        }
        return null;
    }
    public static DataFoods searchFoodSimilar(String name){
        double max_same_chars = 0.0;
        DataFoods d = null;
        for (DataFoods data : dataFoods) {
            if(calc_percentage(data.name, name) > max_same_chars){
                d = new DataFoods(data);
                max_same_chars = calc_percentage(d.name, name);
            }
        }
        return d;
    }
    
    public static double calc_percentage(String a, String b){
        double cb = 0;
        for(int i = 0; i < b.length(); i++){
            for(int j = 0; j < a.length(); j++){
                if(b.charAt(i) == a.charAt(j)){
                    cb++;
                    break;
                }
            }
        }
        return ((cb / a.length()) * 100) >= 75.0 ? ((cb / a.length()) * 100) : 0.0;
    }

    public static class DataFoods {
        public String name;
        public String Calories;
        public String protein;
        public String carb;
        public String fat;
        public String advantage;
        DataFoods(String name, String Calories, String protein, String carb, String fat, String advantage){
            this.name = name;
            this.Calories = Calories;
            this.protein = protein;
            this.carb = carb;
            this.fat = fat;
            this.advantage = advantage;
        }
        DataFoods(DataFoods data){
            this.name = data.name;
            this.Calories = data.Calories;
            this.protein = data.protein;
            this.carb = data.carb;
            this.fat = data.fat;
            this.advantage = data.advantage;
        }
    }

    public static List <DataFoods> dataFoods = new ArrayList<DataFoods>();

    public static void fillDataFoods() {
        File file = new File(MainWindow.prefixPath + "/src/main/java/files/Foods.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                dataFoods.add(new DataFoods(data[0], data[1], data[2], data[3], data[4], data[5]));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
//-----------------------------------------------------Main---------------------------------------------------------------
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Foods().setVisible(true);
            }
        });
    }
//------------------------------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBandAid;
    private javax.swing.JButton jFoods;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jMedicines;
    private javax.swing.JButton jOkSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JTextArea jadvantage;
    private javax.swing.JButton jbtnLogo;
    private javax.swing.JButton jbtnPC_Doctor;
    private javax.swing.JButton jbtnSystemLogin;
    private javax.swing.JLabel jcalories;
    private javax.swing.JLabel jcarb;
    private javax.swing.JLabel jfat;
    private javax.swing.JLabel jfood;
    private javax.swing.JLabel jname;
    private javax.swing.JLabel jprotein;
    // End of variables declaration//GEN-END:variables

}
