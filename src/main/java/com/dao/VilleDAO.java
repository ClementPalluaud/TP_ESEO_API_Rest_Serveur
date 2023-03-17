package com.dao;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.dto.Ville;

@Repository
public interface VilleDAO {
    public ArrayList<Ville> findAllVilles();
}