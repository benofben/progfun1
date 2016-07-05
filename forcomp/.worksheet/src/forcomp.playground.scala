package forcomp

object playground {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(35); val res$0 = 
  Anagrams.wordOccurrences("abcd");System.out.println("""res0: forcomp.Anagrams.Occurrences = """ + $show(res$0));$skip(50); val res$1 = 
  Anagrams.sentenceOccurrences(List("abcd", "e"));System.out.println("""res1: forcomp.Anagrams.Occurrences = """ + $show(res$1));$skip(75); val res$2 = 
  Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)));System.out.println("""res2: Option[List[forcomp.Anagrams.Word]] = """ + $show(res$2));$skip(35); val res$3 = 
  Anagrams.wordAnagrams("married");System.out.println("""res3: List[forcomp.Anagrams.Word] = """ + $show(res$3))}
}
