import scala.io.Source

object ReadFromFile extends App {
  val harvest = if (args.length > 0) args(0)
  else "harvest.csv"

  val prices = if (args.length > 0) args(1)
  else "prices.csv"

  val _harvest = Source.fromFile(harvest).getLines.toSeq
  val splitValues = _harvest.map(line => line.split("\\W+").toSeq)
}
