import javax.swing.*;

public class main_frame extends javax.swing.JFrame 
{
    String nobat ;
    int map[] = new int[9];
    
    public main_frame() 
    {
        initComponents();
        lbl_nobat.setText("PLAYER : X");
        nobat = "X";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        lbl_nobat = new javax.swing.JLabel();
        btn_resrt = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tic tac toe");
        setName("main_frame"); // NOI18N
        setResizable(false);

        btn_2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_2.setAlignmentY(0.0F);
        btn_2.setFocusPainted(false);
        btn_2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_2.setName("2"); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_0.setAlignmentY(0.0F);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_0.setName("0"); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_5.setAlignmentY(0.0F);
        btn_5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_5.setName("5"); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_3.setAlignmentY(0.0F);
        btn_3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_3.setName("3"); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_7.setAlignmentY(0.0F);
        btn_7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_7.setName("7"); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_8.setAlignmentY(0.0F);
        btn_8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_8.setName("8"); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        btn_1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_1.setAlignmentY(0.0F);
        btn_1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_1.setName("1"); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_6.setAlignmentY(0.0F);
        btn_6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_6.setName("6"); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_4.setAlignmentY(0.0F);
        btn_4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_4.setName("4"); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_click(evt);
            }
        });

        lbl_nobat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nobat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nobat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btn_resrt.setText("RESRT");
        btn_resrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_resrt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lbl_nobat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_nobat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_resrt, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_click

        JButton btn = (JButton) evt.getSource();
        
        
        if(btn.getText().isEmpty())
        {
            btn.setText(nobat);   
            
            int i = Integer.parseInt(btn.getName());
            
            if(nobat.equals("X"))
            {    
                map[i] = 1;
                nobat = "Y";
            }
            else
            {
                map[i] = 2;
                nobat = "X";
            }
            
            if(win() == 1)
            {
                JOptionPane.showMessageDialog( rootPane , "player X is winner");
                btn_reset(null);
            }
            if(win() == 2)
            {
                JOptionPane.showMessageDialog( rootPane , "player Y is winner");
                btn_reset(null);
                
            }
            if(win() == 3)
            {
                JOptionPane.showMessageDialog( rootPane , "eny body not win");
                btn_reset(null);
            }
            if(win() == 0)
            {
                lbl_nobat.setText("PLAYER : "+nobat);
            }  
            
        }
    }//GEN-LAST:event_btn_click

    private void btn_reset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset
        for(int i=0 ; i<map.length ; i++)
            map[i] = 0;
        btn_0.setText("");
        btn_1.setText("");
        btn_2.setText("");
        btn_3.setText("");
        btn_4.setText("");
        btn_5.setText("");
        btn_6.setText("");
        btn_7.setText("");
        btn_8.setText("");
        lbl_nobat.setText("PLAYER : X");
        nobat = "X";
    }//GEN-LAST:event_btn_reset
    
    private int win()
    {
        int j = 0;
        boolean taeed = false;        
        if( (map[0] == map[1]  && map[1] == map[2]) && map[0] != 0)
        {
            j = map[0]==1 ? 1 : 2;
            taeed = true;
        }
        
        if( (map[3] == map[4]  && map[4] == map[5]) && map[3] != 0)
        {
            j = map[3]==1 ? 1 : 2;
            taeed = true;
        }
        
        if( (map[6] == map[7]  && map[7] == map[8]) && map[6] != 0)
        {
            j = map[6]==1 ? 1 : 2;
            taeed = true;
        }
        
        if( (map[0] == map[3]  && map[3] == map[6]) && map[0] != 0)
        {
            j = map[0]==1 ? 1 : 2;
            taeed = true;
        }
        
        if( (map[1] == map[4]  && map[4] == map[7]) && map[1] != 0)
        {
            j = map[1]==1 ? 1 : 2;
            taeed = true;
        }
        
        if( (map[2] == map[5]  && map[5] == map[8]) && map[2] != 0)
        {
            j = map[2]==1 ? 1 : 2;
            taeed = true;
        }
        
        if( (map[0] == map[4]  && map[4] == map[8]) && map[0] != 0)
        {
            j = map[0]==1 ? 1 : 2;
            taeed = true;
        }
        
        if( (map[2] == map[4]  && map[4] == map[6]) && map[2] != 0)
        {
            j = map[2]==1 ? 1 : 2;
            taeed = true;
        }
        
        boolean por = true;
        for(int i=0 ; i<map.length ; i++)
        {
            if(map[i]==0)
            {
                por=false;
                break;
            }
        }
        
        if(por == true && taeed == false)
            j=3;
            
        return j;
    }
    
    public static void main(String args[]) 
    {        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new main_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_resrt;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel lbl_nobat;
    // End of variables declaration//GEN-END:variables
}