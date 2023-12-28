import java.awt.Color
import java.awt.Rectangle
import javax.swing.JFrame
import javax.swing.*


class UItest {
    private var w =JFrame("Better Test bro")
    private val game = numGuessing()

    fun calcApp() {
        var tf1=JTextField()
        var tf2=JTextField()
        var tf3=JTextField()



        w.setSize(640,480)
        w.layout=null
        val submitBtn=JButton("Submit")
        val guessBtn=JButton("Guess")
        val msg=JLabel("Enter your min and max numbers",SwingConstants.CENTER)
        var msg2=JLabel("Enter your guess",SwingConstants.CENTER)

        msg.bounds= Rectangle(100,60,300,50)
        tf1.bounds= Rectangle(100,100,150,50)
        tf2.bounds= Rectangle(250,100,150,50)

        submitBtn.bounds=Rectangle(175,150,150,50)
        submitBtn.background= Color.black
        submitBtn.foreground= Color.white


        w.add(msg)
        w.add(tf1)
        w.add(tf2)
        w.add(submitBtn)
        w.defaultCloseOperation=JFrame.EXIT_ON_CLOSE


        w.isVisible=true

        submitBtn.addActionListener {

            //variables
            game.setMinNum(tf1.getText().toInt())
            game.setMaxNum(tf2.getText().toInt())

            if(game.areNumsAppr()){
                tf3.bounds=Rectangle(175,250,150,50)
                guessBtn.bounds=Rectangle(175,300,150,50)
                guessBtn.background= Color.BLACK
                guessBtn.foreground= Color.WHITE
                w.add(tf3)
                w.add(guessBtn)

            }
            //updates the state
            msg.text=game.getState()


        }
        guessBtn.addActionListener{
            game.setGuess(tf3.getText().toInt())
            game.startGame()
            msg.text=game.getState()
        }

    }

}