package it.fushji.openai.client;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import it.fushji.openai.model.CreateImageRequest;
import it.fushji.openai.model.CreateImageResponse;
import it.fushji.openai.model.ModelResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;


@RegisterRestClient(baseUri = "https://api.openai.com")
@Path("/v1")
public interface OpenAIRestClient {


        @GET
        @Path("/models")
        @ClientHeaderParam(name = "Authorization", value = "Bearer ${openai.api.key}")
        ModelResponse getModels();

        @POST
        @Path("/images/generations")
        @ClientHeaderParam(name = "Authorization", value = "Bearer ${openai.api.key}")
        CreateImageResponse generateImage(CreateImageRequest createImageRequest);

}
