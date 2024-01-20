package csc583

import org.scalatest._

class TestQ5 extends FlatSpec with Matchers {
	val inputFilePath = "src/main/resources/Docs.txt"
	val invertedIndex = new InvertedIndex(inputFilePath)

	"Boolean model" should "answer Q5_1 correctly" in {
		val query = "schizophrenia AND drug"
		val docs = invertedIndex.runQ5_1(query) 
		println(s"Ranked documents using the unsmoothed method: ${docs.mkString(", ")}")

		docs.size should be (2)
		docs(0) should be ("Doc1")
		docs(1) should be ("Doc4")
	}

	it should "answer Q5_2 correctly" in {
		val query = "breakthrough OR new"
		val docs = invertedIndex.runQ5_2(query) 
		println(s"Ranked documents using the unsmoothed method: ${docs.mkString(", ")}")

		docs.size should be (4)
		docs(0) should be ("Doc1")
		docs(1) should be ("Doc2")
		docs(2) should be ("Doc3")
		docs(3) should be ("Doc4")
	}

	it should "answer Q5_3 correctly" in {
		val query = "(drug OR treatment) AND schizophrenia"
		val docs = invertedIndex.runQ5_3(query) 
		println(s"Ranked documents using the unsmoothed method: ${docs.mkString(", ")}")

		docs.size should be (3)
		docs(0) should be ("Doc1")
		docs(1) should be ("Doc2")
		docs(2) should be ("Doc4")
	}
}