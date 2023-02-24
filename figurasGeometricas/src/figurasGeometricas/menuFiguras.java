package figurasGeometricas;

/**
 * Cristian Daniel Alvarez Cervantes
 * 1223IS
 */
public class menuFiguras extends javax.swing.JFrame {
    
    //objetos creados a traves de mi constructor figuras
    
    operaciones operar = new operaciones();
    
    public menuFiguras() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cajaBase = new javax.swing.JTextField();
        hipotenusa = new javax.swing.JButton();
        perimetroTriangulo = new javax.swing.JButton();
        cuadradoArea = new javax.swing.JButton();
        perimetroCirculo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        areaCirculo = new javax.swing.JButton();
        btnRectangulo1 = new javax.swing.JButton();
        areaTriangulo = new javax.swing.JButton();
        rectanguloArea = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioArea = new javax.swing.JLabel();
        perCuadrado = new javax.swing.JLabel();
        caja2 = new javax.swing.JTextField();
        caja5 = new javax.swing.JTextField();
        rectanguloPer = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        baseCuadrado = new javax.swing.JTextField();
        caja4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        perCirculo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        caja3 = new javax.swing.JTextField();
        cajaAltura1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        per2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        are1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cuadradoPer = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        hipo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        triTipo = new javax.swing.JLabel();
        cajaRadio1 = new javax.swing.JTextField();
        base = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        areaRectangulo = new javax.swing.JLabel();
        perRectangulo = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        areaCuadrado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 2, 18)); // NOI18N
        jLabel1.setText("TRIÁNGULO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 100, 40));

        cajaBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBaseActionPerformed(evt);
            }
        });
        jPanel1.add(cajaBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 100, 30));

        hipotenusa.setBackground(new java.awt.Color(51, 204, 0));
        hipotenusa.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        hipotenusa.setText("HIPOTENUSA");
        hipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hipotenusaActionPerformed(evt);
            }
        });
        jPanel1.add(hipotenusa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, -1));

        perimetroTriangulo.setBackground(new java.awt.Color(0, 204, 0));
        perimetroTriangulo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        perimetroTriangulo.setText("PERÍMETRO");
        perimetroTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perimetroTrianguloActionPerformed(evt);
            }
        });
        jPanel1.add(perimetroTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        cuadradoArea.setBackground(new java.awt.Color(255, 255, 0));
        cuadradoArea.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        cuadradoArea.setText("ÁREA");
        cuadradoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoAreaActionPerformed(evt);
            }
        });
        jPanel1.add(cuadradoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        perimetroCirculo.setBackground(new java.awt.Color(255, 51, 51));
        perimetroCirculo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        perimetroCirculo.setText("PERÍMETRO");
        perimetroCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perimetroCirculoActionPerformed(evt);
            }
        });
        jPanel1.add(perimetroCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel5.setText("FIGURAS GEOMETRICAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel6.setFont(new java.awt.Font("Britannic Bold", 2, 18)); // NOI18N
        jLabel6.setText("CUADRADO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 100, 30));

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 2, 18)); // NOI18N
        jLabel7.setText("RECTÁNGULO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 40));

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 2, 18)); // NOI18N
        jLabel8.setText("CÍRCULO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, 40));

        areaCirculo.setBackground(new java.awt.Color(255, 51, 51));
        areaCirculo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        areaCirculo.setText("ÁREA");
        areaCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCirculoActionPerformed(evt);
            }
        });
        jPanel1.add(areaCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        btnRectangulo1.setBackground(new java.awt.Color(51, 204, 0));
        btnRectangulo1.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        btnRectangulo1.setText("TIPO DE TRIÁNGULO");
        btnRectangulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectangulo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRectangulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 130, 60));

        areaTriangulo.setBackground(new java.awt.Color(0, 204, 0));
        areaTriangulo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        areaTriangulo.setText("ÁREA");
        areaTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTrianguloActionPerformed(evt);
            }
        });
        jPanel1.add(areaTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        rectanguloArea.setBackground(new java.awt.Color(0, 153, 255));
        rectanguloArea.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        rectanguloArea.setText("ÁREA");
        rectanguloArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloAreaActionPerformed(evt);
            }
        });
        jPanel1.add(rectanguloArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Ingresa cateto adyacente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 140, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel3.setText("IMPORTANTE: INGRESE SUS DATOS EN CENTÍMETROS (CM)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 460, 30));
        jPanel1.add(radioArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, 40));
        jPanel1.add(perCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 90, 30));

        caja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja2ActionPerformed(evt);
            }
        });
        jPanel1.add(caja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 100, -1));

        caja5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja5ActionPerformed(evt);
            }
        });
        jPanel1.add(caja5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 80, 30));

        rectanguloPer.setBackground(new java.awt.Color(0, 153, 255));
        rectanguloPer.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        rectanguloPer.setText("PERÍMETRO");
        rectanguloPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloPerActionPerformed(evt);
            }
        });
        jPanel1.add(rectanguloPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Ingresa el lado 1:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, 50));

        baseCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseCuadradoActionPerformed(evt);
            }
        });
        jPanel1.add(baseCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 100, 30));

        caja4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja4ActionPerformed(evt);
            }
        });
        jPanel1.add(caja4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 80, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel11.setText("Ingresa el lado 2:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 100, 50));

        perCirculo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel1.add(perCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 70, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel13.setText("Ingresa el lado 3:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 50));

        caja3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja3ActionPerformed(evt);
            }
        });
        jPanel1.add(caja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 100, -1));

        cajaAltura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAltura1ActionPerformed(evt);
            }
        });
        jPanel1.add(cajaAltura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 100, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel14.setText("Ingresa cateto opuesto:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 130, 30));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setText("=");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        per2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel1.add(per2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 60, 30));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("=");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setText("=");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        are1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel1.add(are1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 100, 30));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel18.setText("Ingresa la altura:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 100, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel12.setText("Ingresa la base:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 100, 40));

        cuadradoPer.setBackground(new java.awt.Color(255, 255, 0));
        cuadradoPer.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        cuadradoPer.setText("PERÍMETRO");
        cuadradoPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoPerActionPerformed(evt);
            }
        });
        jPanel1.add(cuadradoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel19.setText("=");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        hipo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel1.add(hipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 70, 30));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel20.setText("2 = Triángulo escaleno");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, 30));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel21.setText("1 = Triángulo IsosCele");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, 30));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel22.setText("3 = Triángulo equilatero");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, -1, 30));
        jPanel1.add(caja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 100, -1));

        triTipo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel1.add(triTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 30, 30));

        cajaRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaRadio1ActionPerformed(evt);
            }
        });
        jPanel1.add(cajaRadio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 100, 30));

        base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseActionPerformed(evt);
            }
        });
        jPanel1.add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 100, 30));

        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });
        jPanel1.add(altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 100, 30));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel23.setText("=");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel24.setText("=");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel25.setText("=");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel26.setText("Ingresa el radio:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel27.setText("Ingresa el largo:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 90, 30));
        jPanel1.add(areaRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 90, 30));
        jPanel1.add(perRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 90, 30));

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel30.setText("Ingresa el ancho:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 90, 30));

        jLabel28.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel28.setText("=");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel29.setText("=");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel31.setText("Ingresa la base:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 90, 30));
        jPanel1.add(areaCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 90, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel4.setText("Bienvenido al programa para obtener el área y perímetro de las figuras geométricas: círculo, rectángulo, triángulo y cuadrado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 690, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hipotenusaActionPerformed
        double co1 = Double.parseDouble(caja4.getText());
        double ca2 = Double.parseDouble(caja5.getText());
        
        operar.hipotenusa(ca2, co1);
        
        hipo.setText(String.valueOf(operar.result) + " cm");
    }//GEN-LAST:event_hipotenusaActionPerformed

    private void perimetroTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perimetroTrianguloActionPerformed
        
        double num1 = Double.parseDouble(caja1.getText());
        double num2 = Double.parseDouble(caja2.getText());
        double num3 = Double.parseDouble(caja3.getText());
        
        operar.perimetroTriangulo(num1, num2, num3);
        
        per2.setText(String.valueOf(operar.result) + " cm");
    }//GEN-LAST:event_perimetroTrianguloActionPerformed

    private void cuadradoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoAreaActionPerformed
        double bc = Double.parseDouble(baseCuadrado.getText());
        
        operar.areaCuadrado(bc);
        
        areaCuadrado.setText(String.valueOf(operar.result) + " cm^2");
    }//GEN-LAST:event_cuadradoAreaActionPerformed

    private void perimetroCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perimetroCirculoActionPerformed
        double radio = Double.parseDouble(cajaRadio1.getText());
        
        operar.perimetroCirculo(radio);
        
        perCirculo.setText(String.valueOf(operar.result) + " cm");
    }//GEN-LAST:event_perimetroCirculoActionPerformed

    private void areaCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCirculoActionPerformed
        double radio = Double.parseDouble(cajaRadio1.getText());
        
        operar.areaCirculo(radio);
        
        radioArea.setText(String.valueOf(operar.result) + " cm^2");
    }//GEN-LAST:event_areaCirculoActionPerformed

    private void btnRectangulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectangulo1ActionPerformed
        
        double ld1 = Double.parseDouble(caja1.getText());
        double ld2 = Double.parseDouble(caja2.getText());
        double ld3 = Double.parseDouble(caja3.getText());
        
        operar.trianguloTipo(ld1, ld2, ld3);
        
        triTipo.setText(String.valueOf(operar.tipo));
        
    }//GEN-LAST:event_btnRectangulo1ActionPerformed

    private void areaTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTrianguloActionPerformed
        
        double bs = Double.parseDouble(cajaAltura1.getText());
        double alt = Double.parseDouble(cajaBase.getText());
        
        operar.areaTriangulo(bs, alt);
        
        are1.setText(String.valueOf(operar.result) + " cm^2");
    }//GEN-LAST:event_areaTrianguloActionPerformed

    private void rectanguloAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloAreaActionPerformed
        double large = Double.parseDouble(base.getText());
        double high = Double.parseDouble(altura.getText());
        
        operar.areaRectangulo(large, high);
        
        areaRectangulo.setText(String.valueOf(operar.result) + " cm^2");
    }//GEN-LAST:event_rectanguloAreaActionPerformed

    private void cajaBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBaseActionPerformed

    private void caja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja2ActionPerformed

    private void caja5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja5ActionPerformed

    private void rectanguloPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloPerActionPerformed
        double large = Double.parseDouble(base.getText());
        double high = Double.parseDouble(altura.getText());
        
        operar.perimetroRectangulo(large, high);
        
        perRectangulo.setText(String.valueOf(operar.result) + " cm");
    }//GEN-LAST:event_rectanguloPerActionPerformed

    private void baseCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseCuadradoActionPerformed

    private void caja4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja4ActionPerformed

    private void caja3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja3ActionPerformed

    private void cajaAltura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAltura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAltura1ActionPerformed

    private void cuadradoPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoPerActionPerformed
        double bcc = Double.parseDouble(baseCuadrado.getText());
        
        operar.perimetroCuadrado(bcc);
        
        perCuadrado.setText(String.valueOf(operar.result) + " cm");
    }//GEN-LAST:event_cuadradoPerActionPerformed

    private void cajaRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaRadio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaRadio1ActionPerformed

    private void baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseActionPerformed

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaActionPerformed

    /**
     * @param args the command line arguments
     * metodo principalpara ejecutar el entorno grafico
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
            java.util.logging.Logger.getLogger(menuFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JLabel are1;
    private javax.swing.JButton areaCirculo;
    private javax.swing.JLabel areaCuadrado;
    private javax.swing.JLabel areaRectangulo;
    private javax.swing.JButton areaTriangulo;
    private javax.swing.JTextField base;
    private javax.swing.JTextField baseCuadrado;
    private javax.swing.JButton btnRectangulo1;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JTextField caja5;
    private javax.swing.JTextField cajaAltura1;
    private javax.swing.JTextField cajaBase;
    private javax.swing.JTextField cajaRadio1;
    private javax.swing.JButton cuadradoArea;
    private javax.swing.JButton cuadradoPer;
    private javax.swing.JLabel hipo;
    private javax.swing.JButton hipotenusa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel per2;
    private javax.swing.JLabel perCirculo;
    private javax.swing.JLabel perCuadrado;
    private javax.swing.JLabel perRectangulo;
    private javax.swing.JButton perimetroCirculo;
    private javax.swing.JButton perimetroTriangulo;
    private javax.swing.JLabel radioArea;
    private javax.swing.JButton rectanguloArea;
    private javax.swing.JButton rectanguloPer;
    private javax.swing.JLabel triTipo;
    // End of variables declaration//GEN-END:variables
}
