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
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    
    // set the costom colors
    Color yellow = new Color(251, 206, 177);
    Color brown = new Color(76, 38, 0);


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
	g.setColor(yellow);
	// fill the color
	g.fillRect(0,0,WIDTH,HEIGHT);
	
        // set costom color
        g.setColor(Color.BLACK);
        // shape 
        g.drawOval(200,100,450,450);
        // fill the color of face
        g.fillOval(200,100,450,450);
        
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
        
        // nose
        // set color
        g.setColor(Color.PINK);
        // draw nose
        g.drawOval(400, 320, 20, 20);
        g.drawOval(440, 320, 20, 20);
        g.drawOval(380, 300, 100, 60);
        //fill the color
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
	g.drawOval(400,400,80,80);
	// fill the color
	g.fillOval(400,400,80,80);
        
	// teeth
	// set color
	g.setColor(Color.WHITE);
	// draw teeth
	g.drawRect(440,400,20,20);
        g.drawRect(460,400,20,20);
	// fill the color
        g.fillRect(440,400,20,20);
        g.fillRect(460,400,20,20);
        
        // ears
	// set color
        g.setColor(Color.BLACK);
        // 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
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

