package main.java.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class ByeIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("Bye"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        String speechText = "GoodBye, Changa ji theek aan.";
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Bye", speechText)
                .build();
    }
}
