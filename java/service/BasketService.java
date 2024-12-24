package pro.sky.skyprospringbasketdemo.service;


import java.util.List;


public interface BasketService {

    void addAll(List<Integer> ids);
    List<Integer>get();
}
