package edu.camt.se444.AdventureGame.controller;

/**
 * Created by admin on 10/23/2017 AD.
 */
import edu.camt.se444.AdventureGame.model.Toon;
import edu.camt.se444.AdventureGame.service.ToonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ToonController {

    @Autowired
    private ToonService toonService;

    @RequestMapping(value = "/toons", method = RequestMethod.GET, produces = "application/json")
    public ArrayList<Toon> ListToons() {
        return toonService.GetAllCharacters();
    }

    @RequestMapping(value = "/toons/{id}", method = RequestMethod.GET, produces = "application/json")
    public Toon GetToonById(@PathVariable String id) {
        return toonService.GetToonById(id);
    }

    @RequestMapping(value = "/toons/addtoon", method = RequestMethod.POST, produces = "application/json")
    public String AddToon(@RequestBody Toon toon) {
        boolean addToon = toonService.AddToon(toon);

        if (addToon == true){
            String success = "Success";
            return success;
        }

        String fault = "fault";
        return fault;
    }

    @RequestMapping(value = "/toons/updatetoon", method = RequestMethod.PUT, produces = "application/json")
    public String UpdateToon(@RequestBody Toon toon) {
        boolean updateToon = toonService.UpdateToon(toon);
        if (updateToon == true){
            String success = "Success";
            return success;
        }

        String fault = "fault";
        return fault;
    }

    @RequestMapping(value = "/toons/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String DeleteToon(@PathVariable String id) {
        boolean updateToon = toonService.DeleteToon(id);
        if (updateToon == true){
            String success = "Success";
            return success;
        }

        String fault = "fault";
        return fault;
    }
}
