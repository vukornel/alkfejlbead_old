package hu.vkzsa.alkfejlbead.web.controller;


import hu.vkzsa.alkfejlbead.entity.Beer;
import hu.vkzsa.alkfejlbead.entity.Wine;
import hu.vkzsa.alkfejlbead.service.BeerService;
import hu.vkzsa.alkfejlbead.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drink")
public class DrinkController {


    private BeerService beerService;
    private WineService wineService;

    @Autowired
    public void setBeerService(BeerService beerService) {
        this.beerService = beerService;
    }

    @Autowired
    public void setWineService(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping("/beers")
    public List<Beer> beers(){
        return beerService.findAllBeers();
    }

    @GetMapping("/wines")
    public List<Wine> wines(){
        return wineService.findAllWines();
    }


}
