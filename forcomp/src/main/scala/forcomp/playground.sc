package forcomp

object playground {
  //Anagrams.wordOccurrences("abcd")
  //Anagrams.sentenceOccurrences(List("abcd", "e"))
  //Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
  //Anagrams.wordAnagrams("married")
  //Anagrams.subtract(Anagrams.wordOccurrences("lard"), Anagrams.wordOccurrences("r"))
  //Anagrams.subtract(Anagrams.wordOccurrences("lardaass"), Anagrams.wordOccurrences("rad"))
  //Anagrams.sentenceAnagrams(List())
  //Anagrams.sentenceAnagrams(List("Linux", "rulez"))
  Anagrams.combinations(Anagrams.wordOccurrences("abba"))
                                                  //> res0: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,2), (b,2)), 
                                                  //| List((a,2), (b,2)))
}