package main

import org.anormcypher._

object Main {
  def main(args : Array[String]):Unit = {
    // Somebody here?
    println("helloWorld")

    // Using Anormcypher
    implicit val connection = Neo4jREST()

    // Requete de test
    val req = Cypher("MATCH (n:document) RETURN n LIMIT 25")
    val stream = req()
    stream.map(row => {row[String]("n.name")}).toList
  }
}

