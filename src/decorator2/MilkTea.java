package decorator2;


import java.util.ArrayList;
import java.util.List;


public class MilkTea implements SeasoningDecorator {

    private List<SeasoningDecorator> seasonings = new ArrayList<>();

    public void setSeasoning (SeasoningDecorator seasoning) {
        seasonings.add(seasoning);
    }

    @Override
    public void addSeasoning() {
        System.out.println("标准动作 + 奶茶 ");
        for (SeasoningDecorator s : seasonings) {
            s.addSeasoning();
        }
    }
}
