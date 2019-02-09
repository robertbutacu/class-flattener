import shapeless._

object Main extends App {
  val otherOther = OtherOther("asdfa", "asdasd")

  val other = Other(2.0, 'c', otherOther)

  val example = Example("asdasd", "asdasd", 5, other)
  val genericOtherOther: String :: String :: HNil = Generic[OtherOther].to(otherOther)

  val genericOther = Generic[Other].to(other)

  val genericExample = Generic[Example].to(example)

  println(the[Generic[Example]].to(example))
}
