package forcomp

object playground {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(35); val res$0 = 
  Anagrams.wordOccurrences("abcd");System.out.println("""res0: forcomp.Anagrams.Occurrences = """ + $show(res$0));$skip(50); val res$1 = 
  Anagrams.sentenceOccurrences(List("abcd", "e"));System.out.println("""res1: forcomp.Anagrams.Occurrences = """ + $show(res$1))}
}
