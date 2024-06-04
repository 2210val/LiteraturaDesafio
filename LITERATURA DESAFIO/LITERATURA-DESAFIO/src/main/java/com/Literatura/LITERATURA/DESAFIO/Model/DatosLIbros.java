package com.Literatura.LITERATURA.DESAFIO.Model;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year")   String fechaDeNacimiento

) {
}
