package view;

import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class MyCanvas extends JPanel{
    
       private GameBoard gameBoard;

       public MyCanvas(GameBoard gameBoard,int width,int height){
           this.gameBoard=gameBoard;
           setPreferredSize(new Dimension(width,height));
           setBackground(Color.BLACK);
       }

       @Override
       public void paintComponent(Graphics g){
           super.paintComponent(g);

           Graphics2D g2= (Graphics2D) g;

       }


    
}
