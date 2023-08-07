package it.fushji.openai.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateImageRequest {

    @JsonProperty("prompt")
    private String prompt;

    @JsonProperty("n")
    private int n;

    @JsonProperty("size")
    private String size;

    public CreateImageRequest() {
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
