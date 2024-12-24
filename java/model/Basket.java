package pro.sky.skyprospringbasketdemo.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Data
@SessionScope
@Component
@RequiredArgsConstructor
public class Basket {

    private final List<Integer> itemsIds;

    public void add (int ids) {
        itemsIds.add(ids);
    }

    public List<Integer> getItems() {
        return new ArrayList<>(itemsIds);
    }

}
