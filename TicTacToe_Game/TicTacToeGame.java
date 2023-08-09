import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame extends JFrame {

    private JButton [][] buttons;
    private boolean gameEnded=false;
    private boolean isX =true;
    private JFrame frame;


    public TicTacToeGame(){
        frame=new JFrame();
        frame.setTitle("Tic-Tac-Toe");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3));
        frame.setVisible(true);

        buttons=new JButton [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttons[i][j]=new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN,40));
                // buttons[i][j].setMargin(new Insets(15,15,15,15));
                buttons[i][j].setBorder(BorderFactory.createBevelBorder(1,Color.blue, Color.RED));                
                buttons[i][j].addActionListener(new ButtonClickListener(i,j));
                frame.add(buttons[i][j]);
            }
        }
        }

        private void checkWin(){
            String symbol= isX ? "X":"O";
            
            // Checking rows and columns for a win
            for(int i=0;i<3;i++){
                
                // Checking rows
                if(buttons[i][0].getText().equals(symbol) && buttons[i][1].getText().equals(symbol)&& buttons[i][2].getText().equals(symbol)){
                    highlightWinningButtons(i, 0, i, 1, i, 2);
                    showWinMessage(symbol); // Show a pop-up message indicating the winner
                    return;
                }
                // Checking columns
                if(buttons[0][i].getText().equals(symbol) && buttons[1][i].getText().equals(symbol)&& buttons[2][i].getText().equals(symbol)){
                    highlightWinningButtons(0, i, 1, i, 2, i); // Highlight the winning buttons
                    showWinMessage(symbol); // Show a pop-up message indicating the winner
                    return;
                }
            }

            // Checking diagonals for a win
                if(buttons[0][0].getText().equals(symbol) && buttons[1][1].getText().equals(symbol)&& buttons[2][2].getText().equals(symbol)){
                    highlightWinningButtons(0, 0, 1, 1, 2, 2);// Highlight the winning buttons
                    showWinMessage(symbol); // Show a pop-up message indicating the winner
                    return; // Exit the method since the game is won
                }
                if(buttons[0][2].getText().equals(symbol) && buttons[1][1].getText().equals(symbol)&& buttons[2][0].getText().equals(symbol)){
                    highlightWinningButtons(0, 2, 1, 1, 2, 0);
                    showWinMessage(symbol);
                    return;
                }        

                 // If no winner is found, check for a draw

                 boolean isDraw =true;
                 for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(buttons[i][j].getText().isEmpty()){
                            isDraw=false;
                            break;
                        }
                    }
                 }
                 if(isDraw){
                    gameEnded=true;
                    JOptionPane.showMessageDialog(this, "It's a draw!");
                    resetGame();
                 }           
    }
    private void resetGame() {
            for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttons[i][j].setText("");
                buttons[i][j].setBackground(null);
            }
        }
        gameEnded=false;
        isX=true;
        }

    private void showWinMessage(String symbol) {
        gameEnded=true;
        JOptionPane.showMessageDialog(this,"Player "+ symbol + " Wins!");
        resetGame();
        }

    private void highlightWinningButtons(int x1, int y1, int x2, int y2, int x3, int y3) {
        buttons[x1][y1].setBackground(Color.GREEN);
        buttons[x2][y2].setBackground(Color.GREEN);
        buttons[x3][y3].setBackground(Color.GREEN);
    }
    private class ButtonClickListener implements ActionListener {
        private int x, y;

        public ButtonClickListener(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!buttons[x][y].getText().isEmpty()|| gameEnded){
                return;
            }
            String symbol= isX ? "X" : "O";
            buttons[x][y].setText(symbol);
            checkWin();
            isX = !isX;
        }
        
    }
    public static void main(String[] args) {
        // new TicTacToeGame();
        new TicTacToeGame();

        
    }
}
