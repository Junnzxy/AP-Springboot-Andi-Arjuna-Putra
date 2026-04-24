package com.example.portfolio.model;

public class Photographer {
    private String name;
    private String specialty;
    private int yearsOfExperience;
    private String bio;
    private String profileImageUrl;

    public Photographer(String name, String specialty, int yearsOfExperience, String bio, String profileImageUrl) {
        this.name = name;
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
        this.bio = bio;
        this.profileImageUrl = profileImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getExperienceLabel() {
        if (yearsOfExperience >= 5) {
            return "Experienced";
        } else {
            return "Emerging";
        }
    }
}