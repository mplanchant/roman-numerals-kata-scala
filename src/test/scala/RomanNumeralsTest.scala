import org.scalatest._

class RomanNumeralsTest extends FlatSpec with Matchers {

  "1" should "be I" in {
    RomanNumerals.of(1) shouldBe "I"
  }

  "2" should "be II" in {
    RomanNumerals.of(2) shouldBe "II"
  }


}
