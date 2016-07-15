package forcomp

object playground {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(435); val res$0 = 
  //Anagrams.wordOccurrences("abcd")
  //Anagrams.sentenceOccurrences(List("abcd", "e"))
  //Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
  //Anagrams.wordAnagrams("married")
  //Anagrams.combinations(Anagrams.wordOccurrences("abba"))
                                                  
  Anagrams.subtract(Anagrams.wordOccurrences("lard"), Anagrams.wordOccurrences("r"));System.out.println("""res0: forcomp.Anagrams.Occurrences = """ + $show(res$0));$skip(91); val res$1 = 
  Anagrams.subtract(Anagrams.wordOccurrences("lardaass"), Anagrams.wordOccurrences("rad"));System.out.println("""res1: forcomp.Anagrams.Occurrences = """ + $show(res$1))}

}
