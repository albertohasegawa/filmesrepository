
package br.com.cast.filmesangular.entidade;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Title",
    "Year",
    "Rated",
    "Released",
    "Runtime",
    "Genre",
    "Director",
    "Writer",
    "Actors",
    "Plot",
    "Language",
    "Country",
    "Awards",
    "Poster",
    "Ratings",
    "Metascore",
    "imdbRating",
    "imdbVotes",
    "imdbID",
    "Type",
    "DVD",
    "BoxOffice",
    "Production",
    "Website",
    "Response"
})
public class Filme implements Serializable
{

    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("Rated")
    private String rated;
    @JsonProperty("Released")
    private String released;
    @JsonProperty("Runtime")
    private String runtime;
    @JsonProperty("Genre")
    private String genre;
    @JsonProperty("Director")
    private String director;
    @JsonProperty("Writer")
    private String writer;
    @JsonProperty("Actors")
    private String actors;
    @JsonProperty("Plot")
    private String plot;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Awards")
    private String awards;
    @JsonProperty("Poster")
    private String poster;
    @JsonProperty("Ratings")
    @Valid
    private List<Rating> ratings = null;
    @JsonProperty("Metascore")
    private String metascore;
    @JsonProperty("imdbRating")
    private String imdbRating;
    @JsonProperty("imdbVotes")
    private String imdbVotes;
    @JsonProperty("imdbID")
    private String imdbID;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("DVD")
    private String dVD;
    @JsonProperty("BoxOffice")
    private String boxOffice;
    @JsonProperty("Production")
    private String production;
    @JsonProperty("Website")
    private String website;
    @JsonProperty("Response")
    private String response;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6141565768283120065L;

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Filme withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("Year")
    public String getYear() {
        return year;
    }

    @JsonProperty("Year")
    public void setYear(String year) {
        this.year = year;
    }

    public Filme withYear(String year) {
        this.year = year;
        return this;
    }

    @JsonProperty("Rated")
    public String getRated() {
        return rated;
    }

    @JsonProperty("Rated")
    public void setRated(String rated) {
        this.rated = rated;
    }

    public Filme withRated(String rated) {
        this.rated = rated;
        return this;
    }

    @JsonProperty("Released")
    public String getReleased() {
        return released;
    }

    @JsonProperty("Released")
    public void setReleased(String released) {
        this.released = released;
    }

    public Filme withReleased(String released) {
        this.released = released;
        return this;
    }

    @JsonProperty("Runtime")
    public String getRuntime() {
        return runtime;
    }

    @JsonProperty("Runtime")
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public Filme withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }

    @JsonProperty("Genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Filme withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    @JsonProperty("Director")
    public String getDirector() {
        return director;
    }

    @JsonProperty("Director")
    public void setDirector(String director) {
        this.director = director;
    }

    public Filme withDirector(String director) {
        this.director = director;
        return this;
    }

    @JsonProperty("Writer")
    public String getWriter() {
        return writer;
    }

    @JsonProperty("Writer")
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Filme withWriter(String writer) {
        this.writer = writer;
        return this;
    }

    @JsonProperty("Actors")
    public String getActors() {
        return actors;
    }

    @JsonProperty("Actors")
    public void setActors(String actors) {
        this.actors = actors;
    }

    public Filme withActors(String actors) {
        this.actors = actors;
        return this;
    }

    @JsonProperty("Plot")
    public String getPlot() {
        return plot;
    }

    @JsonProperty("Plot")
    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Filme withPlot(String plot) {
        this.plot = plot;
        return this;
    }

    @JsonProperty("Language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public Filme withLanguage(String language) {
        this.language = language;
        return this;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Filme withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("Awards")
    public String getAwards() {
        return awards;
    }

    @JsonProperty("Awards")
    public void setAwards(String awards) {
        this.awards = awards;
    }

    public Filme withAwards(String awards) {
        this.awards = awards;
        return this;
    }

    @JsonProperty("Poster")
    public String getPoster() {
        return poster;
    }

    @JsonProperty("Poster")
    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Filme withPoster(String poster) {
        this.poster = poster;
        return this;
    }

    @JsonProperty("Ratings")
    public List<Rating> getRatings() {
        return ratings;
    }

    @JsonProperty("Ratings")
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public Filme withRatings(List<Rating> ratings) {
        this.ratings = ratings;
        return this;
    }

    @JsonProperty("Metascore")
    public String getMetascore() {
        return metascore;
    }

    @JsonProperty("Metascore")
    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public Filme withMetascore(String metascore) {
        this.metascore = metascore;
        return this;
    }

    @JsonProperty("imdbRating")
    public String getImdbRating() {
        return imdbRating;
    }

    @JsonProperty("imdbRating")
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Filme withImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
        return this;
    }

    @JsonProperty("imdbVotes")
    public String getImdbVotes() {
        return imdbVotes;
    }

    @JsonProperty("imdbVotes")
    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public Filme withImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
        return this;
    }

    @JsonProperty("imdbID")
    public String getImdbID() {
        return imdbID;
    }

    @JsonProperty("imdbID")
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public Filme withImdbID(String imdbID) {
        this.imdbID = imdbID;
        return this;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    public Filme withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("DVD")
    public String getDVD() {
        return dVD;
    }

    @JsonProperty("DVD")
    public void setDVD(String dVD) {
        this.dVD = dVD;
    }

    public Filme withDVD(String dVD) {
        this.dVD = dVD;
        return this;
    }

    @JsonProperty("BoxOffice")
    public String getBoxOffice() {
        return boxOffice;
    }

    @JsonProperty("BoxOffice")
    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Filme withBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
        return this;
    }

    @JsonProperty("Production")
    public String getProduction() {
        return production;
    }

    @JsonProperty("Production")
    public void setProduction(String production) {
        this.production = production;
    }

    public Filme withProduction(String production) {
        this.production = production;
        return this;
    }

    @JsonProperty("Website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("Website")
    public void setWebsite(String website) {
        this.website = website;
    }

    public Filme withWebsite(String website) {
        this.website = website;
        return this;
    }

    @JsonProperty("Response")
    public String getResponse() {
        return response;
    }

    @JsonProperty("Response")
    public void setResponse(String response) {
        this.response = response;
    }

    public Filme withResponse(String response) {
        this.response = response;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Filme withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
