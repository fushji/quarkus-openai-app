package it.fushji.openai;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import it.fushji.openai.client.OpenAIRestClient;
import it.fushji.openai.model.CreateImageRequest;
import it.fushji.openai.model.ModelResponse;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/quarkus-openai")
public class OpenAIEndpoint {

    @RestClient
    private OpenAIRestClient openAIRestClient;

    @GET
    @Path("/generate-image")
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateImage(@QueryParam("description") String description,
            @DefaultValue("1") @QueryParam("n") int n,
            @DefaultValue("1024x1024") @QueryParam("size") String size) {

        final CreateImageRequest createImageRequest = new CreateImageRequest();
        createImageRequest.setPrompt(description);
        createImageRequest.setN(n);
        createImageRequest.setSize(size);

        URI uri;
        try {
            uri = new URI(
                    openAIRestClient.generateImage(createImageRequest).getUrls().get(0).getUrl());
        } catch (URISyntaxException e) {
            return Response.noContent().build();
        }
        return Response.seeOther(uri).build();
    }

    @GET
    @Path("/models")
    @Produces(MediaType.APPLICATION_JSON)
    public ModelResponse getModels() {
        return openAIRestClient.getModels();
    }
}
