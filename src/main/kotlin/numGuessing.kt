import kotlin.random.Random

class numGuessing {
    private var minNum:Int=0
    private var maxNum:Int=0
    private var state:String=""
    private var input:Int=0
    private var guess:Int=0
    private var rndNum:Int=0
    private var isFinished:Boolean=false

    constructor(){

    }

    constructor(minNum:Int,maxNum:Int,input:Int){
        this.minNum=minNum
        this.maxNum=maxNum
        this.input=input
   }

    fun setState(newText:String){
        state=newText
    }

    fun getState():String{
        return state
    }

    fun getMinNum(): Int {
        return minNum
    }
    fun setMinNum(newMinNum:Int){
        minNum=newMinNum
    }

    fun getMaxNum(): Int {
        return maxNum
    }
    fun setMaxNum(newMaxNum:Int){
        maxNum=newMaxNum
    }

    fun getGuess():Int{
        return guess
    }

    fun setGuess(newGuess:Int){
        guess = newGuess
    }
    fun isFinished():Boolean{
        //as the variable at 9th line
        return isFinished
    }

    fun areNumsAppr():Boolean{
        if(this.minNum<this.maxNum){
            this.state="Now you can guess your num"
            rndNum = Random.nextInt(minNum,maxNum)
            print(rndNum)
            return true

        }else{
            this.state="enter a good numbah mate"
            return false
        }

    }

    fun startGame(){
        //all the game logic
        if(guess>rndNum) {
            state="Your number is bigger than random"
        }else if(guess<rndNum){
            state="Your number is lower than random"
        }else{
            state="You win"
            isFinished=true
        }

    }

}