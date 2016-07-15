package forcomp

object playground {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(264); val res$0 = 
  //Anagrams.wordOccurrences("abcd")
  //Anagrams.sentenceOccurrences(List("abcd", "e"))
  //Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
  //Anagrams.wordAnagrams("married")
  
  Anagrams.combinations(Anagrams.wordOccurrences("abcd"));System.out.println("""res0: List[forcomp.Anagrams.Occurrences] = """ + $show(res$0));$skip(29); val res$1 = 
  Anagrams.combinations(Nil);System.out.println("""res1: List[forcomp.Anagrams.Occurrences] = """ + $show(res$1))}

}
