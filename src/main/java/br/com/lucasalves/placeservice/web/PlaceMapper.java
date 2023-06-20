package br.com.lucasalves.placeservice.web;

import br.com.lucasalves.placeservice.api.PlaceResponse;
import br.com.lucasalves.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
