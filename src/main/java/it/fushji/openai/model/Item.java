package it.fushji.openai.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    @JsonProperty("url")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
