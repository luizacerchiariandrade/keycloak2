package com.discoclient.com.discoclient.controller;


import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discoclient.com.discoclient.response.AlbumRest;

@RestController
@RequestMapping("/albums")
public class AlbumsController {
    
    @GetMapping
    public List<AlbumRest> getAlbums() { 
        
        AlbumRest album1 = new AlbumRest();
        album1.setAlbumId("albumIdHere");
        album1.setUserId("1");
        album1.setAlbumTitle("Album one title");
        album1.setAlbumDescription("Album 1 description");
        album1.setAlbumUrl("Album 1 URL");
        
        AlbumRest album2 = new AlbumRest();
        album2.setAlbumId("albumIdHere");
        album2.setUserId("2");
        album2.setAlbumTitle("Album two title");
        album2.setAlbumDescription("Album 2 description");
        album2.setAlbumUrl("Album 2 URL");
         
        return Arrays.asList(album1, album2);
    }
 
}