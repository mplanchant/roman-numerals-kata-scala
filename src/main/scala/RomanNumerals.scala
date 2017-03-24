object RomanNumerals {
  def of(arabic: Int): String = {
    arabic match {
      case 0 => ""
      case 1 => "I"
      case 2 => "II"
    }
  }
}
