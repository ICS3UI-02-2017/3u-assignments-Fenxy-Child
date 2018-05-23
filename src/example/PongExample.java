package example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Rectangle;
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
public class PongExample extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "PONG";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    // rectangle (x,y,width,height)
    Rectangle paddle1 = new Rectangle(50,250,25,100);
    Rectangle paddle2 = new Rectangle(725,250,25,100);
    
    Rectangle ball = new Rectangle(395,295,10,10);
    
    int ballAngle = 50;
    int ballSpeed = 10;
    
    // control variables
    boolean paddle1Up = false;
    boolean paddle1Down = false;    
    boolean paddle2Up = false;
    boolean paddle2Down = false;    
    int paddleSpeed = 8;
    
    // scores
    int score1 = 0;
    int score2 = 0;
    
    // create a custom font
    Font biggerFont = new Font("times new roman",Font.ITALIC, 36);
    

    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public PongExample(){
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
        // draw the background
        g.setColor(Color.BLACK);
        g.fillRect(0,0,WIDTH,HEIGHT);
	
        // draw the paddles
        g.setColor(Color.white);
        g.fillRect(paddle1.x,paddle1.y,paddle1.width,paddle1.height);
        g.fillRect(paddle2.x,paddle2.y,paddle2.width,paddle2.height);
        
        g.setColor(Color.cyan);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);
        
        // draw the scores
        g.setFont(biggerFont);
        g.drawString("" + score1, WIDTH/2 - 50 , 50);
        g.drawString("" + score2, WIDTH/2 + 50 , 50);
	
        
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
        moveBall();
        movePaddles();
        checkForCollision();
        checkForGoal();
    }

    private void moveBall() {
        // convert ball angle to radians to use in trig
        double newAngle = Math.toRadians(ballAngle);
        // determine how much to move ball x and ball y
        // using trig
        double moveX = ballSpeed*Math.cos(newAngle);
        double moveY = ballSpeed*Math.sin(newAngle);
        
        // move the ball
        ball.x = ball.x + (int)moveX;
        ball.y = ball.y + (int)moveY;
    }

    private void movePaddles(){
        // player 1 control
        if(paddle1Up){
            paddle1.y = paddle1.y - paddleSpeed;
        }else if(paddle1Down){
            paddle1.y = paddle1.y + paddleSpeed;
        }
        
        if(paddle1.y<0){
            paddle1.y = 0;
        }else if(paddle1.y + paddle1.height > HEIGHT){
            paddle1.y = HEIGHT - paddle1.height;
        }
        
        // player 2 control
        if(paddle2Up){
            paddle2.y = paddle2.y - paddleSpeed;
        }else if(paddle2Down){
            paddle2.y = paddle2.y + paddleSpeed;
        }
        
        if(paddle2.y<0){
            paddle2.y = 0;
        }else if(paddle2.y + paddle2.height > HEIGHT){
            paddle2.y = HEIGHT - paddle2.height;
        }
    }

    private void checkForCollision() {
        // collusion with bottom/top
        if(ball.y < 0 || ball.y + ball.height > HEIGHT){
            ballAngle = ballAngle * -1;
        }
        
        if(ball.intersects(paddle1)||ball.intersects(paddle2)){
            ballAngle = (180 + ballAngle * -1);
        }
    }

    private void checkForGoal() {
        // ball off left hand side
        if(ball.x<0){
            // add to player 2 score
            score2++;
            // put ball back at the center
            ball.x = WIDTH/2 - ball.width/2;
            ball.y = HEIGHT/2 - ball.height/2;
        }
        // ball hit right hand side 
        if(ball.x + ball.width > WIDTH){
            score1++;
            ball.x = WIDTH/2 - ball.width/2;
            ball.y = HEIGHT/2 - ball.height/2;
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
            int keyCode = e.getKeyCode();
            
            // move paddle 1
            if(keyCode == KeyEvent.VK_W){
                paddle1Up = true;
            }else if(keyCode == KeyEvent.VK_S){
                paddle1Down = true; 
            }
            
            // move paddle 2
            if(keyCode == KeyEvent.VK_UP){
                paddle2Up = true;
            }else if(keyCode == KeyEvent.VK_DOWN){
                paddle2Down = true; 
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            
            // move paddle 1
            if(keyCode == KeyEvent.VK_W){
                paddle1Up = false;
            }else if(keyCode == KeyEvent.VK_S){
                paddle1Down = false; 
            }
            
            // move paddle 2
            if(keyCode == KeyEvent.VK_UP){
                paddle2Up = false;
            }else if(keyCode == KeyEvent.VK_DOWN){
                paddle2Down = false; 
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
        PongExample game = new PongExample();
    }
}

