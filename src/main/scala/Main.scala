import com.raquo.laminar.api.L._
import org.scalajs.dom.document

object Main {
  def main(args: Array[String]): Unit = {
    render(document.getElementById("app"), appElement)
  }

  val movieTitleVar = Var("")
  val releaseYearVar = Var("")
  val moviesVar = Var(List.empty[(String, String, Var[Boolean])])

  def appElement: Div = {
    div(
      h2("Movie Watchlist"),
      div(
        label("Movie name: "),
        input(
          typ := "text",
          controlled(
            value <-- movieTitleVar.signal,
            onInput.mapToValue --> movieTitleVar.writer
          )
        ),
        label("Year released: "),
        input(
          typ := "text",
          controlled(
            value <-- releaseYearVar.signal,
            onInput.mapToValue --> releaseYearVar.writer
          )
        ),
        button(
          "Add movie",
          onClick --> { _ =>
            val title = movieTitleVar.now()
            val year = releaseYearVar.now()
            if (title.nonEmpty && year.nonEmpty) {
              moviesVar.update(_ :+ (title, year, Var(false)))
              movieTitleVar.set("")
              releaseYearVar.set("")
            }
          }
        )
      ),
      hr(),
      table(
        thead(
          tr(
            th("Watched?"),
            th("Movie Name"),
            th("Year Released")
          )
        ),
        tbody(
          children <-- moviesVar.signal.split(_._1) { (_, movie, _, watchedVar) =>
            tr(
              td(
                input(typ := "checkbox", controlled(checked <-- watchedVar.signal, onClick.mapToChecked --> watchedVar.writer))
              ),
              td(movie._1),
              td(movie._2)
            )
          }
        )
      )
    )
  }
}

