package main.java.com.interview.photoAlbum.service;

import main.java.com.interview.photoAlbum.model.Photo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@Component
public class PhotoService {

    public ResponseEntity<?> getPhotoById(Long id)
    {
        System.out.print("id ========================" + id);
        final String uri = "http://5af9fcb0edf5520014cbd30b.mockapi.io/api/v1/pictures/";
        RestTemplate restTemplate = new RestTemplate();
        Photo photo = restTemplate.getForObject(uri + id, Photo.class);
        ResponseEntity<String> entity = restTemplate.getForEntity(uri + id, String.class);

        return entity;
    }

}
