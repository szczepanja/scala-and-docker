import scala.io.Source

object ReadFromFile extends App {
  val fileName = "harvest.csv"
  val lines = Source.fromFile(fileName).getLines.toSeq

  lines.foreach(println)

}
