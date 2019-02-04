package main.java.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class SatsriakalIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("Satsriakal"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        String speechText = "Sat Sri Akal Kidda ji ki haal aa.";
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Satsriakal", speechText)
                .build();
    }
}
