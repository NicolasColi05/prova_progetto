package it.unibo.sampleapp;

import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.tools.OmdbBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.jooq.lambda.Unchecked.function;

/**
 * Monolitic application that fetches movie rates.
 */
public final class RateAMovie {
    private static final String DEFAULT_MOVIE = "Breaking Bad";
    private static final String OMDB_API_KEY = System.getenv("OMDB_API_KEY");
    private static final Logger LOGGER = LoggerFactory.getLogger(RateAMovie.class);

    private RateAMovie() { }

    /**
     * Launches the application. Expects {@code OMDB_API_KEY} to be a valid environment variable.
     *
     * @param args a string with the movie/series name.
     */
    public static void main(final String[] args) {
       System.out.println("ciao");
       System.out.println("il mago samu");
       int i = 0;
       if(i == 0) {
        System.out.println("gay");

        System.err.println("booh");
       }
<<<<<<< HEAD
=======
       System.out.println("forza inter");
>>>>>>> fede_prova_da_casa
    }
}
