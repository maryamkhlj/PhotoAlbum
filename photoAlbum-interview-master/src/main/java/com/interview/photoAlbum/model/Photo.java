package main.java.com.interview.photoAlbum.model;

/**
 * Created by Maryam on 2018-05-14.
 */

import java.io.Serializable;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Photo implements Serializable {
    private String id;
    private String createdAt;
    private String name;
    private String avatar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        avatar = avatar;
    }


}
