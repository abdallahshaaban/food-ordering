package com.food.ordering.system.order.service.domain.dto.create;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
@AllArgsConstructor
public class OrderAddress {

    @NonNull
    @Size(max = 50)
    private final String street;
    @NonNull
    @Size(max = 10)
    private final String postalCode;
    @NonNull
    private final String city;
}
