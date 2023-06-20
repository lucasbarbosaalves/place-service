package br.com.lucasalves.placeservice.api;

import java.time.LocalDate;

public record PlaceResponse(String name, String slug, String state, LocalDate createdAt, LocalDate updatedAt) {

}
