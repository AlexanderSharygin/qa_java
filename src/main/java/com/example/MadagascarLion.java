package com.example;

import java.util.List;

public class MadagascarLion extends Lion{


    public final String NAME = "Alex";

    private String placeOfLiving;
    private List<String> friends;

    public MadagascarLion(Feline feline) throws Exception {
        super("Самец", feline);
        placeOfLiving = "Нью-Йоркский зоопарк";
        friends = List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public List<String> getFriends() {
        return friends;
    }

    @Override
    public int getKittens()
    {
       return 0;
    }
}
