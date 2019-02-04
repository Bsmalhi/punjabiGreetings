package main.java;

import com.amazon.ask.AlexaSkill;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.amazon.ask.dispatcher.request.handler.impl.LaunchRequestHandler;
import com.amazon.ask.dispatcher.request.handler.impl.SessionEndedRequestHandler;
import main.java.handlers.ByeIntentHandler;
import main.java.handlers.HelpIntentHandler;
import main.java.handlers.SatsriakalIntentHandler;

public class PunjabiGreetingsStreamHandler extends SkillStreamHandler {

    private static Skill getSkill(){
        return Skills.standard()
                .addRequestHandlers(
                            new SatsriakalIntentHandler(),
                            new ByeIntentHandler(),
                            new HelpIntentHandler())
                .withSkillId("amzn1.ask.skill.99fe1792-7372-40d9-9256-77d519d4e230")
                .build();
    }

    public PunjabiGreetingsStreamHandler() {
        super(getSkill());
    }
}
