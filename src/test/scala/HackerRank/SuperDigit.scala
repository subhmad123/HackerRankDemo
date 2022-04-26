package HackerRank

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object SuperDigit extends App {
      println("please enter the required number to check")
      var number:Int=readInt()
      println("please enter the repetition frequency")
      var frequency:Int=readInt()
      //fill function creates repetition of any number in required frequency and appends to list
      val final_num=List.fill(frequency)(number).mkString("").toInt
      println("super digit of input number is "+superDigit(final_num))

  /**
   * this function calculates and returns sum of digits of a given number
   * @param num
   * @return
   */
      def get_sum(num:Int): Int =
      {
            var temp=num
            var sum:Int=0
            while(temp!=0){
              sum=sum+temp%10
              temp=temp/10
            }
            sum
      }

  /**
   * this function recursively sums up everyDigit of the numbers
   * @param number
   * @return
   */

     @tailrec
     def superDigit(number:Int): Int =
      {
            if(number.toString.length==1){
               number
            }
            else{
              superDigit(get_sum(number))
            }
      }
}
