package br.com.lucasalves.placeservice.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaceRepository extends ReactiveCrudRepository<Place, Long> {

}
