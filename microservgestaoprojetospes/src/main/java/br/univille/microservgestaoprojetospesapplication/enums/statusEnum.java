package br.univille.microservgestaoprojetospesapplication.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum statusEnum {
    ATIVO, INATIVO;

    @JsonCreator
    public static statusEnum fromValue(String value) {
        return statusEnum.valueOf(value.toUpperCase());
    }

    @JsonValue
    public String toValue() {
        return name();
    }
}
