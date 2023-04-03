package com.blo;

import java.util.ArrayList;

import com.dto.Ville;

public interface VilleBLO {

    public ArrayList<Ville> getInfoVilles(String codePostal);
    public static final String mess = "C'est un test";

}