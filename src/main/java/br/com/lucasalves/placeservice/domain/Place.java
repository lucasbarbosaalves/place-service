package br.com.lucasalves.placeservice.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public record Place(Long id, String name, String slug, String state, @CreatedDate LocalDate createdAt,
        @LastModifiedDate LocalDate updatedAt) {

}
