/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import controllers.ControlCar;
import entites.Assembley;
import entites.Breaks;
import entites.Car;
import entites.Engine;
import entites.Model;
import entites.Steering;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author ae
 */
public class UI_CarSimulator extends JPanel implements ActionListener, KeyListener {
    
    Timer t = new Timer(200, this); // Responsiveness
    int speed = 0;
    int x = 10, y = 500;
    int xvel = 0, yvel = 0;
    String[] models = new String[]{"Mini", "Maxi"};
    String[] size = new String[]{"500", "1000"};
    String[] color = new String[]{"red", "blue"};
    ControlCar carCtrl;
    GridBagConstraints c;
    JFrame f;
    JLabel jspeed;
    JLabel jdirection;
    JComboBox<String> jcomboModels;
    JComboBox<String> jcomboEngine;
    JComboBox<String> jcomboColor;
    JButton jbuttonApply;
    String model = "bmw";
    String engine = "500";
    String colour = "red";
    
    public UI_CarSimulator() {
        
        t.start();
        
        f = new JFrame();
        f.setTitle("Car simulator");
        f.setSize(600, 400);
        f.setAlwaysOnTop(true);
        //    f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addKeyListener(this);

        // Panel Setup
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
        setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.PAGE_START;
        
        c.gridx = 1;
        c.gridy = 0;
        add(new JLabel("Model Selection "), c);
        c.gridx = 2;
        c.gridy = 0;
        jcomboModels = new JComboBox<>(models);
        jcomboModels.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jcomboModels = (JComboBox<String>) e.getSource();
                model = (String) jcomboModels.getSelectedItem();
            }
        });
        add(jcomboModels, c);
        
        c.gridx = 1;
        c.gridy = 1;
        add(new JLabel("Engine Size "), c);
        c.gridx = 2;
        c.gridy = 1;
        jcomboEngine = new JComboBox<>(size);
        jcomboEngine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jcomboEngine = (JComboBox<String>) e.getSource();
                engine = (String) jcomboEngine.getSelectedItem();
            }
        });
        add(jcomboEngine, c);
        
        c.gridx = 1;
        c.gridy = 3;
        add(new JLabel("Color "), c);
        c.gridx = 2;
        c.gridy = 3;
        jcomboColor = new JComboBox<>(color);
        jcomboColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jcomboColor = (JComboBox<String>) e.getSource();
                colour = (String) jcomboColor.getSelectedItem();
            }
        });
        add(jcomboColor, c);
        
        c.gridx = 1;
        c.gridy = 4;
        jspeed = new JLabel();
        jspeed.setText("Speed : 0");
        add(jspeed, c);
        
        c.gridx = 1;
        c.gridy = 5;
        jdirection = new JLabel();
        jdirection.setText("Direction : Stationary");
        add(jdirection, c);
        
//        c.gridwidth = 2;
//        c.gridx = 1;
//        c.gridy = 6;
//        jbuttonApply = new JButton("Apply Changes");
//        jbuttonApply.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                repaint();
//            }
//        });
//        add(jbuttonApply, c);

        // Add Panel To Frame
        f.add(this);

        //      String selectedBook = (String) bookList.getSelectedItem();
        //      System.out.println("You seleted the book: " + selectedBook);
    }
    
    public JPanel getJPanel() {
        return this;
    }
    // Animation Point :

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (this.colour.toLowerCase().contains("red")) {
            g.setColor(Color.RED);
        } else if (this.colour.toLowerCase().contains("blue")) {
            g.setColor(Color.BLUE);
        } else {
            g.setColor(Color.GREEN);
        }
        
        if (this.model.toLowerCase().contains("mini")) {
            g.fillRect(x, y, 50, 130);
        } else if (this.model.toLowerCase().contains("maxi")) {
            g.fillRect(x, y, 50, 230);
        } else {
            g.fill3DRect(x, y, 50, 30, true);
            
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (x < 0) {
            xvel = 0;
            x = 0;
        }
        if (x > 530) {
            xvel = 0;
            x = 0;
        }
        if (y < 0) {
            yvel = 0;
            y = 0;
        }
        if (y > 330) {
            yvel = 0;
            y = 330;
        }
        x += xvel;
        y += yvel;

        // Repaint this compoent!!! 
        repaint();
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        
        xvel = 0;
        yvel = 0;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {

        // Move object around screen by increments of 1 !!!!
        int k = e.getKeyCode();
        if (k == KeyEvent.VK_LEFT) {
            this.carCtrl.bearing("Backwards");
            this.carCtrl.drive(speed -= 1);
            
            xvel = -speed;
            yvel = 1;
            
            jspeed.setText("Speed [kph] : " + carCtrl.getCar().getSpeed());
            jdirection.setText("Direction [bearing] : " + carCtrl.getCar().getDirection());
            
        }
        
        if (k == KeyEvent.VK_UP) {
            xvel = 0;
            yvel = -1;
            this.carCtrl.bearing("Flying High");
            this.carCtrl.drive(0);
            
            jspeed.setText("Speed [kph] : " + carCtrl.getCar().getSpeed());
            jdirection.setText("Direction [bearing] : " + carCtrl.getCar().getDirection());
            
        }
        
        if (k == KeyEvent.VK_RIGHT) {
            this.carCtrl.bearing("Forwards");
            this.carCtrl.drive(speed += 1);
            
            xvel = speed;
            yvel = 0;
            
            jspeed.setText("Speed [kph] : " + carCtrl.getCar().getSpeed());
            jdirection.setText("Direction [bearing] : " + carCtrl.getCar().getDirection());
            
        }
        
        if (k == KeyEvent.VK_DOWN) {
            this.carCtrl.bearing("Hellward Bound!!!");
            this.carCtrl.drive(0);
            xvel = 0;
            yvel = 1;
            
            jspeed.setText("Speed [kph] : " + carCtrl.getCar().getSpeed());
            jdirection.setText("Direction [bearing] : " + carCtrl.getCar().getDirection());
            
        }
        
        f.validate();
        
    }
    
    public void setCarCtrl(ControlCar carCtrl) {
        this.carCtrl = carCtrl;
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                ControlCar carCtrl;
                try {
                    
                    System.out.println("INF: Spinning up 2D Game!!!");
                    // 1. Spin up the GUI
                    UI_CarSimulator ux = new UI_CarSimulator();

// Priming the car object                    
                    // 2. Build desired Car based on customer selection
                    // 3. Send message to controller about selection, so that car can be assembled accordingly
                    carCtrl = new ControlCar(new Engine("1000"), new Model("Maxi", "v1.2")); // Control To Entity : Car

                    // 4. Send message to UX about the controller to use, so that the controller can mediate instructions.  
                    ux.setCarCtrl(carCtrl);
                    
                } catch (Exception e) {
                    
                    e.printStackTrace();
                    
                }
                
            }
            
        });

        // Display Menu Options
    }
    
}
