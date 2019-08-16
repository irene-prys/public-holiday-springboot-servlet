package demo.holidays;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;

import com.amazon.ask.servlet.SkillServlet;
import demo.holidays.handler.AboutHandler;
import demo.holidays.handler.HolidaysHandler;

public class PublicHolidaysServlet extends SkillServlet {

    public PublicHolidaysServlet() {
        super(getSkill());
    }

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new HolidaysHandler(),
                        new AboutHandler())
                .build();
    }
}
