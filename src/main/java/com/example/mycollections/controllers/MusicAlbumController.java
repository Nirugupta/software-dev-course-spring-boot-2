package com.example.mycollections.controllers;

import com.example.mycollections.models.MusicAlbum;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class MusicAlbumController {

    private final List<MusicAlbum> albums = new ArrayList<>() {{
        add(new MusicAlbum("Thriller", "Michael Jackson", 1982, "Pop"));
        add(new MusicAlbum("Back in Black", "AC/DC", 1980, "Rock"));
        add(new MusicAlbum("Rumours", "Fleetwood Mac", 1977, "Rock"));
    }};

    @GetMapping("/json")
    public List<MusicAlbum> getAlbumsJson() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        String albumList = "<ul>";
        for (MusicAlbum album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
            <html>
                <body>
                    <h1>Music Albums</h1>
                    """ + albumList + """
                </body>
            </html>
            """;
    }
}