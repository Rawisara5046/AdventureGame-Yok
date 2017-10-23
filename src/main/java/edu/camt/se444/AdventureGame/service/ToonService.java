package edu.camt.se444.AdventureGame.service;

/**
 * Created by admin on 10/23/2017 AD.
 */

import org.springframework.stereotype.Service;
import edu.camt.se444.AdventureGame.model.Toon;

import java.util.ArrayList;

@Service
public class ToonService {

    private ArrayList<Toon> listToon = new ArrayList<Toon>();

    public ArrayList<Toon> GetAllCharacters(){
        Toon t1 = new Toon("1","Yok");
        Toon t2 = new Toon("2","Boat");

        listToon.add(t1);
        listToon.add(t2);

        return listToon;
    }

    public Toon GetToonById(String id){
        return listToon.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public boolean AddToon (Toon toon){
        Toon newToon = new Toon();
        newToon.setId(toon.getId());
        newToon.setName(toon.getName());

        listToon.add(newToon);
        return true;
    }

    public boolean UpdateToon (Toon toon){
        Toon findToon = GetToonById(toon.getId());
        findToon.setId(toon.getId());
        findToon.setName(toon.getName());

        return true;
    }

    public boolean DeleteToon (String id){
        Toon findToon = GetToonById(id);
        listToon.remove(findToon);

        return true;
    }
}
