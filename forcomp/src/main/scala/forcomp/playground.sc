package forcomp

object playground {
  //Anagrams.wordOccurrences("abcd")
  //Anagrams.sentenceOccurrences(List("abcd", "e"))
  //Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
  //Anagrams.wordAnagrams("married")
  //Anagrams.combinations(Anagrams.wordOccurrences("abba"))
                                                  
  Anagrams.subtract(Anagrams.wordOccurrences("lard"), Anagrams.wordOccurrences("r"))
                                                  //> res0: forcomp.Anagrams.Occurrences = List((a,1), (d,1), (l,1))
  Anagrams.subtract(Anagrams.wordOccurrences("lardaass"), Anagrams.wordOccurrences("rad"))
                                                  //> res1: forcomp.Anagrams.Occurrences = List((a,2), (l,1), (s,2))

}