package forcomp

object playground {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  Anagrams.wordOccurrences("abcd")                //> res0: forcomp.Anagrams.Occurrences = List((a,1), (b,1), (c,1), (d,1))
  Anagrams.sentenceOccurrences(List("abcd", "e")) //> res1: forcomp.Anagrams.Occurrences = List((e,1), (a,1), (b,1), (c,1), (d,1))
                                                  //| 
}