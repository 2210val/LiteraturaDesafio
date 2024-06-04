package com.Literatura.LITERATURA.DESAFIO.Model;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Datos(
        @JsonAlias("count") Integer total,
        @JsonAlias("results") List<DatosLibro> libros) {
}

















