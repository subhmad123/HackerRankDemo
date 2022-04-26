package HackerRank

import scala.io.StdIn.{readInt, readLine}

object GameOfKyles extends  App{
  //taking input from user on number of testcases and for each testcase,calling the predict_win method and printing status
    println("Please enter the number of testcases")
    val no_of_testcases=readInt()
    for(i<-0 until no_of_testcases){
        println("please enter the starting number of kyles")
        val starting_number=readInt()
        val current_status_pins=readLine("please enter the current status")
        val list_pins=predict_win(starting_number,current_status_pins)
        if(list_pins.length%2==0)
          println("LOSE")
        else
          println("WIN")
    }

  /**
   * this function evaluates the current structure of remaining pins and returns it in form of list for decision making
   * @param starting_number
   * @param current_Status_pins
   * @return
   */
    def predict_win(starting_number:Int,current_Status_pins:String):List[String]={
        var str1:String=""
        var splitted_list:List[String]=List()
        for(i<-0 until starting_number)
        {
                  if(current_Status_pins(i).toString=="I")
                  {
                        if(str1.length==2){
                          splitted_list = splitted_list :+ str1.trim
                          str1 = ""
                        }
                        str1=str1+current_Status_pins(i).toString
                  }
                  else
                  {
                          if(str1!="") {
                            splitted_list = splitted_list :+ str1.trim
                            str1 = ""
                          }
                  }
        }
        if(str1!="")
        {
          splitted_list = splitted_list :+ str1.trim
        }
        splitted_list
    }

}
