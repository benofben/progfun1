package forcomp

object playground {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(515); val res$0 = 
  //Anagrams.wordOccurrences("abcd")
  //Anagrams.sentenceOccurrences(List("abcd", "e"))
  //Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
  //Anagrams.wordAnagrams("married")
  //Anagrams.subtract(Anagrams.wordOccurrences("lard"), Anagrams.wordOccurrences("r"))
  //Anagrams.subtract(Anagrams.wordOccurrences("lardaass"), Anagrams.wordOccurrences("rad"))
  //Anagrams.combinations(Anagrams.wordOccurrences("abba"))
  Anagrams.sentenceAnagrams(List());System.out.println("""res0: List[forcomp.Anagrams.Sentence] = """ + $show(res$0));$skip(52); val res$1 = 
  Anagrams.sentenceAnagrams(List("Linux", "rulez"));System.out.println("""res1: List[forcomp.Anagrams.Sentence] = """ + $show(res$1))}
}
