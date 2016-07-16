package forcomp

object playground {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(569); val res$0 = 
  //Anagrams.wordOccurrences("abcd")
  //Anagrams.sentenceOccurrences(List("abcd", "e"))
  //Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
  //Anagrams.wordAnagrams("married")
  //Anagrams.subtract(Anagrams.wordOccurrences("lard"), Anagrams.wordOccurrences("r"))
  //Anagrams.subtract(Anagrams.wordOccurrences("lardaass"), Anagrams.wordOccurrences("rad"))
  //Anagrams.sentenceAnagrams(List())
  //Anagrams.sentenceAnagrams(List("Linux", "rulez"))
  Anagrams.combinations(Anagrams.wordOccurrences("abba"));System.out.println("""res0: List[forcomp.Anagrams.Occurrences] = """ + $show(res$0))}
}
