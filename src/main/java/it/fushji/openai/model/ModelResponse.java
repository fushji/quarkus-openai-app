package it.fushji.openai.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelResponse {
    @JsonProperty("object")
    private String object;

    @JsonProperty("data")
    private List<Model> data;


}
