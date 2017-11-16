package aufgabe2;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Rechteck extends JComponent{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1463873654158464779L;
	private int breite, hoehe, posx, posy;
    private Color color, bak;
    private Map<String, Color> colorMap = new HashMap<>();

    public Rechteck() {
    	this(100,100);
    }

    public Rechteck(int breite, int hoehe) {
        this(breite, hoehe, 100, 100);
    }

    public Rechteck(int breite, int hoehe, int posx, int posy) {
        this(breite, hoehe, posx, posy, Color.BLACK);
    }

    public Rechteck(int breite, int hoehe, int posx, int posy, Color color) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        this.setLocation(posx, posy);
        this.setSize(breite, hoehe);
        fillColorMap();
    }
    
    private void fillColorMap() {
    	colorMap.put("schwarz", Color.black);
    	colorMap.put("gruen", Color.green);
    	colorMap.put("blau", Color.blue);
    	colorMap.put("rot", Color.red);
    	colorMap.put("cyan", Color.cyan);
    	colorMap.put("gelb", Color.yellow);
    	colorMap.put("grau", Color.gray);
    	colorMap.put("braun", Color.decode("#994C00"));
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
        this.updateLocation();
    }
    
    public void setSize(int breite, int hoehe) {
    	this.setBreite(breite);
    	this.setHoehe(hoehe);
    	super.setSize(breite, hoehe);
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
        this.updateLocation();
    }
    
    private void updateLocation() {
    	this.setLocation(posx, posy);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void backupColor() {
    	this.bak = this.color;
    }
    
    public void restoreColor() {
    	this.color = this.bak;
    }

    public void print(){
        System.out.println("Hoehe: "+hoehe+" Breite: "+breite);
    }

    public void anpassen(){
    	Color color = this.getColor();
    	int newBreite = getIntegerFromGui("Neue Breite eingeben.", this.getBreite());
        int newHoehe = getIntegerFromGui("Neue Höhe eingeben.", this.getHoehe());
        color = getColorFromGui();
        this.setSize(newBreite, newHoehe);
        this.color = color;
        backupColor();
        repaint();
    }
    
    private int getIntegerFromGui(String msg, int defaultValue) {
    	String result = JOptionPane.showInputDialog(msg);
    	int res = 0;
    	try {
    		res = Integer.parseInt(result);
    	}
    	catch(Exception e) {
    		res = defaultValue;
    	}
    	return res;
    }
    
    private Color getColorFromGui() {
    	String color = JOptionPane.showInputDialog("Neue Farbe eingeben ("+colorMap.keySet()+").");
    	if(!color.equals("")) {
    		return colorMap.get(color);
    	}
    	else {
    		restoreColor();
    		return this.getColor();
    	}
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(0, 0,breite-1,hoehe-1);
        g.setColor(color);
        g.fillRect(0,0, breite-1, hoehe-1);
    }

	public Color getBak() {
		return bak;
	}

	public void setBak(Color bak) {
		this.bak = bak;
	}
}
