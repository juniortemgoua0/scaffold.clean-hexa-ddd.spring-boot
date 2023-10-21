package com.juniortemgoua.library.core.utilities.classes;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
public class MetaData {

    private String lastApiVersion;
    private String apiVersion;
    private String ressourceVersion;
    private LocalDateTime time;
    private Map<String, Object> others;

    public MetaData() {
        this.lastApiVersion= "v2";
        this.apiVersion = "v1";
        this.ressourceVersion = "v1.0.0";
        this.time = LocalDateTime.now();
    }
}
