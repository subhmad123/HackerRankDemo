package HackerRank


import scala.annotation.tailrec
import scala.io.StdIn.readInt

object CaptionPrime extends App
{           println("enter the number of inputs")
            val num_of_inputs=readInt()
            println("please enter the inputs one by one")
            for(i<-0 until num_of_inputs)
            {
                  val num:Int=readInt()
                  //calling check_status function and printing the received output
                  println("status of the input number is: "+ check_status(num.toString))
             }

  /***
   * this function checks from both left and right side for prime number consistency and returns appropriate decision
   * @param num
   * @return
   */
            def check_status(num:String): String ={
                 if(num.contains("0")||(!IsPrime(num.toInt))) {
                        "DEAD"
                 }
                else
                 {
                         val left_status=left_side_check(num.drop(1))
                         val right_status=right_side_check(num.dropRight(1))
                         if(left_status&&right_status){
                           "CENTRAL"
                         }
                         else if(left_status){
                           "LEFT"
                         }
                         else if(right_status){
                           "RIGHT"
                         }
                         else{
                           "DEAD"
                         }
                 }
            }

  /**
   * this function drops digit one by one from right side and checks for prime number consistency
   * @param num
   * @return
   */

           @tailrec
           def right_side_check(num:String):Boolean={
             if(num.isEmpty)
             {
                          true
             }
             else
             {
                           if (IsPrime(num.toInt))
                             right_side_check(num.dropRight(1))
                           else
                             false
             }
           }

  /**
   *  this function drops digit one by one from left side and checks for prime number consistency
   * @param num
   * @return
   */

          @tailrec
          def left_side_check(num:String): Boolean ={
             if(num.isEmpty){
                        true
             }
             else
             {
                       if (IsPrime(num.toInt))
                         left_side_check(num.drop(1))
                       else
                         false
             }
           }

  /**
   * this function check whether a number is prime or not
   * @param value
   * @return
   */

            def IsPrime(value: Int): Boolean =
            {
              var flag = true
              for (i <- 2 until value / 2)
              {
                if (value % i == 0)
                {
                  flag = false
                }
              }
              flag
            }


}
