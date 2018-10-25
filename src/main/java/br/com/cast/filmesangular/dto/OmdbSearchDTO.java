package br.com.cast.filmesangular.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OmdbSearchDTO {

	@JsonProperty("Search")
	private List<SearchDTO> Search;

	public List<SearchDTO> getSearch() {
		return Search;
	}

	public void setSearch(List<SearchDTO> search) {
		Search = search;
	}
}
