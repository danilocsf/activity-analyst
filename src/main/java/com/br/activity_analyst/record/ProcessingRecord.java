package com.br.activity_analyst.record;


import com.br.activity_analyst.enums.ProcessingStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
    Exemplo de Json
    {
	"id": 1497014222380,
    "processName": "Processo teste",
    "numberOfActivities": 12,
    "status":"finished",
    "mockError": false
}
 */
public record ProcessingRecord(
        Long id,
        String processName,
        int numberOfActivities,
        @JsonProperty("status") ProcessingStatus status,
        boolean mockError
    ) {}
