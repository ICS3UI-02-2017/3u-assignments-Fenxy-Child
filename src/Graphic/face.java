package Graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author choij2116
 */
public class face extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "BLACKPIG";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 3;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    
    // set the costom colors
    Color yell = new Color(251, 206, 177);
    Color brown = new Color(76, 38, 0);
    Color x = new Color(255, 180, 223);
    Color y = new Color(0,0,0);
    Color z = new Color(0,0,0);
    Color u = new Color(255,255,255);
    Color WW = new Color(255,255,255);

    // set int
    int l = 120;

    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public face(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        
	// background color
	// set color
	g.setColor(yell);
	// fill the color
	g.fillRect(0,0,WIDTH,HEIGHT);
	
        // pens
        // set color
        g.setColor(brown);
        // create pens
        g.drawRect(0, 160, WIDTH, 30);
        g.fillRect(0,160,WIDTH,30);
        
        g.drawRect(0,130,20,90);
        g.drawRect(30,130,20,90);
        g.drawRect(60,130,20,90);
        g.drawRect(90,130,20,90);
        g.drawRect(120,130,20,90);
        g.drawRect(150,130,20,90);
        g.drawRect(180,130,20,90);
        g.drawRect(210,130,20,90);
        g.drawRect(240,130,20,90);
        g.drawRect(270,130,20,90);
        g.drawRect(300,130,20,90);
        g.drawRect(330,130,20,90);
        g.drawRect(360,130,20,90);
        g.drawRect(390,130,20,90);
        g.drawRect(420,130,20,90);
        g.drawRect(450,130,20,90);
        g.drawRect(480,130,20,90);
        g.drawRect(510,130,20,90);
        g.drawRect(540,130,20,90);
        g.drawRect(570,130,20,90);
        g.drawRect(600,130,20,90);
        g.drawRect(630,130,20,90);
        g.drawRect(660,130,20,90);
        g.drawRect(690,130,20,90);
        g.drawRect(720,130,20,90);
        g.drawRect(750,130,20,90);
        g.drawRect(780,130,20,90);
        // fill rects
        g.fillRect(0,130,20,90);
        g.fillRect(30,130,20,90);
        g.fillRect(60,130,20,90);
        g.fillRect(90,130,20,90);
        g.fillRect(120,130,20,90);
        g.fillRect(150,130,20,90);
        g.fillRect(180,130,20,90);
        g.fillRect(210,130,20,90);
        g.fillRect(240,130,20,90);
        g.fillRect(270,130,20,90);
        g.fillRect(300,130,20,90);
        g.fillRect(330,130,20,90);
        g.fillRect(360,130,20,90);
        g.fillRect(420,130,20,90);
        g.fillRect(450,130,20,90);
        g.fillRect(480,130,20,90);
        g.fillRect(510,130,20,90);
        g.fillRect(540,130,20,90);
        g.fillRect(570,130,20,90);
        g.fillRect(600,130,20,90);
        g.fillRect(630,130,20,90);
        g.fillRect(660,130,20,90);
        g.fillRect(690,130,20,90);
        g.fillRect(720,130,20,90);
        g.fillRect(750,130,20,90);
        g.fillRect(780,130,20,90);
        
        // ears
        // left
	// set color
        g.setColor(y);
        // draw a polygon
        // set arrays
        int[] a = {220,350,215};
        int[] b = {100,125,240};
        // (array of a points, array of b points, # of points)
        g.fillPolygon(a, b, 3);
        // set color
        g.setColor(u);
        // draw a polygon
        // set arrays
        int[] c = {250,320,245};
        int[] d = {130,145,225};
        // (array of c points, array of d points, # of points)
        g.fillPolygon(c,d,3);
        
        // right
        // set color
        g.setColor(y);
        // draw a polygon
        // set arrays
        int[] e = {635,500,630};
        int[] f = {240,125,100};
        // (array of e points, array of f points, # of points)
        g.fillPolygon(e,f,3);
        // set color
        g.setColor(u);
        // draw a polygon
        // set arrays
        int[] h = {605,530,600};
        int[] i = {225,145,130};
        // (array of h points, array of i points, # of points)
        g.fillPolygon(h,i,3);
        
        
        // set costom color
        g.setColor(y);
        // shape 
        g.drawOval(200,100,450,400);
        // fill the color of face
        g.fillOval(200,100,450,400);
        
        // line
        // set color
        g.setColor(Color.BLACK);
        // draw lines
        int[] q = {220,300};
        int[] p = {220,240};
        g.drawPolyline(q, p, 2);
        int[] v = {380,630};
        int[] o = {240, 200};
        g.drawPolyline(v,o,2); 
        
        // eyes
        // sclera
        // set color
        g.setColor(Color.WHITE);
        // draw circles
        g.drawOval(300, 200, 80, 80);
        g.drawOval(480, 200, 80, 80);
        // fill the color
        g.fillOval(480, 200, 80, 80);
	g.fillOval(300, 200, 80, 80);
        // iris
        // color
        g.setColor(brown);
        // draw circles
        g.drawOval(320,220,40,40);
	g.drawOval(500,220,40,40);
        // fill the color
        g.fillOval(320,220,40,40);
        g.fillOval(500,220,40,40);
        
        //circle
        //set color
        g.setColor(Color.BLACK);
        // draw ovals
        g.drawOval(300, l, 80, 80);
        // fill ovals
        g.fillOval(300, l, 80, 80);
        
        // nose
        // set color
        g.setColor(Color.PINK);
        // draw nose
        g.drawOval(400, 320, 20, 20);
        g.drawOval(440, 320, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(380, 300, 100, 60);
        //fill the color
        g.setColor(Color.pink);
        g.fillOval(380,300,100,60);
	// set another color
        g.setColor(Color.BLACK);
	// fill the color
	g.fillOval(400,320,20,20);
        g.fillOval(440,320,20,20);
        
	// mouth
	// set color
	g.setColor(Color.RED);
	// draw mouth
	g.drawOval(380,397,100,80);
	// fill the color
	g.fillOval(380,397,100,80);
        
	// teeth
	// set color
	g.setColor(Color.BLACK);
	// draw teeth
	g.drawRect(410,400,20,20);
        g.drawRect(431,400,20,20);
	// set new color
        g.setColor(Color.WHITE);
        // fill the color
        g.fillRect(410,400,20,20);
        g.fillRect(431,400,20,20);
        
        // eyebrows
        // set color
        g.setColor(u);
        // draw a rectangle
        g.drawRect(300, 160, 260, 20);
        // fill rect
        g.fillRect(300, 160, 260, 20);
                
               
                
                
                
                
                
	
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        gameTimer.start();
        if(l<200){
            l = l + 80;
            y = x;
            u = z;
        }else if(l>=200){
            l = l-80;
            y=z;
            u=WW;
        }

    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        face game = new face();
    }
}

