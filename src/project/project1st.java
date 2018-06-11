package project;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.Timer;

import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author choij2116
 */
public class project1st extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "Number Baseball Game (bulls and cows)";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    // create a custom font
    Font biggerFont = new Font("times new roman",Font.ITALIC, 50);
    Font smaller = new Font("times new roman",Font.ITALIC, 25);
    
    // custom color
    Color skyblue = new Color(135, 206, 235);
    Color bl = new Color(0,0,0);
    Color cy = new Color(0,255,255);
    
    // the number that the computer chose
    int computer[] = new int[3];
    
    // the number that the user will choose
    int user[] = new int[3];
    
    // random for computer[]
    Random random = new Random();
    
    // int for strike and ball and
    int strike = 0;
    int ball = 0;
    
    // boolean out
    boolean out = false;
        
    // int tries
    int tries = 0;
    
    // boolean enter
    boolean enter = false; 
    
    // boolean showup strike/ball
    boolean showst = false;
    boolean showba = false; 
    
    // boolean end game
    boolean end = false; 
    
        
    // x positions for cards
    int x1 = 50;
    int x2 = 120;
    int x3 = 190;
    int x4 = 260;
    int x5 = 330;
    int x6 = 400;
    int x7 = 470;
    int x8 = 540;
    int x9 = 610;
    
    // y positions for cards
    int y1 = 500;
    int y2 = 500;
    int y3 = 500;
    int y4 = 500;
    int y5 = 500;
    int y6 = 500;
    int y7 = 500;
    int y8 = 500;
    int y9 = 500;
    
    // start time
    long startT = System.currentTimeMillis();
    
    
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public project1st(){
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
        
        // background
        // set color
        g.setColor(skyblue);
        g.fillRect(0,0,WIDTH,HEIGHT);
        
        // draw cards
        // set color
        g.setColor(bl);
        // cards' shapes
        g.fillRoundRect(x1, y1, 50, 75, 10, 10);
        g.fillRoundRect(x2, y2, 50, 75, 10, 10);
        g.fillRoundRect(x3, y3, 50, 75, 10, 10);
        g.fillRoundRect(x4, y4, 50, 75, 10, 10);
        g.fillRoundRect(x5, y5, 50, 75, 10, 10);
        g.fillRoundRect(x6, y6, 50, 75, 10, 10);
        g.fillRoundRect(x7, y7, 50, 75, 10, 10);
        g.fillRoundRect(x8, y8, 50, 75, 10, 10);
        g.fillRoundRect(x9, y9, 50, 75, 10, 10);
        // set font
        g.setFont(biggerFont);
        // set color
        g.setColor(cy);
        // draw numbers on the cards
        g.drawString("1", x1+15, y1+50);
        g.drawString("2", x2+15, y2+50);
        g.drawString("3", x3+15, y3+50);
        g.drawString("4", x4+15, y4+50);
        g.drawString("5", x5+15, y5+50);
        g.drawString("6", x6+15, y6+50);
        g.drawString("7", x7+15, y7+50);
        g.drawString("8", x8+15, y8+50);
        g.drawString("9", x9+15, y9+50);
        
        // Clear & enter button
        // set color
        g.setColor(Color.BLACK);
        // draw and fill
        g.fillRoundRect(680, 500, 75, 30, 10, 10);
        g.fillRoundRect(680, 535, 75, 30, 10, 10);
        // set another color
        g.setColor(cy);
        // set font
        g.setFont(smaller);
        // draw clear and enter 
        g.drawString("Clear", 690, 520);
        g.drawString("Enter", 690, 555);
        
        // board
        // set color
        g.setColor(Color.BLACK);
        // draw and fill
        g.fillRoundRect(570, 35, 200, 200, 50,50);
        
	// strike and ball
        // set font
        g.setFont(biggerFont);
        // set color
        g.setColor(Color.yellow);
        // strike
        g.drawString("S" , 600, 100);
        // set color
        g.setColor(Color.GREEN);
        // ball
        g.drawString("B", 600, 200);
        
        // if showst is true
        if(showst = true){
            // set color
            g.setColor(Color.yellow);
            // show strikes
            g.drawString("" + strike,700,100);
        }
        
        // if showba is true
        if(showba = true){
            // set color
            g.setColor(Color.GREEN);
            // show balls
            g.drawString("" + ball, 700, 200);
        }
        
        // title
        // set color
        g.setColor(Color.BLACK);
        // draw the title
        g.drawString("Number Baseball Game", 50, 100);
        
        // result (game board)
        // set color
        g.setColor(Color.RED);
        // results
        g.drawString("RESULT", 100, 200);
        g.drawRoundRect(50,200,300,200,50,50);
        g.setColor(Color.BLACK);
        g.drawRoundRect(80, 260, 50, 75, 10, 10);
        g.drawRoundRect(170, 260, 50, 75, 10, 10);
        g.drawRoundRect(260, 260, 50, 75, 10, 10);
        
        // timer and tries
        g.setColor(Color.DARK_GRAY);
        g.setFont(smaller);
        g.drawString("Time and Tries", 550, 300);
        g.drawRoundRect(500,300,250,150,50,50);    
        // time
        long nowt = (System.currentTimeMillis() - startT)/1000;
        // shows time and tries 
        g.drawString("Time   " + nowt + " sec." , 525, 350);
        g.drawString("Tries", 525, 400);
        // shows number of tries
        g.drawString(""+tries, 625,400);
        
        // next trial
        g.setColor(Color.WHITE);
        g.fillRoundRect(640, 220, 50, 20, 10, 10);
        g.setColor(Color.BLACK);
        g.drawString("next",645,235);
        
        // show out if it is out
        if(out==true){
            g.setColor(Color.RED);
            g.drawString("OUT!", 635,220);
        }
        
        // end the game
        if(end == true){
            // clear background
            g.clearRect(0, 0, WIDTH, HEIGHT);
            // set color
            g.setColor(Color.GREEN);
            // background
            g.fillRoundRect(0,0,WIDTH,HEIGHT,100,100);
            // set font
            g.setFont(biggerFont);
            // set color
            g.setColor(Color.RED);
            // Final Score
            g.drawString("You Win!!", 300, 275);
            g.drawString("" + computer[0] + " " + computer[1] + " " + computer[2], 300, 225);
            // set new font
            g.setFont(smaller);
            g.drawString("Time : " + nowt + "  sec. ", 350, 400);
            g.drawString("Tries : " + tries , 350, 375);   
            
            // new game
            g.setColor(Color.yellow);
            g.fillRoundRect(350, 450, 135, 50, 10, 10);
            g.setColor(Color.CYAN);
            g.drawString("NEW GAME", 355 , 475);
        }
        
        
        // GAME DRAWING ENDS HERE
    }
    
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // the combination of the numbers that the computer choose
        // prevent the repitaion of the numbers
        
        // first digit of the number
        // if first digit is equal to zero, put random number on first.
        while(computer[0]==0){
            computer[0] = random.nextInt(9);
        }
        // second digit
        // if first digit and second digit is same OR
        // second digit is equal to zero put random number on second.
        while(computer[0]==computer[1] || computer[1] == 0){
            computer[1] = random.nextInt(9);
        }
        // if first digit and third digit is same OR 
        // second digit and third digit is same OR
        // third digit is equal to zero put random number on third.
        while(computer[0]==computer[2]|| computer[1]==computer[2] || computer[2] == 0){
            computer[2] = random.nextInt(9);
        }
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
            
        if(strike != 3){
            end = false; 
            if(user[0]==0||user[1] == 0 || user[2] == 0){
                enter = false;
            }
            if(user[0]!=0&&user[1]!=0&&user[2]!=0){
                if(enter){
                showst = true;
                showba = true;
            }
            }
        }else if(strike == 3 && enter){
            end = true;
        }
        
        if(strike == 0&& ball == 0 && enter){
            out = true;
           
        }
        
    }
    
    private void strikecount() {
            if(computer[0] == user[0]){
                strike = strike + 1;
            }
            if(computer[1] == user[1]){
                strike = strike + 1;
            }
            if(computer[2] == user[2]){
                strike = strike + 1;
            }
    }

    private void ballcount() {
            if(user[0]==computer[1]||user[0]==computer[2]){
                ball = ball + 1;
            }
            if(user[1]==computer[0]||user[1]==computer[2]){
                ball = ball + 1;
            }
            if(user[2]==computer[0]||user[2]==computer[1]){
                ball = ball + 1;
            }
    }


    

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            // get x and y position when the mouse pressed
            e.getX();
            e.getY();
            // if statement for first digit of number
            // if first digit is zero
                if(user[0] == 0){
                // if mouse click the '1' card, 
                if(e.getX()<=100 && e.getX()>=50 && e.getY()<=575 && e.getY()>= 500){
                    // with the first button
                    if(e.getButton()== MouseEvent.BUTTON1){
                        // '1' card goes first space
                        x1 = 80;
                        y1 = 260;
                        // first digit is '1'
                        user[0] = 1;
                    }
                    // same method has been used for other cards
                }else if(e.getX()<=170 && e.getX()>=120 && e.getY()<=575 && e.getY()>= 500){
                    if(e.getButton()== MouseEvent.BUTTON1){
                        x2 = 80;
                        y2 = 260;
                        user[0] = 2;
                    }
                }else if(e.getX()<240 && e.getX()>=190 && e.getY()<=575 && e.getY()>= 500){
                    if(e.getButton()== MouseEvent.BUTTON1){
                        x3 = 80;
                        y3 = 260;
                        user[0] = 3;
                    }
                }else if(e.getX()<=310 && e.getX()>=260 && e.getY()<=575 && e.getY()>= 500){
                    if(e.getButton()== MouseEvent.BUTTON1){
                        x4 = 80;
                        y4 = 260;
                        user[0] = 4;
                    }
                }else if(e.getX()<=380 && e.getX()>=330 && e.getY()<=575 && e.getY()>= 500){
                    if(e.getButton()== MouseEvent.BUTTON1){
                        x5 = 80;
                        y5 = 260;
                        user[0] = 5;
                    }
                }else if(e.getX()<=450 && e.getX()>=400 && e.getY()<=575 && e.getY()>= 500){
                    if(e.getButton()== MouseEvent.BUTTON1){
                        x6 = 80;
                        y6 = 260;
                        user[0] = 6;
                    }
                }else if(e.getX()<=520 && e.getX()>=470 && e.getY()<=575 && e.getY()>= 500){
                    if(e.getButton()== MouseEvent.BUTTON1){
                        x7 = 80;
                        y7 = 260;
                        user[0] = 7;
                    }
                }else if(e.getX()<=590 && e.getX()>=540 && e.getY()<=575 && e.getY()>= 500){
                    if(e.getButton()== MouseEvent.BUTTON1){
                        x8 = 80;
                        y8 = 260;
                        user[0] = 8;
                    }
                }else if(e.getX()<=660 && e.getX()>=610 && e.getY()<=575 && e.getY()>= 500){
                    if(e.getButton()== MouseEvent.BUTTON1){
                        x9 = 80;
                        y9 = 260;
                        user[0] = 9;
                    }
                }
            }
            
                // second digit
                // if first digit is zero
                else if(user[0]!=0 && user[1] == 0){
                if(e.getX()<=100 && e.getX()>=50 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 1){
                        x1 = 170;
                        y1 = 260;
                        user[1] = 1;
                    }
                }else if(e.getX()<=170 && e.getX()>=120 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 2){
                        x2 = 170;
                        y2 = 260;
                        user[1] = 2;
                    }
                }else if(e.getX()<240 && e.getX()>=190 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 3){
                        x3 = 170;
                        y3 = 260;
                        user[1] = 3;
                    }
                }else if(e.getX()<=310 && e.getX()>=260 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 4){
                        x4 = 170;
                        y4 = 260;
                        user[1] = 4;
                    }
                }else if(e.getX()<=380 && e.getX()>=330 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 5){
                        x5 = 170;
                        y5 = 260;
                        user[1] = 5;
                    }
                }else if(e.getX()<=450 && e.getX()>=400 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 6){
                        x6 = 170;
                        y6 = 260;
                        user[1] = 6;
                    }
                }else if(e.getX()<=520 && e.getX()>=470 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 7){
                        x7 = 170;
                        y7 = 260;
                        user[1] = 7;
                    }
                }else if(e.getX()<=590 && e.getX()>=540 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 8){
                        x8 = 170;
                        y8 = 260;
                        user[1] = 8;
                    }
                }else if(e.getX()<=660 && e.getX()>=610 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 9){
                        x9 = 170;
                        y9 = 260;
                        user[1] = 9;
                    }
                }
            }
                
                // third digit
                else if(user[0] != 0 && user[1] != 0 && user[2] == 0){
                if(e.getX()<=100 && e.getX()>=50 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 1 && user[1] != 1){
                        x1 = 260;
                        y1 = 260;
                        user[2] = 1;
                    }
                }else if(e.getX()<=170 && e.getX()>=120 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 2 && user[1] != 2){
                        x2 = 260;
                        y2 = 260;
                        user[2] = 2;
                    }
                }else if(e.getX()<240 && e.getX()>=190 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 3 && user[1] != 3){
                        x3 = 260;
                        y3 = 260;
                        user[2] = 3;
                    }
                }else if(e.getX()<=310 && e.getX()>=260 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 4 && user[1] != 4){
                        x4 = 260;
                        y4 = 260;
                        user[2] = 4;
                    }
                }else if(e.getX()<=380 && e.getX()>=330 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 5 && user[1] != 5){
                        x5 = 260;
                        y5 = 260;
                        user[2] = 5;
                    }
                }else if(e.getX()<=450 && e.getX()>=400 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 6 && user[1] != 6){
                        x6 = 260;
                        y6 = 260;
                        user[2] = 6;
                    }
                }else if(e.getX()<=520 && e.getX()>=470 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 7 && user[1] != 7){
                        x7 = 260;
                        y7 = 260;
                        user[2] = 7;
                    }
                }else if(e.getX()<=590 && e.getX()>=540 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 8 && user[1] != 8){
                        x8 = 260;
                        y8 = 260;
                        user[2] = 8;
                    }
                }else if(e.getX()<=660 && e.getX()>=610 && e.getY()<=575 && e.getY()>= 500){
                    if((e.getButton()== MouseEvent.BUTTON1)&& user[0] != 9 && user[1] != 9){
                        x9 = 260;
                        y9 = 260;
                        user[2] = 9;
                    }
                }
            } 
                // clear
                if(user[0] != 0 || user[1] != 0 || user[2]!=0){
                    if(e.getX()>= 680 && e.getX()<= 730 && e.getY()<= 530 && e.getY()>=500){
                        if(e.getButton()== MouseEvent.BUTTON1){
                        // x
                        x1 = 50;
                        x2 = 120;
                        x3 = 190;
                        x4 = 260;
                        x5 = 330;
                        x6 = 400;
                        x7 = 470;
                        x8 = 540;
                        x9 = 610;

                        // y 
                        y1 = 500;
                        y2 = 500;
                        y3 = 500;
                        y4 = 500;
                        y5 = 500;
                        y6 = 500;
                        y7 = 500;
                        y8 = 500;
                        y9 = 500;
                        
                        // reset
                        user[0] = 0;
                        user[1] = 0;
                        user[2] = 0;
                        
                        // strike and balls
                        strike = 0;
                        ball = 0;
                        out = false; 
                        
                    }
                    }
                }
                
                // enter
                if(user[0] != 0 && user[1] != 0 && user[2]!=0){
                    if(e.getX()>= 680 && e.getX()<= 730 && e.getY()<= 565 && e.getY()>=535){
                        if(e.getButton()== MouseEvent.BUTTON1){
                            strikecount();
                            ballcount();
                            enter = true;
                            tries = tries + 1;
                        }
                    }
                }
                
                // next turn
                if(strike != 3){
                if(e.getX()>= 640 && e.getX()<= 690 && e.getY() >= 220 && e.getY() <= 240){
                    if(e.getButton() == MouseEvent.BUTTON1){
                    strike = 0;
                    ball = 0;
                    showst = false; 
                    showba = false; 
                    out = false; 
                    
                    // x
                        x1 = 50;
                        x2 = 120;
                        x3 = 190;
                        x4 = 260;
                        x5 = 330;
                        x6 = 400;
                        x7 = 470;
                        x8 = 540;
                        x9 = 610;

                        // y 
                        y1 = 500;
                        y2 = 500;
                        y3 = 500;
                        y4 = 500;
                        y5 = 500;
                        y6 = 500;
                        y7 = 500;
                        y8 = 500;
                        y9 = 500;
                        
                        // reset
                        user[0] = 0;
                        user[1] = 0;
                        user[2] = 0;
                    }
                }
                }
                
                // new game 
                if(strike == 3){
                    if(e.getX()>=350 && e.getX()<=485 && e.getY()>=450&&e.getY()<=500){
                        if(e.getButton()==MouseEvent.BUTTON1){
                            end = false; 
                            strike = 0;
                            ball = 0;
                            showst = false; 
                            showba = false; 
                            out = false; 
                            tries=0;
                            startT = System.currentTimeMillis();
                    
                    // x
                        x1 = 50;
                        x2 = 120;
                        x3 = 190;
                        x4 = 260;
                        x5 = 330;
                        x6 = 400;
                        x7 = 470;
                        x8 = 540;
                        x9 = 610;

                        // y 
                        y1 = 500;
                        y2 = 500;
                        y3 = 500;
                        y4 = 500;
                        y5 = 500;
                        y6 = 500;
                        y7 = 500;
                        y8 = 500;
                        y9 = 500;
                        
                        // reset
                        user[0] = 0;
                        user[1] = 0;
                        user[2] = 0;
                        computer[0] = 0;
                        computer[1] = 0;
                        computer[2] = 0;
                        }
                    }
                }
                
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getX()>= 680 && e.getX()<= 730 && e.getY()<= 565 && e.getY()>=535){
                enter = false; 
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
             int keyCode = e.getKeyCode();
            // if statement for first digit of number
            // if first digit is zero
                if(user[0] == 0){
                    if(keyCode== KeyEvent.VK_1||keyCode==KeyEvent.VK_NUMPAD1){
                        // '1' card goes first space
                        x1 = 80;
                        y1 = 260;
                        // first digit is '1'
                        user[0] = 1;
                    }
                    // same method has been used for other cards
                else if(keyCode== KeyEvent.VK_2||keyCode==KeyEvent.VK_NUMPAD2){
                        x2 = 80;
                        y2 = 260;
                        user[0] = 2;
                    
                }else if(keyCode== KeyEvent.VK_3||keyCode==KeyEvent.VK_NUMPAD3){
                        x3 = 80;
                        y3 = 260;
                        user[0] = 3;
                    
                }else if(keyCode== KeyEvent.VK_4||keyCode==KeyEvent.VK_NUMPAD4){
                        x4 = 80;
                        y4 = 260;
                        user[0] = 4;
                    
                }else if(keyCode== KeyEvent.VK_5||keyCode==KeyEvent.VK_NUMPAD5){
                        x5 = 80;
                        y5 = 260;
                        user[0] = 5;
                    
                }else if(keyCode== KeyEvent.VK_6||keyCode==KeyEvent.VK_NUMPAD6){
                        x6 = 80;
                        y6 = 260;
                        user[0] = 6;
                    
                }else if(keyCode== KeyEvent.VK_7||keyCode==KeyEvent.VK_NUMPAD7){
                        x7 = 80;
                        y7 = 260;
                        user[0] = 7;
                    
                }else if(keyCode== KeyEvent.VK_8||keyCode==KeyEvent.VK_NUMPAD8){
                        x8 = 80;
                        y8 = 260;
                        user[0] = 8;
                    
                }else if(keyCode== KeyEvent.VK_9||keyCode==KeyEvent.VK_NUMPAD9){
                        x9 = 80;
                        y9 = 260;
                        user[0] = 9;
                    }
                }
                
            
            
                // second digit
                // if first digit is zero
                else if(user[0]!=0 && user[1] == 0){
                if((keyCode== KeyEvent.VK_1||keyCode==KeyEvent.VK_NUMPAD1) && user[0] != 1){
                        x1 = 170;
                        y1 = 260;
                        user[1] = 1;
                }else if((keyCode== KeyEvent.VK_2||keyCode==KeyEvent.VK_NUMPAD2)&& user[0] != 2){
                        x2 = 170;
                        y2 = 260;
                        user[1] = 2;
                }else if((keyCode== KeyEvent.VK_3||keyCode==KeyEvent.VK_NUMPAD3)&& user[0] != 3){
                        x3 = 170;
                        y3 = 260;
                        user[1] = 3;
                }else if((keyCode== KeyEvent.VK_4||keyCode==KeyEvent.VK_NUMPAD4)&& user[0] != 4){
                        x4 = 170;
                        y4 = 260;
                        user[1] = 4;
                }else if((keyCode== KeyEvent.VK_5||keyCode==KeyEvent.VK_NUMPAD5)&& user[0] != 5){
                        x5 = 170;
                        y5 = 260;
                        user[1] = 5;
                }else if((keyCode== KeyEvent.VK_6||keyCode==KeyEvent.VK_NUMPAD6)&& user[0] != 6){
                        x6 = 170;
                        y6 = 260;
                        user[1] = 6;
                }else if((keyCode== KeyEvent.VK_7||keyCode==KeyEvent.VK_NUMPAD7)&& user[0] != 7){
                        x7 = 170;
                        y7 = 260;
                        user[1] = 7;
                }else if((keyCode== KeyEvent.VK_8||keyCode==KeyEvent.VK_NUMPAD8)&& user[0] != 8){
                        x8 = 170;
                        y8 = 260;
                        user[1] = 8;
                }else if((keyCode== KeyEvent.VK_9||keyCode==KeyEvent.VK_NUMPAD9)&& user[0] != 9){
                        x9 = 170;
                        y9 = 260;
                        user[1] = 9;
                }
            }
                
                // third digit
                else if(user[0] != 0 && user[1] != 0 && user[2] == 0){
                if((keyCode== KeyEvent.VK_1||keyCode==KeyEvent.VK_NUMPAD1)&& user[0] != 1 && user[1] != 1){
                        x1 = 260;
                        y1 = 260;
                        user[2] = 1;
                    
                }else if((keyCode== KeyEvent.VK_2||keyCode==KeyEvent.VK_NUMPAD2)&& user[0] != 2 && user[1] != 2){
                        x2 = 260;
                        y2 = 260;
                        user[2] = 2;
                    
                }else if((keyCode== KeyEvent.VK_3||keyCode==KeyEvent.VK_NUMPAD3)&& user[0] != 3 && user[1] != 3){
                        x3 = 260;
                        y3 = 260;
                        user[2] = 3;
                    
                }else if((keyCode== KeyEvent.VK_4||keyCode==KeyEvent.VK_NUMPAD4)&& user[0] != 4 && user[1] != 4){
                        x4 = 260;
                        y4 = 260;
                        user[2] = 4;
                    
                }else if((keyCode== KeyEvent.VK_5||keyCode==KeyEvent.VK_NUMPAD5)&& user[0] != 5 && user[1] != 5){
                        x5 = 260;
                        y5 = 260;
                        user[2] = 5;
                    
                }else if((keyCode== KeyEvent.VK_6||keyCode==KeyEvent.VK_NUMPAD6)&& user[0] != 6 && user[1] != 6){
                        x6 = 260;
                        y6 = 260;
                        user[2] = 6;
                    
                }else if((keyCode== KeyEvent.VK_7||keyCode==KeyEvent.VK_NUMPAD7)&& user[0] != 7 && user[1] != 7){
                        x7 = 260;
                        y7 = 260;
                        user[2] = 7;
                    
                }else if((keyCode== KeyEvent.VK_8||keyCode==KeyEvent.VK_NUMPAD8)&& user[0] != 8 && user[1] != 8){
                        x8 = 260;
                        y8 = 260;
                        user[2] = 8;
                    
                }else if((keyCode== KeyEvent.VK_9||keyCode==KeyEvent.VK_NUMPAD9)&& user[0] != 9 && user[1] != 9){
                        x9 = 260;
                        y9 = 260;
                        user[2] = 9;
                    
                }
        }
             
                // clear
                if(user[0] != 0 || user[1] != 0 || user[2]!=0){
                    if(keyCode== KeyEvent.VK_BACK_SPACE){
                        // x
                        x1 = 50;
                        x2 = 120;
                        x3 = 190;
                        x4 = 260;
                        x5 = 330;
                        x6 = 400;
                        x7 = 470;
                        x8 = 540;
                        x9 = 610;

                        // y 
                        y1 = 500;
                        y2 = 500;
                        y3 = 500;
                        y4 = 500;
                        y5 = 500;
                        y6 = 500;
                        y7 = 500;
                        y8 = 500;
                        y9 = 500;
                        
                        // reset
                        user[0] = 0;
                        user[1] = 0;
                        user[2] = 0;
                        
                        // strike and balls
                        strike = 0;
                        ball = 0;
                        out = false; 
                        
                    }
                    }
                
                
                // enter
                if(keyCode== KeyEvent.VK_ENTER){
                            strikecount();
                            ballcount();
                            enter = true;
                            
                        // add tries
                        tries = tries + 1;
                        }
                
                // next turn
                if(strike != 3){
                if(keyCode== KeyEvent.VK_RIGHT){
                    strike = 0;
                    ball = 0;
                    showst = false; 
                    showba = false; 
                    out = false; 
                    
                    // x
                        x1 = 50;
                        x2 = 120;
                        x3 = 190;
                        x4 = 260;
                        x5 = 330;
                        x6 = 400;
                        x7 = 470;
                        x8 = 540;
                        x9 = 610;

                        // y 
                        y1 = 500;
                        y2 = 500;
                        y3 = 500;
                        y4 = 500;
                        y5 = 500;
                        y6 = 500;
                        y7 = 500;
                        y8 = 500;
                        y9 = 500;
                        
                        // reset
                        user[0] = 0;
                        user[1] = 0;
                        user[2] = 0;
                    }
                }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            
            if(keyCode== KeyEvent.VK_ENTER){
                            enter = false;
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
        project1st game = new project1st();
    }
}

