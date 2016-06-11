package recfun

object Main {
  def main(args: Array[String]) {
    println(countChange(1,List(1)))
    println(countChange(1,List(1,2)))
    println(countChange(1,List(2,1)))
    println(countChange(2,List(2,1)))
    println(countChange(3,List(2,1)))
    println(countChange(4,List(1,2)))

    /*
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }*/ 
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c==0 || c==r)
        1
      else
        pascal(c-1,r-1)+pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      balanceInt(chars, 0)==0
    }
    
    def balanceInt(chars: List[Char], leftParenCount: Int): Int = {
      if(chars.isEmpty)
        leftParenCount
      else if(chars.head != '(' && chars.head != ')')
        balanceInt(chars.tail, leftParenCount)
      else if(chars.head == '(')
        balanceInt(chars.tail, leftParenCount+1)
      else if(leftParenCount>0 && chars.head==')')
        balanceInt(chars.tail, leftParenCount-1)
      else
        -1
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money==0 || coins.isEmpty)
        0
      else if(money-coins.head==0)
        1+countChange(money, coins.tail)
      else if(money-coins.head<0)
        countChange(money, coins.tail)
      else
        countChange(money-coins.head, coins)+countChange(money, coins.tail)
    }
}