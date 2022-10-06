import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class tictactoe  implements ActionListener {
 JFrame f = new JFrame("TicTacToe Game");
 JPanel titlepanel = new JPanel();
 JPanel buttonpanel = new JPanel();
 JButton btn[] = new JButton[9];
 JLabel lb = new JLabel();
 boolean player;
 Random rand = new Random();



   tictactoe(){
       f.setSize(600,600);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       f.add(lb);
       f.add(titlepanel , BorderLayout.NORTH);
       f.add(buttonpanel );
       lb.setText("TicTacToe");
       lb.setBackground(new Color(255,255,250));
       lb.setForeground(new Color(0,109,0));
       lb.setFont(new Font("MV Boli" ,Font.PLAIN, 60 ));
       lb.setHorizontalAlignment(JLabel.CENTER);
       lb.setOpaque(true);
       titlepanel.setLayout(new BorderLayout(2,1));
       titlepanel.setBounds(0,0 , 600,100);
       titlepanel.add(lb);
       buttonpanel.setLayout(new GridLayout(3,3,2,4));
       buttonpanel.setBackground(new Color(55,55,55));
       firstTurn();
       check();

       for(int i = 0 ; i<9 ; i++){
           btn[i] = new JButton();
           buttonpanel.add(btn[i]);
           btn[i].setFont(new Font("Georgia" , Font.ITALIC, 90))  ;
           btn[i].setBackground(new Color(55,55,55));
           btn[i].setFocusable(false);
           btn[i].addActionListener(this);                      // ADD ACTION LISTENER *******************
       }


   }
    public void firstTurn(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(rand.nextInt(2) == 0 ){         // X  =>   player = true
            player = true;
            lb.setText("X Turn !");

        }
        else{
            player = false;
            lb.setText("O Turn !");
        }
    }
    public void check(){
       if((btn[0].getText() == "X" ) && (btn[1].getText() == "X") && (btn[2].getText() == "X")){
           XWins(0,1,2);

        }
        if((btn[3].getText() == "X" ) && (btn[4].getText() == "X") && (btn[5].getText() == "X")){
            XWins(3,4,5);

        }
        if((btn[6].getText() == "X" ) && (btn[7].getText() == "X") && (btn[8].getText() == "X")){
            XWins(6,7,8);

        }
        if((btn[0].getText() == "X" ) && (btn[3].getText() == "X") && (btn[6].getText() == "X")){
            XWins(0,3,6);

        }
        if((btn[1].getText() == "X" ) && (btn[4].getText() == "X") && (btn[7].getText() == "X")){
            XWins(1,4,7);

        }
        if((btn[2].getText() == "X" ) && (btn[5].getText() == "X") && (btn[8].getText() == "X")){
            XWins(2,5,8);

        }
        if((btn[0].getText() == "X" ) && (btn[4].getText() == "X") && (btn[8].getText() == "X")){
            XWins(0,4,8);

        }
        if((btn[2].getText() == "X" ) && (btn[4].getText() == "X") && (btn[6].getText() == "X")){
            XWins(2,4,6);

        }
        if((btn[0].getText() == "O" ) && (btn[1].getText() == "O") && (btn[2].getText() == "O")){
            OWins(0,1,2);

        }
        if((btn[3].getText() == "O" ) && (btn[4].getText() == "O") && (btn[5].getText() == "O")){
            OWins(3,4,5);

        }
        if((btn[6].getText() == "O" ) && (btn[7].getText() == "O") && (btn[8].getText() == "O")){
            OWins(6,7,8);

        }
        if((btn[0].getText() == "O" ) && (btn[3].getText() == "O") && (btn[6].getText() == "O")){
            OWins(0,3,6);

        }
        if((btn[1].getText() == "O" ) && (btn[4].getText() == "O") && (btn[7].getText() == "O")){
            OWins(1,4,7);

        }
        if((btn[2].getText() == "O" ) && (btn[5].getText() == "O") && (btn[8].getText() == "O")){
            OWins(2,5,8);

        }
        if((btn[0].getText() == "O" ) && (btn[4].getText() == "O") && (btn[8].getText() == "O")){
            OWins(0,4,8);

        }
        if((btn[2].getText() == "O" ) && (btn[4].getText() == "O") && (btn[6].getText() == "O")){
            OWins(2,4,6);

        }



    }
   public void XWins(int a , int b , int c){

   }



   public void OWins(int a , int b , int c){

   }



    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == btn[i]) {
                if (player == true) {
                    if (btn[i].getText() == "") {
                        btn[i].setForeground(new Color(255, 0, 80));
                        btn[i].setText("X");
                        player = false;
                        lb.setText("O Turn !");
                        check();
                    }
                }
             else {
                 if (btn[i].getText() == "") {
                        btn[i].setForeground(new Color(51, 153, 255));
                        btn[i].setText("O");
                        player = true;
                        lb.setText("X Turn !");
                        check();

                    }
                }

            } }}


            public static void main (String[]args){
              tictactoe tictactoe = new tictactoe();


            }
        }


