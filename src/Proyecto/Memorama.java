/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

//import static Proyecto.Reloj.seg;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author T-107
 */
public class Memorama extends javax.swing.JFrame {
ArrayList<JLabel> etiquetas;
int piezas[]=new int[12];
int valor=0;
JLabel imagenes[]=new JLabel[12];
int piezarr[]=new int[12];
int par=0;
int pares[]=new int[4];
Random r=new Random();
int seg=1;
int mili=59;
int term=0;
    /**
     * Creates new form Memorama
     */
    public Memorama() {
        etiquetas=new ArrayList<JLabel>();
        initComponents();
        jPanel1.setSize(200,200);
 
        for (int x = 0; x < 12; x++) {
            int arr = (int) (r.nextDouble() * 6 + 1);
            if (x == 0) {
                piezarr[x] = arr;
            }
            if (x != 0) {
                int xyz=0;
                for(;xyz!=1;){
                    int z=0;
                    for(int y=0; y<piezarr.length; y++){
                        if(arr==piezarr[y]){
                            z++;
                        }
                    }
                    if((z==0)||(z==1)){
                        piezarr[x]=arr;
                        xyz=1;
                    }else{
                        arr=(int)(r.nextDouble()*6+1);
                    }
                }
            }
        }
        //vamos agregar loa labels a nuestro arreglo
        for(int i:piezas){
            imagenes[valor]=new JLabel();
            imagenes[valor].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png"))); // NOI18N
            imagenes[valor].setName(""+valor);
            Integer inte=new Integer(imagenes[valor].getName());
            jPanel1.add(imagenes[valor]);
            imagenes[valor].addMouseListener(new MouseListener(){

                @Override
                public void mouseClicked(MouseEvent e) {
                   jLabel1.setText(e.getComponent().getName());
                    //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frog.png"))); // NOI18N
                   if(piezarr[inte]==1){
                   imagenes[inte].setIcon(new javax.swing.ImageIcon(getClass().getResource("/frog.png"))); // NOI18N
                   imagenes[inte].setText(null);
                   par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                            
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                imagenes[pares[3]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                                
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                            term++;
                        }

                   }
                   
                    if(piezarr[inte]==2){
                   imagenes[inte].setIcon(new javax.swing.ImageIcon(getClass().getResource("/bird.png"))); // NOI18N
                   imagenes[inte].setText(null);
                   par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                imagenes[pares[3]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                                
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                            term++;
                        }
                   }
                    
                    if(piezarr[inte]==3){
                   imagenes[inte].setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghost_of_hunger_past.png"))); // NOI18N
                   imagenes[inte].setText(null);
                   par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                imagenes[pares[3]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                                
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                            term++;
                        }
                   }
                    
                    if(piezarr[inte]==4){
                   imagenes[inte].setIcon(new javax.swing.ImageIcon(getClass().getResource("/brontosaurus.png"))); // NOI18N
                   imagenes[inte].setText(null);
                   par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                imagenes[pares[3]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                                
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                            term++;
                        }
                   }
                    
                     if(piezarr[inte]==5){
                   imagenes[inte].setIcon(new javax.swing.ImageIcon(getClass().getResource("/findingnemo2.png"))); // NOI18N
                   imagenes[inte].setText(null);
                   par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                imagenes[pares[3]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                                
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                            term++;
                        }
                   }
                    
                    if(piezarr[inte]==6){
                   imagenes[inte].setIcon(new javax.swing.ImageIcon(getClass().getResource("/dog_4.png"))); // NOI18N
                   imagenes[inte].setText(null);
                   par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                imagenes[pares[3]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png")));
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                                
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                            term++;
                        }
                   }
                   
                   
                }

                @Override
                public void mousePressed(MouseEvent e) {
                   
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    
                }
                
            });
            valor++;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiqueta_reloj = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 405));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new java.awt.GridLayout(4, 3));

        jLabel1.setText("jLabel1");

        etiqueta_reloj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta_reloj.setText("02:00");

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(etiqueta_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Thread t1=new Thread(new Runnable() {

            @Override
            public void run() {
              
                 while(true){
        try{
            Thread.sleep(1000);
           
              etiqueta_reloj.setText(seg+":"+mili); 
            mili=mili - 1;
            if (mili==0){
                mili=59;
                seg=seg-1;
            }
            
            if ((seg==0)&&(mili==0)){
                  etiqueta_reloj.setText("GAME OVER"); 
                 
                break;
                
            }
             if (term==6){
                  etiqueta_reloj.setText("GAME OVER"); 
                 
                break;
                
            }
        }catch(Exception ex){
            
        }
        
        }
               
            }
        });
        
        t1.start();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memorama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiqueta_reloj;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
