package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> movies = new ArrayList<>() {{
        add(new Movie("Inception", "Christopher Nolan", 2010, 148));
        add(new Movie("The Matrix", "Lana and Lilly Wachowski", 1999, 136));
        add(new Movie("Interstellar", "Christopher Nolan", 2014, 169));
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson() {
        return movies;
    }

    @GetMapping("/html")
    public String getMoviesHtml() {
        String movieList = "<ul>";
        for (Movie movie : movies) {
            movieList += "<li>" + movie + "</li>";
        }
        movieList += "</ul>";

        return """
            <html>
                <body>
                    <h1>Movies</h1>
                    """ + movieList + """
                </body>
            </html>
            """;
    }
}