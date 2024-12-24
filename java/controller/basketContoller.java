package pro.sky.skyprospringbasketdemo.conroller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringbasketdemo.service.BasketService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store/order")

public class BasketController {
    private final BasketService basketService;

    @GetMapping(path = "/add")
    public String add(@RequestParam  List<Integer> ids){
        basketService.addAll(ids);
        return "Items added to cart: " + ids;
    }

    @GetMapping(path = "/get")
    public List<Integer> get(){
        return basketService.get();
    }
}
