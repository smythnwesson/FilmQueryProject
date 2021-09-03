package com.skilldistillery.filmquery.entities;

import java.util.Objects;

public class Film {
	private int id;
	private String title;
	private String description;
	private Integer releaseYear;
	private int languageId;
	private int rentalDuration;
	private double rentalRate;
	private Integer filmLength;
	private double replacmentCost;
	private String rating;
	private String specialFeatures;
	
	public Film() {
		super();
	}
	
	public Film(int id, String title, String description, Integer releaseYear, int languageId, int rentalDuration,
			double rentalRate, Integer filmLength, double replacmentCost, String rating, String specialFeatures) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.filmLength = filmLength;
		this.replacmentCost = replacmentCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public int getRentalDuration() {
		return rentalDuration;
	}
	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	public Integer getFilmLength() {
		return filmLength;
	}
	public void setFilmLength(Integer filmLength) {
		this.filmLength = filmLength;
	}
	public double getReplacmentCost() {
		return replacmentCost;
	}
	public void setReplacmentCost(double replacmentCost) {
		this.replacmentCost = replacmentCost;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSpecialFeatures() {
		return specialFeatures;
	}
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, filmLength, id, languageId, rating, releaseYear, rentalDuration, rentalRate,
				replacmentCost, specialFeatures, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(description, other.description) && Objects.equals(filmLength, other.filmLength)
				&& id == other.id && languageId == other.languageId && Objects.equals(rating, other.rating)
				&& Objects.equals(releaseYear, other.releaseYear) && rentalDuration == other.rentalDuration
				&& Double.doubleToLongBits(rentalRate) == Double.doubleToLongBits(other.rentalRate)
				&& Double.doubleToLongBits(replacmentCost) == Double.doubleToLongBits(other.replacmentCost)
				&& Objects.equals(specialFeatures, other.specialFeatures) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", description=" + description + ", releaseYear=" + releaseYear
				+ ", languageId=" + languageId + ", rentalDuration=" + rentalDuration + ", rentalRate=" + rentalRate
				+ ", filmLength=" + filmLength + ", replacmentCost=" + replacmentCost + ", rating=" + rating
				+ ", specialFeatures=" + specialFeatures + "]";
	}
	
	
	
}
