package com.example.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.StringJoiner;

public class MarsCamera {
    private Long id;
    private String name;
    @JsonProperty("rover_id")
    private Long roverId;
    @JsonProperty("full_name")
    private String fullName;

    public MarsCamera() {
    }

    public MarsCamera(Long id, String name, Long roverId, String fullName) {
        this.id = id;
        this.name = name;
        this.roverId = roverId;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoverId() {
        return roverId;
    }

    public void setRoverId(Long roverId) {
        this.roverId = roverId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MarsCamera.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("roverId=" + roverId)
                .add("fullName='" + fullName + "'")
                .toString();
    }
}
