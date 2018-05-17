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
    int desiredFPS = 30;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    
    // set the costom colors
    Color yell = new Color(251, 206, 177);
    Color brown = new Color(76, 38, 0);
    Color Brown = new Color(76, 38, 0);
    Color x = new Color(255, 180, 223);
    Color y = new Color(0,0,0);
    Color z = new Color(0,0,0);
    Color u = new Color(255,255,255);
    Color WW = new Color(255,255,255);
    Color redd = new Color(255,0,0);
    Color red = new Color(255,0,0);
    Color newwhite = new Color(255,255,255);
    Color theblue = new Color(0, 51, 255);
    Color yel = new Color(251,206,177);

    // set int
    int j = 0;
    
    // sun
    int sunX = 100;
    int sunY = 50;

    boolean moveUp = false;
    boolean moveDown = false;
    boolean moveLeft = false;
    boolean moveRight = false;

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
        
        g.drawRect(j,130,20,90);
        g.drawRect(j+30,130,20,90);
        g.drawRect(j+60,130,20,90);
        g.drawRect(j+90,130,20,90);
        g.drawRect(j+120,130,20,90);
        g.drawRect(j+150,130,20,90);
        g.drawRect(j+180,130,20,90);
        g.drawRect(j+210,130,20,90);
        g.drawRect(j+240,130,20,90);
        g.drawRect(j+270,130,20,90);
        g.drawRect(j+300,130,20,90);
        g.drawRect(j+330,130,20,90);
        g.drawRect(j+360,130,20,90);
        g.drawRect(j+390,130,20,90);
        g.drawRect(j+420,130,20,90);
        g.drawRect(j+450,130,20,90);
        g.drawRect(j+480,130,20,90);
        g.drawRect(j+510,130,20,90);
        g.drawRect(j+540,130,20,90);
        g.drawRect(j+570,130,20,90);
        g.drawRect(j+600,130,20,90);
        g.drawRect(j+630,130,20,90);
        g.drawRect(j+660,130,20,90);
        g.drawRect(j+690,130,20,90);
        g.drawRect(j+720,130,20,90);
        g.drawRect(j+750,130,20,90);
        g.drawRect(j+780,130,20,90);
        // fill rects
        g.fillRect(j,130,20,90);
        g.fillRect(j+30,130,20,90);
        g.fillRect(j+60,130,20,90);
        g.fillRect(j+90,130,20,90);
        g.fillRect(j+120,130,20,90);
        g.fillRect(j+150,130,20,90);
        g.fillRect(j+180,130,20,90);
        g.fillRect(j+210,130,20,90);
        g.fillRect(j+240,130,20,90);
        g.fillRect(j+270,130,20,90);
        g.fillRect(j+300,130,20,90);
        g.fillRect(j+330,130,20,90);
        g.fillRect(j+360,130,20,90);
        g.fillRect(j+420,130,20,90);
        g.fillRect(j+450,130,20,90);
        g.fillRect(j+480,130,20,90);
        g.fillRect(j+510,130,20,90);
        g.fillRect(j+540,130,20,90);
        g.fillRect(j+570,130,20,90);
        g.fillRect(j+600,130,20,90);
        g.fillRect(j+630,130,20,90);
        g.fillRect(j+660,130,20,90);
        g.fillRect(j+690,130,20,90);
        g.fillRect(j+720,130,20,90);
        g.fillRect(j+750,130,20,90);
        g.fillRect(j+780,130,20,90);
        
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
        // left
        // sclera
        // set color
        g.setColor(u);
        // draw circles
        g.drawOval(300, 200, 80, 80);
        // fill the color
        g.fillOval(300, 200, 80, 80);
        // iris
        // color
        g.setColor(Brown);
        // draw circles
        g.drawOval(320,220,40,40);
        // fill the color
        g.fillOval(320,220,40,40);
        // right
        // sclera
        // set color
        g.setColor(Color.WHITE);
        // draw circles
        g.drawOval(480, 200, 80, 80);
        // fill the color
        g.fillOval(480, 200, 80, 80);
        // iris
        // color
        g.setColor(brown);
        // draw circles
        g.drawOval(500,220,40,40);
        // fill the color
        g.fillOval(500,220,40,40);
        
        
	
        
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
        
        // moon and sun
        // sun
        // set color
        g.setColor(red);
        // draw
        g.drawOval(sunX,sunY,100,100);
        g.fillOval(sunX, sunY, 100, 100);
        // set color
        g.setColor(redd);
        g.drawOval(sunX+10,sunY+20,20,20);
        g.drawOval(sunX+45,sunY+35,30,30);
        g.drawOval(sunX+80,sunY+40,10,10);
        g.drawOval(sunX+15,sunY+50,30,30);
        g.drawOval(sunX+50,sunY+10,20,20);
        g.drawOval(sunX+50,sunY+70,20,20);
        
        
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
        
        // when sun leaves the screen
        if(sunX>WIDTH){
            sunX = -100;
        }
        if(sunX<-100){
            sunX = WIDTH + 100;
        }
        if(sunY>HEIGHT){
            sunY = -100;
        }
        if(sunY<-100){
            sunY = HEIGHT;
        }
        
        // move the player
        if(moveUp){
            sunY = sunY - 10;
        }else if(moveDown){
            sunY = sunY + 10;
        }
        
        if(moveLeft){
            sunX = sunX - 10;
        }else if(moveRight){
            sunX = sunX + 10;
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getButton()== MouseEvent.BUTTON1){
            j = j-15;
            }
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getButton()== MouseEvent.BUTTON1){
                j = j + 15;
            }
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
            // get the key code
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_SHIFT){
                    y = x;
                    u = z;
                    yell = theblue;
                    red = newwhite;
                    Brown = z;
                    redd = Color.BLACK;
            }
            if(keyCode == KeyEvent.VK_CONTROL){
                    y=z;
                    u=WW;
                    yell = yel;
                    red = Color.RED;
                    Brown = brown;
                    redd = red;
            }
            // which key is being pressed
            if(keyCode == KeyEvent.VK_UP){
                moveUp = true;
            }
            if(keyCode == KeyEvent.VK_DOWN){
                moveDown = true;
            }
            if(keyCode == KeyEvent.VK_LEFT){
                moveLeft = true;
            }
            if(keyCode == KeyEvent.VK_RIGHT){
                moveRight = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            // get the key code
            int keyCode = e.getKeyCode();
            // which key is being pressed
            if(keyCode == KeyEvent.VK_UP){
                moveUp = false;
            }
            if(keyCode == KeyEvent.VK_DOWN){
                moveDown = false;
            }
            if(keyCode == KeyEvent.VK_LEFT){
                moveLeft = false;
            }
            if(keyCode == KeyEvent.VK_RIGHT){
                moveRight = false;
            }
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

