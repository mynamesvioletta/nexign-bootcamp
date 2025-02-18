package com.example.commonthings.model;

import com.example.commonthings.entity.Call;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CallsDetailsDto {
    private Long id;
    private String numberPhone;
    private String tariffIndex;
    private List<Call> payload;
    private String totalCost;
    private String monetaryUnit;
}
