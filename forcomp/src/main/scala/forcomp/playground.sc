package forcomp

object playground {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //Anagrams.wordOccurrences("abcd")
  //Anagrams.sentenceOccurrences(List("abcd", "e"))
  //Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
  //Anagrams.wordAnagrams("married")
  
  Anagrams.combinations(Anagrams.wordOccurrences("abcd"))
                                                  //> res0: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,1), (b,1), (
                                                  //| c,1)), List((a,1), (b,1), (d,1)), List((a,1), (c,1), (d,1)), List((b,1), (c,
                                                  //| 1), (d,1)), List((b,1), (c,1)), List((b,1), (d,1)), List((c,1), (d,1)), List
                                                  //| ((c,1)), List((d,1)), List())
  Anagrams.combinations(Nil)                      //> res1: List[forcomp.Anagrams.Occurrences] = List(List())

}