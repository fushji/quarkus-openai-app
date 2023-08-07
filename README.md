# quarkus-openai-app

This project uses Quarkus to call the OpenAI DALL.E API to generate image from user prompts.

## Setting up the application
Register to OpenAI to get the API KEY from  https://platform.openai.com/account/api-keys then put it inside the **application.properties** filling the `openai.api.key` properties.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

