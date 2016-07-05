package forcomp

object playground {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  Anagrams.wordOccurrences("abcd")                //> res0: forcomp.Anagrams.Occurrences = List((a,1), (b,1), (c,1), (d,1))
  Anagrams.sentenceOccurrences(List("abcd", "e")) //> res1: forcomp.Anagrams.Occurrences = List((a,1), (b,1), (c,1), (d,1), (e,1))
                                                  //| 
  Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
                                                  //> res2: Option[List[forcomp.Anagrams.Word]] = Some(List(ate, eat, tea))
  Anagrams.wordAnagrams("married")                //> res3: List[forcomp.Anagrams.Word] = List(admirer, married)
}