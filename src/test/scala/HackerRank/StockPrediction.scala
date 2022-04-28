package HackerRank
import javax.swing.plaf.basic.BasicBorders.MarginBorder
import scala.io.StdIn.{readInt, readLine}
object Solution111 {
  def main(args: Array[String]) {
    val n = readInt()
    val stock = readLine().split(' ').toArray.map(_.toInt)
    val num_of_queries = readInt()

    def sol(index: Int, margin: Int) = {
      val target = stock(index)


      def searchLeft(position: Int): Int = {
        if (position < 0 || isInvalid(stock(position))) {
          index - position + 1
        }
        else {
          searchLeft(position - 1)
        }
      }

      def searchRight(position: Int): Int = {
        if (position >= n || isInvalid(stock(position))) {
          position - index - 1
        }
        else {
          searchRight(position + 1)
        }
      }

      def isInvalid(price: Int) = {
        price < target || price - target > margin
      }
      searchLeft(index - 1) + searchRight(index + 1) - 1
    }

    for (i <- 1 to num_of_queries) {
      val q = io.StdIn.readLine().split(' ').toArray.map(_.toInt)
      println(sol(q(0), q(1)))
    }
  }
}

