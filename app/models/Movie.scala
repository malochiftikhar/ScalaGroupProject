package models

import scala.collection.mutable.ArrayBuffer

case class Movie(title: String, genre: String, rating: Double)

  object Movie {

    val movies = ArrayBuffer (
      Movie("Movie1", "TestGenre", 3.5),
      Movie("Movie2", "TestGenre", 3.2),
      Movie("Movie3", "TestGenre", 4.3),
      Movie("Movie4", "TestGenre", 2.1),
      Movie("Movie5", "TestGenre", 3.1),
      Movie("Movie6", "TestGenre", 5),
      Movie("Movie7", "TestGenre", 8),
      Movie("Movie8", "TestGenre", 5),
      Movie("Movie9", "TestGenre", 8)
    )
  }
