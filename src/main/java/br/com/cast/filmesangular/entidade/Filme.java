
package br.com.cast.filmesangular.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(schema = "filmeangular", name = "filme")
public class Filme {
	private String Title;
	private String Year;
	private String Rated;
	private String Released;
	private String Runtime;
	private String Genre;
	private String Director;
	private String Writer;
	private String Actors;
	private String Plot;
	private String Language;
	private String Country;
	private String Awards;
	private String Poster;
	private String Metascore;
	private String imdbrating;
	private String imdbvotes;
	@Id
	private String imdbid;
	private String Type;
	private String DVD;
	private String boxoffice;
	private String Production;
	private String Website;
	private String Response;
	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "filme")
	private List<Recomendacoes> recomendacoes;
	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "filme")
	private List<Comentario> comentarios;

	//Formula roda uma query SQL e não HQL
	@Formula(" (SELECT COUNT(c.id) FROM filmeangular.comentario c WHERE c.imdbid_filme = imdbid) ")
	private Integer qtdComentarios;

	// Getter Methods

	public String getTitle() {
		return Title;
	}

	public String getYear() {
		return Year;
	}

	public String getRated() {
		return Rated;
	}

	public String getReleased() {
		return Released;
	}

	public String getRuntime() {
		return Runtime;
	}

	public String getGenre() {
		return Genre;
	}

	public String getDirector() {
		return Director;
	}

	public String getWriter() {
		return Writer;
	}

	public String getActors() {
		return Actors;
	}

	public String getPlot() {
		return Plot;
	}

	public String getLanguage() {
		return Language;
	}

	public String getCountry() {
		return Country;
	}

	public String getAwards() {
		return Awards;
	}

	public String getPoster() {
		return Poster;
	}

	public String getMetascore() {
		return Metascore;
	}

	public String getImdbRating() {
		return imdbrating;
	}

	public String getImdbVotes() {
		return imdbvotes;
	}

	public String getImdbID() {
		return imdbid;
	}

	public String getType() {
		return Type;
	}

	public String getDVD() {
		return DVD;
	}

	public String getBoxOffice() {
		return boxoffice;
	}

	public String getProduction() {
		return Production;
	}

	public String getWebsite() {
		return Website;
	}

	public String getResponse() {
		return Response;
	}

	// Setter Methods

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public void setYear(String Year) {
		this.Year = Year;
	}

	public void setRated(String Rated) {
		this.Rated = Rated;
	}

	public void setReleased(String Released) {
		this.Released = Released;
	}

	public void setRuntime(String Runtime) {
		this.Runtime = Runtime;
	}

	public void setGenre(String Genre) {
		this.Genre = Genre;
	}

	public void setDirector(String Director) {
		this.Director = Director;
	}

	public void setWriter(String Writer) {
		this.Writer = Writer;
	}

	public void setActors(String Actors) {
		this.Actors = Actors;
	}

	public void setPlot(String Plot) {
		this.Plot = Plot;
	}

	public void setLanguage(String Language) {
		this.Language = Language;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setAwards(String Awards) {
		this.Awards = Awards;
	}

	public void setPoster(String Poster) {
		this.Poster = Poster;
	}

	public void setMetascore(String Metascore) {
		this.Metascore = Metascore;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbrating = imdbRating;
	}

	public void setImdbVotes(String imdbVotes) {
		this.imdbvotes = imdbVotes;
	}

	public void setImdbID(String imdbID) {
		this.imdbid = imdbID;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	public void setDVD(String DVD) {
		this.DVD = DVD;
	}

	public void setBoxOffice(String BoxOffice) {
		this.boxoffice = BoxOffice;
	}

	public void setProduction(String Production) {
		this.Production = Production;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setResponse(String Response) {
		this.Response = Response;
	}

	public Integer getQtdComentarios() {
		return qtdComentarios;
	}

	public void setQtdComentarios(Integer qtdComentarios) {
		this.qtdComentarios = qtdComentarios;
	}

}
