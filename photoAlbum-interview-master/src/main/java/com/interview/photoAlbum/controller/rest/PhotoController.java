package main.java.com.interview.photoAlbum.controller.rest;

import main.java.com.interview.photoAlbum.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pictures")
public class PhotoController {

    @Autowired
    PhotoService photoService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getPhotoById(@PathVariable("id") Long id) {

       // photoService.getPhotoById(id);
        return ResponseEntity.ok(photoService.getPhotoById(id));
    }
}