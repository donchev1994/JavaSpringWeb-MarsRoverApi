package com.example.response;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class MarsRoverApiResponse {

    List<MarsPhoto> photos = new ArrayList<>();

    public MarsRoverApiResponse() {
    }

    public MarsRoverApiResponse(List<MarsPhoto> photos) {
        this.photos = photos;
    }

    public List<MarsPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<MarsPhoto> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MarsRoverApiResponse.class.getSimpleName() + "[", "]")
                .add("photos=" + photos)
                .toString();
    }
}
