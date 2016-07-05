package forcomp

object playground {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  Anagrams.wordOccurrences("abcd")                //> res0: forcomp.Anagrams.Occurrences = List((a,1), (b,1), (c,1), (d,1))
  Anagrams.sentenceOccurrences(List("abcd", "e")) //> res1: forcomp.Anagrams.Occurrences = List((a,1), (b,1), (c,1), (d,1), (e,1))
                                                  //| 
  Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
                                                  //> res2: Option[List[forcomp.Anagrams.Word]] = Some(List(ate, eat, tea))
  Anagrams.wordAnagrams("married")                //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:230)
                                                  //| 	at forcomp.Anagrams$.wordAnagrams(Anagrams.scala:93)
                                                  //| 	at forcomp.playground$$anonfun$main$1.apply$mcV$sp(forcomp.playground.sc
                                                  //| ala:8)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at forcomp.playground$.main(forcomp.playground.scala:3)
                                                  //| 	at forcomp.playground.main(forcomp.playground.scala)
}