/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class kriteria extends javax.swing.JFrame {

    /**
     * Creates new form kriteria
     */
    public kriteria() {
        initComponents();
        this.setLocationRelativeTo(this);

    }

    public JButton getPerhitungan() {
        return perhitungan;
    }

    public JButton getAlternatif() {
        return alternatif;
    }

    public JButton getHapus() {
        return hapus;
    }

    public JButton getTambah() {
        return tambah;
    }

    public JTable getTbKriteria() {
        return tbKriteria;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbKriteria = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        alternatif = new javax.swing.JButton();
        perhitungan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        tbKriteria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbKriteria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbKriteria.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tbKriteria);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 870, 250));

        tambah.setBorder(null);
        tambah.setBorderPainted(false);
        tambah.setContentAreaFilled(false);
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 40));

        hapus.setBorder(null);
        hapus.setBorderPainted(false);
        hapus.setContentAreaFilled(false);
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 130, 40));

        alternatif.setBorder(null);
        alternatif.setBorderPainted(false);
        alternatif.setContentAreaFilled(false);
        getContentPane().add(alternatif, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 40));

        perhitungan.setBorder(null);
        perhitungan.setBorderPainted(false);
        perhitungan.setContentAreaFilled(false);
        getContentPane().add(perhitungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Kriteria.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
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
            java.util.logging.Logger.getLogger(kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kriteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alternatif;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton perhitungan;
    private javax.swing.JButton tambah;
    private javax.swing.JTable tbKriteria;
    // End of variables declaration//GEN-END:variables
}
