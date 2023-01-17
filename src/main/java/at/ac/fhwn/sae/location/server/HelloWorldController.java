package at.ac.fhwn.sae.location.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController<Cows> {


    CowService cowService;

    public HelloWorldController(CowService cowService){
        this.cowService = cowService;
    }

    @GetMapping("/")
    public String root(){
        return "Hello World";
    }

    @GetMapping("/cow")
    public Cow cow(
            @RequestParam("index") int index){
        Cow cow = new Cow("Zenzi");
        cowService.helloWorld(cow, index);
        return new Cow("Loisi");
    }

    @GetMapping("/cows")
    public List<Cow> cows(    ){
        return (List<Cow>) cowService.getCows();
    }




}

