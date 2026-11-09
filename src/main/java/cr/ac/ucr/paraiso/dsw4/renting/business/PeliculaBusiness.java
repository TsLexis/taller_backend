package cr.ac.ucr.paraiso.dsw4.renting.business;

import java.util.List;

import org.springframework.stereotype.Service;

import cr.ac.ucr.paraiso.dsw4.renting.data.PeliculaData;
import cr.ac.ucr.paraiso.dsw4.renting.domain.Pelicula;

import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PeliculaBusiness {
    @Autowired
    private PeliculaData peliculaData;

    public List<Pelicula> findMoviesByTitleOrGenre(String title, String genre) {
        return peliculaData.findMovieByTitleOrGenre(title, genre);
    }
    public Pelicula save(Pelicula pelicula) throws SQLException{
        peliculaData.save(pelicula);
        return pelicula;
    }

}
