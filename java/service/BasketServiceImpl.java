package pro.sky.skyprospringbasketdemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.skyprospringbasketdemo.model.Basket;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    @Override
    public void addAll(List<Integer> ids){
        ids.forEach(basket::add);
    }
    @Override
    public List<Integer>get(){
        return basket.getItems();
    }
}