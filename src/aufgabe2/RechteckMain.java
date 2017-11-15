package aufgabe2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class RechteckMain extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1755775870637219266L;
	private Rechteck recht1, recht2;
	private static final int normBreite = 100, normHoehe = 100;

    public static void main(String[] args){
        RechteckMain main = new RechteckMain();
        main.init();
        main.addRechtecke();
        main.setVisible(true);
    }

    private void init(){
        this.setTitle("Rechteck");
        this.setSize(1200,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.addMouseListener(new Maus());
    }

    private void addRechtecke(){
        recht1 = new Rechteck(100,100, 20, 20);
        recht2 = new Rechteck(100,100, 400,20, Color.GREEN);
        recht1.addMouseListener(new Maus());
        recht2.addMouseListener(new Maus());
        this.add(recht1);
        this.add(recht2);
    }
    
    private void addRechteck(int x, int y) {
    	Rechteck newRechteck = new Rechteck(normBreite, normHoehe, x, y, Color.CYAN);
    	newRechteck.addMouseListener(new Maus());
    	this.add(newRechteck);
    	this.repaint();
    }
    
    private void removeRechteck(Rechteck source){
    	this.remove(source);
    	this.repaint();
    }
    

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }

    private class Maus implements MouseListener{
        int altX,altY;
        Color alt;
        @Override
        public void mouseClicked(MouseEvent e) {
        	if(e.getSource() instanceof Rechteck) {
                Rechteck source = (Rechteck)e.getSource();
        		if(e.getButton() == 1) {
                    source.anpassen();
                    alt = source.getColor();
                    repaint();
        		}
        		if(e.getButton() == 2) {
        			removeRechteck(source);
        		}
        	}
        	if(e.getButton() == 3) {
        		addRechteck(e.getX(), e.getY());
        	}
        }

        @Override
        public void mousePressed(MouseEvent e) {
            altX = e.getX();
            altY = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        	if(e.getSource() instanceof Rechteck) {
                Rechteck source = (Rechteck) e.getSource();
                if(e.getButton()==1){
                    source.setLocation(source.getLocation().x+e.getX()-altX, source.getLocation().y+e.getY()-altY);
                }
        	}
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        	if(e.getSource() instanceof Rechteck) {
                Rechteck source = (Rechteck) e.getSource();
                source.backupColor();
                source.setColor(Color.BLUE);
                repaint();
        	}
        }

        @Override
        public void mouseExited(MouseEvent e) {
        	if(e.getSource() instanceof Rechteck) {
                Rechteck source = (Rechteck) e.getSource();
                source.restoreColor();
                repaint();
        	}
        }
    }
    

}
