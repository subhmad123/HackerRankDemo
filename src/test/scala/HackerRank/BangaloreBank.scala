package HackerRank

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.{readInt, readLine}

object BangaloreBank extends App {
        println("pls enter the length of account number")
         val length_of_account_number:Int=readInt()
         var input_list: ListBuffer[Int] =ListBuffer()
         println("pls enter the account number digits one by one")
         for(i<-0 until length_of_account_number) {
              input_list.addOne(readInt())
         }
         println("minimum time required will be "+time_calculator(input_list))

  /**
   * this function calculates minimum time required to type whole bank account number
   * It decides initial finger position and based on initial position , which key will be at least distance
   * @param input_list
   * @return
   */

        def time_calculator(input_list:ListBuffer[Int]):String=
        {
           var left:List[Int]=List()
           var right:List[Int]=List()

            if(input_list.length==1) {
                  "1"
            }

            else if(input_list.length==2)
                  "2"
            else {
                         for(i<-input_list.indices)
                         {
                           if(input_list(i)==0)
                             input_list(i)=10
                         }
                         if(input_list.head<input_list(1)){
                           left=left:+input_list.head
                           right=right:+input_list(1)
                         }
                        else{
                           left=left:+input_list(1)
                           right=right:+input_list.head
                        }
                        var k:Int=0
                        var j:Int=0
                        for(i<-2 until input_list.length){
                          if(Math.abs(input_list(i)-left(k))<=Math.abs(input_list(i)-right(j))){
                            left=left:+input_list(i)
                            k=k+1
                          }
                          else{
                            right=right:+input_list(i)
                            j=j+1
                          }
                        }

                        var sum:Int=left.length+right.length
                        for(i<-0 until left.length-1){
                          sum=sum+Math.abs(left(i)-left(i+1))
                        }
                        for(i<-0 until right.length-1){
                          sum=sum+Math.abs(right(i)-right(i+1))
                        }

                        sum.toString
          }
        }
}